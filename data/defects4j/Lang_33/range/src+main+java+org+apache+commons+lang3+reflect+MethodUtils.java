{
  "filepath": "/tmp/Lang-33b/src/main/java/org/apache/commons/lang3/reflect/MethodUtils.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "MethodUtils",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 56,
      "end_line": 676,
      "comment": "\n * \u003cp\u003e Utility reflection methods focused on methods, originally from Commons BeanUtils.\n * Differences from the BeanUtils version may be noted, especially where similar functionality\n * already existed within Lang.\n * \u003c/p\u003e\n *\n * \u003ch3\u003eKnown Limitations\u003c/h3\u003e\n * \u003ch4\u003eAccessing Public Methods In A Default Access Superclass\u003c/h4\u003e\n * \u003cp\u003eThere is an issue when invoking public methods contained in a default access superclass on JREs prior to 1.4.\n * Reflection locates these methods fine and correctly assigns them as public.\n * However, an \u003ccode\u003eIllegalAccessException\u003c/code\u003e is thrown if the method is invoked.\u003c/p\u003e\n *\n * \u003cp\u003e\u003ccode\u003eMethodUtils\u003c/code\u003e contains a workaround for this situation. \n * It will attempt to call \u003ccode\u003esetAccessible\u003c/code\u003e on this method.\n * If this call succeeds, then the method can be invoked as normal.\n * This call will only succeed when the application has sufficient security privileges. \n * If this call fails then the method may fail.\u003c/p\u003e\n *\n * @author Apache Software Foundation\n * @author Craig R. McClanahan\n * @author Ralph Schaer\n * @author Chris Audley\n * @author Rey Fran\u0026#231;ois\n * @author Gregor Ra\u0026#253;man\n * @author Jan Sorensen\n * @author Robert Burrell Donkin\n * @author Matt Benson\n * @since 3.0\n * @version $Id$\n "
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
      "signature": "org.apache.commons.lang3.reflect.MethodUtils.invokeMethod(java.lang.Object, java.lang.String, java.lang.Object)",
      "begin_line": 92,
      "end_line": 96,
      "comment": "\n     * \u003cp\u003eInvoke a named method whose parameter type matches the object type.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method delegates the method search to {@link #getMatchingAccessibleMethod(Class, String, Class[])}.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method supports calls to methods taking primitive parameters \n     * via passing in wrapping classes. So, for example, a \u003ccode\u003eBoolean\u003c/code\u003e object\n     * would match a \u003ccode\u003eboolean\u003c/code\u003e primitive.\u003c/p\u003e\n     *\n     * \u003cp\u003e This is a convenient wrapper for\n     * {@link #invokeMethod(Object object, String methodName, Object[] args)}.\n     * \u003c/p\u003e\n     *\n     * @param object invoke method on this object\n     * @param methodName get method with this name\n     * @param arg use this argument\n     * @return The value returned by the invoked method\n     *\n     * @throws NoSuchMethodException if there is no such accessible method\n     * @throws InvocationTargetException wraps an exception thrown by the method invoked\n     * @throws IllegalAccessException if the requested method is not accessible via reflection\n     ",
      "child_ranges": [
        "(line 95,col 9)-(line 95,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.reflect.MethodUtils.invokeMethod(java.lang.Object, java.lang.String, java.lang.Object[])",
      "begin_line": 120,
      "end_line": 132,
      "comment": "\n     * \u003cp\u003eInvoke a named method whose parameter type matches the object type.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method delegates the method search to {@link #getMatchingAccessibleMethod(Class, String, Class[])}.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method supports calls to methods taking primitive parameters \n     * via passing in wrapping classes. So, for example, a \u003ccode\u003eBoolean\u003c/code\u003e object\n     * would match a \u003ccode\u003eboolean\u003c/code\u003e primitive.\u003c/p\u003e\n     *\n     * \u003cp\u003e This is a convenient wrapper for\n     * {@link #invokeMethod(Object object,String methodName, Object[] args, Class[] parameterTypes)}.\n     * \u003c/p\u003e\n     *\n     * @param object invoke method on this object\n     * @param methodName get method with this name\n     * @param args use these arguments - treat null as empty array\n     * @return The value returned by the invoked method\n     *\n     * @throws NoSuchMethodException if there is no such accessible method\n     * @throws InvocationTargetException wraps an exception thrown by the method invoked\n     * @throws IllegalAccessException if the requested method is not accessible via reflection\n     ",
      "child_ranges": [
        "(line 123,col 9)-(line 125,col 9)",
        "(line 126,col 9)-(line 126,col 36)",
        "(line 127,col 9)-(line 127,col 57)",
        "(line 128,col 9)-(line 130,col 9)",
        "(line 131,col 9)-(line 131,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.reflect.MethodUtils.invokeMethod(java.lang.Object, java.lang.String, java.lang.Object[], java.lang.Class\u003c?\u003e[])",
      "begin_line": 153,
      "end_line": 171,
      "comment": "\n     * \u003cp\u003eInvoke a named method whose parameter type matches the object type.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method delegates the method search to {@link #getMatchingAccessibleMethod(Class, String, Class[])}.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method supports calls to methods taking primitive parameters \n     * via passing in wrapping classes. So, for example, a \u003ccode\u003eBoolean\u003c/code\u003e object\n     * would match a \u003ccode\u003eboolean\u003c/code\u003e primitive.\u003c/p\u003e\n     *\n     * @param object invoke method on this object\n     * @param methodName get method with this name\n     * @param args use these arguments - treat null as empty array\n     * @param parameterTypes match these parameters - treat null as empty array\n     * @return The value returned by the invoked method\n     *\n     * @throws NoSuchMethodException if there is no such accessible method\n     * @throws InvocationTargetException wraps an exception thrown by the method invoked\n     * @throws IllegalAccessException if the requested method is not accessible via reflection\n     ",
      "child_ranges": [
        "(line 157,col 9)-(line 159,col 9)",
        "(line 160,col 9)-(line 162,col 9)",
        "(line 163,col 9)-(line 164,col 44)",
        "(line 165,col 9)-(line 169,col 9)",
        "(line 170,col 9)-(line 170,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod(java.lang.Object, java.lang.String, java.lang.Object)",
      "begin_line": 192,
      "end_line": 196,
      "comment": "\n     * \u003cp\u003eInvoke a method whose parameter type matches exactly the object\n     * type.\u003c/p\u003e\n     *\n     * \u003cp\u003e This is a convenient wrapper for\n     * {@link #invokeExactMethod(Object object,String methodName,Object [] args)}.\n     * \u003c/p\u003e\n     *\n     * @param object invoke method on this object\n     * @param methodName get method with this name\n     * @param arg use this argument\n     * @return The value returned by the invoked method\n     *\n     * @throws NoSuchMethodException if there is no such accessible method\n     * @throws InvocationTargetException wraps an exception thrown by the\n     *  method invoked\n     * @throws IllegalAccessException if the requested method is not accessible\n     *  via reflection\n     ",
      "child_ranges": [
        "(line 195,col 9)-(line 195,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod(java.lang.Object, java.lang.String, java.lang.Object[])",
      "begin_line": 216,
      "end_line": 228,
      "comment": "\n     * \u003cp\u003eInvoke a method whose parameter types match exactly the object\n     * types.\u003c/p\u003e\n     *\n     * \u003cp\u003e This uses reflection to invoke the method obtained from a call to\n     * \u003ccode\u003egetAccessibleMethod()\u003c/code\u003e.\u003c/p\u003e\n     *\n     * @param object invoke method on this object\n     * @param methodName get method with this name\n     * @param args use these arguments - treat null as empty array\n     * @return The value returned by the invoked method\n     *\n     * @throws NoSuchMethodException if there is no such accessible method\n     * @throws InvocationTargetException wraps an exception thrown by the\n     *  method invoked\n     * @throws IllegalAccessException if the requested method is not accessible\n     *  via reflection\n     ",
      "child_ranges": [
        "(line 219,col 9)-(line 221,col 9)",
        "(line 222,col 9)-(line 222,col 36)",
        "(line 223,col 9)-(line 223,col 57)",
        "(line 224,col 9)-(line 226,col 9)",
        "(line 227,col 9)-(line 227,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod(java.lang.Object, java.lang.String, java.lang.Object[], java.lang.Class\u003c?\u003e[])",
      "begin_line": 249,
      "end_line": 267,
      "comment": "\n     * \u003cp\u003eInvoke a method whose parameter types match exactly the parameter\n     * types given.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis uses reflection to invoke the method obtained from a call to\n     * \u003ccode\u003egetAccessibleMethod()\u003c/code\u003e.\u003c/p\u003e\n     *\n     * @param object invoke method on this object\n     * @param methodName get method with this name\n     * @param args use these arguments - treat null as empty array\n     * @param parameterTypes match these parameters - treat null as empty array\n     * @return The value returned by the invoked method\n     *\n     * @throws NoSuchMethodException if there is no such accessible method\n     * @throws InvocationTargetException wraps an exception thrown by the\n     *  method invoked\n     * @throws IllegalAccessException if the requested method is not accessible\n     *  via reflection\n     ",
      "child_ranges": [
        "(line 253,col 9)-(line 255,col 9)",
        "(line 256,col 9)-(line 258,col 9)",
        "(line 259,col 9)-(line 260,col 32)",
        "(line 261,col 9)-(line 265,col 9)",
        "(line 266,col 9)-(line 266,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.reflect.MethodUtils.invokeExactStaticMethod(java.lang.Class\u003c?\u003e, java.lang.String, java.lang.Object[], java.lang.Class\u003c?\u003e[])",
      "begin_line": 288,
      "end_line": 304,
      "comment": "\n     * \u003cp\u003eInvoke a static method whose parameter types match exactly the parameter\n     * types given.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis uses reflection to invoke the method obtained from a call to\n     * {@link #getAccessibleMethod(Class, String, Class[])}.\u003c/p\u003e\n     *\n     * @param cls invoke static method on this class\n     * @param methodName get method with this name\n     * @param args use these arguments - treat null as empty array\n     * @param parameterTypes match these parameters - treat null as empty array\n     * @return The value returned by the invoked method\n     *\n     * @throws NoSuchMethodException if there is no such accessible method\n     * @throws InvocationTargetException wraps an exception thrown by the\n     *  method invoked\n     * @throws IllegalAccessException if the requested method is not accessible\n     *  via reflection\n     ",
      "child_ranges": [
        "(line 292,col 9)-(line 294,col 9)",
        "(line 295,col 9)-(line 297,col 9)",
        "(line 298,col 9)-(line 298,col 77)",
        "(line 299,col 9)-(line 302,col 9)",
        "(line 303,col 9)-(line 303,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.reflect.MethodUtils.invokeStaticMethod(java.lang.Class\u003c?\u003e, java.lang.String, java.lang.Object)",
      "begin_line": 330,
      "end_line": 334,
      "comment": "\n     * \u003cp\u003eInvoke a named static method whose parameter type matches the object type.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method delegates the method search to {@link #getMatchingAccessibleMethod(Class, String, Class[])}.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method supports calls to methods taking primitive parameters \n     * via passing in wrapping classes. So, for example, a \u003ccode\u003eBoolean\u003c/code\u003e class\n     * would match a \u003ccode\u003eboolean\u003c/code\u003e primitive.\u003c/p\u003e\n     *\n     * \u003cp\u003e This is a convenient wrapper for\n     * {@link #invokeStaticMethod(Class objectClass,String methodName,Object [] args)}.\n     * \u003c/p\u003e\n     *\n     * @param cls invoke static method on this class\n     * @param methodName get method with this name\n     * @param arg use this argument\n     * @return The value returned by the invoked method\n     *\n     * @throws NoSuchMethodException if there is no such accessible method\n     * @throws InvocationTargetException wraps an exception thrown by the\n     *  method invoked\n     * @throws IllegalAccessException if the requested method is not accessible\n     *  via reflection\n     ",
      "child_ranges": [
        "(line 333,col 9)-(line 333,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.reflect.MethodUtils.invokeStaticMethod(java.lang.Class\u003c?\u003e, java.lang.String, java.lang.Object[])",
      "begin_line": 360,
      "end_line": 372,
      "comment": "\n     * \u003cp\u003eInvoke a named static method whose parameter type matches the object type.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method delegates the method search to {@link #getMatchingAccessibleMethod(Class, String, Class[])}.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method supports calls to methods taking primitive parameters \n     * via passing in wrapping classes. So, for example, a \u003ccode\u003eBoolean\u003c/code\u003e class\n     * would match a \u003ccode\u003eboolean\u003c/code\u003e primitive.\u003c/p\u003e\n     *\n     * \u003cp\u003e This is a convenient wrapper for\n     * {@link #invokeStaticMethod(Class objectClass,String methodName,Object [] args,Class[] parameterTypes)}.\n     * \u003c/p\u003e\n     *\n     * @param cls invoke static method on this class\n     * @param methodName get method with this name\n     * @param args use these arguments - treat null as empty array\n     * @return The value returned by the invoked method\n     *\n     * @throws NoSuchMethodException if there is no such accessible method\n     * @throws InvocationTargetException wraps an exception thrown by the\n     *  method invoked\n     * @throws IllegalAccessException if the requested method is not accessible\n     *  via reflection\n     ",
      "child_ranges": [
        "(line 363,col 9)-(line 365,col 9)",
        "(line 366,col 9)-(line 366,col 36)",
        "(line 367,col 9)-(line 367,col 57)",
        "(line 368,col 9)-(line 370,col 9)",
        "(line 371,col 9)-(line 371,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.reflect.MethodUtils.invokeStaticMethod(java.lang.Class\u003c?\u003e, java.lang.String, java.lang.Object[], java.lang.Class\u003c?\u003e[])",
      "begin_line": 396,
      "end_line": 413,
      "comment": "\n     * \u003cp\u003eInvoke a named static method whose parameter type matches the object type.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method delegates the method search to {@link #getMatchingAccessibleMethod(Class, String, Class[])}.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method supports calls to methods taking primitive parameters \n     * via passing in wrapping classes. So, for example, a \u003ccode\u003eBoolean\u003c/code\u003e class\n     * would match a \u003ccode\u003eboolean\u003c/code\u003e primitive.\u003c/p\u003e\n     *\n     *\n     * @param cls invoke static method on this class\n     * @param methodName get method with this name\n     * @param args use these arguments - treat null as empty array\n     * @param parameterTypes match these parameters - treat null as empty array\n     * @return The value returned by the invoked method\n     *\n     * @throws NoSuchMethodException if there is no such accessible method\n     * @throws InvocationTargetException wraps an exception thrown by the\n     *  method invoked\n     * @throws IllegalAccessException if the requested method is not accessible\n     *  via reflection\n     ",
      "child_ranges": [
        "(line 400,col 9)-(line 402,col 9)",
        "(line 403,col 9)-(line 405,col 9)",
        "(line 406,col 9)-(line 407,col 32)",
        "(line 408,col 9)-(line 411,col 9)",
        "(line 412,col 9)-(line 412,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.reflect.MethodUtils.invokeExactStaticMethod(java.lang.Class\u003c?\u003e, java.lang.String, java.lang.Object)",
      "begin_line": 434,
      "end_line": 438,
      "comment": "\n     * \u003cp\u003eInvoke a static method whose parameter type matches exactly the object\n     * type.\u003c/p\u003e\n     *\n     * \u003cp\u003e This is a convenient wrapper for\n     * {@link #invokeExactStaticMethod(Class objectClass,String methodName,Object [] args)}.\n     * \u003c/p\u003e\n     *\n     * @param cls invoke static method on this class\n     * @param methodName get method with this name\n     * @param arg use this argument\n     * @return The value returned by the invoked method\n     *\n     * @throws NoSuchMethodException if there is no such accessible method\n     * @throws InvocationTargetException wraps an exception thrown by the\n     *  method invoked\n     * @throws IllegalAccessException if the requested method is not accessible\n     *  via reflection\n     ",
      "child_ranges": [
        "(line 437,col 9)-(line 437,col 78)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.reflect.MethodUtils.invokeExactStaticMethod(java.lang.Class\u003c?\u003e, java.lang.String, java.lang.Object[])",
      "begin_line": 458,
      "end_line": 470,
      "comment": "\n     * \u003cp\u003eInvoke a static method whose parameter types match exactly the object\n     * types.\u003c/p\u003e\n     *\n     * \u003cp\u003e This uses reflection to invoke the method obtained from a call to\n     * {@link #getAccessibleMethod(Class, String, Class[])}.\u003c/p\u003e\n     *\n     * @param cls invoke static method on this class\n     * @param methodName get method with this name\n     * @param args use these arguments - treat null as empty array\n     * @return The value returned by the invoked method\n     *\n     * @throws NoSuchMethodException if there is no such accessible method\n     * @throws InvocationTargetException wraps an exception thrown by the\n     *  method invoked\n     * @throws IllegalAccessException if the requested method is not accessible\n     *  via reflection\n     ",
      "child_ranges": [
        "(line 461,col 9)-(line 463,col 9)",
        "(line 464,col 9)-(line 464,col 36)",
        "(line 465,col 9)-(line 465,col 57)",
        "(line 466,col 9)-(line 468,col 9)",
        "(line 469,col 9)-(line 469,col 78)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.reflect.MethodUtils.getAccessibleMethod(java.lang.Class\u003c?\u003e, java.lang.String, java.lang.Class\u003c?\u003e)",
      "begin_line": 484,
      "end_line": 488,
      "comment": "\n     * \u003cp\u003eReturn an accessible method (that is, one that can be invoked via\n     * reflection) with given name and a single parameter.  If no such method\n     * can be found, return \u003ccode\u003enull\u003c/code\u003e.\n     * Basically, a convenience wrapper that constructs a \u003ccode\u003eClass\u003c/code\u003e\n     * array for you.\u003c/p\u003e\n     *\n     * @param cls get method from this class\n     * @param methodName get method with this name\n     * @param parameterType taking this type of parameter\n     * @return The accessible method\n     ",
      "child_ranges": [
        "(line 486,col 9)-(line 487,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.reflect.MethodUtils.getAccessibleMethod(java.lang.Class\u003c?\u003e, java.lang.String, java.lang.Class\u003c?\u003e[])",
      "begin_line": 502,
      "end_line": 510,
      "comment": "\n     * \u003cp\u003eReturn an accessible method (that is, one that can be invoked via\n     * reflection) with given name and parameters.  If no such method\n     * can be found, return \u003ccode\u003enull\u003c/code\u003e.\n     * This is just a convenient wrapper for\n     * {@link #getAccessibleMethod(Method method)}.\u003c/p\u003e\n     *\n     * @param cls get method from this class\n     * @param methodName get method with this name\n     * @param parameterTypes with these parameters types\n     * @return The accessible method\n     ",
      "child_ranges": [
        "(line 504,col 9)-(line 509,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.reflect.MethodUtils.getAccessibleMethod(java.lang.reflect.Method)",
      "begin_line": 520,
      "end_line": 542,
      "comment": "\n     * \u003cp\u003eReturn an accessible method (that is, one that can be invoked via\n     * reflection) that implements the specified Method.  If no such method\n     * can be found, return \u003ccode\u003enull\u003c/code\u003e.\u003c/p\u003e\n     *\n     * @param method The method that we wish to call\n     * @return The accessible method\n     ",
      "child_ranges": [
        "(line 521,col 9)-(line 523,col 9)",
        "(line 525,col 9)-(line 525,col 50)",
        "(line 526,col 9)-(line 528,col 9)",
        "(line 529,col 9)-(line 529,col 45)",
        "(line 530,col 9)-(line 530,col 63)",
        "(line 533,col 9)-(line 534,col 32)",
        "(line 537,col 9)-(line 540,col 9)",
        "(line 541,col 9)-(line 541,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.reflect.MethodUtils.getAccessibleMethodFromSuperclass(java.lang.Class\u003c?\u003e, java.lang.String, java.lang.Class\u003c?\u003e[])",
      "begin_line": 553,
      "end_line": 567,
      "comment": "\n     * \u003cp\u003eReturn an accessible method (that is, one that can be invoked via\n     * reflection) by scanning through the superclasses. If no such method\n     * can be found, return \u003ccode\u003enull\u003c/code\u003e.\u003c/p\u003e\n     *\n     * @param cls Class to be checked\n     * @param methodName Method name of the method we wish to call\n     * @param parameterTypes The parameter type signatures\n     ",
      "child_ranges": [
        "(line 555,col 9)-(line 555,col 51)",
        "(line 556,col 9)-(line 565,col 9)",
        "(line 566,col 9)-(line 566,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.reflect.MethodUtils.getAccessibleMethodFromInterfaceNest(java.lang.Class\u003c?\u003e, java.lang.String, java.lang.Class\u003c?\u003e[])",
      "begin_line": 583,
      "end_line": 619,
      "comment": "\n     * \u003cp\u003eReturn an accessible method (that is, one that can be invoked via\n     * reflection) that implements the specified method, by scanning through\n     * all implemented interfaces and subinterfaces.  If no such method\n     * can be found, return \u003ccode\u003enull\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cp\u003e There isn\u0027t any good reason why this method must be private.\n     * It is because there doesn\u0027t seem any reason why other classes should\n     * call this rather than the higher level methods.\u003c/p\u003e\n     *\n     * @param cls Parent class for the interfaces to be checked\n     * @param methodName Method name of the method we wish to call\n     * @param parameterTypes The parameter type signatures\n     ",
      "child_ranges": [
        "(line 585,col 9)-(line 585,col 29)",
        "(line 588,col 9)-(line 617,col 9)",
        "(line 618,col 9)-(line 618,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.reflect.MethodUtils.getMatchingAccessibleMethod(java.lang.Class\u003c?\u003e, java.lang.String, java.lang.Class\u003c?\u003e[])",
      "begin_line": 641,
      "end_line": 675,
      "comment": "\n     * \u003cp\u003eFind an accessible method that matches the given name and has compatible parameters.\n     * Compatible parameters mean that every method parameter is assignable from \n     * the given parameters.\n     * In other words, it finds a method with the given name \n     * that will take the parameters given.\u003cp\u003e\n     *\n     * \u003cp\u003eThis method is used by \n     * {@link \n     * #invokeMethod(Object object, String methodName, Object[] args, Class[] parameterTypes)}.\n     *\n     * \u003cp\u003eThis method can match primitive parameter by passing in wrapper classes.\n     * For example, a \u003ccode\u003eBoolean\u003c/code\u003e will match a primitive \u003ccode\u003eboolean\u003c/code\u003e\n     * parameter.\n     *\n     * @param cls find method in this class\n     * @param methodName find method with this name\n     * @param parameterTypes find method with most compatible parameters \n     * @return The accessible method\n     ",
      "child_ranges": [
        "(line 643,col 9)-(line 648,col 9)",
        "(line 650,col 9)-(line 650,col 32)",
        "(line 651,col 9)-(line 651,col 44)",
        "(line 652,col 9)-(line 670,col 9)",
        "(line 671,col 9)-(line 673,col 9)",
        "(line 674,col 9)-(line 674,col 25)"
      ]
    }
  ]
}