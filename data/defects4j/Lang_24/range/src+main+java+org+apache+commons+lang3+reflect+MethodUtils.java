{
  "filepath": "/tmp/Lang-24b/src/main/java/org/apache/commons/lang3/reflect/MethodUtils.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "MethodUtils",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 56,
      "end_line": 552,
      "comment": "\n * \u003cp\u003e Utility reflection methods focused on methods, originally from Commons BeanUtils.\n * Differences from the BeanUtils version may be noted, especially where similar functionality\n * already existed within Lang.\n * \u003c/p\u003e\n *\n * \u003ch3\u003eKnown Limitations\u003c/h3\u003e\n * \u003ch4\u003eAccessing Public Methods In A Default Access Superclass\u003c/h4\u003e\n * \u003cp\u003eThere is an issue when invoking public methods contained in a default access superclass on JREs prior to 1.4.\n * Reflection locates these methods fine and correctly assigns them as public.\n * However, an \u003ccode\u003eIllegalAccessException\u003c/code\u003e is thrown if the method is invoked.\u003c/p\u003e\n *\n * \u003cp\u003e\u003ccode\u003eMethodUtils\u003c/code\u003e contains a workaround for this situation. \n * It will attempt to call \u003ccode\u003esetAccessible\u003c/code\u003e on this method.\n * If this call succeeds, then the method can be invoked as normal.\n * This call will only succeed when the application has sufficient security privileges. \n * If this call fails then the method may fail.\u003c/p\u003e\n *\n * @author Apache Software Foundation\n * @author Craig R. McClanahan\n * @author Ralph Schaer\n * @author Chris Audley\n * @author Rey Fran\u0026#231;ois\n * @author Gregor Ra\u0026#253;man\n * @author Jan Sorensen\n * @author Robert Burrell Donkin\n * @author Matt Benson\n * @since 2.5\n * @version $Id$\n "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.reflect.MethodUtils.MethodUtils()",
      "begin_line": 66,
      "end_line": 68,
      "comment": "\n     * \u003cp\u003eMethodUtils instances should NOT be constructed in standard programming.\n     * Instead, the class should be used as\n     * \u003ccode\u003eMethodUtils.getAccessibleMethod(method)\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis constructor is public to permit tools that require a JavaBean\n     * instance to operate.\u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 67,col 9)-(line 67,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.reflect.MethodUtils.invokeMethod(java.lang.Object, java.lang.String, java.lang.Object...)",
      "begin_line": 92,
      "end_line": 104,
      "comment": "\n     * \u003cp\u003eInvoke a named method whose parameter type matches the object type.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method delegates the method search to {@link #getMatchingAccessibleMethod(Class, String, Class[])}.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method supports calls to methods taking primitive parameters \n     * via passing in wrapping classes. So, for example, a \u003ccode\u003eBoolean\u003c/code\u003e object\n     * would match a \u003ccode\u003eboolean\u003c/code\u003e primitive.\u003c/p\u003e\n     *\n     * \u003cp\u003e This is a convenient wrapper for\n     * {@link #invokeMethod(Object object,String methodName, Object[] args, Class[] parameterTypes)}.\n     * \u003c/p\u003e\n     *\n     * @param object invoke method on this object\n     * @param methodName get method with this name\n     * @param args use these arguments - treat null as empty array\n     * @return The value returned by the invoked method\n     *\n     * @throws NoSuchMethodException if there is no such accessible method\n     * @throws InvocationTargetException wraps an exception thrown by the method invoked\n     * @throws IllegalAccessException if the requested method is not accessible via reflection\n     ",
      "child_ranges": [
        "(line 95,col 9)-(line 97,col 9)",
        "(line 98,col 9)-(line 98,col 36)",
        "(line 99,col 9)-(line 99,col 57)",
        "(line 100,col 9)-(line 102,col 9)",
        "(line 103,col 9)-(line 103,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.reflect.MethodUtils.invokeMethod(java.lang.Object, java.lang.String, java.lang.Object[], java.lang.Class\u003c?\u003e[])",
      "begin_line": 125,
      "end_line": 143,
      "comment": "\n     * \u003cp\u003eInvoke a named method whose parameter type matches the object type.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method delegates the method search to {@link #getMatchingAccessibleMethod(Class, String, Class[])}.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method supports calls to methods taking primitive parameters \n     * via passing in wrapping classes. So, for example, a \u003ccode\u003eBoolean\u003c/code\u003e object\n     * would match a \u003ccode\u003eboolean\u003c/code\u003e primitive.\u003c/p\u003e\n     *\n     * @param object invoke method on this object\n     * @param methodName get method with this name\n     * @param args use these arguments - treat null as empty array\n     * @param parameterTypes match these parameters - treat null as empty array\n     * @return The value returned by the invoked method\n     *\n     * @throws NoSuchMethodException if there is no such accessible method\n     * @throws InvocationTargetException wraps an exception thrown by the method invoked\n     * @throws IllegalAccessException if the requested method is not accessible via reflection\n     ",
      "child_ranges": [
        "(line 129,col 9)-(line 131,col 9)",
        "(line 132,col 9)-(line 134,col 9)",
        "(line 135,col 9)-(line 136,col 44)",
        "(line 137,col 9)-(line 141,col 9)",
        "(line 142,col 9)-(line 142,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod(java.lang.Object, java.lang.String, java.lang.Object...)",
      "begin_line": 163,
      "end_line": 175,
      "comment": "\n     * \u003cp\u003eInvoke a method whose parameter types match exactly the object\n     * types.\u003c/p\u003e\n     *\n     * \u003cp\u003e This uses reflection to invoke the method obtained from a call to\n     * \u003ccode\u003egetAccessibleMethod()\u003c/code\u003e.\u003c/p\u003e\n     *\n     * @param object invoke method on this object\n     * @param methodName get method with this name\n     * @param args use these arguments - treat null as empty array\n     * @return The value returned by the invoked method\n     *\n     * @throws NoSuchMethodException if there is no such accessible method\n     * @throws InvocationTargetException wraps an exception thrown by the\n     *  method invoked\n     * @throws IllegalAccessException if the requested method is not accessible\n     *  via reflection\n     ",
      "child_ranges": [
        "(line 166,col 9)-(line 168,col 9)",
        "(line 169,col 9)-(line 169,col 36)",
        "(line 170,col 9)-(line 170,col 57)",
        "(line 171,col 9)-(line 173,col 9)",
        "(line 174,col 9)-(line 174,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod(java.lang.Object, java.lang.String, java.lang.Object[], java.lang.Class\u003c?\u003e[])",
      "begin_line": 196,
      "end_line": 214,
      "comment": "\n     * \u003cp\u003eInvoke a method whose parameter types match exactly the parameter\n     * types given.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis uses reflection to invoke the method obtained from a call to\n     * \u003ccode\u003egetAccessibleMethod()\u003c/code\u003e.\u003c/p\u003e\n     *\n     * @param object invoke method on this object\n     * @param methodName get method with this name\n     * @param args use these arguments - treat null as empty array\n     * @param parameterTypes match these parameters - treat null as empty array\n     * @return The value returned by the invoked method\n     *\n     * @throws NoSuchMethodException if there is no such accessible method\n     * @throws InvocationTargetException wraps an exception thrown by the\n     *  method invoked\n     * @throws IllegalAccessException if the requested method is not accessible\n     *  via reflection\n     ",
      "child_ranges": [
        "(line 200,col 9)-(line 202,col 9)",
        "(line 203,col 9)-(line 205,col 9)",
        "(line 206,col 9)-(line 207,col 32)",
        "(line 208,col 9)-(line 212,col 9)",
        "(line 213,col 9)-(line 213,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.reflect.MethodUtils.invokeExactStaticMethod(java.lang.Class\u003c?\u003e, java.lang.String, java.lang.Object[], java.lang.Class\u003c?\u003e[])",
      "begin_line": 235,
      "end_line": 251,
      "comment": "\n     * \u003cp\u003eInvoke a static method whose parameter types match exactly the parameter\n     * types given.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis uses reflection to invoke the method obtained from a call to\n     * {@link #getAccessibleMethod(Class, String, Class[])}.\u003c/p\u003e\n     *\n     * @param cls invoke static method on this class\n     * @param methodName get method with this name\n     * @param args use these arguments - treat null as empty array\n     * @param parameterTypes match these parameters - treat null as empty array\n     * @return The value returned by the invoked method\n     *\n     * @throws NoSuchMethodException if there is no such accessible method\n     * @throws InvocationTargetException wraps an exception thrown by the\n     *  method invoked\n     * @throws IllegalAccessException if the requested method is not accessible\n     *  via reflection\n     ",
      "child_ranges": [
        "(line 239,col 9)-(line 241,col 9)",
        "(line 242,col 9)-(line 244,col 9)",
        "(line 245,col 9)-(line 245,col 77)",
        "(line 246,col 9)-(line 249,col 9)",
        "(line 250,col 9)-(line 250,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.reflect.MethodUtils.invokeStaticMethod(java.lang.Class\u003c?\u003e, java.lang.String, java.lang.Object...)",
      "begin_line": 277,
      "end_line": 289,
      "comment": "\n     * \u003cp\u003eInvoke a named static method whose parameter type matches the object type.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method delegates the method search to {@link #getMatchingAccessibleMethod(Class, String, Class[])}.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method supports calls to methods taking primitive parameters \n     * via passing in wrapping classes. So, for example, a \u003ccode\u003eBoolean\u003c/code\u003e class\n     * would match a \u003ccode\u003eboolean\u003c/code\u003e primitive.\u003c/p\u003e\n     *\n     * \u003cp\u003e This is a convenient wrapper for\n     * {@link #invokeStaticMethod(Class objectClass,String methodName,Object [] args,Class[] parameterTypes)}.\n     * \u003c/p\u003e\n     *\n     * @param cls invoke static method on this class\n     * @param methodName get method with this name\n     * @param args use these arguments - treat null as empty array\n     * @return The value returned by the invoked method\n     *\n     * @throws NoSuchMethodException if there is no such accessible method\n     * @throws InvocationTargetException wraps an exception thrown by the\n     *  method invoked\n     * @throws IllegalAccessException if the requested method is not accessible\n     *  via reflection\n     ",
      "child_ranges": [
        "(line 280,col 9)-(line 282,col 9)",
        "(line 283,col 9)-(line 283,col 36)",
        "(line 284,col 9)-(line 284,col 57)",
        "(line 285,col 9)-(line 287,col 9)",
        "(line 288,col 9)-(line 288,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.reflect.MethodUtils.invokeStaticMethod(java.lang.Class\u003c?\u003e, java.lang.String, java.lang.Object[], java.lang.Class\u003c?\u003e[])",
      "begin_line": 313,
      "end_line": 330,
      "comment": "\n     * \u003cp\u003eInvoke a named static method whose parameter type matches the object type.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method delegates the method search to {@link #getMatchingAccessibleMethod(Class, String, Class[])}.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method supports calls to methods taking primitive parameters \n     * via passing in wrapping classes. So, for example, a \u003ccode\u003eBoolean\u003c/code\u003e class\n     * would match a \u003ccode\u003eboolean\u003c/code\u003e primitive.\u003c/p\u003e\n     *\n     *\n     * @param cls invoke static method on this class\n     * @param methodName get method with this name\n     * @param args use these arguments - treat null as empty array\n     * @param parameterTypes match these parameters - treat null as empty array\n     * @return The value returned by the invoked method\n     *\n     * @throws NoSuchMethodException if there is no such accessible method\n     * @throws InvocationTargetException wraps an exception thrown by the\n     *  method invoked\n     * @throws IllegalAccessException if the requested method is not accessible\n     *  via reflection\n     ",
      "child_ranges": [
        "(line 317,col 9)-(line 319,col 9)",
        "(line 320,col 9)-(line 322,col 9)",
        "(line 323,col 9)-(line 324,col 32)",
        "(line 325,col 9)-(line 328,col 9)",
        "(line 329,col 9)-(line 329,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.reflect.MethodUtils.invokeExactStaticMethod(java.lang.Class\u003c?\u003e, java.lang.String, java.lang.Object...)",
      "begin_line": 350,
      "end_line": 362,
      "comment": "\n     * \u003cp\u003eInvoke a static method whose parameter types match exactly the object\n     * types.\u003c/p\u003e\n     *\n     * \u003cp\u003e This uses reflection to invoke the method obtained from a call to\n     * {@link #getAccessibleMethod(Class, String, Class[])}.\u003c/p\u003e\n     *\n     * @param cls invoke static method on this class\n     * @param methodName get method with this name\n     * @param args use these arguments - treat null as empty array\n     * @return The value returned by the invoked method\n     *\n     * @throws NoSuchMethodException if there is no such accessible method\n     * @throws InvocationTargetException wraps an exception thrown by the\n     *  method invoked\n     * @throws IllegalAccessException if the requested method is not accessible\n     *  via reflection\n     ",
      "child_ranges": [
        "(line 353,col 9)-(line 355,col 9)",
        "(line 356,col 9)-(line 356,col 36)",
        "(line 357,col 9)-(line 357,col 57)",
        "(line 358,col 9)-(line 360,col 9)",
        "(line 361,col 9)-(line 361,col 78)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.reflect.MethodUtils.getAccessibleMethod(java.lang.Class\u003c?\u003e, java.lang.String, java.lang.Class\u003c?\u003e...)",
      "begin_line": 376,
      "end_line": 384,
      "comment": "\n     * \u003cp\u003eReturn an accessible method (that is, one that can be invoked via\n     * reflection) with given name and parameters.  If no such method\n     * can be found, return \u003ccode\u003enull\u003c/code\u003e.\n     * This is just a convenient wrapper for\n     * {@link #getAccessibleMethod(Method method)}.\u003c/p\u003e\n     *\n     * @param cls get method from this class\n     * @param methodName get method with this name\n     * @param parameterTypes with these parameters types\n     * @return The accessible method\n     ",
      "child_ranges": [
        "(line 378,col 9)-(line 383,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.reflect.MethodUtils.getAccessibleMethod(java.lang.reflect.Method)",
      "begin_line": 394,
      "end_line": 416,
      "comment": "\n     * \u003cp\u003eReturn an accessible method (that is, one that can be invoked via\n     * reflection) that implements the specified Method.  If no such method\n     * can be found, return \u003ccode\u003enull\u003c/code\u003e.\u003c/p\u003e\n     *\n     * @param method The method that we wish to call\n     * @return The accessible method\n     ",
      "child_ranges": [
        "(line 395,col 9)-(line 397,col 9)",
        "(line 399,col 9)-(line 399,col 50)",
        "(line 400,col 9)-(line 402,col 9)",
        "(line 403,col 9)-(line 403,col 45)",
        "(line 404,col 9)-(line 404,col 63)",
        "(line 407,col 9)-(line 408,col 32)",
        "(line 411,col 9)-(line 414,col 9)",
        "(line 415,col 9)-(line 415,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.reflect.MethodUtils.getAccessibleMethodFromSuperclass(java.lang.Class\u003c?\u003e, java.lang.String, java.lang.Class\u003c?\u003e...)",
      "begin_line": 428,
      "end_line": 442,
      "comment": "\n     * \u003cp\u003eReturn an accessible method (that is, one that can be invoked via\n     * reflection) by scanning through the superclasses. If no such method\n     * can be found, return \u003ccode\u003enull\u003c/code\u003e.\u003c/p\u003e\n     *\n     * @param cls Class to be checked\n     * @param methodName Method name of the method we wish to call\n     * @param parameterTypes The parameter type signatures\n     * @return the accessible method or \u003ccode\u003enull\u003c/code\u003e if not found\n     ",
      "child_ranges": [
        "(line 430,col 9)-(line 430,col 51)",
        "(line 431,col 9)-(line 440,col 9)",
        "(line 441,col 9)-(line 441,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.reflect.MethodUtils.getAccessibleMethodFromInterfaceNest(java.lang.Class\u003c?\u003e, java.lang.String, java.lang.Class\u003c?\u003e...)",
      "begin_line": 459,
      "end_line": 495,
      "comment": "\n     * \u003cp\u003eReturn an accessible method (that is, one that can be invoked via\n     * reflection) that implements the specified method, by scanning through\n     * all implemented interfaces and subinterfaces.  If no such method\n     * can be found, return \u003ccode\u003enull\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cp\u003e There isn\u0027t any good reason why this method must be private.\n     * It is because there doesn\u0027t seem any reason why other classes should\n     * call this rather than the higher level methods.\u003c/p\u003e\n     *\n     * @param cls Parent class for the interfaces to be checked\n     * @param methodName Method name of the method we wish to call\n     * @param parameterTypes The parameter type signatures\n     * @return the accessible method or \u003ccode\u003enull\u003c/code\u003e if not found\n     ",
      "child_ranges": [
        "(line 461,col 9)-(line 461,col 29)",
        "(line 464,col 9)-(line 493,col 9)",
        "(line 494,col 9)-(line 494,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.reflect.MethodUtils.getMatchingAccessibleMethod(java.lang.Class\u003c?\u003e, java.lang.String, java.lang.Class\u003c?\u003e...)",
      "begin_line": 517,
      "end_line": 551,
      "comment": "\n     * \u003cp\u003eFind an accessible method that matches the given name and has compatible parameters.\n     * Compatible parameters mean that every method parameter is assignable from \n     * the given parameters.\n     * In other words, it finds a method with the given name \n     * that will take the parameters given.\u003cp\u003e\n     *\n     * \u003cp\u003eThis method is used by \n     * {@link \n     * #invokeMethod(Object object, String methodName, Object[] args, Class[] parameterTypes)}.\n     *\n     * \u003cp\u003eThis method can match primitive parameter by passing in wrapper classes.\n     * For example, a \u003ccode\u003eBoolean\u003c/code\u003e will match a primitive \u003ccode\u003eboolean\u003c/code\u003e\n     * parameter.\n     *\n     * @param cls find method in this class\n     * @param methodName find method with this name\n     * @param parameterTypes find method with most compatible parameters \n     * @return The accessible method\n     ",
      "child_ranges": [
        "(line 519,col 9)-(line 524,col 9)",
        "(line 526,col 9)-(line 526,col 32)",
        "(line 527,col 9)-(line 527,col 44)",
        "(line 528,col 9)-(line 546,col 9)",
        "(line 547,col 9)-(line 549,col 9)",
        "(line 550,col 9)-(line 550,col 25)"
      ]
    }
  ]
}