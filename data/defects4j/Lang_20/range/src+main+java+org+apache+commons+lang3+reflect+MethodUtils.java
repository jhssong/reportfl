{
  "filepath": "/tmp/Lang-20b/src/main/java/org/apache/commons/lang3/reflect/MethodUtils.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "MethodUtils",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 47,
      "end_line": 543,
      "comment": "\n * \u003cp\u003e Utility reflection methods focused on methods, originally from Commons BeanUtils.\n * Differences from the BeanUtils version may be noted, especially where similar functionality\n * already existed within Lang.\n * \u003c/p\u003e\n *\n * \u003ch3\u003eKnown Limitations\u003c/h3\u003e\n * \u003ch4\u003eAccessing Public Methods In A Default Access Superclass\u003c/h4\u003e\n * \u003cp\u003eThere is an issue when invoking public methods contained in a default access superclass on JREs prior to 1.4.\n * Reflection locates these methods fine and correctly assigns them as public.\n * However, an \u003ccode\u003eIllegalAccessException\u003c/code\u003e is thrown if the method is invoked.\u003c/p\u003e\n *\n * \u003cp\u003e\u003ccode\u003eMethodUtils\u003c/code\u003e contains a workaround for this situation. \n * It will attempt to call \u003ccode\u003esetAccessible\u003c/code\u003e on this method.\n * If this call succeeds, then the method can be invoked as normal.\n * This call will only succeed when the application has sufficient security privileges. \n * If this call fails then the method may fail.\u003c/p\u003e\n *\n * @since 2.5\n * @version $Id$\n "
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
      "end_line": 95,
      "comment": "\n     * \u003cp\u003eInvoke a named method whose parameter type matches the object type.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method delegates the method search to {@link #getMatchingAccessibleMethod(Class, String, Class[])}.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method supports calls to methods taking primitive parameters \n     * via passing in wrapping classes. So, for example, a \u003ccode\u003eBoolean\u003c/code\u003e object\n     * would match a \u003ccode\u003eboolean\u003c/code\u003e primitive.\u003c/p\u003e\n     *\n     * \u003cp\u003e This is a convenient wrapper for\n     * {@link #invokeMethod(Object object,String methodName, Object[] args, Class[] parameterTypes)}.\n     * \u003c/p\u003e\n     *\n     * @param object invoke method on this object\n     * @param methodName get method with this name\n     * @param args use these arguments - treat null as empty array\n     * @return The value returned by the invoked method\n     *\n     * @throws NoSuchMethodException if there is no such accessible method\n     * @throws InvocationTargetException wraps an exception thrown by the method invoked\n     * @throws IllegalAccessException if the requested method is not accessible via reflection\n     ",
      "child_ranges": [
        "(line 86,col 9)-(line 88,col 9)",
        "(line 89,col 9)-(line 89,col 36)",
        "(line 90,col 9)-(line 90,col 57)",
        "(line 91,col 9)-(line 93,col 9)",
        "(line 94,col 9)-(line 94,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.reflect.MethodUtils.invokeMethod(java.lang.Object, java.lang.String, java.lang.Object[], java.lang.Class\u003c?\u003e[])",
      "begin_line": 116,
      "end_line": 134,
      "comment": "\n     * \u003cp\u003eInvoke a named method whose parameter type matches the object type.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method delegates the method search to {@link #getMatchingAccessibleMethod(Class, String, Class[])}.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method supports calls to methods taking primitive parameters \n     * via passing in wrapping classes. So, for example, a \u003ccode\u003eBoolean\u003c/code\u003e object\n     * would match a \u003ccode\u003eboolean\u003c/code\u003e primitive.\u003c/p\u003e\n     *\n     * @param object invoke method on this object\n     * @param methodName get method with this name\n     * @param args use these arguments - treat null as empty array\n     * @param parameterTypes match these parameters - treat null as empty array\n     * @return The value returned by the invoked method\n     *\n     * @throws NoSuchMethodException if there is no such accessible method\n     * @throws InvocationTargetException wraps an exception thrown by the method invoked\n     * @throws IllegalAccessException if the requested method is not accessible via reflection\n     ",
      "child_ranges": [
        "(line 120,col 9)-(line 122,col 9)",
        "(line 123,col 9)-(line 125,col 9)",
        "(line 126,col 9)-(line 127,col 44)",
        "(line 128,col 9)-(line 132,col 9)",
        "(line 133,col 9)-(line 133,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod(java.lang.Object, java.lang.String, java.lang.Object...)",
      "begin_line": 154,
      "end_line": 166,
      "comment": "\n     * \u003cp\u003eInvoke a method whose parameter types match exactly the object\n     * types.\u003c/p\u003e\n     *\n     * \u003cp\u003e This uses reflection to invoke the method obtained from a call to\n     * \u003ccode\u003egetAccessibleMethod()\u003c/code\u003e.\u003c/p\u003e\n     *\n     * @param object invoke method on this object\n     * @param methodName get method with this name\n     * @param args use these arguments - treat null as empty array\n     * @return The value returned by the invoked method\n     *\n     * @throws NoSuchMethodException if there is no such accessible method\n     * @throws InvocationTargetException wraps an exception thrown by the\n     *  method invoked\n     * @throws IllegalAccessException if the requested method is not accessible\n     *  via reflection\n     ",
      "child_ranges": [
        "(line 157,col 9)-(line 159,col 9)",
        "(line 160,col 9)-(line 160,col 36)",
        "(line 161,col 9)-(line 161,col 57)",
        "(line 162,col 9)-(line 164,col 9)",
        "(line 165,col 9)-(line 165,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod(java.lang.Object, java.lang.String, java.lang.Object[], java.lang.Class\u003c?\u003e[])",
      "begin_line": 187,
      "end_line": 205,
      "comment": "\n     * \u003cp\u003eInvoke a method whose parameter types match exactly the parameter\n     * types given.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis uses reflection to invoke the method obtained from a call to\n     * \u003ccode\u003egetAccessibleMethod()\u003c/code\u003e.\u003c/p\u003e\n     *\n     * @param object invoke method on this object\n     * @param methodName get method with this name\n     * @param args use these arguments - treat null as empty array\n     * @param parameterTypes match these parameters - treat null as empty array\n     * @return The value returned by the invoked method\n     *\n     * @throws NoSuchMethodException if there is no such accessible method\n     * @throws InvocationTargetException wraps an exception thrown by the\n     *  method invoked\n     * @throws IllegalAccessException if the requested method is not accessible\n     *  via reflection\n     ",
      "child_ranges": [
        "(line 191,col 9)-(line 193,col 9)",
        "(line 194,col 9)-(line 196,col 9)",
        "(line 197,col 9)-(line 198,col 32)",
        "(line 199,col 9)-(line 203,col 9)",
        "(line 204,col 9)-(line 204,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.reflect.MethodUtils.invokeExactStaticMethod(java.lang.Class\u003c?\u003e, java.lang.String, java.lang.Object[], java.lang.Class\u003c?\u003e[])",
      "begin_line": 226,
      "end_line": 242,
      "comment": "\n     * \u003cp\u003eInvoke a static method whose parameter types match exactly the parameter\n     * types given.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis uses reflection to invoke the method obtained from a call to\n     * {@link #getAccessibleMethod(Class, String, Class[])}.\u003c/p\u003e\n     *\n     * @param cls invoke static method on this class\n     * @param methodName get method with this name\n     * @param args use these arguments - treat null as empty array\n     * @param parameterTypes match these parameters - treat null as empty array\n     * @return The value returned by the invoked method\n     *\n     * @throws NoSuchMethodException if there is no such accessible method\n     * @throws InvocationTargetException wraps an exception thrown by the\n     *  method invoked\n     * @throws IllegalAccessException if the requested method is not accessible\n     *  via reflection\n     ",
      "child_ranges": [
        "(line 230,col 9)-(line 232,col 9)",
        "(line 233,col 9)-(line 235,col 9)",
        "(line 236,col 9)-(line 236,col 77)",
        "(line 237,col 9)-(line 240,col 9)",
        "(line 241,col 9)-(line 241,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.reflect.MethodUtils.invokeStaticMethod(java.lang.Class\u003c?\u003e, java.lang.String, java.lang.Object...)",
      "begin_line": 268,
      "end_line": 280,
      "comment": "\n     * \u003cp\u003eInvoke a named static method whose parameter type matches the object type.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method delegates the method search to {@link #getMatchingAccessibleMethod(Class, String, Class[])}.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method supports calls to methods taking primitive parameters \n     * via passing in wrapping classes. So, for example, a \u003ccode\u003eBoolean\u003c/code\u003e class\n     * would match a \u003ccode\u003eboolean\u003c/code\u003e primitive.\u003c/p\u003e\n     *\n     * \u003cp\u003e This is a convenient wrapper for\n     * {@link #invokeStaticMethod(Class objectClass,String methodName,Object [] args,Class[] parameterTypes)}.\n     * \u003c/p\u003e\n     *\n     * @param cls invoke static method on this class\n     * @param methodName get method with this name\n     * @param args use these arguments - treat null as empty array\n     * @return The value returned by the invoked method\n     *\n     * @throws NoSuchMethodException if there is no such accessible method\n     * @throws InvocationTargetException wraps an exception thrown by the\n     *  method invoked\n     * @throws IllegalAccessException if the requested method is not accessible\n     *  via reflection\n     ",
      "child_ranges": [
        "(line 271,col 9)-(line 273,col 9)",
        "(line 274,col 9)-(line 274,col 36)",
        "(line 275,col 9)-(line 275,col 57)",
        "(line 276,col 9)-(line 278,col 9)",
        "(line 279,col 9)-(line 279,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.reflect.MethodUtils.invokeStaticMethod(java.lang.Class\u003c?\u003e, java.lang.String, java.lang.Object[], java.lang.Class\u003c?\u003e[])",
      "begin_line": 304,
      "end_line": 321,
      "comment": "\n     * \u003cp\u003eInvoke a named static method whose parameter type matches the object type.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method delegates the method search to {@link #getMatchingAccessibleMethod(Class, String, Class[])}.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method supports calls to methods taking primitive parameters \n     * via passing in wrapping classes. So, for example, a \u003ccode\u003eBoolean\u003c/code\u003e class\n     * would match a \u003ccode\u003eboolean\u003c/code\u003e primitive.\u003c/p\u003e\n     *\n     *\n     * @param cls invoke static method on this class\n     * @param methodName get method with this name\n     * @param args use these arguments - treat null as empty array\n     * @param parameterTypes match these parameters - treat null as empty array\n     * @return The value returned by the invoked method\n     *\n     * @throws NoSuchMethodException if there is no such accessible method\n     * @throws InvocationTargetException wraps an exception thrown by the\n     *  method invoked\n     * @throws IllegalAccessException if the requested method is not accessible\n     *  via reflection\n     ",
      "child_ranges": [
        "(line 308,col 9)-(line 310,col 9)",
        "(line 311,col 9)-(line 313,col 9)",
        "(line 314,col 9)-(line 315,col 32)",
        "(line 316,col 9)-(line 319,col 9)",
        "(line 320,col 9)-(line 320,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.reflect.MethodUtils.invokeExactStaticMethod(java.lang.Class\u003c?\u003e, java.lang.String, java.lang.Object...)",
      "begin_line": 341,
      "end_line": 353,
      "comment": "\n     * \u003cp\u003eInvoke a static method whose parameter types match exactly the object\n     * types.\u003c/p\u003e\n     *\n     * \u003cp\u003e This uses reflection to invoke the method obtained from a call to\n     * {@link #getAccessibleMethod(Class, String, Class[])}.\u003c/p\u003e\n     *\n     * @param cls invoke static method on this class\n     * @param methodName get method with this name\n     * @param args use these arguments - treat null as empty array\n     * @return The value returned by the invoked method\n     *\n     * @throws NoSuchMethodException if there is no such accessible method\n     * @throws InvocationTargetException wraps an exception thrown by the\n     *  method invoked\n     * @throws IllegalAccessException if the requested method is not accessible\n     *  via reflection\n     ",
      "child_ranges": [
        "(line 344,col 9)-(line 346,col 9)",
        "(line 347,col 9)-(line 347,col 36)",
        "(line 348,col 9)-(line 348,col 57)",
        "(line 349,col 9)-(line 351,col 9)",
        "(line 352,col 9)-(line 352,col 78)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.reflect.MethodUtils.getAccessibleMethod(java.lang.Class\u003c?\u003e, java.lang.String, java.lang.Class\u003c?\u003e...)",
      "begin_line": 367,
      "end_line": 375,
      "comment": "\n     * \u003cp\u003eReturn an accessible method (that is, one that can be invoked via\n     * reflection) with given name and parameters.  If no such method\n     * can be found, return \u003ccode\u003enull\u003c/code\u003e.\n     * This is just a convenient wrapper for\n     * {@link #getAccessibleMethod(Method method)}.\u003c/p\u003e\n     *\n     * @param cls get method from this class\n     * @param methodName get method with this name\n     * @param parameterTypes with these parameters types\n     * @return The accessible method\n     ",
      "child_ranges": [
        "(line 369,col 9)-(line 374,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.reflect.MethodUtils.getAccessibleMethod(java.lang.reflect.Method)",
      "begin_line": 385,
      "end_line": 407,
      "comment": "\n     * \u003cp\u003eReturn an accessible method (that is, one that can be invoked via\n     * reflection) that implements the specified Method.  If no such method\n     * can be found, return \u003ccode\u003enull\u003c/code\u003e.\u003c/p\u003e\n     *\n     * @param method The method that we wish to call\n     * @return The accessible method\n     ",
      "child_ranges": [
        "(line 386,col 9)-(line 388,col 9)",
        "(line 390,col 9)-(line 390,col 50)",
        "(line 391,col 9)-(line 393,col 9)",
        "(line 394,col 9)-(line 394,col 45)",
        "(line 395,col 9)-(line 395,col 63)",
        "(line 398,col 9)-(line 399,col 32)",
        "(line 402,col 9)-(line 405,col 9)",
        "(line 406,col 9)-(line 406,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.reflect.MethodUtils.getAccessibleMethodFromSuperclass(java.lang.Class\u003c?\u003e, java.lang.String, java.lang.Class\u003c?\u003e...)",
      "begin_line": 419,
      "end_line": 433,
      "comment": "\n     * \u003cp\u003eReturn an accessible method (that is, one that can be invoked via\n     * reflection) by scanning through the superclasses. If no such method\n     * can be found, return \u003ccode\u003enull\u003c/code\u003e.\u003c/p\u003e\n     *\n     * @param cls Class to be checked\n     * @param methodName Method name of the method we wish to call\n     * @param parameterTypes The parameter type signatures\n     * @return the accessible method or \u003ccode\u003enull\u003c/code\u003e if not found\n     ",
      "child_ranges": [
        "(line 421,col 9)-(line 421,col 51)",
        "(line 422,col 9)-(line 431,col 9)",
        "(line 432,col 9)-(line 432,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.reflect.MethodUtils.getAccessibleMethodFromInterfaceNest(java.lang.Class\u003c?\u003e, java.lang.String, java.lang.Class\u003c?\u003e...)",
      "begin_line": 450,
      "end_line": 486,
      "comment": "\n     * \u003cp\u003eReturn an accessible method (that is, one that can be invoked via\n     * reflection) that implements the specified method, by scanning through\n     * all implemented interfaces and subinterfaces.  If no such method\n     * can be found, return \u003ccode\u003enull\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cp\u003e There isn\u0027t any good reason why this method must be private.\n     * It is because there doesn\u0027t seem any reason why other classes should\n     * call this rather than the higher level methods.\u003c/p\u003e\n     *\n     * @param cls Parent class for the interfaces to be checked\n     * @param methodName Method name of the method we wish to call\n     * @param parameterTypes The parameter type signatures\n     * @return the accessible method or \u003ccode\u003enull\u003c/code\u003e if not found\n     ",
      "child_ranges": [
        "(line 452,col 9)-(line 452,col 29)",
        "(line 455,col 9)-(line 484,col 9)",
        "(line 485,col 9)-(line 485,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.reflect.MethodUtils.getMatchingAccessibleMethod(java.lang.Class\u003c?\u003e, java.lang.String, java.lang.Class\u003c?\u003e...)",
      "begin_line": 508,
      "end_line": 542,
      "comment": "\n     * \u003cp\u003eFind an accessible method that matches the given name and has compatible parameters.\n     * Compatible parameters mean that every method parameter is assignable from \n     * the given parameters.\n     * In other words, it finds a method with the given name \n     * that will take the parameters given.\u003cp\u003e\n     *\n     * \u003cp\u003eThis method is used by \n     * {@link \n     * #invokeMethod(Object object, String methodName, Object[] args, Class[] parameterTypes)}.\n     *\n     * \u003cp\u003eThis method can match primitive parameter by passing in wrapper classes.\n     * For example, a \u003ccode\u003eBoolean\u003c/code\u003e will match a primitive \u003ccode\u003eboolean\u003c/code\u003e\n     * parameter.\n     *\n     * @param cls find method in this class\n     * @param methodName find method with this name\n     * @param parameterTypes find method with most compatible parameters \n     * @return The accessible method\n     ",
      "child_ranges": [
        "(line 510,col 9)-(line 515,col 9)",
        "(line 517,col 9)-(line 517,col 32)",
        "(line 518,col 9)-(line 518,col 44)",
        "(line 519,col 9)-(line 537,col 9)",
        "(line 538,col 9)-(line 540,col 9)",
        "(line 541,col 9)-(line 541,col 25)"
      ]
    }
  ]
}