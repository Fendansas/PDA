package net.afterday.compas.persistency.hardcoded;

import net.afterday.compas.core.influences.Emission;
import net.afterday.compas.core.influences.Influence;
import net.afterday.compas.persistency.influences.InfluencesPersistency;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/**
 * Created by Justas Spakauskas on 2/3/2018.
 */

public class HInfluencesPersistency implements InfluencesPersistency
{
    @Override
    public List<Influence> getPossibleInfluences()
    {
        return null;
    }

    @Override
    public List<String> getRegisteredWifiModules()
    {
        List<String> wifiInfls = new ArrayList<>();
        //Mad Elks
        wifiInfls.add("4a:55:19:12:db:09");  //H100 (Router)
        wifiInfls.add("5e:cf:7f:8f:33:43");  //Various 100 (Modem)
        wifiInfls.add("5a:bf:25:d9:eb:11");  //A100 usb esp7
        wifiInfls.add("4a:55:19:c8:8d:31");  //B100 usb esp7
        wifiInfls.add("4a:55:19:c8:6d:20");  //!!!!!!!!!!!!!!!!!!!!!!!!!!
        wifiInfls.add("ea:9f:6d:93:fb:32");  //H100 usb esp12
        wifiInfls.add("ca:c9:a3:56:73:c9");  //M100 usb tp-link
        wifiInfls.add("5a:bf:25:da:53:ca");  //C100 usb tp-link
        wifiInfls.add("4e:75:25:36:70:be");  //R100 usb long flexible
        wifiInfls.add("5a:bf:25:d9:fc:cf");  //H100-plus usb
        wifiInfls.add("4e:75:25:36:11:c8");  //H100-plus usb
        wifiInfls.add("ae:0b:fb:db:29:ce");  //H100-plus usb
        wifiInfls.add("5a:bf:25:d7:74:38");  //H100-plus usb
        wifiInfls.add("4a:55:19:14:c6:47");  //H100-plus usb
        wifiInfls.add("5a:bf:25:d6:c3:d6");  //H100-plus usb
        wifiInfls.add("5a:bf:25:da:41:b9");  //H100-plus
        wifiInfls.add("4e:75:25:29:a0:a6");  //H100-plus usb
        wifiInfls.add("4a:55:19:12:48:91");  //H100-plus usb
        wifiInfls.add("1a:fe:34:c2:cc:35");  //H100-plus usb
        wifiInfls.add("1a:fe:34:c2:cc:01");  //H100-plus usb
        wifiInfls.add("be:ff:4d:cf:f6:44");  //H100-plus usb
        wifiInfls.add("42:91:51:44:b5:09");  //H100-plus usb
        wifiInfls.add("02:08:22:34:95:ff");  //H100-plus usb
        wifiInfls.add("de:58:f4:30:20:c8");  //H100-plus usb
        wifiInfls.add("c2:51:d3:c5:71:32");  //H100-plus usb
        wifiInfls.add("0a:0b:f7:e3:00:52");  //H100-plus usb
        wifiInfls.add("3e:38:80:be:3c:70");  //H100-plus usb
        wifiInfls.add("be:8e:19:9a:77:25");  //H100-plus usb
        wifiInfls.add("9a:7a:00:9e:5e:c6");  //H100-plus usb
        wifiInfls.add("ce:50:e3:3c:ee:41");  //pinks
        wifiInfls.add("3e:61:05:e4:d4:31");  //pinks
        wifiInfls.add("ea:db:84:a4:4f:f8");  //pinks
        wifiInfls.add("92:54:e3:82:6f:7f");  //Сергей бармен
        wifiInfls.add("fe:d3:13:f5:c1:1b");  //Велес

        return wifiInfls;
    }

    @Override
    public List<Emission> getEmissions()
    {
        List<Emission> emissions = new ArrayList<Emission>();

        //Test Emissions
        emissions.add(emission(at(6, 15, 17, 0), 2, 60));
        emissions.add(emission(at(6, 15, 23, 0), 2, 60));
        emissions.add(emission(at(6, 16, 8, 0), 2, 60));
        emissions.add(emission(at(6, 15, 23, 0), 2, 0, true));
        emissions.add(emission(at(6, 11, 23, 15), 2, 60));
//        emissions.add(emission(at(2, 14, 18, 0), 2, 30));
//        emissions.add(emission(at(2, 28, 22, 0), 2, 30));
        emissions.add(emission(at(6, 11, 23, 10), 2, 0, true));
        emissions.add(emission(at(3, 14, 13, 0), 2, 30));
        emissions.add(emission(at(3, 28, 18, 0), 2, 30));
        emissions.add(emission(at(4, 1, 12, 0), 2, 30));
        emissions.add(emission(at(4, 14, 18, 0), 2, 0, true));
        emissions.add(emission(at(4, 28, 20, 0), 2, 30));
        emissions.add(emission(at(5, 1, 18, 0), 2, 30));
        emissions.add(emission(at(5, 5, 18, 0), 2, 30));
        emissions.add(emission(at(5, 5, 19, 45), 2, 0, true));
        emissions.add(emission(at(6, 1, 13, 0), 2, 30));
        emissions.add(emission(at(6, 14, 18, 0), 2, 30));
        emissions.add(emission(at(6, 28, 22, 0), 2, 30));
        emissions.add(emission(at(7, 1, 10, 0), 2, 0, true));
        emissions.add(emission(at(7, 14, 13, 0), 2, 30));
        emissions.add(emission(at(7, 28, 18, 0), 2, 30));
        emissions.add(emission(at(8, 1, 16, 0), 2, 30));
        emissions.add(emission(at(8, 14, 19, 0), 2, 0, true));
        emissions.add(emission(at(8, 28, 21, 0), 2, 30));
        emissions.add(emission(at(9, 1, 18, 0), 2, 30));
        emissions.add(emission(at(9, 14, 20, 0), 2, 30));
        emissions.add(emission(at(9, 28, 22, 0), 2, 0, true));
        emissions.add(emission(at(10, 1, 13, 0), 2, 30));
        emissions.add(emission(at(10, 14, 18, 0), 2, 30));
        emissions.add(emission(at(10, 28, 22, 0), 2, 30));
        emissions.add(emission(at(11, 1, 10, 0), 2, 0, true));
        emissions.add(emission(at(11, 14, 13, 0), 2, 30));
        emissions.add(emission(at(11, 28, 18, 0), 2, 30));
        emissions.add(emission(at(12, 1, 18, 0), 2, 30));
        emissions.add(emission(at(12, 14, 20, 0), 2, 0, true));
        emissions.add(emission(at(12, 28, 22, 0), 2, 30));

        //New Year Emission
        emissions.add(emission(at(12, 31, 23, 59), 9, 2));

        //Game Emissions

        return emissions;
    }

    private Emission emission(Calendar startAt, int notifyBefore, int duration, boolean isFake)
    {
        return new Emission()
        {
            @Override
            public Calendar getStartTime()
            {
                return startAt;
            }

            @Override
            public int notifyBefore()
            {
                return notifyBefore;
            }

            @Override
            public int duration()
            {
                return duration;
            }

            @Override
            public boolean isFake()
            {
                return isFake;
            }
        };
    }

    private Emission emission(Calendar startAt, int notifyBefore, int duration)
    {
        return emission(startAt, notifyBefore, duration, false);
    }

//    private Emission emission(int afterMins, int notifyBefore, int duration)
//    {
//        return new Emission()
//        {
//            @Override
//            public Calendar getStartTime()
//            {
//                return afterMins(afterMins);
//            }
//
//            @Override
//            public int notifyBefore()
//            {
//                return notifyBefore;
//            }
//
//            @Override
//            public int duration()
//            {
//                return duration;
//            }
//
//            @Override
//            public boolean isFake()
//            {
//
//            }
//        };
//    }

    private Calendar afterMins(int mins)
    {
        Calendar c = Calendar.getInstance();
        c.set(Calendar.MINUTE, c.get(Calendar.MINUTE) + mins);
        return c;
    }

    private Calendar at(int month, int day, int hour, int min)
    {
        Calendar c = Calendar.getInstance();
        c.set(Calendar.MONTH, month - 1);
        c.set(Calendar.DAY_OF_MONTH, day);
        c.set(Calendar.HOUR_OF_DAY, hour);
        c.set(Calendar.MINUTE, min);
        c.set(Calendar.SECOND, 0);
        return c;
    }
}
