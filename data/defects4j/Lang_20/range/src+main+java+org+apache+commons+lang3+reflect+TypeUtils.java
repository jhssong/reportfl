{
  "filepath": "/tmp/Lang-20b/src/main/java/org/apache/commons/lang3/reflect/TypeUtils.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "TypeUtils",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 41,
      "end_line": 1089,
      "comment": "\n * \u003cp\u003e Utility methods focusing on type inspection, particularly with regard to\n * generics. \u003c/p\u003e\n *\n * @since 3.0\n * @version $Id$\n "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.reflect.TypeUtils.TypeUtils()",
      "begin_line": 50,
      "end_line": 52,
      "comment": "\n     * \u003cp\u003e TypeUtils instances should NOT be constructed in standard\n     * programming. Instead, the class should be used as\n     * \u003ccode\u003eTypeUtils.isAssignable(cls, toClass)\u003c/code\u003e. \u003c/p\u003e \u003cp\u003e This\n     * constructor is public to permit tools that require a JavaBean instance to\n     * operate. \u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 51,col 9)-(line 51,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.reflect.TypeUtils.isAssignable(java.lang.reflect.Type, java.lang.reflect.Type)",
      "begin_line": 64,
      "end_line": 66,
      "comment": "\n     * \u003cp\u003e Checks if the subject type may be implicitly cast to the target type\n     * following the Java generics rules. If both types are {@link Class}\n     * objects, the method returns the result of\n     * {@link ClassUtils#isAssignable(Class, Class)}. \u003c/p\u003e\n     *\n     * @param type the subject type to be assigned to the target type\n     * @param toType the target type\n     * @return \u003ccode\u003etrue\u003c/code\u003e if \u003ccode\u003etype\u003c/code\u003e is assignable to \u003ccode\u003etoType\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 65,col 9)-(line 65,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.reflect.TypeUtils.isAssignable(java.lang.reflect.Type, java.lang.reflect.Type, java.util.Map\u003cjava.lang.reflect.TypeVariable\u003c?\u003e, java.lang.reflect.Type\u003e)",
      "begin_line": 77,
      "end_line": 102,
      "comment": "\n     * \u003cp\u003e Checks if the subject type may be implicitly cast to the target type\n     * following the Java generics rules. \u003c/p\u003e\n     *\n     * @param type the subject type to be assigned to the target type\n     * @param toType the target type\n     * @param typeVarAssigns optional map of type variable assignments\n     * @return \u003ccode\u003etrue\u003c/code\u003e if \u003ccode\u003etype\u003c/code\u003e is assignable to \u003ccode\u003etoType\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 79,col 9)-(line 81,col 9)",
        "(line 83,col 9)-(line 85,col 9)",
        "(line 87,col 9)-(line 89,col 9)",
        "(line 91,col 9)-(line 93,col 9)",
        "(line 96,col 9)-(line 98,col 9)",
        "(line 101,col 9)-(line 101,col 78)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.reflect.TypeUtils.isAssignable(java.lang.reflect.Type, java.lang.Class\u003c?\u003e)",
      "begin_line": 112,
      "end_line": 168,
      "comment": "\n     * \u003cp\u003e Checks if the subject type may be implicitly cast to the target class\n     * following the Java generics rules. \u003c/p\u003e\n     *\n     * @param type the subject type to be assigned to the target type\n     * @param toClass the target class\n     * @return true if \u003ccode\u003etype\u003c/code\u003e is assignable to \u003ccode\u003etoClass\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 113,col 9)-(line 116,col 9)",
        "(line 120,col 9)-(line 122,col 9)",
        "(line 125,col 9)-(line 127,col 9)",
        "(line 129,col 9)-(line 132,col 9)",
        "(line 134,col 9)-(line 137,col 9)",
        "(line 140,col 9)-(line 150,col 9)",
        "(line 154,col 9)-(line 159,col 9)",
        "(line 163,col 9)-(line 165,col 9)",
        "(line 167,col 9)-(line 167,col 76)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.reflect.TypeUtils.isAssignable(java.lang.reflect.Type, java.lang.reflect.ParameterizedType, java.util.Map\u003cjava.lang.reflect.TypeVariable\u003c?\u003e, java.lang.reflect.Type\u003e)",
      "begin_line": 179,
      "end_line": 235,
      "comment": "\n     * \u003cp\u003e Checks if the subject type may be implicitly cast to the target\n     * parameterized type following the Java generics rules. \u003c/p\u003e\n     *\n     * @param type the subject type to be assigned to the target type\n     * @param toParameterizedType the target parameterized type\n     * @param typeVarAssigns a map with type variables\n     * @return true if \u003ccode\u003etype\u003c/code\u003e is assignable to \u003ccode\u003etoType\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 181,col 9)-(line 183,col 9)",
        "(line 187,col 9)-(line 189,col 9)",
        "(line 192,col 9)-(line 194,col 9)",
        "(line 197,col 9)-(line 197,col 59)",
        "(line 200,col 9)-(line 200,col 94)",
        "(line 203,col 9)-(line 205,col 9)",
        "(line 210,col 9)-(line 212,col 9)",
        "(line 215,col 9)-(line 216,col 41)",
        "(line 219,col 9)-(line 232,col 9)",
        "(line 234,col 9)-(line 234,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.reflect.TypeUtils.isAssignable(java.lang.reflect.Type, java.lang.reflect.GenericArrayType, java.util.Map\u003cjava.lang.reflect.TypeVariable\u003c?\u003e, java.lang.reflect.Type\u003e)",
      "begin_line": 247,
      "end_line": 311,
      "comment": "\n     * \u003cp\u003e Checks if the subject type may be implicitly cast to the target\n     * generic array type following the Java generics rules. \u003c/p\u003e\n     *\n     * @param type the subject type to be assigned to the target type\n     * @param toGenericArrayType the target generic array type\n     * @param typeVarAssigns a map with type variables\n     * @return true if \u003ccode\u003etype\u003c/code\u003e is assignable to\n     * \u003ccode\u003etoGenericArrayType\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 249,col 9)-(line 251,col 9)",
        "(line 255,col 9)-(line 257,col 9)",
        "(line 260,col 9)-(line 262,col 9)",
        "(line 264,col 9)-(line 264,col 76)",
        "(line 266,col 9)-(line 272,col 9)",
        "(line 274,col 9)-(line 278,col 9)",
        "(line 280,col 9)-(line 289,col 9)",
        "(line 291,col 9)-(line 301,col 9)",
        "(line 303,col 9)-(line 308,col 9)",
        "(line 310,col 9)-(line 310,col 76)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.reflect.TypeUtils.isAssignable(java.lang.reflect.Type, java.lang.reflect.WildcardType, java.util.Map\u003cjava.lang.reflect.TypeVariable\u003c?\u003e, java.lang.reflect.Type\u003e)",
      "begin_line": 323,
      "end_line": 400,
      "comment": "\n     * \u003cp\u003e Checks if the subject type may be implicitly cast to the target\n     * wildcard type following the Java generics rules. \u003c/p\u003e\n     *\n     * @param type the subject type to be assigned to the target type\n     * @param toWildcardType the target wildcard type\n     * @param typeVarAssigns a map with type variables\n     * @return true if \u003ccode\u003etype\u003c/code\u003e is assignable to\n     * \u003ccode\u003etoWildcardType\u003c/code\u003e.\n     ",
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
      "begin_line": 412,
      "end_line": 448,
      "comment": "\n     * \u003cp\u003e Checks if the subject type may be implicitly cast to the target type\n     * variable following the Java generics rules. \u003c/p\u003e\n     *\n     * @param type the subject type to be assigned to the target type\n     * @param toTypeVariable the target type variable\n     * @param typeVarAssigns a map with type variables\n     * @return true if \u003ccode\u003etype\u003c/code\u003e is assignable to\n     * \u003ccode\u003etoTypeVariable\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 414,col 9)-(line 416,col 9)",
        "(line 420,col 9)-(line 422,col 9)",
        "(line 425,col 9)-(line 427,col 9)",
        "(line 429,col 9)-(line 440,col 9)",
        "(line 442,col 9)-(line 445,col 9)",
        "(line 447,col 9)-(line 447,col 76)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.reflect.TypeUtils.substituteTypeVariables(java.lang.reflect.Type, java.util.Map\u003cjava.lang.reflect.TypeVariable\u003c?\u003e, java.lang.reflect.Type\u003e)",
      "begin_line": 458,
      "end_line": 471,
      "comment": "\n     * \u003cp\u003e \u003c/p\u003e\n     *\n     * @param type the type to be replaced\n     * @param typeVarAssigns the map with type variables\n     * @return the replaced type\n     * @throws IllegalArgumentException if the type cannot be substituted\n     ",
      "child_ranges": [
        "(line 459,col 9)-(line 468,col 9)",
        "(line 470,col 9)-(line 470,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.reflect.TypeUtils.getTypeArguments(java.lang.reflect.ParameterizedType)",
      "begin_line": 484,
      "end_line": 486,
      "comment": "\n     * \u003cp\u003e Retrieves all the type arguments for this parameterized type\n     * including owner hierarchy arguments such as \u003ccode\u003e\n     * Outer\u003cK,V\u003e.Inner\u003cT\u003e.DeepInner\u003cE\u003e\u003c/code\u003e . The arguments are returned in a\n     * {@link Map} specifying the argument type for each {@link TypeVariable}.\n     * \u003c/p\u003e\n     *\n     * @param type specifies the subject parameterized type from which to\n     * harvest the parameters.\n     * @return a map of the type arguments to their respective type variables.\n     ",
      "child_ranges": [
        "(line 485,col 9)-(line 485,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.reflect.TypeUtils.getTypeArguments(java.lang.reflect.Type, java.lang.Class\u003c?\u003e)",
      "begin_line": 520,
      "end_line": 522,
      "comment": "\n     * \u003cp\u003e Gets the type arguments of a class/interface based on a subtype. For\n     * instance, this method will determine that both of the parameters for the\n     * interface {@link Map} are {@link Object} for the subtype\n     * {@link java.util.Properties Properties} even though the subtype does not\n     * directly implement the \u003ccode\u003eMap\u003c/code\u003e interface. \u003cp\u003e \u003c/p\u003e This method\n     * returns \u003ccode\u003enull\u003c/code\u003e if \u003ccode\u003etype\u003c/code\u003e is not assignable to\n     * \u003ccode\u003etoClass\u003c/code\u003e. It returns an empty map if none of the classes or\n     * interfaces in its inheritance hierarchy specify any type arguments. \u003c/p\u003e\n     * \u003cp\u003e A side-effect of this method is that it also retrieves the type\n     * arguments for the classes and interfaces that are part of the hierarchy\n     * between \u003ccode\u003etype\u003c/code\u003e and \u003ccode\u003etoClass\u003c/code\u003e. So with the above\n     * example, this method will also determine that the type arguments for\n     * {@link java.util.Hashtable Hashtable} are also both \u003ccode\u003eObject\u003c/code\u003e.\n     * In cases where the interface specified by \u003ccode\u003etoClass\u003c/code\u003e is\n     * (indirectly) implemented more than once (e.g. where \u003ccode\u003etoClass\u003c/code\u003e\n     * specifies the interface {@link java.lang.Iterable Iterable} and\n     * \u003ccode\u003etype\u003c/code\u003e specifies a parameterized type that implements both\n     * {@link java.util.Set Set} and {@link java.util.Collection Collection}),\n     * this method will look at the inheritance hierarchy of only one of the\n     * implementations/subclasses; the first interface encountered that isn\u0027t a\n     * subinterface to one of the others in the \u003ccode\u003etype\u003c/code\u003e to\n     * \u003ccode\u003etoClass\u003c/code\u003e hierarchy. \u003c/p\u003e\n     *\n     * @param type the type from which to determine the type parameters of\n     * \u003ccode\u003etoClass\u003c/code\u003e\n     * @param toClass the class whose type parameters are to be determined based\n     * on the subtype \u003ccode\u003etype\u003c/code\u003e\n     * @return a map of the type assignments for the type variables in each type\n     * in the inheritance hierarchy from \u003ccode\u003etype\u003c/code\u003e to\n     * \u003ccode\u003etoClass\u003c/code\u003e inclusive.\n     ",
      "child_ranges": [
        "(line 521,col 9)-(line 521,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.reflect.TypeUtils.getTypeArguments(java.lang.reflect.Type, java.lang.Class\u003c?\u003e, java.util.Map\u003cjava.lang.reflect.TypeVariable\u003c?\u003e, java.lang.reflect.Type\u003e)",
      "begin_line": 532,
      "end_line": 574,
      "comment": "\n     * \u003cp\u003e Return a map of the type arguments of \u003ccode\u003etype\u003c/code\u003e in the context of \u003ccode\u003etoClass\u003c/code\u003e. \u003c/p\u003e\n     *\n     * @param type the type in question\n     * @param toClass the class\n     * @param subtypeVarAssigns a map with type variables\n     * @return the map with type arguments\n     ",
      "child_ranges": [
        "(line 534,col 9)-(line 536,col 9)",
        "(line 538,col 9)-(line 540,col 9)",
        "(line 542,col 9)-(line 545,col 9)",
        "(line 549,col 9)-(line 558,col 9)",
        "(line 561,col 9)-(line 570,col 9)",
        "(line 573,col 9)-(line 573,col 76)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.reflect.TypeUtils.getTypeArguments(java.lang.reflect.ParameterizedType, java.lang.Class\u003c?\u003e, java.util.Map\u003cjava.lang.reflect.TypeVariable\u003c?\u003e, java.lang.reflect.Type\u003e)",
      "begin_line": 584,
      "end_line": 627,
      "comment": "\n     * \u003cp\u003e Return a map of the type arguments of a parameterized type in the context of \u003ccode\u003etoClass\u003c/code\u003e. \u003c/p\u003e\n     *\n     * @param parameterizedType the parameterized type\n     * @param toClass the class\n     * @param subtypeVarAssigns a map with type variables\n     * @return the map with type arguments\n     ",
      "child_ranges": [
        "(line 587,col 9)-(line 587,col 53)",
        "(line 590,col 9)-(line 592,col 9)",
        "(line 594,col 9)-(line 594,col 58)",
        "(line 595,col 9)-(line 595,col 50)",
        "(line 597,col 9)-(line 606,col 9)",
        "(line 609,col 9)-(line 609,col 69)",
        "(line 611,col 9)-(line 611,col 63)",
        "(line 614,col 9)-(line 618,col 9)",
        "(line 620,col 9)-(line 623,col 9)",
        "(line 626,col 9)-(line 626,col 93)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.reflect.TypeUtils.getTypeArguments(java.lang.Class\u003c?\u003e, java.lang.Class\u003c?\u003e, java.util.Map\u003cjava.lang.reflect.TypeVariable\u003c?\u003e, java.lang.reflect.Type\u003e)",
      "begin_line": 637,
      "end_line": 668,
      "comment": "\n     * \u003cp\u003e Return a map of the type arguments of a class in the context of \u003ccode\u003etoClass\u003c/code\u003e. \u003c/p\u003e\n     *\n     * @param cls the class in question\n     * @param toClass the context class\n     * @param subtypeVarAssigns a map with type variables\n     * @return the map with type arguments\n     ",
      "child_ranges": [
        "(line 640,col 9)-(line 642,col 9)",
        "(line 645,col 9)-(line 655,col 9)",
        "(line 658,col 9)-(line 659,col 72)",
        "(line 662,col 9)-(line 664,col 9)",
        "(line 667,col 9)-(line 667,col 93)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.reflect.TypeUtils.determineTypeArguments(java.lang.Class\u003c?\u003e, java.lang.reflect.ParameterizedType)",
      "begin_line": 697,
      "end_line": 727,
      "comment": "\n     * \u003cp\u003e Tries to determine the type arguments of a class/interface based on a\n     * super parameterized type\u0027s type arguments. This method is the inverse of\n     * {@link #getTypeArguments(Type, Class)} which gets a class/interface\u0027s\n     * type arguments based on a subtype. It is far more limited in determining\n     * the type arguments for the subject class\u0027s type variables in that it can\n     * only determine those parameters that map from the subject {@link Class}\n     * object to the supertype. \u003c/p\u003e \u003cp\u003e Example: {@link java.util.TreeSet\n     * TreeSet} sets its parameter as the parameter for\n     * {@link java.util.NavigableSet NavigableSet}, which in turn sets the\n     * parameter of {@link java.util.SortedSet}, which in turn sets the\n     * parameter of {@link Set}, which in turn sets the parameter of\n     * {@link java.util.Collection}, which in turn sets the parameter of\n     * {@link java.lang.Iterable}. Since \u003ccode\u003eTreeSet\u003c/code\u003e\u0027s parameter maps\n     * (indirectly) to \u003ccode\u003eIterable\u003c/code\u003e\u0027s parameter, it will be able to\n     * determine that based on the super type \u003ccode\u003eIterable\u003c? extends\n     * Map\u003cInteger,? extends Collection\u003c?\u003e\u003e\u003e\u003c/code\u003e, the parameter of\n     * \u003ccode\u003eTreeSet\u003c/code\u003e is \u003ccode\u003e? extends Map\u003cInteger,? extends\n     * Collection\u003c?\u003e\u003e\u003c/code\u003e. \u003c/p\u003e\n     *\n     * @param cls the class whose type parameters are to be determined\n     * @param superType the super type from which \u003ccode\u003ecls\u003c/code\u003e\u0027s type\n     * arguments are to be determined\n     * @return a map of the type assignments that could be determined for the\n     * type variables in each type in the inheritance hierarchy from\n     * \u003ccode\u003etype\u003c/code\u003e to \u003ccode\u003etoClass\u003c/code\u003e inclusive.\n     ",
      "child_ranges": [
        "(line 699,col 9)-(line 699,col 52)",
        "(line 702,col 9)-(line 704,col 9)",
        "(line 706,col 9)-(line 708,col 9)",
        "(line 711,col 9)-(line 711,col 61)",
        "(line 714,col 9)-(line 716,col 9)",
        "(line 718,col 9)-(line 718,col 77)",
        "(line 719,col 9)-(line 719,col 61)",
        "(line 722,col 9)-(line 722,col 96)",
        "(line 724,col 9)-(line 724,col 79)",
        "(line 726,col 9)-(line 726,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.reflect.TypeUtils.mapTypeVariablesToArguments(java.lang.Class\u003cT\u003e, java.lang.reflect.ParameterizedType, java.util.Map\u003cjava.lang.reflect.TypeVariable\u003c?\u003e, java.lang.reflect.Type\u003e)",
      "begin_line": 737,
      "end_line": 774,
      "comment": "\n     * \u003cp\u003ePerforms a mapping of type variables.\u003c/p\u003e\n     *\n     * @param \u003cT\u003e the generic type of the class in question\n     * @param cls the class in question\n     * @param parameterizedType the parameterized type\n     * @param typeVarAssigns the map to be filled\n     ",
      "child_ranges": [
        "(line 740,col 9)-(line 740,col 58)",
        "(line 742,col 9)-(line 745,col 9)",
        "(line 751,col 9)-(line 751,col 69)",
        "(line 755,col 9)-(line 755,col 87)",
        "(line 758,col 9)-(line 759,col 38)",
        "(line 761,col 9)-(line 773,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.reflect.TypeUtils.getClosestParentType(java.lang.Class\u003c?\u003e, java.lang.Class\u003c?\u003e)",
      "begin_line": 784,
      "end_line": 823,
      "comment": "\n     * \u003cp\u003e Closest parent type? Closest to what? The closest parent type to the\n     * super class specified by \u003ccode\u003esuperClass\u003c/code\u003e. \u003c/p\u003e\n     *\n     * @param cls the class in question\n     * @param superClass the super class\n     * @return the closes parent type\n     ",
      "child_ranges": [
        "(line 786,col 9)-(line 818,col 9)",
        "(line 822,col 9)-(line 822,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.reflect.TypeUtils.isInstance(java.lang.Object, java.lang.reflect.Type)",
      "begin_line": 833,
      "end_line": 840,
      "comment": "\n     * \u003cp\u003e Checks if the given value can be assigned to the target type\n     * following the Java generics rules. \u003c/p\u003e\n     *\n     * @param value the value to be checked\n     * @param type the target type\n     * @return true of \u003ccode\u003evalue\u003c/code\u003e is an instance of \u003ccode\u003etype\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 834,col 9)-(line 836,col 9)",
        "(line 838,col 9)-(line 839,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.reflect.TypeUtils.normalizeUpperBounds(java.lang.reflect.Type[])",
      "begin_line": 863,
      "end_line": 887,
      "comment": "\n     * \u003cp\u003e This method strips out the redundant upper bound types in type\n     * variable types and wildcard types (or it would with wildcard types if\n     * multiple upper bounds were allowed). \u003c/p\u003e \u003cp\u003e Example: with the variable\n     * type declaration:\n     *\n     * \u003cpre\u003e \u0026lt;K extends java.util.Collection\u0026lt;String\u0026gt; \u0026amp;\n     * java.util.List\u0026lt;String\u0026gt;\u0026gt; \u003c/pre\u003e\n     *\n     * since \u003ccode\u003eList\u003c/code\u003e is a subinterface of \u003ccode\u003eCollection\u003c/code\u003e,\n     * this method will return the bounds as if the declaration had been:\n     *\n     * \u003cpre\u003e \u0026lt;K extends java.util.List\u0026lt;String\u0026gt;\u0026gt; \u003c/pre\u003e\n     *\n     * \u003c/p\u003e\n     *\n     * @param bounds an array of types representing the upper bounds of either\n     * \u003ccode\u003eWildcardType\u003c/code\u003e or \u003ccode\u003eTypeVariable\u003c/code\u003e.\n     * @return an array containing the values from \u003ccode\u003ebounds\u003c/code\u003e minus the\n     * redundant types.\n     ",
      "child_ranges": [
        "(line 865,col 9)-(line 867,col 9)",
        "(line 869,col 9)-(line 869,col 59)",
        "(line 871,col 9)-(line 884,col 9)",
        "(line 886,col 9)-(line 886,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.reflect.TypeUtils.getImplicitBounds(java.lang.reflect.TypeVariable\u003c?\u003e)",
      "begin_line": 898,
      "end_line": 902,
      "comment": "\n     * \u003cp\u003e Returns an array containing the sole type of {@link Object} if\n     * {@link TypeVariable#getBounds()} returns an empty array. Otherwise, it\n     * returns the result of \u003ccode\u003eTypeVariable.getBounds()\u003c/code\u003e passed into\n     * {@link #normalizeUpperBounds}. \u003c/p\u003e\n     *\n     * @param typeVariable the subject type variable\n     * @return a non-empty array containing the bounds of the type variable.\n     ",
      "child_ranges": [
        "(line 899,col 9)-(line 899,col 49)",
        "(line 901,col 9)-(line 901,col 95)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.reflect.TypeUtils.getImplicitUpperBounds(java.lang.reflect.WildcardType)",
      "begin_line": 914,
      "end_line": 918,
      "comment": "\n     * \u003cp\u003e Returns an array containing the sole value of {@link Object} if\n     * {@link WildcardType#getUpperBounds()} returns an empty array. Otherwise,\n     * it returns the result of \u003ccode\u003eWildcardType.getUpperBounds()\u003c/code\u003e\n     * passed into {@link #normalizeUpperBounds}. \u003c/p\u003e\n     *\n     * @param wildcardType the subject wildcard type\n     * @return a non-empty array containing the upper bounds of the wildcard\n     * type.\n     ",
      "child_ranges": [
        "(line 915,col 9)-(line 915,col 54)",
        "(line 917,col 9)-(line 917,col 95)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.reflect.TypeUtils.getImplicitLowerBounds(java.lang.reflect.WildcardType)",
      "begin_line": 929,
      "end_line": 933,
      "comment": "\n     * \u003cp\u003e Returns an array containing a single value of \u003ccode\u003enull\u003c/code\u003e if\n     * {@link WildcardType#getLowerBounds()} returns an empty array. Otherwise,\n     * it returns the result of \u003ccode\u003eWildcardType.getLowerBounds()\u003c/code\u003e. \u003c/p\u003e\n     *\n     * @param wildcardType the subject wildcard type\n     * @return a non-empty array containing the lower bounds of the wildcard\n     * type.\n     ",
      "child_ranges": [
        "(line 930,col 9)-(line 930,col 54)",
        "(line 932,col 9)-(line 932,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.reflect.TypeUtils.typesSatisfyVariables(java.util.Map\u003cjava.lang.reflect.TypeVariable\u003c?\u003e, java.lang.reflect.Type\u003e)",
      "begin_line": 948,
      "end_line": 964,
      "comment": "\n     * \u003cp\u003e Determines whether or not specified types satisfy the bounds of their\n     * mapped type variables. When a type parameter extends another (such as\n     * \u003ccode\u003e\u003cT, S extends T\u003e\u003c/code\u003e), uses another as a type parameter (such as\n     * \u003ccode\u003e\u003cT, S extends Comparable\u003cT\u003e\u003c/code\u003e), or otherwise depends on\n     * another type variable to be specified, the dependencies must be included\n     * in \u003ccode\u003etypeVarAssigns\u003c/code\u003e. \u003c/p\u003e\n     *\n     * @param typeVarAssigns specifies the potential types to be assigned to the\n     * type variables.\n     * @return whether or not the types can be assigned to their respective type\n     * variables.\n     ",
      "child_ranges": [
        "(line 951,col 9)-(line 961,col 9)",
        "(line 963,col 9)-(line 963,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.reflect.TypeUtils.getRawType(java.lang.reflect.ParameterizedType)",
      "begin_line": 973,
      "end_line": 986,
      "comment": "\n     * \u003cp\u003e Transforms the passed in type to a {@code Class} object. Type-checking method of convenience. \u003c/p\u003e\n     *\n     * @param parameterizedType the type to be converted\n     * @return the corresponding {@code Class} object\n     * @throws IllegalStateException if the conversion fails\n     ",
      "child_ranges": [
        "(line 974,col 9)-(line 974,col 54)",
        "(line 981,col 9)-(line 983,col 9)",
        "(line 985,col 9)-(line 985,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.reflect.TypeUtils.getRawType(java.lang.reflect.Type, java.lang.reflect.Type)",
      "begin_line": 1000,
      "end_line": 1062,
      "comment": "\n     * \u003cp\u003e Get the raw type of a Java type, given its context. Primarily for use\n     * with {@link TypeVariable}s and {@link GenericArrayType}s, or when you do\n     * not know the runtime type of \u003ccode\u003etype\u003c/code\u003e: if you know you have a\n     * {@link Class} instance, it is already raw; if you know you have a\n     * {@link ParameterizedType}, its raw type is only a method call away. \u003c/p\u003e\n     *\n     * @param type to resolve\n     * @param assigningType type to be resolved against\n     * @return the resolved \u003ccode\u003eClass\u003c/code\u003e object or \u003ccode\u003enull\u003c/code\u003e if\n     * the type could not be resolved\n     ",
      "child_ranges": [
        "(line 1001,col 9)-(line 1004,col 9)",
        "(line 1006,col 9)-(line 1009,col 9)",
        "(line 1011,col 9)-(line 1045,col 9)",
        "(line 1047,col 9)-(line 1054,col 9)",
        "(line 1057,col 9)-(line 1059,col 9)",
        "(line 1061,col 9)-(line 1061,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.reflect.TypeUtils.isArrayType(java.lang.reflect.Type)",
      "begin_line": 1069,
      "end_line": 1071,
      "comment": "\n     * Learn whether the specified type denotes an array type.\n     * @param type the type to be checked\n     * @return \u003ccode\u003etrue\u003c/code\u003e if \u003ccode\u003etype\u003c/code\u003e is an array class or a {@link GenericArrayType}.\n     ",
      "child_ranges": [
        "(line 1070,col 9)-(line 1070,col 107)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.reflect.TypeUtils.getArrayComponentType(java.lang.reflect.Type)",
      "begin_line": 1078,
      "end_line": 1087,
      "comment": "\n     * Get the array component type of \u003ccode\u003etype\u003c/code\u003e.\n     * @param type the type to be checked\n     * @return component type or null if type is not an array type\n     ",
      "child_ranges": [
        "(line 1079,col 9)-(line 1082,col 9)",
        "(line 1083,col 9)-(line 1085,col 9)",
        "(line 1086,col 9)-(line 1086,col 20)"
      ]
    }
  ]
}