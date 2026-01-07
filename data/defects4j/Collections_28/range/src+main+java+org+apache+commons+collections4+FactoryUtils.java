{
  "filepath": "/tmp/Collections-28b/src/main/java/org/apache/commons/collections4/FactoryUtils.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "FactoryUtils",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 45,
      "end_line": 150,
      "comment": "\n * \u003ccode\u003eFactoryUtils\u003c/code\u003e provides reference implementations and utilities\n * for the Factory functor interface. The supplied factories are:\n * \u003cul\u003e\n * \u003cli\u003ePrototype - clones a specified object\n * \u003cli\u003eInstantiate - creates objects using reflection\n * \u003cli\u003eConstant - always returns the same object\n * \u003cli\u003eNull - always returns null\n * \u003cli\u003eException - always throws an exception\n * \u003c/ul\u003e\n * \u003cp\u003e\n * Since v4.1 only factories which are considered to be safe are\n * Serializable. Factories considered to be unsafe for serialization are:\n * \u003cul\u003e\n * \u003cli\u003ePrototype\n * \u003cli\u003eInstantiate\n * \u003c/ul\u003e\n *\n * @since 3.0\n * @version $Id$\n "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.FactoryUtils.FactoryUtils()",
      "begin_line": 50,
      "end_line": 50,
      "comment": "\n     * This class is not normally instantiated.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.FactoryUtils.exceptionFactory()",
      "begin_line": 61,
      "end_line": 63,
      "comment": "\n     * Gets a Factory that always throws an exception.\n     * This could be useful during testing as a placeholder.\n     *\n     * @see org.apache.commons.collections4.functors.ExceptionFactory\n     *\n     * @param \u003cT\u003e the type that the factory creates\n     * @return the factory\n     ",
      "child_ranges": [
        "(line 62,col 9)-(line 62,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.FactoryUtils.nullFactory()",
      "begin_line": 73,
      "end_line": 75,
      "comment": "\n     * Gets a Factory that will return null each time the factory is used.\n     * This could be useful during testing as a placeholder.\n     *\n     * @see org.apache.commons.collections4.functors.ConstantFactory\n     * @param \u003cT\u003e the \"type\" of null object the factory should return.\n     * @return the factory\n     ",
      "child_ranges": [
        "(line 74,col 9)-(line 74,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.FactoryUtils.constantFactory(T)",
      "begin_line": 89,
      "end_line": 91,
      "comment": "\n     * Creates a Factory that will return the same object each time the factory\n     * is used. No check is made that the object is immutable. In general, only\n     * immutable objects should use the constant factory. Mutable objects should\n     * use the prototype factory.\n     *\n     * @see org.apache.commons.collections4.functors.ConstantFactory\n     *\n     * @param \u003cT\u003e the type that the factory creates\n     * @param constantToReturn  the constant object to return each time in the factory\n     * @return the \u003ccode\u003econstant\u003c/code\u003e factory.\n     ",
      "child_ranges": [
        "(line 90,col 9)-(line 90,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.FactoryUtils.prototypeFactory(T)",
      "begin_line": 111,
      "end_line": 113,
      "comment": "\n     * Creates a Factory that will return a clone of the same prototype object\n     * each time the factory is used. The prototype will be cloned using one of these\n     * techniques (in order):\n     * \u003cul\u003e\n     * \u003cli\u003epublic clone method\n     * \u003cli\u003epublic copy constructor\n     * \u003cli\u003eserialization clone\n     * \u003cul\u003e\n     *\n     * @see org.apache.commons.collections4.functors.PrototypeFactory\n     *\n     * @param \u003cT\u003e the type that the factory creates\n     * @param prototype  the object to clone each time in the factory\n     * @return the \u003ccode\u003eprototype\u003c/code\u003e factory, or a {@link ConstantFactory#NULL_INSTANCE} if\n     * the {@code prototype} is {@code null}\n     * @throws IllegalArgumentException if the prototype cannot be cloned\n     ",
      "child_ranges": [
        "(line 112,col 9)-(line 112,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.FactoryUtils.instantiateFactory(java.lang.Class\u003cT\u003e)",
      "begin_line": 126,
      "end_line": 128,
      "comment": "\n     * Creates a Factory that can create objects of a specific type using\n     * a no-args constructor.\n     *\n     * @see org.apache.commons.collections4.functors.InstantiateFactory\n     *\n     * @param \u003cT\u003e the type that the factory creates\n     * @param classToInstantiate  the Class to instantiate each time in the factory\n     * @return the \u003ccode\u003ereflection\u003c/code\u003e factory\n     * @throws NullPointerException if the classToInstantiate is null\n     ",
      "child_ranges": [
        "(line 127,col 9)-(line 127,col 85)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.FactoryUtils.instantiateFactory(java.lang.Class\u003cT\u003e, java.lang.Class\u003c?\u003e[], java.lang.Object[])",
      "begin_line": 145,
      "end_line": 148,
      "comment": "\n     * Creates a Factory that can create objects of a specific type using\n     * the arguments specified to this method.\n     *\n     * @see org.apache.commons.collections4.functors.InstantiateFactory\n     *\n     * @param \u003cT\u003e the type that the factory creates\n     * @param classToInstantiate  the Class to instantiate each time in the factory\n     * @param paramTypes  parameter types for the constructor, can be null\n     * @param args  the arguments to pass to the constructor, can be null\n     * @return the \u003ccode\u003ereflection\u003c/code\u003e factory\n     * @throws NullPointerException if the classToInstantiate is null\n     * @throws IllegalArgumentException if the paramTypes and args don\u0027t match\n     * @throws IllegalArgumentException if the constructor doesn\u0027t exist\n     ",
      "child_ranges": [
        "(line 147,col 9)-(line 147,col 91)"
      ]
    }
  ]
}