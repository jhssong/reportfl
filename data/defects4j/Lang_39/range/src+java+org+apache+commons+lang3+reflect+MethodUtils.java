{
  "filepath": "/tmp/Lang-39b/src/java/org/apache/commons/lang3/reflect/MethodUtils.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "MethodUtils",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 57,
      "end_line": 677,
      "comment": "\n * \u003cp\u003e Utility reflection methods focused on methods, originally from Commons BeanUtils.\n * Differences from the BeanUtils version may be noted, especially where similar functionality\n * already existed within Lang.\n * \u003c/p\u003e\n *\n * \u003ch3\u003eKnown Limitations\u003c/h3\u003e\n * \u003ch4\u003eAccessing Public Methods In A Default Access Superclass\u003c/h4\u003e\n * \u003cp\u003eThere is an issue when invoking public methods contained in a default access superclass on JREs prior to 1.4.\n * Reflection locates these methods fine and correctly assigns them as public.\n * However, an \u003ccode\u003eIllegalAccessException\u003c/code\u003e is thrown if the method is invoked.\u003c/p\u003e\n *\n * \u003cp\u003e\u003ccode\u003eMethodUtils\u003c/code\u003e contains a workaround for this situation. \n * It will attempt to call \u003ccode\u003esetAccessible\u003c/code\u003e on this method.\n * If this call succeeds, then the method can be invoked as normal.\n * This call will only succeed when the application has sufficient security privileges. \n * If this call fails then the method may fail.\u003c/p\u003e\n *\n * @author Apache Software Foundation\n * @author Craig R. McClanahan\n * @author Ralph Schaer\n * @author Chris Audley\n * @author Rey Fran\u0026#231;ois\n * @author Gregor Ra\u0026#253;man\n * @author Jan Sorensen\n * @author Robert Burrell Donkin\n * @author Niall Pemberton\n * @author Matt Benson\n * @since 3.0\n * @version $Id$\n "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.reflect.MethodUtils.MethodUtils()",
      "begin_line": 67,
      "end_line": 69,
      "comment": "\n     * \u003cp\u003eMethodUtils instances should NOT be constructed in standard programming.\n     * Instead, the class should be used as\n     * \u003ccode\u003eMethodUtils.getAccessibleMethod(method)\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis constructor is public to permit tools that require a JavaBean\n     * instance to operate.\u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 68,col 9)-(line 68,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.reflect.MethodUtils.invokeMethod(java.lang.Object, java.lang.String, java.lang.Object)",
      "begin_line": 93,
      "end_line": 97,
      "comment": "\n     * \u003cp\u003eInvoke a named method whose parameter type matches the object type.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method delegates the method search to {@link #getMatchingAccessibleMethod(Class, String, Class[])}.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method supports calls to methods taking primitive parameters \n     * via passing in wrapping classes. So, for example, a \u003ccode\u003eBoolean\u003c/code\u003e object\n     * would match a \u003ccode\u003eboolean\u003c/code\u003e primitive.\u003c/p\u003e\n     *\n     * \u003cp\u003e This is a convenient wrapper for\n     * {@link #invokeMethod(Object object, String methodName, Object[] args)}.\n     * \u003c/p\u003e\n     *\n     * @param object invoke method on this object\n     * @param methodName get method with this name\n     * @param arg use this argument\n     * @return The value returned by the invoked method\n     *\n     * @throws NoSuchMethodException if there is no such accessible method\n     * @throws InvocationTargetException wraps an exception thrown by the method invoked\n     * @throws IllegalAccessException if the requested method is not accessible via reflection\n     ",
      "child_ranges": [
        "(line 96,col 9)-(line 96,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.reflect.MethodUtils.invokeMethod(java.lang.Object, java.lang.String, java.lang.Object[])",
      "begin_line": 121,
      "end_line": 133,
      "comment": "\n     * \u003cp\u003eInvoke a named method whose parameter type matches the object type.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method delegates the method search to {@link #getMatchingAccessibleMethod(Class, String, Class[])}.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method supports calls to methods taking primitive parameters \n     * via passing in wrapping classes. So, for example, a \u003ccode\u003eBoolean\u003c/code\u003e object\n     * would match a \u003ccode\u003eboolean\u003c/code\u003e primitive.\u003c/p\u003e\n     *\n     * \u003cp\u003e This is a convenient wrapper for\n     * {@link #invokeMethod(Object object,String methodName, Object[] args, Class[] parameterTypes)}.\n     * \u003c/p\u003e\n     *\n     * @param object invoke method on this object\n     * @param methodName get method with this name\n     * @param args use these arguments - treat null as empty array\n     * @return The value returned by the invoked method\n     *\n     * @throws NoSuchMethodException if there is no such accessible method\n     * @throws InvocationTargetException wraps an exception thrown by the method invoked\n     * @throws IllegalAccessException if the requested method is not accessible via reflection\n     ",
      "child_ranges": [
        "(line 124,col 9)-(line 126,col 9)",
        "(line 127,col 9)-(line 127,col 36)",
        "(line 128,col 9)-(line 128,col 57)",
        "(line 129,col 9)-(line 131,col 9)",
        "(line 132,col 9)-(line 132,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.reflect.MethodUtils.invokeMethod(java.lang.Object, java.lang.String, java.lang.Object[], java.lang.Class\u003c?\u003e[])",
      "begin_line": 154,
      "end_line": 172,
      "comment": "\n     * \u003cp\u003eInvoke a named method whose parameter type matches the object type.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method delegates the method search to {@link #getMatchingAccessibleMethod(Class, String, Class[])}.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method supports calls to methods taking primitive parameters \n     * via passing in wrapping classes. So, for example, a \u003ccode\u003eBoolean\u003c/code\u003e object\n     * would match a \u003ccode\u003eboolean\u003c/code\u003e primitive.\u003c/p\u003e\n     *\n     * @param object invoke method on this object\n     * @param methodName get method with this name\n     * @param args use these arguments - treat null as empty array\n     * @param parameterTypes match these parameters - treat null as empty array\n     * @return The value returned by the invoked method\n     *\n     * @throws NoSuchMethodException if there is no such accessible method\n     * @throws InvocationTargetException wraps an exception thrown by the method invoked\n     * @throws IllegalAccessException if the requested method is not accessible via reflection\n     ",
      "child_ranges": [
        "(line 158,col 9)-(line 160,col 9)",
        "(line 161,col 9)-(line 163,col 9)",
        "(line 164,col 9)-(line 165,col 44)",
        "(line 166,col 9)-(line 170,col 9)",
        "(line 171,col 9)-(line 171,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod(java.lang.Object, java.lang.String, java.lang.Object)",
      "begin_line": 193,
      "end_line": 197,
      "comment": "\n     * \u003cp\u003eInvoke a method whose parameter type matches exactly the object\n     * type.\u003c/p\u003e\n     *\n     * \u003cp\u003e This is a convenient wrapper for\n     * {@link #invokeExactMethod(Object object,String methodName,Object [] args)}.\n     * \u003c/p\u003e\n     *\n     * @param object invoke method on this object\n     * @param methodName get method with this name\n     * @param arg use this argument\n     * @return The value returned by the invoked method\n     *\n     * @throws NoSuchMethodException if there is no such accessible method\n     * @throws InvocationTargetException wraps an exception thrown by the\n     *  method invoked\n     * @throws IllegalAccessException if the requested method is not accessible\n     *  via reflection\n     ",
      "child_ranges": [
        "(line 196,col 9)-(line 196,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod(java.lang.Object, java.lang.String, java.lang.Object[])",
      "begin_line": 217,
      "end_line": 229,
      "comment": "\n     * \u003cp\u003eInvoke a method whose parameter types match exactly the object\n     * types.\u003c/p\u003e\n     *\n     * \u003cp\u003e This uses reflection to invoke the method obtained from a call to\n     * \u003ccode\u003egetAccessibleMethod()\u003c/code\u003e.\u003c/p\u003e\n     *\n     * @param object invoke method on this object\n     * @param methodName get method with this name\n     * @param args use these arguments - treat null as empty array\n     * @return The value returned by the invoked method\n     *\n     * @throws NoSuchMethodException if there is no such accessible method\n     * @throws InvocationTargetException wraps an exception thrown by the\n     *  method invoked\n     * @throws IllegalAccessException if the requested method is not accessible\n     *  via reflection\n     ",
      "child_ranges": [
        "(line 220,col 9)-(line 222,col 9)",
        "(line 223,col 9)-(line 223,col 36)",
        "(line 224,col 9)-(line 224,col 57)",
        "(line 225,col 9)-(line 227,col 9)",
        "(line 228,col 9)-(line 228,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod(java.lang.Object, java.lang.String, java.lang.Object[], java.lang.Class\u003c?\u003e[])",
      "begin_line": 250,
      "end_line": 268,
      "comment": "\n     * \u003cp\u003eInvoke a method whose parameter types match exactly the parameter\n     * types given.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis uses reflection to invoke the method obtained from a call to\n     * \u003ccode\u003egetAccessibleMethod()\u003c/code\u003e.\u003c/p\u003e\n     *\n     * @param object invoke method on this object\n     * @param methodName get method with this name\n     * @param args use these arguments - treat null as empty array\n     * @param parameterTypes match these parameters - treat null as empty array\n     * @return The value returned by the invoked method\n     *\n     * @throws NoSuchMethodException if there is no such accessible method\n     * @throws InvocationTargetException wraps an exception thrown by the\n     *  method invoked\n     * @throws IllegalAccessException if the requested method is not accessible\n     *  via reflection\n     ",
      "child_ranges": [
        "(line 254,col 9)-(line 256,col 9)",
        "(line 257,col 9)-(line 259,col 9)",
        "(line 260,col 9)-(line 261,col 32)",
        "(line 262,col 9)-(line 266,col 9)",
        "(line 267,col 9)-(line 267,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.reflect.MethodUtils.invokeExactStaticMethod(java.lang.Class\u003c?\u003e, java.lang.String, java.lang.Object[], java.lang.Class\u003c?\u003e[])",
      "begin_line": 289,
      "end_line": 305,
      "comment": "\n     * \u003cp\u003eInvoke a static method whose parameter types match exactly the parameter\n     * types given.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis uses reflection to invoke the method obtained from a call to\n     * {@link #getAccessibleMethod(Class, String, Class[])}.\u003c/p\u003e\n     *\n     * @param cls invoke static method on this class\n     * @param methodName get method with this name\n     * @param args use these arguments - treat null as empty array\n     * @param parameterTypes match these parameters - treat null as empty array\n     * @return The value returned by the invoked method\n     *\n     * @throws NoSuchMethodException if there is no such accessible method\n     * @throws InvocationTargetException wraps an exception thrown by the\n     *  method invoked\n     * @throws IllegalAccessException if the requested method is not accessible\n     *  via reflection\n     ",
      "child_ranges": [
        "(line 293,col 9)-(line 295,col 9)",
        "(line 296,col 9)-(line 298,col 9)",
        "(line 299,col 9)-(line 299,col 77)",
        "(line 300,col 9)-(line 303,col 9)",
        "(line 304,col 9)-(line 304,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.reflect.MethodUtils.invokeStaticMethod(java.lang.Class\u003c?\u003e, java.lang.String, java.lang.Object)",
      "begin_line": 331,
      "end_line": 335,
      "comment": "\n     * \u003cp\u003eInvoke a named static method whose parameter type matches the object type.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method delegates the method search to {@link #getMatchingAccessibleMethod(Class, String, Class[])}.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method supports calls to methods taking primitive parameters \n     * via passing in wrapping classes. So, for example, a \u003ccode\u003eBoolean\u003c/code\u003e class\n     * would match a \u003ccode\u003eboolean\u003c/code\u003e primitive.\u003c/p\u003e\n     *\n     * \u003cp\u003e This is a convenient wrapper for\n     * {@link #invokeStaticMethod(Class objectClass,String methodName,Object [] args)}.\n     * \u003c/p\u003e\n     *\n     * @param cls invoke static method on this class\n     * @param methodName get method with this name\n     * @param arg use this argument\n     * @return The value returned by the invoked method\n     *\n     * @throws NoSuchMethodException if there is no such accessible method\n     * @throws InvocationTargetException wraps an exception thrown by the\n     *  method invoked\n     * @throws IllegalAccessException if the requested method is not accessible\n     *  via reflection\n     ",
      "child_ranges": [
        "(line 334,col 9)-(line 334,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.reflect.MethodUtils.invokeStaticMethod(java.lang.Class\u003c?\u003e, java.lang.String, java.lang.Object[])",
      "begin_line": 361,
      "end_line": 373,
      "comment": "\n     * \u003cp\u003eInvoke a named static method whose parameter type matches the object type.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method delegates the method search to {@link #getMatchingAccessibleMethod(Class, String, Class[])}.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method supports calls to methods taking primitive parameters \n     * via passing in wrapping classes. So, for example, a \u003ccode\u003eBoolean\u003c/code\u003e class\n     * would match a \u003ccode\u003eboolean\u003c/code\u003e primitive.\u003c/p\u003e\n     *\n     * \u003cp\u003e This is a convenient wrapper for\n     * {@link #invokeStaticMethod(Class objectClass,String methodName,Object [] args,Class[] parameterTypes)}.\n     * \u003c/p\u003e\n     *\n     * @param cls invoke static method on this class\n     * @param methodName get method with this name\n     * @param args use these arguments - treat null as empty array\n     * @return The value returned by the invoked method\n     *\n     * @throws NoSuchMethodException if there is no such accessible method\n     * @throws InvocationTargetException wraps an exception thrown by the\n     *  method invoked\n     * @throws IllegalAccessException if the requested method is not accessible\n     *  via reflection\n     ",
      "child_ranges": [
        "(line 364,col 9)-(line 366,col 9)",
        "(line 367,col 9)-(line 367,col 36)",
        "(line 368,col 9)-(line 368,col 57)",
        "(line 369,col 9)-(line 371,col 9)",
        "(line 372,col 9)-(line 372,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.reflect.MethodUtils.invokeStaticMethod(java.lang.Class\u003c?\u003e, java.lang.String, java.lang.Object[], java.lang.Class\u003c?\u003e[])",
      "begin_line": 397,
      "end_line": 414,
      "comment": "\n     * \u003cp\u003eInvoke a named static method whose parameter type matches the object type.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method delegates the method search to {@link #getMatchingAccessibleMethod(Class, String, Class[])}.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method supports calls to methods taking primitive parameters \n     * via passing in wrapping classes. So, for example, a \u003ccode\u003eBoolean\u003c/code\u003e class\n     * would match a \u003ccode\u003eboolean\u003c/code\u003e primitive.\u003c/p\u003e\n     *\n     *\n     * @param cls invoke static method on this class\n     * @param methodName get method with this name\n     * @param args use these arguments - treat null as empty array\n     * @param parameterTypes match these parameters - treat null as empty array\n     * @return The value returned by the invoked method\n     *\n     * @throws NoSuchMethodException if there is no such accessible method\n     * @throws InvocationTargetException wraps an exception thrown by the\n     *  method invoked\n     * @throws IllegalAccessException if the requested method is not accessible\n     *  via reflection\n     ",
      "child_ranges": [
        "(line 401,col 9)-(line 403,col 9)",
        "(line 404,col 9)-(line 406,col 9)",
        "(line 407,col 9)-(line 408,col 32)",
        "(line 409,col 9)-(line 412,col 9)",
        "(line 413,col 9)-(line 413,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.reflect.MethodUtils.invokeExactStaticMethod(java.lang.Class\u003c?\u003e, java.lang.String, java.lang.Object)",
      "begin_line": 435,
      "end_line": 439,
      "comment": "\n     * \u003cp\u003eInvoke a static method whose parameter type matches exactly the object\n     * type.\u003c/p\u003e\n     *\n     * \u003cp\u003e This is a convenient wrapper for\n     * {@link #invokeExactStaticMethod(Class objectClass,String methodName,Object [] args)}.\n     * \u003c/p\u003e\n     *\n     * @param cls invoke static method on this class\n     * @param methodName get method with this name\n     * @param arg use this argument\n     * @return The value returned by the invoked method\n     *\n     * @throws NoSuchMethodException if there is no such accessible method\n     * @throws InvocationTargetException wraps an exception thrown by the\n     *  method invoked\n     * @throws IllegalAccessException if the requested method is not accessible\n     *  via reflection\n     ",
      "child_ranges": [
        "(line 438,col 9)-(line 438,col 78)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.reflect.MethodUtils.invokeExactStaticMethod(java.lang.Class\u003c?\u003e, java.lang.String, java.lang.Object[])",
      "begin_line": 459,
      "end_line": 471,
      "comment": "\n     * \u003cp\u003eInvoke a static method whose parameter types match exactly the object\n     * types.\u003c/p\u003e\n     *\n     * \u003cp\u003e This uses reflection to invoke the method obtained from a call to\n     * {@link #getAccessibleMethod(Class, String, Class[])}.\u003c/p\u003e\n     *\n     * @param cls invoke static method on this class\n     * @param methodName get method with this name\n     * @param args use these arguments - treat null as empty array\n     * @return The value returned by the invoked method\n     *\n     * @throws NoSuchMethodException if there is no such accessible method\n     * @throws InvocationTargetException wraps an exception thrown by the\n     *  method invoked\n     * @throws IllegalAccessException if the requested method is not accessible\n     *  via reflection\n     ",
      "child_ranges": [
        "(line 462,col 9)-(line 464,col 9)",
        "(line 465,col 9)-(line 465,col 36)",
        "(line 466,col 9)-(line 466,col 57)",
        "(line 467,col 9)-(line 469,col 9)",
        "(line 470,col 9)-(line 470,col 78)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.reflect.MethodUtils.getAccessibleMethod(java.lang.Class\u003c?\u003e, java.lang.String, java.lang.Class\u003c?\u003e)",
      "begin_line": 485,
      "end_line": 489,
      "comment": "\n     * \u003cp\u003eReturn an accessible method (that is, one that can be invoked via\n     * reflection) with given name and a single parameter.  If no such method\n     * can be found, return \u003ccode\u003enull\u003c/code\u003e.\n     * Basically, a convenience wrapper that constructs a \u003ccode\u003eClass\u003c/code\u003e\n     * array for you.\u003c/p\u003e\n     *\n     * @param cls get method from this class\n     * @param methodName get method with this name\n     * @param parameterType taking this type of parameter\n     * @return The accessible method\n     ",
      "child_ranges": [
        "(line 487,col 9)-(line 488,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.reflect.MethodUtils.getAccessibleMethod(java.lang.Class\u003c?\u003e, java.lang.String, java.lang.Class\u003c?\u003e[])",
      "begin_line": 503,
      "end_line": 511,
      "comment": "\n     * \u003cp\u003eReturn an accessible method (that is, one that can be invoked via\n     * reflection) with given name and parameters.  If no such method\n     * can be found, return \u003ccode\u003enull\u003c/code\u003e.\n     * This is just a convenient wrapper for\n     * {@link #getAccessibleMethod(Method method)}.\u003c/p\u003e\n     *\n     * @param cls get method from this class\n     * @param methodName get method with this name\n     * @param parameterTypes with these parameters types\n     * @return The accessible method\n     ",
      "child_ranges": [
        "(line 505,col 9)-(line 510,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.reflect.MethodUtils.getAccessibleMethod(java.lang.reflect.Method)",
      "begin_line": 521,
      "end_line": 543,
      "comment": "\n     * \u003cp\u003eReturn an accessible method (that is, one that can be invoked via\n     * reflection) that implements the specified Method.  If no such method\n     * can be found, return \u003ccode\u003enull\u003c/code\u003e.\u003c/p\u003e\n     *\n     * @param method The method that we wish to call\n     * @return The accessible method\n     ",
      "child_ranges": [
        "(line 522,col 9)-(line 524,col 9)",
        "(line 526,col 9)-(line 526,col 50)",
        "(line 527,col 9)-(line 529,col 9)",
        "(line 530,col 9)-(line 530,col 45)",
        "(line 531,col 9)-(line 531,col 63)",
        "(line 534,col 9)-(line 535,col 32)",
        "(line 538,col 9)-(line 541,col 9)",
        "(line 542,col 9)-(line 542,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.reflect.MethodUtils.getAccessibleMethodFromSuperclass(java.lang.Class\u003c?\u003e, java.lang.String, java.lang.Class\u003c?\u003e[])",
      "begin_line": 554,
      "end_line": 568,
      "comment": "\n     * \u003cp\u003eReturn an accessible method (that is, one that can be invoked via\n     * reflection) by scanning through the superclasses. If no such method\n     * can be found, return \u003ccode\u003enull\u003c/code\u003e.\u003c/p\u003e\n     *\n     * @param cls Class to be checked\n     * @param methodName Method name of the method we wish to call\n     * @param parameterTypes The parameter type signatures\n     ",
      "child_ranges": [
        "(line 556,col 9)-(line 556,col 51)",
        "(line 557,col 9)-(line 566,col 9)",
        "(line 567,col 9)-(line 567,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.reflect.MethodUtils.getAccessibleMethodFromInterfaceNest(java.lang.Class\u003c?\u003e, java.lang.String, java.lang.Class\u003c?\u003e[])",
      "begin_line": 584,
      "end_line": 620,
      "comment": "\n     * \u003cp\u003eReturn an accessible method (that is, one that can be invoked via\n     * reflection) that implements the specified method, by scanning through\n     * all implemented interfaces and subinterfaces.  If no such method\n     * can be found, return \u003ccode\u003enull\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cp\u003e There isn\u0027t any good reason why this method must be private.\n     * It is because there doesn\u0027t seem any reason why other classes should\n     * call this rather than the higher level methods.\u003c/p\u003e\n     *\n     * @param cls Parent class for the interfaces to be checked\n     * @param methodName Method name of the method we wish to call\n     * @param parameterTypes The parameter type signatures\n     ",
      "child_ranges": [
        "(line 586,col 9)-(line 586,col 29)",
        "(line 589,col 9)-(line 618,col 9)",
        "(line 619,col 9)-(line 619,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.reflect.MethodUtils.getMatchingAccessibleMethod(java.lang.Class\u003c?\u003e, java.lang.String, java.lang.Class\u003c?\u003e[])",
      "begin_line": 642,
      "end_line": 676,
      "comment": "\n     * \u003cp\u003eFind an accessible method that matches the given name and has compatible parameters.\n     * Compatible parameters mean that every method parameter is assignable from \n     * the given parameters.\n     * In other words, it finds a method with the given name \n     * that will take the parameters given.\u003cp\u003e\n     *\n     * \u003cp\u003eThis method is used by \n     * {@link \n     * #invokeMethod(Object object, String methodName, Object[] args, Class[] parameterTypes)}.\n     *\n     * \u003cp\u003eThis method can match primitive parameter by passing in wrapper classes.\n     * For example, a \u003ccode\u003eBoolean\u003c/code\u003e will match a primitive \u003ccode\u003eboolean\u003c/code\u003e\n     * parameter.\n     *\n     * @param cls find method in this class\n     * @param methodName find method with this name\n     * @param parameterTypes find method with most compatible parameters \n     * @return The accessible method\n     ",
      "child_ranges": [
        "(line 644,col 9)-(line 649,col 9)",
        "(line 651,col 9)-(line 651,col 32)",
        "(line 652,col 9)-(line 652,col 44)",
        "(line 653,col 9)-(line 671,col 9)",
        "(line 672,col 9)-(line 674,col 9)",
        "(line 675,col 9)-(line 675,col 25)"
      ]
    }
  ]
}