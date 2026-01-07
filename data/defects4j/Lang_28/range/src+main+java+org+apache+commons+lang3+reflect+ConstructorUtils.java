{
  "filepath": "/tmp/Lang-28b/src/main/java/org/apache/commons/lang3/reflect/ConstructorUtils.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ConstructorUtils",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 53,
      "end_line": 281,
      "comment": "\n * \u003cp\u003e Utility reflection methods focussed on constructors, modelled after {@link MethodUtils}. \u003c/p\u003e\n *\n * \u003ch3\u003eKnown Limitations\u003c/h3\u003e\n * \u003ch4\u003eAccessing Public Constructors In A Default Access Superclass\u003c/h4\u003e\n * \u003cp\u003eThere is an issue when invoking public constructors contained in a default access superclass.\n * Reflection locates these constructors fine and correctly assigns them as public.\n * However, an \u003ccode\u003eIllegalAccessException\u003c/code\u003e is thrown if the constructors is invoked.\u003c/p\u003e\n *\n * \u003cp\u003e\u003ccode\u003eConstructorUtils\u003c/code\u003e contains a workaround for this situation.\n * It will attempt to call \u003ccode\u003esetAccessible\u003c/code\u003e on this constructor.\n * If this call succeeds, then the method can be invoked as normal.\n * This call will only succeed when the application has sufficient security privilages.\n * If this call fails then a warning will be logged and the method may fail.\u003c/p\u003e\n *\n * @author Apache Software Foundation\n * @author Craig R. McClanahan\n * @author Ralph Schaer\n * @author Chris Audley\n * @author Rey Francois\n * @author Gregor Rayman\n * @author Jan Sorensen\n * @author Robert Burrell Donkin\n * @author Rodney Waldhoff\n * @since 2.5\n * @version $Id$\n "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.reflect.ConstructorUtils.ConstructorUtils()",
      "begin_line": 63,
      "end_line": 65,
      "comment": "\n     * \u003cp\u003eConstructorUtils instances should NOT be constructed in standard programming.\n     * Instead, the class should be used as\n     * \u003ccode\u003eConstructorUtils.invokeConstructor(cls, args)\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis constructor is public to permit tools that require a JavaBean\n     * instance to operate.\u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 64,col 9)-(line 64,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.reflect.ConstructorUtils.invokeConstructor(java.lang.Class\u003cT\u003e, java.lang.Object...)",
      "begin_line": 85,
      "end_line": 96,
      "comment": "\n     * \u003cp\u003eReturns new instance of \u003ccode\u003eklazz\u003c/code\u003e created using the actual arguments \u003ccode\u003eargs\u003c/code\u003e.\n     * The formal parameter types are inferred from the actual values of \u003ccode\u003eargs\u003c/code\u003e.\n     * See {@link #invokeExactConstructor(Class, Object[], Class[])} for more details.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe signatures should be assignment compatible.\u003c/p\u003e\n     *\n     * @param cls the class to be constructed.\n     * @param args actual argument array\n     * @return new instance of \u003ccode\u003eklazz\u003c/code\u003e\n     *\n     * @throws NoSuchMethodException If the constructor cannot be found\n     * @throws IllegalAccessException If an error occurs accessing the constructor\n     * @throws InvocationTargetException If an error occurs invoking the constructor\n     * @throws InstantiationException If an error occurs instantiating the class\n     *\n     * @see #invokeConstructor(java.lang.Class, java.lang.Object[], java.lang.Class[])\n     ",
      "child_ranges": [
        "(line 88,col 9)-(line 90,col 9)",
        "(line 91,col 9)-(line 91,col 59)",
        "(line 92,col 9)-(line 94,col 9)",
        "(line 95,col 9)-(line 95,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.reflect.ConstructorUtils.invokeConstructor(java.lang.Class\u003cT\u003e, java.lang.Object[], java.lang.Class\u003c?\u003e[])",
      "begin_line": 115,
      "end_line": 132,
      "comment": "\n     * \u003cp\u003eReturns new instance of \u003ccode\u003eklazz\u003c/code\u003e created using constructor\n     * with signature \u003ccode\u003eparameterTypes\u003c/code\u003e and actual arguments \u003ccode\u003eargs\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe signatures should be assignment compatible.\u003c/p\u003e\n     *\n     * @param cls the class to be constructed.\n     * @param args actual argument array\n     * @param parameterTypes parameter types array\n     * @return new instance of \u003ccode\u003eklazz\u003c/code\u003e\n     *\n     * @throws NoSuchMethodException if matching constructor cannot be found\n     * @throws IllegalAccessException thrown on the constructor\u0027s invocation\n     * @throws InvocationTargetException thrown on the constructor\u0027s invocation\n     * @throws InstantiationException thrown on the constructor\u0027s invocation\n     * @see Constructor#newInstance\n     ",
      "child_ranges": [
        "(line 119,col 9)-(line 121,col 9)",
        "(line 122,col 9)-(line 124,col 9)",
        "(line 125,col 9)-(line 125,col 84)",
        "(line 126,col 9)-(line 130,col 9)",
        "(line 131,col 9)-(line 131,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.reflect.ConstructorUtils.invokeExactConstructor(java.lang.Class\u003cT\u003e, java.lang.Object...)",
      "begin_line": 152,
      "end_line": 164,
      "comment": "\n     * \u003cp\u003eReturns new instance of \u003ccode\u003eklazz\u003c/code\u003e created using the actual arguments \u003ccode\u003eargs\u003c/code\u003e.\n     * The formal parameter types are inferred from the actual values of \u003ccode\u003eargs\u003c/code\u003e.\n     * See {@link #invokeExactConstructor(Class, Object[], Class[])} for more details.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe signatures should match exactly.\u003c/p\u003e\n     *\n     * @param cls the class to be constructed.\n     * @param args actual argument array\n     * @return new instance of \u003ccode\u003eklazz\u003c/code\u003e\n     *\n     * @throws NoSuchMethodException If the constructor cannot be found\n     * @throws IllegalAccessException If an error occurs accessing the constructor\n     * @throws InvocationTargetException If an error occurs invoking the constructor\n     * @throws InstantiationException If an error occurs instantiating the class\n     *\n     * @see #invokeExactConstructor(java.lang.Class, java.lang.Object[], java.lang.Class[])\n     ",
      "child_ranges": [
        "(line 155,col 9)-(line 157,col 9)",
        "(line 158,col 9)-(line 158,col 36)",
        "(line 159,col 9)-(line 159,col 57)",
        "(line 160,col 9)-(line 162,col 9)",
        "(line 163,col 9)-(line 163,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.reflect.ConstructorUtils.invokeExactConstructor(java.lang.Class\u003cT\u003e, java.lang.Object[], java.lang.Class\u003c?\u003e[])",
      "begin_line": 184,
      "end_line": 201,
      "comment": "\n     * \u003cp\u003eReturns new instance of \u003ccode\u003eklazz\u003c/code\u003e created using constructor\n     * with signature \u003ccode\u003eparameterTypes\u003c/code\u003e and actual arguments\n     * \u003ccode\u003eargs\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe signatures should match exactly.\u003c/p\u003e\n     *\n     * @param cls the class to be constructed.\n     * @param args actual argument array\n     * @param parameterTypes parameter types array\n     * @return new instance of \u003ccode\u003eklazz\u003c/code\u003e\n     *\n     * @throws NoSuchMethodException if matching constructor cannot be found\n     * @throws IllegalAccessException thrown on the constructor\u0027s invocation\n     * @throws InvocationTargetException thrown on the constructor\u0027s invocation\n     * @throws InstantiationException thrown on the constructor\u0027s invocation\n     * @see Constructor#newInstance\n     ",
      "child_ranges": [
        "(line 188,col 9)-(line 190,col 9)",
        "(line 191,col 9)-(line 193,col 9)",
        "(line 194,col 9)-(line 194,col 76)",
        "(line 195,col 9)-(line 199,col 9)",
        "(line 200,col 9)-(line 200,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.reflect.ConstructorUtils.getAccessibleConstructor(java.lang.Class\u003cT\u003e, java.lang.Class\u003c?\u003e...)",
      "begin_line": 211,
      "end_line": 218,
      "comment": "\n     * Returns a constructor given a class and signature.\n     * @param cls the class to be constructed\n     * @param parameterTypes the parameter array\n     * @return null if matching accessible constructor can not be found\n     * @see Class#getConstructor\n     * @see #getAccessibleConstructor(java.lang.reflect.Constructor)\n     ",
      "child_ranges": [
        "(line 213,col 9)-(line 217,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.reflect.ConstructorUtils.getAccessibleConstructor(java.lang.reflect.Constructor\u003cT\u003e)",
      "begin_line": 226,
      "end_line": 230,
      "comment": "\n     * Returns accessible version of the given constructor.\n     * @param ctor prototype constructor object.\n     * @return \u003ccode\u003enull\u003c/code\u003e if accessible constructor can not be found.\n     * @see java.lang.SecurityManager\n     ",
      "child_ranges": [
        "(line 227,col 9)-(line 229,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.reflect.ConstructorUtils.getMatchingAccessibleConstructor(java.lang.Class\u003cT\u003e, java.lang.Class\u003c?\u003e...)",
      "begin_line": 247,
      "end_line": 279,
      "comment": "\n     * \u003cp\u003eFind an accessible constructor with compatible parameters.\n     * Compatible parameters mean that every method parameter is assignable from\n     * the given parameters. In other words, it finds constructor that will take\n     * the parameters given.\u003c/p\u003e\n     *\n     * \u003cp\u003eFirst it checks if there is constructor matching the exact signature.\n     * If no such, all the constructors of the class are tested if their signatures\n     * are assignment compatible with the parameter types.\n     * The first matching constructor is returned.\u003c/p\u003e\n     *\n     * @param cls find constructor for this class\n     * @param parameterTypes find method with compatible parameters\n     * @return a valid Constructor object. If there\u0027s no matching constructor, returns \u003ccode\u003enull\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 252,col 9)-(line 257,col 9)",
        "(line 258,col 9)-(line 258,col 37)",
        "(line 260,col 9)-(line 260,col 55)",
        "(line 261,col 9)-(line 277,col 9)",
        "(line 278,col 9)-(line 278,col 22)"
      ]
    }
  ]
}