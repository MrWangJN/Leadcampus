package com.f22pkj31.controller;

import com.alibaba.fastjson.JSONArray;
import com.f22pkj31.bean.LeadcampusRoute;
import com.f22pkj31.bean.LeadcampusRouteExample;
import com.f22pkj31.utils.ReturnUtil;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

@RestController
@RequestMapping("route")
public class RouteController extends BaseController {

    @RequestMapping(value = "getMessage")
    public Map<String, Object> getRunningRecord(String sessionId,String schoolName,Integer studentId,String studentLocal) {
        Map<String,Object> map=new HashMap<String,Object>();
        String[] ja;
        Double[][] jas;
        int aimPoint=0;
        Double MinDistance;
        if (sessionService.equalSessionId(studentId, sessionId)) {
        LeadcampusRouteExample example = new LeadcampusRouteExample();
        LeadcampusRouteExample.Criteria cirteria = example.createCriteria();
        cirteria.andSchoolNameEqualTo(schoolName);
        List<LeadcampusRoute> routes = routeService.selectByExample(example);
            String[] studentLocals= studentLocal.split(",");
            Double studentLocalX=Double.parseDouble(studentLocals[0]);
            Double studentLocalY=Double.parseDouble(studentLocals[1]);
            System.out.println(studentLocalX+","+studentLocalY);

        if (routes.size() != 0) {
          String[] firstLocals= routes.get(0).getRouteCenterPoint().split(",");
            Double firstLocalX=Double.parseDouble(firstLocals[0]);
            Double firstLocalY=Double.parseDouble(firstLocals[1]);
            MinDistance= Math.sqrt(Math.pow((firstLocalX-studentLocalX),2)+Math.pow((firstLocalY-studentLocalY),2));
            int countOne=0;
            for(LeadcampusRoute lms:routes){
                String[] aimLocals=lms.getRouteCenterPoint().split(",");
                Double aimLocalX=Double.parseDouble(aimLocals[0]);
                Double aimLocalY=Double.parseDouble(aimLocals[1]);
                Double result= Math.sqrt(Math.pow(( aimLocalX-studentLocalX),2)+Math.pow((aimLocalY-studentLocalY),2));
                if(result<=MinDistance){
                    MinDistance=result;
                    aimPoint=countOne;
                }
                System.out.println(aimLocalX+","+aimLocalY+","+countOne+","+result);
                countOne++;
            }
          String routeArray = routes.get(aimPoint).getRouteArray();
//            System.out.println("dssssssssssssssssssss");
//            System.out.println(routes.get(0).getRouteArray());
//            System.out.println(routes.get(1).getRouteArray());
          JSONArray jsonArray = JSONArray.parseArray(routeArray);
          ja = jsonArray.toArray(new String[jsonArray.size()]);
//            //用来获取中心点
//            jas = new Double[jsonArray.size()][2];
//            for (int i = 0; i < jsonArray.size(); i++) {
//                String[] split = ja[i].split(",");
//                jas[i][0] = Double.parseDouble(split[0]);
//                jas[i][1] = Double.parseDouble(split[1]);
//            }
//            double countX=0;
//            double countY=0;
//            for(int i=0;i<jsonArray.size();i++){
//                countX+=jas[i][0];
//                countY+=jas[i][1];
//            }
            //System.out.println(countX/100+","+countY/100);
            Random rand=new Random();
            int[] count=new int[3];
            count[0]=rand.nextInt(100);
            if(count[0]>=70){
                count[1]=count[0]-30;
                count[2]=count[0]-60;
            }else if(count[0]<=30){
                count[1]=count[0]+30;
                count[2]=count[0]+60;
            }else {
                count[1]=count[0]+30;
                count[2]=count[0]-30;
            }
            String[] ThreePoint=new String[3];
            for(int i=0;i<ThreePoint.length;i++){
                ThreePoint[i]=ja[count[i]];
            }
            map.put("routeName",routes.get(aimPoint).getRouteName());
            map.put("ThreePoint",ThreePoint);

        }

        }else{
            return ReturnUtil.failReturn("0000", "sessionId不匹配");
        }
            return  ReturnUtil.successReturn(map);
        }
    }
