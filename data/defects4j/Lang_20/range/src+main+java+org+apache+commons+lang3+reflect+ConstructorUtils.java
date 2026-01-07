{
  "filepath": "/tmp/Lang-20b/src/main/java/org/apache/commons/lang3/reflect/ConstructorUtils.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ConstructorUtils",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 46,
      "end_line": 295,
      "comment": "\n * \u003cp\u003e Utility reflection methods focussed on constructors, modelled after\n * {@link MethodUtils}. \u003c/p\u003e\n *\n * \u003ch3\u003eKnown Limitations\u003c/h3\u003e \u003ch4\u003eAccessing Public Constructors In A Default\n * Access Superclass\u003c/h4\u003e \u003cp\u003eThere is an issue when invoking public constructors\n * contained in a default access superclass. Reflection locates these\n * constructors fine and correctly assigns them as public. However, an\n * \u003ccode\u003eIllegalAccessException\u003c/code\u003e is thrown if the constructors is\n * invoked.\u003c/p\u003e\n *\n * \u003cp\u003e\u003ccode\u003eConstructorUtils\u003c/code\u003e contains a workaround for this situation. It\n * will attempt to call \u003ccode\u003esetAccessible\u003c/code\u003e on this constructor. If this\n * call succeeds, then the method can be invoked as normal. This call will only\n * succeed when the application has sufficient security privilages. If this call\n * fails then a warning will be logged and the method may fail.\u003c/p\u003e\n *\n * @since 2.5\n * @version $Id$\n "
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
      "begin_line": 84,
      "end_line": 95,
      "comment": "\n     * \u003cp\u003eReturns new instance of \u003ccode\u003eklazz\u003c/code\u003e created using the actual\n     * arguments \u003ccode\u003eargs\u003c/code\u003e. The formal parameter types are inferred from\n     * the actual values of \u003ccode\u003eargs\u003c/code\u003e. See\n     * {@link #invokeExactConstructor(Class, Object[], Class[])} for more\n     * details.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe signatures should be assignment compatible.\u003c/p\u003e\n     *\n     * @param \u003cT\u003e the type to be constructed\n     * @param cls the class to be constructed.\n     * @param args actual argument array\n     * @return new instance of \u003ccode\u003eklazz\u003c/code\u003e\n     *\n     * @throws NoSuchMethodException If the constructor cannot be found\n     * @throws IllegalAccessException If an error occurs accessing the\n     * constructor\n     * @throws InvocationTargetException If an error occurs invoking the\n     * constructor\n     * @throws InstantiationException If an error occurs instantiating the class\n     *\n     * @see #invokeConstructor(java.lang.Class, java.lang.Object[],\n     * java.lang.Class[])\n     ",
      "child_ranges": [
        "(line 87,col 9)-(line 89,col 9)",
        "(line 90,col 9)-(line 90,col 59)",
        "(line 91,col 9)-(line 93,col 9)",
        "(line 94,col 9)-(line 94,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.reflect.ConstructorUtils.invokeConstructor(java.lang.Class\u003cT\u003e, java.lang.Object[], java.lang.Class\u003c?\u003e[])",
      "begin_line": 116,
      "end_line": 131,
      "comment": "\n     * \u003cp\u003eReturns new instance of \u003ccode\u003eklazz\u003c/code\u003e created using constructor\n     * with signature \u003ccode\u003eparameterTypes\u003c/code\u003e and actual arguments\n     * \u003ccode\u003eargs\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe signatures should be assignment compatible.\u003c/p\u003e\n     *\n     * @param \u003cT\u003e the type to be constructed\n     * @param cls the class to be constructed.\n     * @param args actual argument array\n     * @param parameterTypes parameter types array\n     * @return new instance of \u003ccode\u003eklazz\u003c/code\u003e\n     *\n     * @throws NoSuchMethodException if matching constructor cannot be found\n     * @throws IllegalAccessException thrown on the constructor\u0027s invocation\n     * @throws InvocationTargetException thrown on the constructor\u0027s invocation\n     * @throws InstantiationException thrown on the constructor\u0027s invocation\n     * @see Constructor#newInstance\n     ",
      "child_ranges": [
        "(line 119,col 9)-(line 121,col 9)",
        "(line 122,col 9)-(line 124,col 9)",
        "(line 125,col 9)-(line 125,col 84)",
        "(line 126,col 9)-(line 129,col 9)",
        "(line 130,col 9)-(line 130,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.reflect.ConstructorUtils.invokeExactConstructor(java.lang.Class\u003cT\u003e, java.lang.Object...)",
      "begin_line": 157,
      "end_line": 169,
      "comment": "\n     * \u003cp\u003eReturns new instance of \u003ccode\u003eklazz\u003c/code\u003e created using the actual\n     * arguments \u003ccode\u003eargs\u003c/code\u003e. The formal parameter types are inferred from\n     * the actual values of \u003ccode\u003eargs\u003c/code\u003e. See\n     * {@link #invokeExactConstructor(Class, Object[], Class[])} for more\n     * details.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe signatures should match exactly.\u003c/p\u003e\n     *\n     * @param \u003cT\u003e the type to be constructed\n     * @param cls the class to be constructed.\n     * @param args actual argument array\n     * @return new instance of \u003ccode\u003eklazz\u003c/code\u003e\n     *\n     * @throws NoSuchMethodException If the constructor cannot be found\n     * @throws IllegalAccessException If an error occurs accessing the\n     * constructor\n     * @throws InvocationTargetException If an error occurs invoking the\n     * constructor\n     * @throws InstantiationException If an error occurs instantiating the class\n     *\n     * @see #invokeExactConstructor(java.lang.Class, java.lang.Object[],\n     * java.lang.Class[])\n     ",
      "child_ranges": [
        "(line 160,col 9)-(line 162,col 9)",
        "(line 163,col 9)-(line 163,col 36)",
        "(line 164,col 9)-(line 164,col 57)",
        "(line 165,col 9)-(line 167,col 9)",
        "(line 168,col 9)-(line 168,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.reflect.ConstructorUtils.invokeExactConstructor(java.lang.Class\u003cT\u003e, java.lang.Object[], java.lang.Class\u003c?\u003e[])",
      "begin_line": 190,
      "end_line": 205,
      "comment": "\n     * \u003cp\u003eReturns new instance of \u003ccode\u003eklazz\u003c/code\u003e created using constructor\n     * with signature \u003ccode\u003eparameterTypes\u003c/code\u003e and actual arguments\n     * \u003ccode\u003eargs\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe signatures should match exactly.\u003c/p\u003e\n     *\n     * @param \u003cT\u003e the type to be constructed\n     * @param cls the class to be constructed.\n     * @param args actual argument array\n     * @param parameterTypes parameter types array\n     * @return new instance of \u003ccode\u003eklazz\u003c/code\u003e\n     *\n     * @throws NoSuchMethodException if matching constructor cannot be found\n     * @throws IllegalAccessException thrown on the constructor\u0027s invocation\n     * @throws InvocationTargetException thrown on the constructor\u0027s invocation\n     * @throws InstantiationException thrown on the constructor\u0027s invocation\n     * @see Constructor#newInstance\n     ",
      "child_ranges": [
        "(line 193,col 9)-(line 195,col 9)",
        "(line 196,col 9)-(line 198,col 9)",
        "(line 199,col 9)-(line 199,col 76)",
        "(line 200,col 9)-(line 203,col 9)",
        "(line 204,col 9)-(line 204,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.reflect.ConstructorUtils.getAccessibleConstructor(java.lang.Class\u003cT\u003e, java.lang.Class\u003c?\u003e...)",
      "begin_line": 217,
      "end_line": 224,
      "comment": "\n     * Returns a constructor given a class and signature.\n     *\n     * @param \u003cT\u003e the type to be constructed\n     * @param cls the class to be constructed\n     * @param parameterTypes the parameter array\n     * @return null if matching accessible constructor can not be found\n     * @see Class#getConstructor\n     * @see #getAccessibleConstructor(java.lang.reflect.Constructor)\n     ",
      "child_ranges": [
        "(line 219,col 9)-(line 223,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.reflect.ConstructorUtils.getAccessibleConstructor(java.lang.reflect.Constructor\u003cT\u003e)",
      "begin_line": 234,
      "end_line": 237,
      "comment": "\n     * Returns accessible version of the given constructor.\n     *\n     * @param \u003cT\u003e the type to be constructed\n     * @param ctor prototype constructor object.\n     * @return \u003ccode\u003enull\u003c/code\u003e if accessible constructor can not be found.\n     * @see java.lang.SecurityManager\n     ",
      "child_ranges": [
        "(line 235,col 9)-(line 236,col 92)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.reflect.ConstructorUtils.getMatchingAccessibleConstructor(java.lang.Class\u003cT\u003e, java.lang.Class\u003c?\u003e...)",
      "begin_line": 256,
      "end_line": 293,
      "comment": "\n     * \u003cp\u003eFind an accessible constructor with compatible parameters. Compatible\n     * parameters mean that every method parameter is assignable from the given\n     * parameters. In other words, it finds constructor that will take the\n     * parameters given.\u003c/p\u003e\n     *\n     * \u003cp\u003eFirst it checks if there is constructor matching the exact signature.\n     * If no such, all the constructors of the class are tested if their\n     * signatures are assignment compatible with the parameter types. The first\n     * matching constructor is returned.\u003c/p\u003e\n     *\n     * @param \u003cT\u003e the type to be constructed\n     * @param cls find constructor for this class\n     * @param parameterTypes find method with compatible parameters\n     * @return a valid Constructor object. If there\u0027s no matching constructor,\n     * returns \u003ccode\u003enull\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 260,col 9)-(line 265,col 9)",
        "(line 266,col 9)-(line 266,col 37)",
        "(line 271,col 9)-(line 271,col 55)",
        "(line 274,col 9)-(line 291,col 9)",
        "(line 292,col 9)-(line 292,col 22)"
      ]
    }
  ]
}