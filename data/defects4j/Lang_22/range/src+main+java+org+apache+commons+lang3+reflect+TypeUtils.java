{
  "filepath": "/tmp/Lang-22b/src/main/java/org/apache/commons/lang3/reflect/TypeUtils.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "TypeUtils",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 44,
      "end_line": 1085,
      "comment": "\n * \u003cp\u003e Utility methods focusing on type inspection, particularly with regard to\n * generics. \u003c/p\u003e\n *\n * @author David M. Sledge\n * @author Matt Benson\n * @author James Carman\n * @since 3.0\n * @version $Id$\n "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.reflect.TypeUtils.TypeUtils()",
      "begin_line": 53,
      "end_line": 55,
      "comment": "\n     * \u003cp\u003e TypeUtils instances should NOT be constructed in standard\n     * programming. Instead, the class should be used as\n     * \u003ccode\u003eTypeUtils.isAssignable(cls, toClass)\u003c/code\u003e. \u003c/p\u003e \u003cp\u003e This\n     * constructor is public to permit tools that require a JavaBean instance to\n     * operate. \u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 54,col 9)-(line 54,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.reflect.TypeUtils.isAssignable(java.lang.reflect.Type, java.lang.reflect.Type)",
      "begin_line": 67,
      "end_line": 69,
      "comment": "\n     * \u003cp\u003e Checks if the subject type may be implicitly cast to the target type\n     * following the Java generics rules. If both types are {@link Class}\n     * objects, the method returns the result of\n     * {@link ClassUtils#isAssignable(Class, Class)}. \u003c/p\u003e\n     *\n     * @param type the subject type to be assigned to the target type\n     * @param toType the target type\n     * @return \u003ccode\u003etrue\u003c/code\u003e if \u003ccode\u003etype\u003c/code\u003e is assignable to \u003ccode\u003etoType\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 68,col 9)-(line 68,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.reflect.TypeUtils.isAssignable(java.lang.reflect.Type, java.lang.reflect.Type, java.util.Map\u003cjava.lang.reflect.TypeVariable\u003c?\u003e, java.lang.reflect.Type\u003e)",
      "begin_line": 80,
      "end_line": 105,
      "comment": "\n     * \u003cp\u003e Checks if the subject type may be implicitly cast to the target type\n     * following the Java generics rules. \u003c/p\u003e\n     *\n     * @param type the subject type to be assigned to the target type\n     * @param toType the target type\n     * @param typeVarAssigns optional map of type variable assignments\n     * @return \u003ccode\u003etrue\u003c/code\u003e if \u003ccode\u003etype\u003c/code\u003e is assignable to \u003ccode\u003etoType\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 82,col 9)-(line 84,col 9)",
        "(line 86,col 9)-(line 88,col 9)",
        "(line 90,col 9)-(line 92,col 9)",
        "(line 94,col 9)-(line 96,col 9)",
        "(line 99,col 9)-(line 101,col 9)",
        "(line 104,col 9)-(line 104,col 78)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.reflect.TypeUtils.isAssignable(java.lang.reflect.Type, java.lang.Class\u003c?\u003e)",
      "begin_line": 115,
      "end_line": 171,
      "comment": "\n     * \u003cp\u003e Checks if the subject type may be implicitly cast to the target class\n     * following the Java generics rules. \u003c/p\u003e\n     *\n     * @param type the subject type to be assigned to the target type\n     * @param toClass the target class\n     * @return true if \u003ccode\u003etype\u003c/code\u003e is assignable to \u003ccode\u003etoClass\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 116,col 9)-(line 119,col 9)",
        "(line 123,col 9)-(line 125,col 9)",
        "(line 128,col 9)-(line 130,col 9)",
        "(line 132,col 9)-(line 135,col 9)",
        "(line 137,col 9)-(line 140,col 9)",
        "(line 143,col 9)-(line 153,col 9)",
        "(line 157,col 9)-(line 162,col 9)",
        "(line 166,col 9)-(line 168,col 9)",
        "(line 170,col 9)-(line 170,col 76)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.reflect.TypeUtils.isAssignable(java.lang.reflect.Type, java.lang.reflect.ParameterizedType, java.util.Map\u003cjava.lang.reflect.TypeVariable\u003c?\u003e, java.lang.reflect.Type\u003e)",
      "begin_line": 181,
      "end_line": 237,
      "comment": "\n     * \u003cp\u003e Checks if the subject type may be implicitly cast to the target\n     * parameterized type following the Java generics rules. \u003c/p\u003e\n     *\n     * @param type the subject type to be assigned to the target type\n     * @param toParameterizedType the target parameterized type\n     * @return true if \u003ccode\u003etype\u003c/code\u003e is assignable to \u003ccode\u003etoType\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 183,col 9)-(line 185,col 9)",
        "(line 189,col 9)-(line 191,col 9)",
        "(line 194,col 9)-(line 196,col 9)",
        "(line 199,col 9)-(line 199,col 59)",
        "(line 202,col 9)-(line 202,col 94)",
        "(line 205,col 9)-(line 207,col 9)",
        "(line 212,col 9)-(line 214,col 9)",
        "(line 217,col 9)-(line 218,col 41)",
        "(line 221,col 9)-(line 234,col 9)",
        "(line 236,col 9)-(line 236,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.reflect.TypeUtils.isAssignable(java.lang.reflect.Type, java.lang.reflect.GenericArrayType, java.util.Map\u003cjava.lang.reflect.TypeVariable\u003c?\u003e, java.lang.reflect.Type\u003e)",
      "begin_line": 248,
      "end_line": 312,
      "comment": "\n     * \u003cp\u003e Checks if the subject type may be implicitly cast to the target\n     * generic array type following the Java generics rules. \u003c/p\u003e\n     *\n     * @param type the subject type to be assigned to the target type\n     * @param toGenericArrayType the target generic array type\n     * @return true if \u003ccode\u003etype\u003c/code\u003e is assignable to\n     * \u003ccode\u003etoGenericArrayType\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 250,col 9)-(line 252,col 9)",
        "(line 256,col 9)-(line 258,col 9)",
        "(line 261,col 9)-(line 263,col 9)",
        "(line 265,col 9)-(line 265,col 76)",
        "(line 267,col 9)-(line 273,col 9)",
        "(line 275,col 9)-(line 279,col 9)",
        "(line 281,col 9)-(line 290,col 9)",
        "(line 292,col 9)-(line 302,col 9)",
        "(line 304,col 9)-(line 309,col 9)",
        "(line 311,col 9)-(line 311,col 76)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.reflect.TypeUtils.isAssignable(java.lang.reflect.Type, java.lang.reflect.WildcardType, java.util.Map\u003cjava.lang.reflect.TypeVariable\u003c?\u003e, java.lang.reflect.Type\u003e)",
      "begin_line": 323,
      "end_line": 400,
      "comment": "\n     * \u003cp\u003e Checks if the subject type may be implicitly cast to the target\n     * wildcard type following the Java generics rules. \u003c/p\u003e\n     *\n     * @param type the subject type to be assigned to the target type\n     * @param toWildcardType the target wildcard type\n     * @return true if \u003ccode\u003etype\u003c/code\u003e is assignable to\n     * \u003ccode\u003etoWildcardType\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 325,col 9)-(line 327,col 9)",
        "(line 331,col 9)-(line 333,col 9)",
        "(line 336,col 9)-(line 338,col 9)",
        "(line 340,col 9)-(line 340,col 70)",
        "(line 341,col 9)-(line 341,col 70)",
        "(line 343,col 9)-(line 379,col 9)",
        "(line 381,col 9)-(line 388,col 9)",
        "(line 390,col 9)-(line 397,col 9)",
        "(line 399,col 9)-(line 399,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.reflect.TypeUtils.isAssignable(java.lang.reflect.Type, java.lang.reflect.TypeVariable\u003c?\u003e, java.util.Map\u003cjava.lang.reflect.TypeVariable\u003c?\u003e, java.lang.reflect.Type\u003e)",
      "begin_line": 411,
      "end_line": 447,
      "comment": "\n     * \u003cp\u003e Checks if the subject type may be implicitly cast to the target type\n     * variable following the Java generics rules. \u003c/p\u003e\n     *\n     * @param type the subject type to be assigned to the target type\n     * @param toTypeVariable the target type variable\n     * @return true if \u003ccode\u003etype\u003c/code\u003e is assignable to\n     * \u003ccode\u003etoTypeVariable\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 413,col 9)-(line 415,col 9)",
        "(line 419,col 9)-(line 421,col 9)",
        "(line 424,col 9)-(line 426,col 9)",
        "(line 428,col 9)-(line 439,col 9)",
        "(line 441,col 9)-(line 444,col 9)",
        "(line 446,col 9)-(line 446,col 76)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.reflect.TypeUtils.substituteTypeVariables(java.lang.reflect.Type, java.util.Map\u003cjava.lang.reflect.TypeVariable\u003c?\u003e, java.lang.reflect.Type\u003e)",
      "begin_line": 456,
      "end_line": 469,
      "comment": "\n     * \u003cp\u003e \u003c/p\u003e\n     *\n     * @param type\n     * @param typeVarAssigns\n     * @return\n     ",
      "child_ranges": [
        "(line 457,col 9)-(line 466,col 9)",
        "(line 468,col 9)-(line 468,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.reflect.TypeUtils.getTypeArguments(java.lang.reflect.ParameterizedType)",
      "begin_line": 482,
      "end_line": 484,
      "comment": "\n     * \u003cp\u003e Retrieves all the type arguments for this parameterized type\n     * including owner hierarchy arguments such as \u003ccode\u003e\n     * Outer\u003cK,V\u003e.Inner\u003cT\u003e.DeepInner\u003cE\u003e\u003c/code\u003e . The arguments are returned in a\n     * {@link Map} specifying the argument type for each {@link TypeVariable}.\n     * \u003c/p\u003e\n     *\n     * @param type specifies the subject parameterized type from which to\n     * harvest the parameters.\n     * @return a map of the type arguments to their respective type variables.\n     ",
      "child_ranges": [
        "(line 483,col 9)-(line 483,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.reflect.TypeUtils.getTypeArguments(java.lang.reflect.Type, java.lang.Class\u003c?\u003e)",
      "begin_line": 518,
      "end_line": 520,
      "comment": "\n     * \u003cp\u003e Gets the type arguments of a class/interface based on a subtype. For\n     * instance, this method will determine that both of the parameters for the\n     * interface {@link Map} are {@link Object} for the subtype\n     * {@link java.util.Properties Properties} even though the subtype does not\n     * directly implement the \u003ccode\u003eMap\u003c/code\u003e interface. \u003cp\u003e \u003c/p\u003e This method\n     * returns \u003ccode\u003enull\u003c/code\u003e if \u003ccode\u003etype\u003c/code\u003e is not assignable to\n     * \u003ccode\u003etoClass\u003c/code\u003e. It returns an empty map if none of the classes or\n     * interfaces in its inheritance hierarchy specify any type arguments. \u003c/p\u003e\n     * \u003cp\u003e A side-effect of this method is that it also retrieves the type\n     * arguments for the classes and interfaces that are part of the hierarchy\n     * between \u003ccode\u003etype\u003c/code\u003e and \u003ccode\u003etoClass\u003c/code\u003e. So with the above\n     * example, this method will also determine that the type arguments for\n     * {@link java.util.Hashtable Hashtable} are also both \u003ccode\u003eObject\u003c/code\u003e.\n     * In cases where the interface specified by \u003ccode\u003etoClass\u003c/code\u003e is\n     * (indirectly) implemented more than once (e.g. where \u003ccode\u003etoClass\u003c/code\u003e\n     * specifies the interface {@link java.lang.Iterable Iterable} and\n     * \u003ccode\u003etype\u003c/code\u003e specifies a parameterized type that implements both\n     * {@link java.util.Set Set} and {@link java.util.Collection Collection}),\n     * this method will look at the inheritance hierarchy of only one of the\n     * implementations/subclasses; the first interface encountered that isn\u0027t a\n     * subinterface to one of the others in the \u003ccode\u003etype\u003c/code\u003e to\n     * \u003ccode\u003etoClass\u003c/code\u003e hierarchy. \u003c/p\u003e\n     *\n     * @param type the type from which to determine the type parameters of\n     * \u003ccode\u003etoClass\u003c/code\u003e\n     * @param toClass the class whose type parameters are to be determined based\n     * on the subtype \u003ccode\u003etype\u003c/code\u003e\n     * @return a map of the type assignments for the type variables in each type\n     * in the inheritance hierarchy from \u003ccode\u003etype\u003c/code\u003e to\n     * \u003ccode\u003etoClass\u003c/code\u003e inclusive.\n     ",
      "child_ranges": [
        "(line 519,col 9)-(line 519,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.reflect.TypeUtils.getTypeArguments(java.lang.reflect.Type, java.lang.Class\u003c?\u003e, java.util.Map\u003cjava.lang.reflect.TypeVariable\u003c?\u003e, java.lang.reflect.Type\u003e)",
      "begin_line": 530,
      "end_line": 572,
      "comment": "\n     * \u003cp\u003e Return a map of the type arguments of \u003ccode\u003etype\u003c/code\u003e in the context of \u003ccode\u003etoClass\u003c/code\u003e. \u003c/p\u003e\n     *\n     * @param type\n     * @param toClass\n     * @param subtypeVarAssigns\n     * @return\n     ",
      "child_ranges": [
        "(line 532,col 9)-(line 534,col 9)",
        "(line 536,col 9)-(line 538,col 9)",
        "(line 540,col 9)-(line 543,col 9)",
        "(line 547,col 9)-(line 556,col 9)",
        "(line 559,col 9)-(line 568,col 9)",
        "(line 571,col 9)-(line 571,col 76)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.reflect.TypeUtils.getTypeArguments(java.lang.reflect.ParameterizedType, java.lang.Class\u003c?\u003e, java.util.Map\u003cjava.lang.reflect.TypeVariable\u003c?\u003e, java.lang.reflect.Type\u003e)",
      "begin_line": 582,
      "end_line": 625,
      "comment": "\n     * \u003cp\u003e \u003c/p\u003e\n     *\n     * @param parameterizedType\n     * @param toClass\n     * @param subtypeVarAssigns\n     * @return\n     ",
      "child_ranges": [
        "(line 585,col 9)-(line 585,col 53)",
        "(line 588,col 9)-(line 590,col 9)",
        "(line 592,col 9)-(line 592,col 58)",
        "(line 593,col 9)-(line 593,col 50)",
        "(line 595,col 9)-(line 604,col 9)",
        "(line 607,col 9)-(line 607,col 69)",
        "(line 609,col 9)-(line 609,col 63)",
        "(line 612,col 9)-(line 616,col 9)",
        "(line 618,col 9)-(line 621,col 9)",
        "(line 624,col 9)-(line 624,col 93)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.reflect.TypeUtils.getTypeArguments(java.lang.Class\u003c?\u003e, java.lang.Class\u003c?\u003e, java.util.Map\u003cjava.lang.reflect.TypeVariable\u003c?\u003e, java.lang.reflect.Type\u003e)",
      "begin_line": 635,
      "end_line": 666,
      "comment": "\n     * \u003cp\u003e \u003c/p\u003e\n     *\n     * @param cls\n     * @param toClass\n     * @param subtypeVarAssigns\n     * @return\n     ",
      "child_ranges": [
        "(line 638,col 9)-(line 640,col 9)",
        "(line 643,col 9)-(line 653,col 9)",
        "(line 656,col 9)-(line 657,col 72)",
        "(line 660,col 9)-(line 662,col 9)",
        "(line 665,col 9)-(line 665,col 93)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.reflect.TypeUtils.determineTypeArguments(java.lang.Class\u003c?\u003e, java.lang.reflect.ParameterizedType)",
      "begin_line": 695,
      "end_line": 725,
      "comment": "\n     * \u003cp\u003e Tries to determine the type arguments of a class/interface based on a\n     * super parameterized type\u0027s type arguments. This method is the inverse of\n     * {@link #getTypeArguments(Type, Class)} which gets a class/interface\u0027s\n     * type arguments based on a subtype. It is far more limited in determining\n     * the type arguments for the subject class\u0027s type variables in that it can\n     * only determine those parameters that map from the subject {@link Class}\n     * object to the supertype. \u003c/p\u003e \u003cp\u003e Example: {@link java.util.TreeSet\n     * TreeSet} sets its parameter as the parameter for\n     * {@link java.util.NavigableSet NavigableSet}, which in turn sets the\n     * parameter of {@link java.util.SortedSet}, which in turn sets the\n     * parameter of {@link Set}, which in turn sets the parameter of\n     * {@link java.util.Collection}, which in turn sets the parameter of\n     * {@link java.lang.Iterable}. Since \u003ccode\u003eTreeSet\u003c/code\u003e\u0027s parameter maps\n     * (indirectly) to \u003ccode\u003eIterable\u003c/code\u003e\u0027s parameter, it will be able to\n     * determine that based on the super type \u003ccode\u003eIterable\u003c? extends\n     * Map\u003cInteger,? extends Collection\u003c?\u003e\u003e\u003e\u003c/code\u003e, the parameter of\n     * \u003ccode\u003eTreeSet\u003c/code\u003e is \u003ccode\u003e? extends Map\u003cInteger,? extends\n     * Collection\u003c?\u003e\u003e\u003c/code\u003e. \u003c/p\u003e\n     *\n     * @param cls the class whose type parameters are to be determined\n     * @param superType the super type from which \u003ccode\u003ecls\u003c/code\u003e\u0027s type\n     * arguments are to be determined\n     * @return a map of the type assignments that could be determined for the\n     * type variables in each type in the inheritance hierarchy from\n     * \u003ccode\u003etype\u003c/code\u003e to \u003ccode\u003etoClass\u003c/code\u003e inclusive.\n     ",
      "child_ranges": [
        "(line 697,col 9)-(line 697,col 52)",
        "(line 700,col 9)-(line 702,col 9)",
        "(line 704,col 9)-(line 706,col 9)",
        "(line 709,col 9)-(line 709,col 61)",
        "(line 712,col 9)-(line 714,col 9)",
        "(line 716,col 9)-(line 716,col 77)",
        "(line 717,col 9)-(line 717,col 61)",
        "(line 720,col 9)-(line 720,col 96)",
        "(line 722,col 9)-(line 722,col 79)",
        "(line 724,col 9)-(line 724,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.reflect.TypeUtils.mapTypeVariablesToArguments(java.lang.Class\u003cT\u003e, java.lang.reflect.ParameterizedType, java.util.Map\u003cjava.lang.reflect.TypeVariable\u003c?\u003e, java.lang.reflect.Type\u003e)",
      "begin_line": 734,
      "end_line": 771,
      "comment": "\n     * \u003cp\u003e \u003c/p\u003e\n     *\n     * @param cls\n     * @param parameterizedType\n     * @param typeVarAssigns\n     ",
      "child_ranges": [
        "(line 737,col 9)-(line 737,col 58)",
        "(line 739,col 9)-(line 742,col 9)",
        "(line 748,col 9)-(line 748,col 69)",
        "(line 752,col 9)-(line 752,col 87)",
        "(line 755,col 9)-(line 756,col 38)",
        "(line 758,col 9)-(line 770,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.reflect.TypeUtils.getClosestParentType(java.lang.Class\u003c?\u003e, java.lang.Class\u003c?\u003e)",
      "begin_line": 781,
      "end_line": 820,
      "comment": "\n     * \u003cp\u003e Closest parent type? Closest to what? The closest parent type to the\n     * super class specified by \u003ccode\u003esuperClass\u003c/code\u003e. \u003c/p\u003e\n     *\n     * @param cls\n     * @param superClass\n     * @return\n     ",
      "child_ranges": [
        "(line 783,col 9)-(line 815,col 9)",
        "(line 819,col 9)-(line 819,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.reflect.TypeUtils.isInstance(java.lang.Object, java.lang.reflect.Type)",
      "begin_line": 830,
      "end_line": 837,
      "comment": "\n     * \u003cp\u003e Checks if the given value can be assigned to the target type\n     * following the Java generics rules. \u003c/p\u003e\n     *\n     * @param value\n     * @param type\n     * @return true of \u003ccode\u003evalue\u003c/code\u003e is an instance of \u003ccode\u003etype\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 831,col 9)-(line 833,col 9)",
        "(line 835,col 9)-(line 836,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.reflect.TypeUtils.normalizeUpperBounds(java.lang.reflect.Type[])",
      "begin_line": 860,
      "end_line": 884,
      "comment": "\n     * \u003cp\u003e This method strips out the redundant upper bound types in type\n     * variable types and wildcard types (or it would with wildcard types if\n     * multiple upper bounds were allowed). \u003c/p\u003e \u003cp\u003e Example: with the variable\n     * type declaration:\n     *\n     * \u003cpre\u003e \u0026lt;K extends java.util.Collection\u0026lt;String\u0026gt; \u0026amp;\n     * java.util.List\u0026lt;String\u0026gt;\u0026gt; \u003c/pre\u003e\n     *\n     * since \u003ccode\u003eList\u003c/code\u003e is a subinterface of \u003ccode\u003eCollection\u003c/code\u003e,\n     * this method will return the bounds as if the declaration had been:\n     *\n     * \u003cpre\u003e \u0026lt;K extends java.util.List\u0026lt;String\u0026gt;\u0026gt; \u003c/pre\u003e\n     *\n     * \u003c/p\u003e\n     *\n     * @param bounds an array of types representing the upper bounds of either\n     * \u003ccode\u003eWildcardType\u003c/code\u003e or \u003ccode\u003eTypeVariable\u003c/code\u003e.\n     * @return an array containing the values from \u003ccode\u003ebounds\u003c/code\u003e minus the\n     * redundant types.\n     ",
      "child_ranges": [
        "(line 862,col 9)-(line 864,col 9)",
        "(line 866,col 9)-(line 866,col 59)",
        "(line 868,col 9)-(line 881,col 9)",
        "(line 883,col 9)-(line 883,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.reflect.TypeUtils.getImplicitBounds(java.lang.reflect.TypeVariable\u003c?\u003e)",
      "begin_line": 895,
      "end_line": 899,
      "comment": "\n     * \u003cp\u003e Returns an array containing the sole type of {@link Object} if\n     * {@link TypeVariable#getBounds()} returns an empty array. Otherwise, it\n     * returns the result of \u003ccode\u003eTypeVariable.getBounds()\u003c/code\u003e passed into\n     * {@link #normalizeUpperBounds}. \u003c/p\u003e\n     *\n     * @param typeVariable the subject type variable\n     * @return a non-empty array containing the bounds of the type variable.\n     ",
      "child_ranges": [
        "(line 896,col 9)-(line 896,col 49)",
        "(line 898,col 9)-(line 898,col 95)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.reflect.TypeUtils.getImplicitUpperBounds(java.lang.reflect.WildcardType)",
      "begin_line": 911,
      "end_line": 915,
      "comment": "\n     * \u003cp\u003e Returns an array containing the sole value of {@link Object} if\n     * {@link WildcardType#getUpperBounds()} returns an empty array. Otherwise,\n     * it returns the result of \u003ccode\u003eWildcardType.getUpperBounds()\u003c/code\u003e\n     * passed into {@link #normalizeUpperBounds}. \u003c/p\u003e\n     *\n     * @param wildcardType the subject wildcard type\n     * @return a non-empty array containing the upper bounds of the wildcard\n     * type.\n     ",
      "child_ranges": [
        "(line 912,col 9)-(line 912,col 54)",
        "(line 914,col 9)-(line 914,col 95)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.reflect.TypeUtils.getImplicitLowerBounds(java.lang.reflect.WildcardType)",
      "begin_line": 926,
      "end_line": 930,
      "comment": "\n     * \u003cp\u003e Returns an array containing a single value of \u003ccode\u003enull\u003c/code\u003e if\n     * {@link WildcardType#getLowerBounds()} returns an empty array. Otherwise,\n     * it returns the result of \u003ccode\u003eWildcardType.getLowerBounds()\u003c/code\u003e. \u003c/p\u003e\n     *\n     * @param wildcardType the subject wildcard type\n     * @return a non-empty array containing the lower bounds of the wildcard\n     * type.\n     ",
      "child_ranges": [
        "(line 927,col 9)-(line 927,col 54)",
        "(line 929,col 9)-(line 929,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.reflect.TypeUtils.typesSatisfyVariables(java.util.Map\u003cjava.lang.reflect.TypeVariable\u003c?\u003e, java.lang.reflect.Type\u003e)",
      "begin_line": 945,
      "end_line": 961,
      "comment": "\n     * \u003cp\u003e Determines whether or not specified types satisfy the bounds of their\n     * mapped type variables. When a type parameter extends another (such as\n     * \u003ccode\u003e\u003cT, S extends T\u003e\u003c/code\u003e), uses another as a type parameter (such as\n     * \u003ccode\u003e\u003cT, S extends Comparable\u003cT\u003e\u003c/code\u003e), or otherwise depends on\n     * another type variable to be specified, the dependencies must be included\n     * in \u003ccode\u003etypeVarAssigns\u003c/code\u003e. \u003c/p\u003e\n     *\n     * @param typeVarAssigns specifies the potential types to be assigned to the\n     * type variables.\n     * @return whether or not the types can be assigned to their respective type\n     * variables.\n     ",
      "child_ranges": [
        "(line 948,col 9)-(line 958,col 9)",
        "(line 960,col 9)-(line 960,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.reflect.TypeUtils.getRawType(java.lang.reflect.ParameterizedType)",
      "begin_line": 969,
      "end_line": 982,
      "comment": "\n     * \u003cp\u003e Type-checking method of convenience. \u003c/p\u003e\n     *\n     * @param parameterizedType\n     * @return\n     ",
      "child_ranges": [
        "(line 970,col 9)-(line 970,col 54)",
        "(line 977,col 9)-(line 979,col 9)",
        "(line 981,col 9)-(line 981,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.reflect.TypeUtils.getRawType(java.lang.reflect.Type, java.lang.reflect.Type)",
      "begin_line": 996,
      "end_line": 1058,
      "comment": "\n     * \u003cp\u003e Get the raw type of a Java type, given its context. Primarily for use\n     * with {@link TypeVariable}s and {@link GenericArrayType}s, or when you do\n     * not know the runtime type of \u003ccode\u003etype\u003c/code\u003e: if you know you have a\n     * {@link Class} instance, it is already raw; if you know you have a\n     * {@link ParameterizedType}, its raw type is only a method call away. \u003c/p\u003e\n     *\n     * @param type to resolve\n     * @param assigningType type to be resolved against\n     * @return the resolved \u003ccode\u003eClass\u003c/code\u003e object or \u003ccode\u003enull\u003c/code\u003e if\n     * the type could not be resolved\n     ",
      "child_ranges": [
        "(line 997,col 9)-(line 1000,col 9)",
        "(line 1002,col 9)-(line 1005,col 9)",
        "(line 1007,col 9)-(line 1041,col 9)",
        "(line 1043,col 9)-(line 1050,col 9)",
        "(line 1053,col 9)-(line 1055,col 9)",
        "(line 1057,col 9)-(line 1057,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.reflect.TypeUtils.isArrayType(java.lang.reflect.Type)",
      "begin_line": 1065,
      "end_line": 1067,
      "comment": "\n     * Learn whether the specified type denotes an array type.\n     * @param type\n     * @return \u003ccode\u003etrue\u003c/code\u003e if \u003ccode\u003etype\u003c/code\u003e is an array class or a {@link GenericArrayType}.\n     ",
      "child_ranges": [
        "(line 1066,col 9)-(line 1066,col 107)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.reflect.TypeUtils.getArrayComponentType(java.lang.reflect.Type)",
      "begin_line": 1074,
      "end_line": 1083,
      "comment": "\n     * Get the array component type of \u003ccode\u003etype\u003c/code\u003e.\n     * @param type\n     * @return component type or null if type is not an array type\n     ",
      "child_ranges": [
        "(line 1075,col 9)-(line 1078,col 9)",
        "(line 1079,col 9)-(line 1081,col 9)",
        "(line 1082,col 9)-(line 1082,col 20)"
      ]
    }
  ]
}