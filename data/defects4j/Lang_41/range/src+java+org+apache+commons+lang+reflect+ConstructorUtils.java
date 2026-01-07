{
  "filepath": "/tmp/Lang-41b/src/java/org/apache/commons/lang/reflect/ConstructorUtils.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ConstructorUtils",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 52,
      "end_line": 340,
      "comment": "\n * \u003cp\u003e Utility reflection methods focussed on constructors, modelled after {@link MethodUtils}. \u003c/p\u003e\n *\n * \u003ch3\u003eKnown Limitations\u003c/h3\u003e\n * \u003ch4\u003eAccessing Public Constructors In A Default Access Superclass\u003c/h4\u003e\n * \u003cp\u003eThere is an issue when invoking public constructors contained in a default access superclass.\n * Reflection locates these constructors fine and correctly assigns them as public.\n * However, an \u003ccode\u003eIllegalAccessException\u003c/code\u003e is thrown if the constructors is invoked.\u003c/p\u003e\n *\n * \u003cp\u003e\u003ccode\u003eConstructorUtils\u003c/code\u003e contains a workaround for this situation.\n * It will attempt to call \u003ccode\u003esetAccessible\u003c/code\u003e on this constructor.\n * If this call succeeds, then the method can be invoked as normal.\n * This call will only succeed when the application has sufficient security privilages.\n * If this call fails then a warning will be logged and the method may fail.\u003c/p\u003e\n *\n * @author Craig R. McClanahan\n * @author Ralph Schaer\n * @author Chris Audley\n * @author Rey Francois\n * @author Gregor Rayman\n * @author Jan Sorensen\n * @author Robert Burrell Donkin\n * @author Rodney Waldhoff\n * @since 3.0\n * @version $Id$\n "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.reflect.ConstructorUtils.ConstructorUtils()",
      "begin_line": 62,
      "end_line": 64,
      "comment": "\n     * \u003cp\u003eConstructorUtils instances should NOT be constructed in standard programming.\n     * Instead, the class should be used as\n     * \u003ccode\u003eConstructorUtils.invokeConstructor(cls, args)\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis constructor is public to permit tools that require a JavaBean\n     * instance to operate.\u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 63,col 9)-(line 63,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.reflect.ConstructorUtils.invokeConstructor(java.lang.Class\u003c?\u003e, java.lang.Object)",
      "begin_line": 84,
      "end_line": 88,
      "comment": "\n     * \u003cp\u003eConvenience method returning new instance of \u003ccode\u003eklazz\u003c/code\u003e using a single argument constructor.\n     * The formal parameter type is inferred from the actual values of \u003ccode\u003earg\u003c/code\u003e.\n     * See {@link #invokeExactConstructor(Class, Object[], Class[])} for more details.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe signatures should be assignment compatible.\u003c/p\u003e\n     *\n     * @param cls the class to be constructed.\n     * @param arg the actual argument\n     * @return new instance of \u003ccode\u003eklazz\u003c/code\u003e\n     *\n     * @throws NoSuchMethodException If the constructor cannot be found\n     * @throws IllegalAccessException If an error occurs accessing the constructor\n     * @throws InvocationTargetException If an error occurs invoking the constructor\n     * @throws InstantiationException If an error occurs instantiating the class\n     *\n     * @see #invokeConstructor(java.lang.Class, java.lang.Object[], java.lang.Class[])\n     ",
      "child_ranges": [
        "(line 87,col 9)-(line 87,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.reflect.ConstructorUtils.invokeConstructor(java.lang.Class\u003c?\u003e, java.lang.Object[])",
      "begin_line": 108,
      "end_line": 119,
      "comment": "\n     * \u003cp\u003eReturns new instance of \u003ccode\u003eklazz\u003c/code\u003e created using the actual arguments \u003ccode\u003eargs\u003c/code\u003e.\n     * The formal parameter types are inferred from the actual values of \u003ccode\u003eargs\u003c/code\u003e.\n     * See {@link #invokeExactConstructor(Class, Object[], Class[])} for more details.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe signatures should be assignment compatible.\u003c/p\u003e\n     *\n     * @param cls the class to be constructed.\n     * @param args actual argument array\n     * @return new instance of \u003ccode\u003eklazz\u003c/code\u003e\n     *\n     * @throws NoSuchMethodException If the constructor cannot be found\n     * @throws IllegalAccessException If an error occurs accessing the constructor\n     * @throws InvocationTargetException If an error occurs invoking the constructor\n     * @throws InstantiationException If an error occurs instantiating the class\n     *\n     * @see #invokeConstructor(java.lang.Class, java.lang.Object[], java.lang.Class[])\n     ",
      "child_ranges": [
        "(line 111,col 9)-(line 113,col 9)",
        "(line 114,col 9)-(line 114,col 59)",
        "(line 115,col 9)-(line 117,col 9)",
        "(line 118,col 9)-(line 118,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.reflect.ConstructorUtils.invokeConstructor(java.lang.Class\u003c?\u003e, java.lang.Object[], java.lang.Class\u003c?\u003e[])",
      "begin_line": 138,
      "end_line": 155,
      "comment": "\n     * \u003cp\u003eReturns new instance of \u003ccode\u003eklazz\u003c/code\u003e created using constructor\n     * with signature \u003ccode\u003eparameterTypes\u003c/code\u003e and actual arguments \u003ccode\u003eargs\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe signatures should be assignment compatible.\u003c/p\u003e\n     *\n     * @param cls the class to be constructed.\n     * @param args actual argument array\n     * @param parameterTypes parameter types array\n     * @return new instance of \u003ccode\u003eklazz\u003c/code\u003e\n     *\n     * @throws NoSuchMethodException if matching constructor cannot be found\n     * @throws IllegalAccessException thrown on the constructor\u0027s invocation\n     * @throws InvocationTargetException thrown on the constructor\u0027s invocation\n     * @throws InstantiationException thrown on the constructor\u0027s invocation\n     * @see Constructor#newInstance\n     ",
      "child_ranges": [
        "(line 142,col 9)-(line 144,col 9)",
        "(line 145,col 9)-(line 147,col 9)",
        "(line 148,col 9)-(line 148,col 81)",
        "(line 149,col 9)-(line 153,col 9)",
        "(line 154,col 9)-(line 154,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.reflect.ConstructorUtils.invokeExactConstructor(java.lang.Class\u003c?\u003e, java.lang.Object)",
      "begin_line": 175,
      "end_line": 179,
      "comment": "\n     * \u003cp\u003eConvenience method returning new instance of \u003ccode\u003eklazz\u003c/code\u003e using a single argument constructor.\n     * The formal parameter type is inferred from the actual values of \u003ccode\u003earg\u003c/code\u003e.\n     * See {@link #invokeExactConstructor(Class, Object[], Class[])} for more details.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe signatures should match exactly.\u003c/p\u003e\n     *\n     * @param cls the class to be constructed.\n     * @param arg the actual argument\n     * @return new instance of \u003ccode\u003eklazz\u003c/code\u003e\n     *\n     * @throws NoSuchMethodException If the constructor cannot be found\n     * @throws IllegalAccessException If an error occurs accessing the constructor\n     * @throws InvocationTargetException If an error occurs invoking the constructor\n     * @throws InstantiationException If an error occurs instantiating the class\n     *\n     * @see #invokeExactConstructor(java.lang.Class, java.lang.Object[], java.lang.Class[])\n     ",
      "child_ranges": [
        "(line 178,col 9)-(line 178,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.reflect.ConstructorUtils.invokeExactConstructor(java.lang.Class\u003c?\u003e, java.lang.Object[])",
      "begin_line": 199,
      "end_line": 211,
      "comment": "\n     * \u003cp\u003eReturns new instance of \u003ccode\u003eklazz\u003c/code\u003e created using the actual arguments \u003ccode\u003eargs\u003c/code\u003e.\n     * The formal parameter types are inferred from the actual values of \u003ccode\u003eargs\u003c/code\u003e.\n     * See {@link #invokeExactConstructor(Class, Object[], Class[])} for more details.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe signatures should match exactly.\u003c/p\u003e\n     *\n     * @param cls the class to be constructed.\n     * @param args actual argument array\n     * @return new instance of \u003ccode\u003eklazz\u003c/code\u003e\n     *\n     * @throws NoSuchMethodException If the constructor cannot be found\n     * @throws IllegalAccessException If an error occurs accessing the constructor\n     * @throws InvocationTargetException If an error occurs invoking the constructor\n     * @throws InstantiationException If an error occurs instantiating the class\n     *\n     * @see #invokeExactConstructor(java.lang.Class, java.lang.Object[], java.lang.Class[])\n     ",
      "child_ranges": [
        "(line 202,col 9)-(line 204,col 9)",
        "(line 205,col 9)-(line 205,col 36)",
        "(line 206,col 9)-(line 206,col 57)",
        "(line 207,col 9)-(line 209,col 9)",
        "(line 210,col 9)-(line 210,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.reflect.ConstructorUtils.invokeExactConstructor(java.lang.Class\u003c?\u003e, java.lang.Object[], java.lang.Class\u003c?\u003e[])",
      "begin_line": 231,
      "end_line": 248,
      "comment": "\n     * \u003cp\u003eReturns new instance of \u003ccode\u003eklazz\u003c/code\u003e created using constructor\n     * with signature \u003ccode\u003eparameterTypes\u003c/code\u003e and actual arguments\n     * \u003ccode\u003eargs\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe signatures should match exactly.\u003c/p\u003e\n     *\n     * @param cls the class to be constructed.\n     * @param args actual argument array\n     * @param parameterTypes parameter types array\n     * @return new instance of \u003ccode\u003eklazz\u003c/code\u003e\n     *\n     * @throws NoSuchMethodException if matching constructor cannot be found\n     * @throws IllegalAccessException thrown on the constructor\u0027s invocation\n     * @throws InvocationTargetException thrown on the constructor\u0027s invocation\n     * @throws InstantiationException thrown on the constructor\u0027s invocation\n     * @see Constructor#newInstance\n     ",
      "child_ranges": [
        "(line 235,col 9)-(line 237,col 9)",
        "(line 238,col 9)-(line 240,col 9)",
        "(line 241,col 9)-(line 241,col 73)",
        "(line 242,col 9)-(line 246,col 9)",
        "(line 247,col 9)-(line 247,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.reflect.ConstructorUtils.getAccessibleConstructor(java.lang.Class\u003c?\u003e, java.lang.Class\u003c?\u003e)",
      "begin_line": 258,
      "end_line": 261,
      "comment": "\n     * Returns a constructor with single argument.\n     * @param cls the class to be constructed\n     * @param parameterType The constructor parameter type\n     * @return null if matching accessible constructor can not be found.\n     * @see Class#getConstructor\n     * @see #getAccessibleConstructor(java.lang.reflect.Constructor)\n     ",
      "child_ranges": [
        "(line 260,col 9)-(line 260,col 76)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.reflect.ConstructorUtils.getAccessibleConstructor(java.lang.Class\u003c?\u003e, java.lang.Class\u003c?\u003e[])",
      "begin_line": 271,
      "end_line": 278,
      "comment": "\n     * Returns a constructor given a class and signature.\n     * @param cls the class to be constructed\n     * @param parameterTypes the parameter array\n     * @return null if matching accessible constructor can not be found\n     * @see Class#getConstructor\n     * @see #getAccessibleConstructor(java.lang.reflect.Constructor)\n     ",
      "child_ranges": [
        "(line 273,col 9)-(line 277,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.reflect.ConstructorUtils.getAccessibleConstructor(java.lang.reflect.Constructor)",
      "begin_line": 286,
      "end_line": 290,
      "comment": "\n     * Returns accessible version of the given constructor.\n     * @param ctor prototype constructor object.\n     * @return \u003ccode\u003enull\u003c/code\u003e if accessible constructor can not be found.\n     * @see java.lang.SecurityManager\n     ",
      "child_ranges": [
        "(line 287,col 9)-(line 289,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.reflect.ConstructorUtils.getMatchingAccessibleConstructor(java.lang.Class\u003c?\u003e, java.lang.Class\u003c?\u003e[])",
      "begin_line": 307,
      "end_line": 338,
      "comment": "\n     * \u003cp\u003eFind an accessible constructor with compatible parameters.\n     * Compatible parameters mean that every method parameter is assignable from\n     * the given parameters. In other words, it finds constructor that will take\n     * the parameters given.\u003c/p\u003e\n     *\n     * \u003cp\u003eFirst it checks if there is constructor matching the exact signature.\n     * If no such, all the constructors of the class are tested if their signatures\n     * are assignment compatible with the parameter types.\n     * The first matching constructor is returned.\u003c/p\u003e\n     *\n     * @param cls find constructor for this class\n     * @param parameterTypes find method with compatible parameters\n     * @return a valid Constructor object. If there\u0027s no matching constructor, returns \u003ccode\u003enull\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 311,col 9)-(line 316,col 9)",
        "(line 317,col 9)-(line 317,col 34)",
        "(line 319,col 9)-(line 319,col 52)",
        "(line 320,col 9)-(line 336,col 9)",
        "(line 337,col 9)-(line 337,col 22)"
      ]
    }
  ]
}