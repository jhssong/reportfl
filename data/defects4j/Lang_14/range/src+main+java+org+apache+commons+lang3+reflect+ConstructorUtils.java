{
  "filepath": "/tmp/Lang-14b/src/main/java/org/apache/commons/lang3/reflect/ConstructorUtils.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ConstructorUtils",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 46,
      "end_line": 289,
      "comment": "\n * \u003cp\u003e Utility reflection methods focused on constructors, modeled after\n * {@link MethodUtils}. \u003c/p\u003e\n *\n * \u003ch3\u003eKnown Limitations\u003c/h3\u003e \u003ch4\u003eAccessing Public Constructors In A Default\n * Access Superclass\u003c/h4\u003e \u003cp\u003eThere is an issue when invoking public constructors\n * contained in a default access superclass. Reflection locates these\n * constructors fine and correctly assigns them as public. However, an\n * \u003ccode\u003eIllegalAccessException\u003c/code\u003e is thrown if the constructors is\n * invoked.\u003c/p\u003e\n *\n * \u003cp\u003e\u003ccode\u003eConstructorUtils\u003c/code\u003e contains a workaround for this situation. It\n * will attempt to call \u003ccode\u003esetAccessible\u003c/code\u003e on this constructor. If this\n * call succeeds, then the method can be invoked as normal. This call will only\n * succeed when the application has sufficient security privileges. If this call\n * fails then a warning will be logged and the method may fail.\u003c/p\u003e\n *\n * @since 2.5\n * @version $Id$\n "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.reflect.ConstructorUtils.ConstructorUtils()",
      "begin_line": 56,
      "end_line": 58,
      "comment": "\n     * \u003cp\u003eConstructorUtils instances should NOT be constructed in standard\n     * programming. Instead, the class should be used as\n     * \u003ccode\u003eConstructorUtils.invokeConstructor(cls, args)\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis constructor is public to permit tools that require a JavaBean\n     * instance to operate.\u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 57,col 9)-(line 57,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.reflect.ConstructorUtils.invokeConstructor(java.lang.Class\u003cT\u003e, java.lang.Object...)",
      "begin_line": 78,
      "end_line": 89,
      "comment": "\n     * \u003cp\u003eReturns a new instance of the specified class inferring the right constructor\n     * from the types of the arguments.\u003c/p\u003e\n     * \n     * \u003cp\u003eThis locates and calls a constructor.\n     * The constructor signature must match the argument types by assignment compatibility.\u003c/p\u003e\n     *\n     * @param \u003cT\u003e the type to be constructed\n     * @param cls  the class to be constructed, not null\n     * @param args  the array of arguments, null treated as empty\n     * @return new instance of \u003ccode\u003ecls\u003c/code\u003e, not null\n     *\n     * @throws NoSuchMethodException if a matching constructor cannot be found\n     * @throws IllegalAccessException if invocation is not permitted by security\n     * @throws InvocationTargetException if an error occurs on invocation\n     * @throws InstantiationException if an error occurs on instantiation\n     * @see #invokeConstructor(java.lang.Class, java.lang.Object[], java.lang.Class[])\n     ",
      "child_ranges": [
        "(line 81,col 9)-(line 83,col 9)",
        "(line 84,col 9)-(line 84,col 59)",
        "(line 85,col 9)-(line 87,col 9)",
        "(line 88,col 9)-(line 88,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.reflect.ConstructorUtils.invokeConstructor(java.lang.Class\u003cT\u003e, java.lang.Object[], java.lang.Class\u003c?\u003e[])",
      "begin_line": 110,
      "end_line": 125,
      "comment": "\n     * \u003cp\u003eReturns a new instance of the specified class choosing the right constructor\n     * from the list of parameter types.\u003c/p\u003e\n     * \n     * \u003cp\u003eThis locates and calls a constructor.\n     * The constructor signature must match the parameter types by assignment compatibility.\u003c/p\u003e\n     *\n     * @param \u003cT\u003e the type to be constructed\n     * @param cls  the class to be constructed, not null\n     * @param args  the array of arguments, null treated as empty\n     * @param parameterTypes  the array of parameter types, null treated as empty\n     * @return new instance of \u003ccode\u003ecls\u003c/code\u003e, not null\n     *\n     * @throws NoSuchMethodException if a matching constructor cannot be found\n     * @throws IllegalAccessException if invocation is not permitted by security\n     * @throws InvocationTargetException if an error occurs on invocation\n     * @throws InstantiationException if an error occurs on instantiation\n     * @see Constructor#newInstance\n     ",
      "child_ranges": [
        "(line 113,col 9)-(line 115,col 9)",
        "(line 116,col 9)-(line 118,col 9)",
        "(line 119,col 9)-(line 119,col 84)",
        "(line 120,col 9)-(line 123,col 9)",
        "(line 124,col 9)-(line 124,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.reflect.ConstructorUtils.invokeExactConstructor(java.lang.Class\u003cT\u003e, java.lang.Object...)",
      "begin_line": 145,
      "end_line": 157,
      "comment": "\n     * \u003cp\u003eReturns a new instance of the specified class inferring the right constructor\n     * from the types of the arguments.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis locates and calls a constructor.\n     * The constructor signature must match the argument types exactly.\u003c/p\u003e\n     *\n     * @param \u003cT\u003e the type to be constructed\n     * @param cls  the class to be constructed, not null\n     * @param args  the array of arguments, null treated as empty\n     * @return new instance of \u003ccode\u003ecls\u003c/code\u003e, not null\n     *\n     * @throws NoSuchMethodException if a matching constructor cannot be found\n     * @throws IllegalAccessException if invocation is not permitted by security\n     * @throws InvocationTargetException if an error occurs on invocation\n     * @throws InstantiationException if an error occurs on instantiation\n     * @see #invokeExactConstructor(java.lang.Class, java.lang.Object[], java.lang.Class[])\n     ",
      "child_ranges": [
        "(line 148,col 9)-(line 150,col 9)",
        "(line 151,col 9)-(line 151,col 36)",
        "(line 152,col 9)-(line 152,col 57)",
        "(line 153,col 9)-(line 155,col 9)",
        "(line 156,col 9)-(line 156,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.reflect.ConstructorUtils.invokeExactConstructor(java.lang.Class\u003cT\u003e, java.lang.Object[], java.lang.Class\u003c?\u003e[])",
      "begin_line": 178,
      "end_line": 193,
      "comment": "\n     * \u003cp\u003eReturns a new instance of the specified class choosing the right constructor\n     * from the list of parameter types.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis locates and calls a constructor.\n     * The constructor signature must match the parameter types exactly.\u003c/p\u003e\n     *\n     * @param \u003cT\u003e the type to be constructed\n     * @param cls  the class to be constructed, not null\n     * @param args  the array of arguments, null treated as empty\n     * @param parameterTypes  the array of parameter types, null treated as empty\n     * @return new instance of \u003ccode\u003ecls\u003c/code\u003e, not null\n     *\n     * @throws NoSuchMethodException if a matching constructor cannot be found\n     * @throws IllegalAccessException if invocation is not permitted by security\n     * @throws InvocationTargetException if an error occurs on invocation\n     * @throws InstantiationException if an error occurs on instantiation\n     * @see Constructor#newInstance\n     ",
      "child_ranges": [
        "(line 181,col 9)-(line 183,col 9)",
        "(line 184,col 9)-(line 186,col 9)",
        "(line 187,col 9)-(line 187,col 76)",
        "(line 188,col 9)-(line 191,col 9)",
        "(line 192,col 9)-(line 192,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.reflect.ConstructorUtils.getAccessibleConstructor(java.lang.Class\u003cT\u003e, java.lang.Class\u003c?\u003e...)",
      "begin_line": 209,
      "end_line": 216,
      "comment": "\n     * \u003cp\u003eFinds a constructor given a class and signature, checking accessibility.\u003c/p\u003e\n     * \n     * \u003cp\u003eThis finds the constructor and ensures that it is accessible.\n     * The constructor signature must match the parameter types exactly.\u003c/p\u003e\n     *\n     * @param \u003cT\u003e the constructor type\n     * @param cls  the class to find a constructor for, not null\n     * @param parameterTypes  the array of parameter types, null treated as empty\n     * @return the constructor, null if no matching accessible constructor found\n     * @see Class#getConstructor\n     * @see #getAccessibleConstructor(java.lang.reflect.Constructor)\n     ",
      "child_ranges": [
        "(line 211,col 9)-(line 215,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.reflect.ConstructorUtils.getAccessibleConstructor(java.lang.reflect.Constructor\u003cT\u003e)",
      "begin_line": 228,
      "end_line": 231,
      "comment": "\n     * \u003cp\u003eChecks if the specified constructor is accessible.\u003c/p\u003e\n     * \n     * \u003cp\u003eThis simply ensures that the constructor is accessible.\u003c/p\u003e\n     *\n     * @param \u003cT\u003e the constructor type\n     * @param ctor  the prototype constructor object, not null\n     * @return the constructor, null if no matching accessible constructor found\n     * @see java.lang.SecurityManager\n     ",
      "child_ranges": [
        "(line 229,col 9)-(line 230,col 92)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.reflect.ConstructorUtils.getMatchingAccessibleConstructor(java.lang.Class\u003cT\u003e, java.lang.Class\u003c?\u003e...)",
      "begin_line": 250,
      "end_line": 287,
      "comment": "\n     * \u003cp\u003eFinds an accessible constructor with compatible parameters.\u003c/p\u003e\n     * \n     * \u003cp\u003eThis checks all the constructor and finds one with compatible parameters\n     * This requires that every parameter is assignable from the given parameter types.\n     * This is a more flexible search than the normal exact matching algorithm.\u003c/p\u003e\n     *\n     * \u003cp\u003eFirst it checks if there is a constructor matching the exact signature.\n     * If not then all the constructors of the class are checked to see if their\n     * signatures are assignment compatible with the parameter types.\n     * The first assignment compatible matching constructor is returned.\u003c/p\u003e\n     *\n     * @param \u003cT\u003e the constructor type\n     * @param cls  the class to find a constructor for, not null\n     * @param parameterTypes find method with compatible parameters\n     * @return the constructor, null if no matching accessible constructor found\n     ",
      "child_ranges": [
        "(line 254,col 9)-(line 259,col 9)",
        "(line 260,col 9)-(line 260,col 37)",
        "(line 265,col 9)-(line 265,col 55)",
        "(line 268,col 9)-(line 285,col 9)",
        "(line 286,col 9)-(line 286,col 22)"
      ]
    }
  ]
}