package org.boon.json;

import org.boon.Lists;
import org.junit.Before;
import org.junit.Test;

import java.util.List;
import java.util.Map;

import static org.boon.Boon.puts;
import static org.boon.Exceptions.die;
import static org.boon.Maps.idx;

/**
 * Created by rick on 12/12/13.
 */
public class JsonLaxTest extends JsonParserBaseTest {


    public JsonParserFactory factory () {
        return new JsonParserFactory ();
    }


//
//    @Test
//    public void testLax() {
//
//        Object obj = jsonParser.parse (Map.class,
//                " {foo: hi mom hi dad how are you? }  ".replace ( '\'', '"' )
//        );
//
//        boolean ok = true;
//
//        ok &= obj instanceof Map || die("Object was not a map");
//
//        Map<String, Object> map = (Map<String, Object>)obj;
//
//        System.out.println(obj);
//
//        System.out.println(idx(map, "foo"));
//
//        ok &=  idx(map, "foo").equals ( "hi mom hi dad how are you?" ) || die("I did not find:" + idx(map, "foo") +"#");
//
//
//    }
//
//
//    @Test
//    public void testLax2() {
//
//        Object obj = jsonParser.parse (Map.class,
//                (" {foo: hi mom hi dad how are you?," +
//                        "thanks:I am good thanks for asking," +
//                        "list:[love, rocket, fire]," +
//                        "num:1," +
//                        "mix: [true,false,1,2,blue] }  ").replace ( '\'', '"' )
//        );
//
//        boolean ok = true;
//
//        ok &= obj instanceof Map || die("Object was not a map");
//
//        Map<String, Object> map = (Map<String, Object>)obj;
//
//
//        ok &=  idx(map, "foo").equals ( "hi mom hi dad how are you?" ) || die("I did not find:" + idx(map, "foo") +"#");
//        ok &=  idx(map, "thanks").equals ( "I am good thanks for asking" ) || die("I did not find:" + idx(map, "foo") +"#");
//
//
//
//        List<Object> list = ( List<Object> ) idx (map, "list");
//
//
//        ok &=  Lists.idx ( list, 0 ).equals ( "love" ) || die("I did not find love:" + Lists.idx(list, 0));
//
//
//        ok &=  Lists.idx ( list, 1 ).equals ( "rocket" ) || die("I did not find rocket:" + Lists.idx(list, 1));
//
//        ok &=  Lists.idx ( list, 2 ).equals ( "fire" ) || die("I did not find fire:" + Lists.idx(list, 2));
//
//        ok &=  idx(map, "num").equals ( 1 ) || die("I did not find 1:" + idx(map, "num") +"#");
//
//
//        List<Object> mix  = ( List<Object> ) idx (map, "mix");
//
//
//        ok &=  Lists.idx ( mix, 0 ).equals ( true ) || die("I did not find true:" + Lists.idx(mix, 0));
//        ok &=  Lists.idx ( mix, 1 ).equals ( false ) || die("I did not find false:" + Lists.idx(mix, 1));
//
//
//        ok &=  Lists.idx ( mix, 2 ).equals ( 1 ) || die("I did not find 1:" + Lists.idx(mix, 2));
//
//
//        ok &=  Lists.idx ( mix, 4 ).equals ( "blue" ) || die("I did not find blue:" + Lists.idx(mix, 3));
//
//        puts("testLax2?", ok);
//
//    }

}
