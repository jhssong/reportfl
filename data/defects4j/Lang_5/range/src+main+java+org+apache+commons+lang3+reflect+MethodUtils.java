{
  "filepath": "/tmp/Lang-5b/src/main/java/org/apache/commons/lang3/reflect/MethodUtils.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "MethodUtils",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 47,
      "end_line": 521,
      "comment": "\n * \u003cp\u003eUtility reflection methods focused on methods, originally from Commons BeanUtils.\n * Differences from the BeanUtils version may be noted, especially where similar functionality\n * already existed within Lang.\n * \u003c/p\u003e\n *\n * \u003ch3\u003eKnown Limitations\u003c/h3\u003e\n * \u003ch4\u003eAccessing Public Methods In A Default Access Superclass\u003c/h4\u003e\n * \u003cp\u003eThere is an issue when invoking public methods contained in a default access superclass on JREs prior to 1.4.\n * Reflection locates these methods fine and correctly assigns them as public.\n * However, an \u003ccode\u003eIllegalAccessException\u003c/code\u003e is thrown if the method is invoked.\u003c/p\u003e\n *\n * \u003cp\u003e\u003ccode\u003eMethodUtils\u003c/code\u003e contains a workaround for this situation. \n * It will attempt to call \u003ccode\u003esetAccessible\u003c/code\u003e on this method.\n * If this call succeeds, then the method can be invoked as normal.\n * This call will only succeed when the application has sufficient security privileges. \n * If this call fails then the method may fail.\u003c/p\u003e\n *\n * @since 2.5\n * @version $Id$\n "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.reflect.MethodUtils.MethodUtils()",
      "begin_line": 57,
      "end_line": 59,
      "comment": "\n     * \u003cp\u003eMethodUtils instances should NOT be constructed in standard programming.\n     * Instead, the class should be used as\n     * \u003ccode\u003eMethodUtils.getAccessibleMethod(method)\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis constructor is public to permit tools that require a JavaBean\n     * instance to operate.\u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 58,col 9)-(line 58,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.reflect.MethodUtils.invokeMethod(java.lang.Object, java.lang.String, java.lang.Object...)",
      "begin_line": 83,
      "end_line": 91,
      "comment": "\n     * \u003cp\u003eInvokes a named method whose parameter type matches the object type.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method delegates the method search to {@link #getMatchingAccessibleMethod(Class, String, Class[])}.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method supports calls to methods taking primitive parameters \n     * via passing in wrapping classes. So, for example, a \u003ccode\u003eBoolean\u003c/code\u003e object\n     * would match a \u003ccode\u003eboolean\u003c/code\u003e primitive.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis is a convenient wrapper for\n     * {@link #invokeMethod(Object object,String methodName, Object[] args, Class[] parameterTypes)}.\n     * \u003c/p\u003e\n     *\n     * @param object invoke method on this object\n     * @param methodName get method with this name\n     * @param args use these arguments - treat null as empty array\n     * @return The value returned by the invoked method\n     *\n     * @throws NoSuchMethodException if there is no such accessible method\n     * @throws InvocationTargetException wraps an exception thrown by the method invoked\n     * @throws IllegalAccessException if the requested method is not accessible via reflection\n     ",
      "child_ranges": [
        "(line 86,col 9)-(line 88,col 9)",
        "(line 89,col 9)-(line 89,col 61)",
        "(line 90,col 9)-(line 90,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.reflect.MethodUtils.invokeMethod(java.lang.Object, java.lang.String, java.lang.Object[], java.lang.Class\u003c?\u003e[])",
      "begin_line": 112,
      "end_line": 130,
      "comment": "\n     * \u003cp\u003eInvokes a named method whose parameter type matches the object type.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method delegates the method search to {@link #getMatchingAccessibleMethod(Class, String, Class[])}.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method supports calls to methods taking primitive parameters \n     * via passing in wrapping classes. So, for example, a \u003ccode\u003eBoolean\u003c/code\u003e object\n     * would match a \u003ccode\u003eboolean\u003c/code\u003e primitive.\u003c/p\u003e\n     *\n     * @param object invoke method on this object\n     * @param methodName get method with this name\n     * @param args use these arguments - treat null as empty array\n     * @param parameterTypes match these parameters - treat null as empty array\n     * @return The value returned by the invoked method\n     *\n     * @throws NoSuchMethodException if there is no such accessible method\n     * @throws InvocationTargetException wraps an exception thrown by the method invoked\n     * @throws IllegalAccessException if the requested method is not accessible via reflection\n     ",
      "child_ranges": [
        "(line 116,col 9)-(line 118,col 9)",
        "(line 119,col 9)-(line 121,col 9)",
        "(line 122,col 9)-(line 123,col 44)",
        "(line 124,col 9)-(line 128,col 9)",
        "(line 129,col 9)-(line 129,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod(java.lang.Object, java.lang.String, java.lang.Object...)",
      "begin_line": 150,
      "end_line": 158,
      "comment": "\n     * \u003cp\u003eInvokes a method whose parameter types match exactly the object\n     * types.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis uses reflection to invoke the method obtained from a call to\n     * \u003ccode\u003egetAccessibleMethod()\u003c/code\u003e.\u003c/p\u003e\n     *\n     * @param object invoke method on this object\n     * @param methodName get method with this name\n     * @param args use these arguments - treat null as empty array\n     * @return The value returned by the invoked method\n     *\n     * @throws NoSuchMethodException if there is no such accessible method\n     * @throws InvocationTargetException wraps an exception thrown by the\n     *  method invoked\n     * @throws IllegalAccessException if the requested method is not accessible\n     *  via reflection\n     ",
      "child_ranges": [
        "(line 153,col 9)-(line 155,col 9)",
        "(line 156,col 9)-(line 156,col 61)",
        "(line 157,col 9)-(line 157,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod(java.lang.Object, java.lang.String, java.lang.Object[], java.lang.Class\u003c?\u003e[])",
      "begin_line": 179,
      "end_line": 197,
      "comment": "\n     * \u003cp\u003eInvokes a method whose parameter types match exactly the parameter\n     * types given.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis uses reflection to invoke the method obtained from a call to\n     * \u003ccode\u003egetAccessibleMethod()\u003c/code\u003e.\u003c/p\u003e\n     *\n     * @param object invoke method on this object\n     * @param methodName get method with this name\n     * @param args use these arguments - treat null as empty array\n     * @param parameterTypes match these parameters - treat null as empty array\n     * @return The value returned by the invoked method\n     *\n     * @throws NoSuchMethodException if there is no such accessible method\n     * @throws InvocationTargetException wraps an exception thrown by the\n     *  method invoked\n     * @throws IllegalAccessException if the requested method is not accessible\n     *  via reflection\n     ",
      "child_ranges": [
        "(line 183,col 9)-(line 185,col 9)",
        "(line 186,col 9)-(line 188,col 9)",
        "(line 189,col 9)-(line 190,col 32)",
        "(line 191,col 9)-(line 195,col 9)",
        "(line 196,col 9)-(line 196,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.reflect.MethodUtils.invokeExactStaticMethod(java.lang.Class\u003c?\u003e, java.lang.String, java.lang.Object[], java.lang.Class\u003c?\u003e[])",
      "begin_line": 218,
      "end_line": 234,
      "comment": "\n     * \u003cp\u003eInvokes a static method whose parameter types match exactly the parameter\n     * types given.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis uses reflection to invoke the method obtained from a call to\n     * {@link #getAccessibleMethod(Class, String, Class[])}.\u003c/p\u003e\n     *\n     * @param cls invoke static method on this class\n     * @param methodName get method with this name\n     * @param args use these arguments - treat null as empty array\n     * @param parameterTypes match these parameters - treat null as empty array\n     * @return The value returned by the invoked method\n     *\n     * @throws NoSuchMethodException if there is no such accessible method\n     * @throws InvocationTargetException wraps an exception thrown by the\n     *  method invoked\n     * @throws IllegalAccessException if the requested method is not accessible\n     *  via reflection\n     ",
      "child_ranges": [
        "(line 222,col 9)-(line 224,col 9)",
        "(line 225,col 9)-(line 227,col 9)",
        "(line 228,col 9)-(line 228,col 77)",
        "(line 229,col 9)-(line 232,col 9)",
        "(line 233,col 9)-(line 233,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.reflect.MethodUtils.invokeStaticMethod(java.lang.Class\u003c?\u003e, java.lang.String, java.lang.Object...)",
      "begin_line": 260,
      "end_line": 268,
      "comment": "\n     * \u003cp\u003eInvokes a named static method whose parameter type matches the object type.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method delegates the method search to {@link #getMatchingAccessibleMethod(Class, String, Class[])}.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method supports calls to methods taking primitive parameters \n     * via passing in wrapping classes. So, for example, a \u003ccode\u003eBoolean\u003c/code\u003e class\n     * would match a \u003ccode\u003eboolean\u003c/code\u003e primitive.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis is a convenient wrapper for\n     * {@link #invokeStaticMethod(Class objectClass,String methodName,Object [] args,Class[] parameterTypes)}.\n     * \u003c/p\u003e\n     *\n     * @param cls invoke static method on this class\n     * @param methodName get method with this name\n     * @param args use these arguments - treat null as empty array\n     * @return The value returned by the invoked method\n     *\n     * @throws NoSuchMethodException if there is no such accessible method\n     * @throws InvocationTargetException wraps an exception thrown by the\n     *  method invoked\n     * @throws IllegalAccessException if the requested method is not accessible\n     *  via reflection\n     ",
      "child_ranges": [
        "(line 263,col 9)-(line 265,col 9)",
        "(line 266,col 9)-(line 266,col 61)",
        "(line 267,col 9)-(line 267,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.reflect.MethodUtils.invokeStaticMethod(java.lang.Class\u003c?\u003e, java.lang.String, java.lang.Object[], java.lang.Class\u003c?\u003e[])",
      "begin_line": 292,
      "end_line": 309,
      "comment": "\n     * \u003cp\u003eInvokes a named static method whose parameter type matches the object type.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method delegates the method search to {@link #getMatchingAccessibleMethod(Class, String, Class[])}.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method supports calls to methods taking primitive parameters \n     * via passing in wrapping classes. So, for example, a \u003ccode\u003eBoolean\u003c/code\u003e class\n     * would match a \u003ccode\u003eboolean\u003c/code\u003e primitive.\u003c/p\u003e\n     *\n     *\n     * @param cls invoke static method on this class\n     * @param methodName get method with this name\n     * @param args use these arguments - treat null as empty array\n     * @param parameterTypes match these parameters - treat null as empty array\n     * @return The value returned by the invoked method\n     *\n     * @throws NoSuchMethodException if there is no such accessible method\n     * @throws InvocationTargetException wraps an exception thrown by the\n     *  method invoked\n     * @throws IllegalAccessException if the requested method is not accessible\n     *  via reflection\n     ",
      "child_ranges": [
        "(line 296,col 9)-(line 298,col 9)",
        "(line 299,col 9)-(line 301,col 9)",
        "(line 302,col 9)-(line 303,col 32)",
        "(line 304,col 9)-(line 307,col 9)",
        "(line 308,col 9)-(line 308,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.reflect.MethodUtils.invokeExactStaticMethod(java.lang.Class\u003c?\u003e, java.lang.String, java.lang.Object...)",
      "begin_line": 329,
      "end_line": 337,
      "comment": "\n     * \u003cp\u003eInvokes a static method whose parameter types match exactly the object\n     * types.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis uses reflection to invoke the method obtained from a call to\n     * {@link #getAccessibleMethod(Class, String, Class[])}.\u003c/p\u003e\n     *\n     * @param cls invoke static method on this class\n     * @param methodName get method with this name\n     * @param args use these arguments - treat null as empty array\n     * @return The value returned by the invoked method\n     *\n     * @throws NoSuchMethodException if there is no such accessible method\n     * @throws InvocationTargetException wraps an exception thrown by the\n     *  method invoked\n     * @throws IllegalAccessException if the requested method is not accessible\n     *  via reflection\n     ",
      "child_ranges": [
        "(line 332,col 9)-(line 334,col 9)",
        "(line 335,col 9)-(line 335,col 61)",
        "(line 336,col 9)-(line 336,col 78)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.reflect.MethodUtils.getAccessibleMethod(java.lang.Class\u003c?\u003e, java.lang.String, java.lang.Class\u003c?\u003e...)",
      "begin_line": 351,
      "end_line": 359,
      "comment": "\n     * \u003cp\u003eReturns an accessible method (that is, one that can be invoked via\n     * reflection) with given name and parameters.  If no such method\n     * can be found, return \u003ccode\u003enull\u003c/code\u003e.\n     * This is just a convenient wrapper for\n     * {@link #getAccessibleMethod(Method method)}.\u003c/p\u003e\n     *\n     * @param cls get method from this class\n     * @param methodName get method with this name\n     * @param parameterTypes with these parameters types\n     * @return The accessible method\n     ",
      "child_ranges": [
        "(line 353,col 9)-(line 358,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.reflect.MethodUtils.getAccessibleMethod(java.lang.reflect.Method)",
      "begin_line": 369,
      "end_line": 391,
      "comment": "\n     * \u003cp\u003eReturns an accessible method (that is, one that can be invoked via\n     * reflection) that implements the specified Method.  If no such method\n     * can be found, return \u003ccode\u003enull\u003c/code\u003e.\u003c/p\u003e\n     *\n     * @param method The method that we wish to call\n     * @return The accessible method\n     ",
      "child_ranges": [
        "(line 370,col 9)-(line 372,col 9)",
        "(line 374,col 9)-(line 374,col 50)",
        "(line 375,col 9)-(line 377,col 9)",
        "(line 378,col 9)-(line 378,col 45)",
        "(line 379,col 9)-(line 379,col 63)",
        "(line 382,col 9)-(line 383,col 32)",
        "(line 386,col 9)-(line 389,col 9)",
        "(line 390,col 9)-(line 390,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.reflect.MethodUtils.getAccessibleMethodFromSuperclass(java.lang.Class\u003c?\u003e, java.lang.String, java.lang.Class\u003c?\u003e...)",
      "begin_line": 403,
      "end_line": 417,
      "comment": "\n     * \u003cp\u003eReturns an accessible method (that is, one that can be invoked via\n     * reflection) by scanning through the superclasses. If no such method\n     * can be found, return \u003ccode\u003enull\u003c/code\u003e.\u003c/p\u003e\n     *\n     * @param cls Class to be checked\n     * @param methodName Method name of the method we wish to call\n     * @param parameterTypes The parameter type signatures\n     * @return the accessible method or \u003ccode\u003enull\u003c/code\u003e if not found\n     ",
      "child_ranges": [
        "(line 405,col 9)-(line 405,col 51)",
        "(line 406,col 9)-(line 415,col 9)",
        "(line 416,col 9)-(line 416,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.reflect.MethodUtils.getAccessibleMethodFromInterfaceNest(java.lang.Class\u003c?\u003e, java.lang.String, java.lang.Class\u003c?\u003e...)",
      "begin_line": 434,
      "end_line": 470,
      "comment": "\n     * \u003cp\u003eReturns an accessible method (that is, one that can be invoked via\n     * reflection) that implements the specified method, by scanning through\n     * all implemented interfaces and subinterfaces.  If no such method\n     * can be found, return \u003ccode\u003enull\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cp\u003eThere isn\u0027t any good reason why this method must be private.\n     * It is because there doesn\u0027t seem any reason why other classes should\n     * call this rather than the higher level methods.\u003c/p\u003e\n     *\n     * @param cls Parent class for the interfaces to be checked\n     * @param methodName Method name of the method we wish to call\n     * @param parameterTypes The parameter type signatures\n     * @return the accessible method or \u003ccode\u003enull\u003c/code\u003e if not found\n     ",
      "child_ranges": [
        "(line 436,col 9)-(line 436,col 29)",
        "(line 439,col 9)-(line 468,col 9)",
        "(line 469,col 9)-(line 469,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.reflect.MethodUtils.getMatchingAccessibleMethod(java.lang.Class\u003c?\u003e, java.lang.String, java.lang.Class\u003c?\u003e...)",
      "begin_line": 492,
      "end_line": 520,
      "comment": "\n     * \u003cp\u003eFinds an accessible method that matches the given name and has compatible parameters.\n     * Compatible parameters mean that every method parameter is assignable from \n     * the given parameters.\n     * In other words, it finds a method with the given name \n     * that will take the parameters given.\u003cp\u003e\n     *\n     * \u003cp\u003eThis method is used by \n     * {@link \n     * #invokeMethod(Object object, String methodName, Object[] args, Class[] parameterTypes)}.\n     *\n     * \u003cp\u003eThis method can match primitive parameter by passing in wrapper classes.\n     * For example, a \u003ccode\u003eBoolean\u003c/code\u003e will match a primitive \u003ccode\u003eboolean\u003c/code\u003e\n     * parameter.\n     *\n     * @param cls find method in this class\n     * @param methodName find method with this name\n     * @param parameterTypes find method with most compatible parameters \n     * @return The accessible method\n     ",
      "child_ranges": [
        "(line 494,col 9)-(line 499,col 9)",
        "(line 501,col 9)-(line 501,col 32)",
        "(line 502,col 9)-(line 502,col 44)",
        "(line 503,col 9)-(line 515,col 9)",
        "(line 516,col 9)-(line 518,col 9)",
        "(line 519,col 9)-(line 519,col 25)"
      ]
    }
  ]
}