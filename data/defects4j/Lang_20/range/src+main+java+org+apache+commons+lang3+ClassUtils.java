{
  "filepath": "/tmp/Lang-20b/src/main/java/org/apache/commons/lang3/ClassUtils.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ClassUtils",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 43,
      "end_line": 1102,
      "comment": "\n * \u003cp\u003eOperates on classes without using reflection.\u003c/p\u003e\n *\n * \u003cp\u003eThis class handles invalid {@code null} inputs as best it can.\n * Each method documents its behaviour in more detail.\u003c/p\u003e\n *\n * \u003cp\u003eThe notion of a {@code canonical name} includes the human\n * readable name for the type, for example {@code int[]}. The\n * non-canonical method variants work with the JVM names, such as\n * {@code [I}. \u003c/p\u003e\n *\n * @since 2.0\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "PACKAGE_SEPARATOR_CHAR"
      ],
      "begin_line": 48,
      "end_line": 48,
      "comment": "\n     * \u003cp\u003eThe package separator character: \u003ccode\u003e\u0027\u0026#x2e;\u0027 \u003d\u003d {@value}\u003c/code\u003e.\u003c/p\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "PACKAGE_SEPARATOR"
      ],
      "begin_line": 53,
      "end_line": 53,
      "comment": "\n     * \u003cp\u003eThe package separator String: {@code \"\u0026#x2e;\"}.\u003c/p\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "INNER_CLASS_SEPARATOR_CHAR"
      ],
      "begin_line": 58,
      "end_line": 58,
      "comment": "\n     * \u003cp\u003eThe inner class separator character: \u003ccode\u003e\u0027$\u0027 \u003d\u003d {@value}\u003c/code\u003e.\u003c/p\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "INNER_CLASS_SEPARATOR"
      ],
      "begin_line": 63,
      "end_line": 63,
      "comment": "\n     * \u003cp\u003eThe inner class separator String: {@code \"$\"}.\u003c/p\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "primitiveWrapperMap"
      ],
      "begin_line": 68,
      "end_line": 68,
      "comment": "\n     * Maps primitive {@code Class}es to their corresponding wrapper {@code Class}.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "wrapperPrimitiveMap"
      ],
      "begin_line": 84,
      "end_line": 84,
      "comment": "\n     * Maps wrapper {@code Class}es to their corresponding primitive types.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "abbreviationMap"
      ],
      "begin_line": 97,
      "end_line": 97,
      "comment": "\n     * Maps a primitive class name to its corresponding abbreviation used in array class names.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "reverseAbbreviationMap"
      ],
      "begin_line": 102,
      "end_line": 102,
      "comment": "\n     * Maps an abbreviation used in array class names to corresponding primitive class name.\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ClassUtils.addAbbreviation(java.lang.String, java.lang.String)",
      "begin_line": 110,
      "end_line": 113,
      "comment": "\n     * Add primitive type abbreviation to maps of abbreviations.\n     *\n     * @param primitive Canonical name of primitive type\n     * @param abbreviation Corresponding abbreviation of primitive type\n     ",
      "child_ranges": [
        "(line 111,col 9)-(line 111,col 53)",
        "(line 112,col 9)-(line 112,col 60)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.ClassUtils.ClassUtils()",
      "begin_line": 137,
      "end_line": 139,
      "comment": "\n     * \u003cp\u003eClassUtils instances should NOT be constructed in standard programming.\n     * Instead, the class should be used as\n     * {@code ClassUtils.getShortClassName(cls)}.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis constructor is public to permit tools that require a JavaBean\n     * instance to operate.\u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 138,col 7)-(line 138,col 14)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ClassUtils.getShortClassName(java.lang.Object, java.lang.String)",
      "begin_line": 150,
      "end_line": 155,
      "comment": "\n     * \u003cp\u003eGets the class name minus the package name for an {@code Object}.\u003c/p\u003e\n     *\n     * @param object  the class to get the short name for, may be null\n     * @param valueIfNull  the value to return if null\n     * @return the class name of the object without the package name, or the null value\n     ",
      "child_ranges": [
        "(line 151,col 9)-(line 153,col 9)",
        "(line 154,col 9)-(line 154,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ClassUtils.getShortClassName(java.lang.Class\u003c?\u003e)",
      "begin_line": 167,
      "end_line": 172,
      "comment": "\n     * \u003cp\u003eGets the class name minus the package name from a {@code Class}.\u003c/p\u003e\n     * \n     * \u003cp\u003eConsider using the Java 5 API {@link Class#getSimpleName()} instead. \n     * The one known difference is that this code will return {@code \"Map.Entry\"} while \n     * the {@code java.lang.Class} variant will simply return {@code \"Entry\"}. \u003c/p\u003e\n     *\n     * @param cls  the class to get the short name for.\n     * @return the class name without the package name or an empty string\n     ",
      "child_ranges": [
        "(line 168,col 9)-(line 170,col 9)",
        "(line 171,col 9)-(line 171,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ClassUtils.getShortClassName(java.lang.String)",
      "begin_line": 186,
      "end_line": 220,
      "comment": "\n     * \u003cp\u003eGets the class name minus the package name from a String.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe string passed in is assumed to be a class name - it is not checked.\u003c/p\u003e\n\n     * \u003cp\u003eNote that this method differs from Class.getSimpleName() in that this will \n     * return {@code \"Map.Entry\"} whilst the {@code java.lang.Class} variant will simply \n     * return {@code \"Entry\"}. \u003c/p\u003e\n     *\n     * @param className  the className to get the short name for\n     * @return the class name of the class without the package name or an empty string\n     ",
      "child_ranges": [
        "(line 187,col 9)-(line 189,col 9)",
        "(line 190,col 9)-(line 192,col 9)",
        "(line 194,col 9)-(line 194,col 56)",
        "(line 197,col 9)-(line 206,col 9)",
        "(line 208,col 9)-(line 210,col 9)",
        "(line 212,col 9)-(line 212,col 71)",
        "(line 213,col 9)-(line 214,col 83)",
        "(line 215,col 9)-(line 215,col 57)",
        "(line 216,col 9)-(line 218,col 9)",
        "(line 219,col 9)-(line 219,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ClassUtils.getSimpleName(java.lang.Class\u003c?\u003e)",
      "begin_line": 230,
      "end_line": 235,
      "comment": "\n     * \u003cp\u003eNull-safe version of \u003ccode\u003eaClass.getSimpleName()\u003c/code\u003e\u003c/p\u003e\n     *\n     * @param cls the class for which to get the simple name.\n     * @return the simple class name.\n     * @since 3.0\n     * @see Class#getSimpleName()\n     ",
      "child_ranges": [
        "(line 231,col 9)-(line 233,col 9)",
        "(line 234,col 9)-(line 234,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ClassUtils.getSimpleName(java.lang.Object, java.lang.String)",
      "begin_line": 246,
      "end_line": 251,
      "comment": "\n     * \u003cp\u003eNull-safe version of \u003ccode\u003eaClass.getSimpleName()\u003c/code\u003e\u003c/p\u003e\n     *\n     * @param object the object for which to get the simple class name.\n     * @param valueIfNull the value to return if \u003ccode\u003eobject\u003c/code\u003e is \u003ccode\u003enull\u003c/code\u003e\n     * @return the simple class name.\n     * @since 3.0\n     * @see Class#getSimpleName()\n     ",
      "child_ranges": [
        "(line 247,col 9)-(line 249,col 9)",
        "(line 250,col 9)-(line 250,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ClassUtils.getPackageName(java.lang.Object, java.lang.String)",
      "begin_line": 262,
      "end_line": 267,
      "comment": "\n     * \u003cp\u003eGets the package name of an {@code Object}.\u003c/p\u003e\n     *\n     * @param object  the class to get the package name for, may be null\n     * @param valueIfNull  the value to return if null\n     * @return the package name of the object, or the null value\n     ",
      "child_ranges": [
        "(line 263,col 9)-(line 265,col 9)",
        "(line 266,col 9)-(line 266,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ClassUtils.getPackageName(java.lang.Class\u003c?\u003e)",
      "begin_line": 275,
      "end_line": 280,
      "comment": "\n     * \u003cp\u003eGets the package name of a {@code Class}.\u003c/p\u003e\n     *\n     * @param cls  the class to get the package name for, may be {@code null}.\n     * @return the package name or an empty string\n     ",
      "child_ranges": [
        "(line 276,col 9)-(line 278,col 9)",
        "(line 279,col 9)-(line 279,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ClassUtils.getPackageName(java.lang.String)",
      "begin_line": 291,
      "end_line": 310,
      "comment": "\n     * \u003cp\u003eGets the package name from a {@code String}.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe string passed in is assumed to be a class name - it is not checked.\u003c/p\u003e\n     * \u003cp\u003eIf the class is unpackaged, return an empty string.\u003c/p\u003e\n     *\n     * @param className  the className to get the package name for, may be {@code null}\n     * @return the package name or an empty string\n     ",
      "child_ranges": [
        "(line 292,col 9)-(line 294,col 9)",
        "(line 297,col 9)-(line 299,col 9)",
        "(line 301,col 9)-(line 303,col 9)",
        "(line 305,col 9)-(line 305,col 62)",
        "(line 306,col 9)-(line 308,col 9)",
        "(line 309,col 9)-(line 309,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ClassUtils.getAllSuperclasses(java.lang.Class\u003c?\u003e)",
      "begin_line": 321,
      "end_line": 332,
      "comment": "\n     * \u003cp\u003eGets a {@code List} of superclasses for the given class.\u003c/p\u003e\n     *\n     * @param cls  the class to look up, may be {@code null}\n     * @return the {@code List} of superclasses in order going up from this one\n     *  {@code null} if null input\n     ",
      "child_ranges": [
        "(line 322,col 9)-(line 324,col 9)",
        "(line 325,col 9)-(line 325,col 59)",
        "(line 326,col 9)-(line 326,col 50)",
        "(line 327,col 9)-(line 330,col 9)",
        "(line 331,col 9)-(line 331,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ClassUtils.getAllInterfaces(java.lang.Class\u003c?\u003e)",
      "begin_line": 347,
      "end_line": 356,
      "comment": "\n     * \u003cp\u003eGets a {@code List} of all interfaces implemented by the given\n     * class and its superclasses.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe order is determined by looking through each interface in turn as\n     * declared in the source file and following its hierarchy up. Then each\n     * superclass is considered in the same way. Later duplicates are ignored,\n     * so the order is maintained.\u003c/p\u003e\n     *\n     * @param cls  the class to look up, may be {@code null}\n     * @return the {@code List} of interfaces in order,\n     *  {@code null} if null input\n     ",
      "child_ranges": [
        "(line 348,col 9)-(line 350,col 9)",
        "(line 352,col 9)-(line 352,col 80)",
        "(line 353,col 9)-(line 353,col 47)",
        "(line 355,col 9)-(line 355,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ClassUtils.getAllInterfaces(java.lang.Class\u003c?\u003e, java.util.HashSet\u003cjava.lang.Class\u003c?\u003e\u003e)",
      "begin_line": 364,
      "end_line": 376,
      "comment": "\n     * Get the interfaces for the specified class.\n     *\n     * @param cls  the class to look up, may be {@code null}\n     * @param interfacesFound the {@code Set} of interfaces for the class\n     ",
      "child_ranges": [
        "(line 365,col 9)-(line 375,col 10)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ClassUtils.convertClassNamesToClasses(java.util.List\u003cjava.lang.String\u003e)",
      "begin_line": 392,
      "end_line": 405,
      "comment": "\n     * \u003cp\u003eGiven a {@code List} of class names, this method converts them into classes.\u003c/p\u003e\n     *\n     * \u003cp\u003eA new {@code List} is returned. If the class name cannot be found, {@code null}\n     * is stored in the {@code List}. If the class name in the {@code List} is\n     * {@code null}, {@code null} is stored in the output {@code List}.\u003c/p\u003e\n     *\n     * @param classNames  the classNames to change\n     * @return a {@code List} of Class objects corresponding to the class names,\n     *  {@code null} if null input\n     * @throws ClassCastException if classNames contains a non String entry\n     ",
      "child_ranges": [
        "(line 393,col 9)-(line 395,col 9)",
        "(line 396,col 9)-(line 396,col 76)",
        "(line 397,col 9)-(line 403,col 9)",
        "(line 404,col 9)-(line 404,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ClassUtils.convertClassesToClassNames(java.util.List\u003cjava.lang.Class\u003c?\u003e\u003e)",
      "begin_line": 419,
      "end_line": 432,
      "comment": "\n     * \u003cp\u003eGiven a {@code List} of {@code Class} objects, this method converts\n     * them into class names.\u003c/p\u003e\n     *\n     * \u003cp\u003eA new {@code List} is returned. {@code null} objects will be copied into\n     * the returned list as {@code null}.\u003c/p\u003e\n     *\n     * @param classes  the classes to change\n     * @return a {@code List} of class names corresponding to the Class objects,\n     *  {@code null} if null input\n     * @throws ClassCastException if {@code classes} contains a non-{@code Class} entry\n     ",
      "child_ranges": [
        "(line 420,col 9)-(line 422,col 9)",
        "(line 423,col 9)-(line 423,col 72)",
        "(line 424,col 9)-(line 430,col 9)",
        "(line 431,col 9)-(line 431,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ClassUtils.isAssignable(java.lang.Class\u003c?\u003e[], java.lang.Class\u003c?\u003e...)",
      "begin_line": 472,
      "end_line": 474,
      "comment": "\n     * \u003cp\u003eChecks if an array of Classes can be assigned to another array of Classes.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method calls {@link #isAssignable(Class, Class) isAssignable} for each\n     * Class pair in the input arrays. It can be used to check if a set of arguments\n     * (the first parameter) are suitably compatible with a set of method parameter types\n     * (the second parameter).\u003c/p\u003e\n     *\n     * \u003cp\u003eUnlike the {@link Class#isAssignableFrom(java.lang.Class)} method, this\n     * method takes into account widenings of primitive classes and\n     * {@code null}s.\u003c/p\u003e\n     *\n     * \u003cp\u003ePrimitive widenings allow an int to be assigned to a {@code long},\n     * {@code float} or {@code double}. This method returns the correct\n     * result for these cases.\u003c/p\u003e\n     *\n     * \u003cp\u003e{@code Null} may be assigned to any reference type. This method will\n     * return {@code true} if {@code null} is passed in and the toClass is\n     * non-primitive.\u003c/p\u003e\n     *\n     * \u003cp\u003eSpecifically, this method tests whether the type represented by the\n     * specified {@code Class} parameter can be converted to the type\n     * represented by this {@code Class} object via an identity conversion\n     * widening primitive or widening reference conversion. See\n     * \u003cem\u003e\u003ca href\u003d\"http://java.sun.com/docs/books/jls/\"\u003eThe Java Language Specification\u003c/a\u003e\u003c/em\u003e,\n     * sections 5.1.1, 5.1.2 and 5.1.4 for details.\u003c/p\u003e\n     *\n     * \u003cp\u003e\u003cstrong\u003eSince Lang 3.0,\u003c/strong\u003e this method will default behavior for\n     * calculating assignability between primitive and wrapper types \u003cem\u003ecorresponding\n     * to the running Java version\u003c/em\u003e; i.e. autoboxing will be the default\n     * behavior in VMs running Java versions \u003e\u003d 1.5.\u003c/p\u003e\n     *\n     * @param classArray  the array of Classes to check, may be {@code null}\n     * @param toClassArray  the array of Classes to try to assign into, may be {@code null}\n     * @return {@code true} if assignment possible\n     ",
      "child_ranges": [
        "(line 473,col 9)-(line 473,col 110)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ClassUtils.isAssignable(java.lang.Class\u003c?\u003e[], java.lang.Class\u003c?\u003e[], boolean)",
      "begin_line": 508,
      "end_line": 524,
      "comment": "\n     * \u003cp\u003eChecks if an array of Classes can be assigned to another array of Classes.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method calls {@link #isAssignable(Class, Class) isAssignable} for each\n     * Class pair in the input arrays. It can be used to check if a set of arguments\n     * (the first parameter) are suitably compatible with a set of method parameter types\n     * (the second parameter).\u003c/p\u003e\n     *\n     * \u003cp\u003eUnlike the {@link Class#isAssignableFrom(java.lang.Class)} method, this\n     * method takes into account widenings of primitive classes and\n     * {@code null}s.\u003c/p\u003e\n     *\n     * \u003cp\u003ePrimitive widenings allow an int to be assigned to a {@code long},\n     * {@code float} or {@code double}. This method returns the correct\n     * result for these cases.\u003c/p\u003e\n     *\n     * \u003cp\u003e{@code Null} may be assigned to any reference type. This method will\n     * return {@code true} if {@code null} is passed in and the toClass is\n     * non-primitive.\u003c/p\u003e\n     *\n     * \u003cp\u003eSpecifically, this method tests whether the type represented by the\n     * specified {@code Class} parameter can be converted to the type\n     * represented by this {@code Class} object via an identity conversion\n     * widening primitive or widening reference conversion. See\n     * \u003cem\u003e\u003ca href\u003d\"http://java.sun.com/docs/books/jls/\"\u003eThe Java Language Specification\u003c/a\u003e\u003c/em\u003e,\n     * sections 5.1.1, 5.1.2 and 5.1.4 for details.\u003c/p\u003e\n     *\n     * @param classArray  the array of Classes to check, may be {@code null}\n     * @param toClassArray  the array of Classes to try to assign into, may be {@code null}\n     * @param autoboxing  whether to use implicit autoboxing/unboxing between primitives and wrappers\n     * @return {@code true} if assignment possible\n     ",
      "child_ranges": [
        "(line 509,col 9)-(line 511,col 9)",
        "(line 512,col 9)-(line 514,col 9)",
        "(line 515,col 9)-(line 517,col 9)",
        "(line 518,col 9)-(line 522,col 9)",
        "(line 523,col 9)-(line 523,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ClassUtils.isAssignable(java.lang.Class\u003c?\u003e, java.lang.Class\u003c?\u003e)",
      "begin_line": 557,
      "end_line": 559,
      "comment": "\n     * \u003cp\u003eChecks if one {@code Class} can be assigned to a variable of\n     * another {@code Class}.\u003c/p\u003e\n     *\n     * \u003cp\u003eUnlike the {@link Class#isAssignableFrom(java.lang.Class)} method,\n     * this method takes into account widenings of primitive classes and\n     * {@code null}s.\u003c/p\u003e\n     *\n     * \u003cp\u003ePrimitive widenings allow an int to be assigned to a long, float or\n     * double. This method returns the correct result for these cases.\u003c/p\u003e\n     *\n     * \u003cp\u003e{@code Null} may be assigned to any reference type. This method\n     * will return {@code true} if {@code null} is passed in and the\n     * toClass is non-primitive.\u003c/p\u003e\n     *\n     * \u003cp\u003eSpecifically, this method tests whether the type represented by the\n     * specified {@code Class} parameter can be converted to the type\n     * represented by this {@code Class} object via an identity conversion\n     * widening primitive or widening reference conversion. See\n     * \u003cem\u003e\u003ca href\u003d\"http://java.sun.com/docs/books/jls/\"\u003eThe Java Language Specification\u003c/a\u003e\u003c/em\u003e,\n     * sections 5.1.1, 5.1.2 and 5.1.4 for details.\u003c/p\u003e\n     *\n     * \u003cp\u003e\u003cstrong\u003eSince Lang 3.0,\u003c/strong\u003e this method will default behavior for\n     * calculating assignability between primitive and wrapper types \u003cem\u003ecorresponding\n     * to the running Java version\u003c/em\u003e; i.e. autoboxing will be the default\n     * behavior in VMs running Java versions \u003e\u003d 1.5.\u003c/p\u003e\n     *\n     * @param cls  the Class to check, may be null\n     * @param toClass  the Class to try to assign into, returns false if null\n     * @return {@code true} if assignment possible\n     ",
      "child_ranges": [
        "(line 558,col 9)-(line 558,col 98)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ClassUtils.isAssignable(java.lang.Class\u003c?\u003e, java.lang.Class\u003c?\u003e, boolean)",
      "begin_line": 588,
      "end_line": 659,
      "comment": "\n     * \u003cp\u003eChecks if one {@code Class} can be assigned to a variable of\n     * another {@code Class}.\u003c/p\u003e\n     *\n     * \u003cp\u003eUnlike the {@link Class#isAssignableFrom(java.lang.Class)} method,\n     * this method takes into account widenings of primitive classes and\n     * {@code null}s.\u003c/p\u003e\n     *\n     * \u003cp\u003ePrimitive widenings allow an int to be assigned to a long, float or\n     * double. This method returns the correct result for these cases.\u003c/p\u003e\n     *\n     * \u003cp\u003e{@code Null} may be assigned to any reference type. This method\n     * will return {@code true} if {@code null} is passed in and the\n     * toClass is non-primitive.\u003c/p\u003e\n     *\n     * \u003cp\u003eSpecifically, this method tests whether the type represented by the\n     * specified {@code Class} parameter can be converted to the type\n     * represented by this {@code Class} object via an identity conversion\n     * widening primitive or widening reference conversion. See\n     * \u003cem\u003e\u003ca href\u003d\"http://java.sun.com/docs/books/jls/\"\u003eThe Java Language Specification\u003c/a\u003e\u003c/em\u003e,\n     * sections 5.1.1, 5.1.2 and 5.1.4 for details.\u003c/p\u003e\n     *\n     * @param cls  the Class to check, may be null\n     * @param toClass  the Class to try to assign into, returns false if null\n     * @param autoboxing  whether to use implicit autoboxing/unboxing between primitives and wrappers\n     * @return {@code true} if assignment possible\n     ",
      "child_ranges": [
        "(line 589,col 9)-(line 591,col 9)",
        "(line 593,col 9)-(line 595,col 9)",
        "(line 597,col 9)-(line 610,col 9)",
        "(line 611,col 9)-(line 613,col 9)",
        "(line 614,col 9)-(line 657,col 9)",
        "(line 658,col 9)-(line 658,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ClassUtils.primitiveToWrapper(java.lang.Class\u003c?\u003e)",
      "begin_line": 673,
      "end_line": 679,
      "comment": "\n     * \u003cp\u003eConverts the specified primitive Class object to its corresponding\n     * wrapper Class object.\u003c/p\u003e\n     *\n     * \u003cp\u003eNOTE: From v2.2, this method handles {@code Void.TYPE},\n     * returning {@code Void.TYPE}.\u003c/p\u003e\n     *\n     * @param cls  the class to convert, may be null\n     * @return the wrapper class for {@code cls} or {@code cls} if\n     * {@code cls} is not a primitive. {@code null} if null input.\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 674,col 9)-(line 674,col 38)",
        "(line 675,col 9)-(line 677,col 9)",
        "(line 678,col 9)-(line 678,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ClassUtils.primitivesToWrappers(java.lang.Class\u003c?\u003e...)",
      "begin_line": 691,
      "end_line": 705,
      "comment": "\n     * \u003cp\u003eConverts the specified array of primitive Class objects to an array of\n     * its corresponding wrapper Class objects.\u003c/p\u003e\n     *\n     * @param classes  the class array to convert, may be null or empty\n     * @return an array which contains for each given class, the wrapper class or\n     * the original class if class is not a primitive. {@code null} if null input.\n     * Empty array if an empty array passed in.\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 692,col 9)-(line 694,col 9)",
        "(line 696,col 9)-(line 698,col 9)",
        "(line 700,col 9)-(line 700,col 64)",
        "(line 701,col 9)-(line 703,col 9)",
        "(line 704,col 9)-(line 704,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ClassUtils.wrapperToPrimitive(java.lang.Class\u003c?\u003e)",
      "begin_line": 723,
      "end_line": 725,
      "comment": "\n     * \u003cp\u003eConverts the specified wrapper class to its corresponding primitive\n     * class.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method is the counter part of {@code primitiveToWrapper()}.\n     * If the passed in class is a wrapper class for a primitive type, this\n     * primitive type will be returned (e.g. {@code Integer.TYPE} for\n     * {@code Integer.class}). For other classes, or if the parameter is\n     * \u003cb\u003enull\u003c/b\u003e, the return value is \u003cb\u003enull\u003c/b\u003e.\u003c/p\u003e\n     *\n     * @param cls the class to convert, may be \u003cb\u003enull\u003c/b\u003e\n     * @return the corresponding primitive type if {@code cls} is a\n     * wrapper class, \u003cb\u003enull\u003c/b\u003e otherwise\n     * @see #primitiveToWrapper(Class)\n     * @since 2.4\n     ",
      "child_ranges": [
        "(line 724,col 9)-(line 724,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(java.lang.Class\u003c?\u003e...)",
      "begin_line": 741,
      "end_line": 755,
      "comment": "\n     * \u003cp\u003eConverts the specified array of wrapper Class objects to an array of\n     * its corresponding primitive Class objects.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method invokes {@code wrapperToPrimitive()} for each element\n     * of the passed in array.\u003c/p\u003e\n     *\n     * @param classes  the class array to convert, may be null or empty\n     * @return an array which contains for each given class, the primitive class or\n     * \u003cb\u003enull\u003c/b\u003e if the original class is not a wrapper class. {@code null} if null input.\n     * Empty array if an empty array passed in.\n     * @see #wrapperToPrimitive(Class)\n     * @since 2.4\n     ",
      "child_ranges": [
        "(line 742,col 9)-(line 744,col 9)",
        "(line 746,col 9)-(line 748,col 9)",
        "(line 750,col 9)-(line 750,col 64)",
        "(line 751,col 9)-(line 753,col 9)",
        "(line 754,col 9)-(line 754,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ClassUtils.isInnerClass(java.lang.Class\u003c?\u003e)",
      "begin_line": 766,
      "end_line": 768,
      "comment": "\n     * \u003cp\u003eIs the specified class an inner class or static nested class.\u003c/p\u003e\n     *\n     * @param cls  the class to check, may be null\n     * @return {@code true} if the class is an inner or static nested class,\n     *  false if not or {@code null}\n     ",
      "child_ranges": [
        "(line 767,col 9)-(line 767,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ClassUtils.getClass(java.lang.ClassLoader, java.lang.String, boolean)",
      "begin_line": 784,
      "end_line": 810,
      "comment": "\n     * Returns the class represented by {@code className} using the\n     * {@code classLoader}.  This implementation supports the syntaxes\n     * \"{@code java.util.Map.Entry[]}\", \"{@code java.util.Map$Entry[]}\",\n     * \"{@code [Ljava.util.Map.Entry;}\", and \"{@code [Ljava.util.Map$Entry;}\".\n     *\n     * @param classLoader  the class loader to use to load the class\n     * @param className  the class name\n     * @param initialize  whether the class must be initialized\n     * @return the class represented by {@code className} using the {@code classLoader}\n     * @throws ClassNotFoundException if the class is not found\n     ",
      "child_ranges": [
        "(line 786,col 9)-(line 809,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ClassUtils.getClass(java.lang.ClassLoader, java.lang.String)",
      "begin_line": 824,
      "end_line": 826,
      "comment": "\n     * Returns the (initialized) class represented by {@code className}\n     * using the {@code classLoader}.  This implementation supports\n     * the syntaxes \"{@code java.util.Map.Entry[]}\",\n     * \"{@code java.util.Map$Entry[]}\", \"{@code [Ljava.util.Map.Entry;}\",\n     * and \"{@code [Ljava.util.Map$Entry;}\".\n     *\n     * @param classLoader  the class loader to use to load the class\n     * @param className  the class name\n     * @return the class represented by {@code className} using the {@code classLoader}\n     * @throws ClassNotFoundException if the class is not found\n     ",
      "child_ranges": [
        "(line 825,col 9)-(line 825,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ClassUtils.getClass(java.lang.String)",
      "begin_line": 839,
      "end_line": 841,
      "comment": "\n     * Returns the (initialized) class represented by {@code className}\n     * using the current thread\u0027s context class loader. This implementation\n     * supports the syntaxes \"{@code java.util.Map.Entry[]}\",\n     * \"{@code java.util.Map$Entry[]}\", \"{@code [Ljava.util.Map.Entry;}\",\n     * and \"{@code [Ljava.util.Map$Entry;}\".\n     *\n     * @param className  the class name\n     * @return the class represented by {@code className} using the current thread\u0027s context class loader\n     * @throws ClassNotFoundException if the class is not found\n     ",
      "child_ranges": [
        "(line 840,col 9)-(line 840,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ClassUtils.getClass(java.lang.String, boolean)",
      "begin_line": 854,
      "end_line": 858,
      "comment": "\n     * Returns the class represented by {@code className} using the\n     * current thread\u0027s context class loader. This implementation supports the\n     * syntaxes \"{@code java.util.Map.Entry[]}\", \"{@code java.util.Map$Entry[]}\",\n     * \"{@code [Ljava.util.Map.Entry;}\", and \"{@code [Ljava.util.Map$Entry;}\".\n     *\n     * @param className  the class name\n     * @param initialize  whether the class must be initialized\n     * @return the class represented by {@code className} using the current thread\u0027s context class loader\n     * @throws ClassNotFoundException if the class is not found\n     ",
      "child_ranges": [
        "(line 855,col 9)-(line 855,col 79)",
        "(line 856,col 9)-(line 856,col 95)",
        "(line 857,col 9)-(line 857,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ClassUtils.getPublicMethod(java.lang.Class\u003c?\u003e, java.lang.String, java.lang.Class\u003c?\u003e...)",
      "begin_line": 883,
      "end_line": 912,
      "comment": "\n     * \u003cp\u003eReturns the desired Method much like {@code Class.getMethod}, however\n     * it ensures that the returned Method is from a public class or interface and not\n     * from an anonymous inner class. This means that the Method is invokable and\n     * doesn\u0027t fall foul of Java bug\n     * \u003ca href\u003d\"http://bugs.sun.com/bugdatabase/view_bug.do?bug_id\u003d4071957\"\u003e4071957\u003c/a\u003e).\n     *\n     *  \u003ccode\u003e\u003cpre\u003eSet set \u003d Collections.unmodifiableSet(...);\n     *  Method method \u003d ClassUtils.getPublicMethod(set.getClass(), \"isEmpty\",  new Class[0]);\n     *  Object result \u003d method.invoke(set, new Object[]);\u003c/pre\u003e\u003c/code\u003e\n     * \u003c/p\u003e\n     *\n     * @param cls  the class to check, not null\n     * @param methodName  the name of the method\n     * @param parameterTypes  the list of parameters\n     * @return the method\n     * @throws NullPointerException if the class is null\n     * @throws SecurityException if a a security violation occured\n     * @throws NoSuchMethodException if the method is not found in the given class\n     *  or if the metothod doen\u0027t conform with the requirements\n     ",
      "child_ranges": [
        "(line 886,col 9)-(line 886,col 74)",
        "(line 887,col 9)-(line 889,col 9)",
        "(line 891,col 9)-(line 891,col 68)",
        "(line 892,col 9)-(line 892,col 55)",
        "(line 893,col 9)-(line 893,col 57)",
        "(line 895,col 9)-(line 908,col 9)",
        "(line 910,col 9)-(line 911,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ClassUtils.toCanonicalName(java.lang.String)",
      "begin_line": 921,
      "end_line": 940,
      "comment": "\n     * Converts a class name to a JLS style class name.\n     *\n     * @param className  the class name\n     * @return the converted name\n     ",
      "child_ranges": [
        "(line 922,col 9)-(line 922,col 60)",
        "(line 923,col 9)-(line 938,col 9)",
        "(line 939,col 9)-(line 939,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ClassUtils.toClass(java.lang.Object...)",
      "begin_line": 952,
      "end_line": 963,
      "comment": "\n     * \u003cp\u003eConverts an array of {@code Object} in to an array of {@code Class} objects.\n     * If any of these objects is null, a null element will be inserted into the array.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns {@code null} for a {@code null} input array.\u003c/p\u003e\n     *\n     * @param array an {@code Object} array\n     * @return a {@code Class} array, {@code null} if null array input\n     * @since 2.4\n     ",
      "child_ranges": [
        "(line 953,col 9)-(line 957,col 9)",
        "(line 958,col 9)-(line 958,col 53)",
        "(line 959,col 9)-(line 961,col 9)",
        "(line 962,col 9)-(line 962,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ClassUtils.getShortCanonicalName(java.lang.Object, java.lang.String)",
      "begin_line": 975,
      "end_line": 980,
      "comment": "\n     * \u003cp\u003eGets the canonical name minus the package name for an {@code Object}.\u003c/p\u003e\n     *\n     * @param object  the class to get the short name for, may be null\n     * @param valueIfNull  the value to return if null\n     * @return the canonical name of the object without the package name, or the null value\n     * @since 2.4\n     ",
      "child_ranges": [
        "(line 976,col 9)-(line 978,col 9)",
        "(line 979,col 9)-(line 979,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ClassUtils.getShortCanonicalName(java.lang.Class\u003c?\u003e)",
      "begin_line": 989,
      "end_line": 994,
      "comment": "\n     * \u003cp\u003eGets the canonical name minus the package name from a {@code Class}.\u003c/p\u003e\n     *\n     * @param cls  the class to get the short name for.\n     * @return the canonical name without the package name or an empty string\n     * @since 2.4\n     ",
      "child_ranges": [
        "(line 990,col 9)-(line 992,col 9)",
        "(line 993,col 9)-(line 993,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ClassUtils.getShortCanonicalName(java.lang.String)",
      "begin_line": 1005,
      "end_line": 1007,
      "comment": "\n     * \u003cp\u003eGets the canonical name minus the package name from a String.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe string passed in is assumed to be a canonical name - it is not checked.\u003c/p\u003e\n     *\n     * @param canonicalName  the class name to get the short name for\n     * @return the canonical name of the class without the package name or an empty string\n     * @since 2.4\n     ",
      "child_ranges": [
        "(line 1006,col 9)-(line 1006,col 77)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ClassUtils.getPackageCanonicalName(java.lang.Object, java.lang.String)",
      "begin_line": 1019,
      "end_line": 1024,
      "comment": "\n     * \u003cp\u003eGets the package name from the canonical name of an {@code Object}.\u003c/p\u003e\n     *\n     * @param object  the class to get the package name for, may be null\n     * @param valueIfNull  the value to return if null\n     * @return the package name of the object, or the null value\n     * @since 2.4\n     ",
      "child_ranges": [
        "(line 1020,col 9)-(line 1022,col 9)",
        "(line 1023,col 9)-(line 1023,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ClassUtils.getPackageCanonicalName(java.lang.Class\u003c?\u003e)",
      "begin_line": 1033,
      "end_line": 1038,
      "comment": "\n     * \u003cp\u003eGets the package name from the canonical name of a {@code Class}.\u003c/p\u003e\n     *\n     * @param cls  the class to get the package name for, may be {@code null}.\n     * @return the package name or an empty string\n     * @since 2.4\n     ",
      "child_ranges": [
        "(line 1034,col 9)-(line 1036,col 9)",
        "(line 1037,col 9)-(line 1037,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ClassUtils.getPackageCanonicalName(java.lang.String)",
      "begin_line": 1050,
      "end_line": 1052,
      "comment": "\n     * \u003cp\u003eGets the package name from the canonical name. \u003c/p\u003e\n     *\n     * \u003cp\u003eThe string passed in is assumed to be a canonical name - it is not checked.\u003c/p\u003e\n     * \u003cp\u003eIf the class is unpackaged, return an empty string.\u003c/p\u003e\n     *\n     * @param canonicalName  the canonical name to get the package name for, may be {@code null}\n     * @return the package name or an empty string\n     * @since 2.4\n     ",
      "child_ranges": [
        "(line 1051,col 9)-(line 1051,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ClassUtils.getCanonicalName(java.lang.String)",
      "begin_line": 1070,
      "end_line": 1101,
      "comment": "\n     * \u003cp\u003eConverts a given name of class into canonical format.\n     * If name of class is not a name of array class it returns\n     * unchanged name.\u003c/p\u003e\n     * \u003cp\u003eExample:\n     * \u003cul\u003e\n     * \u003cli\u003e{@code getCanonicalName(\"[I\") \u003d \"int[]\"}\u003c/li\u003e\n     * \u003cli\u003e{@code getCanonicalName(\"[Ljava.lang.String;\") \u003d \"java.lang.String[]\"}\u003c/li\u003e\n     * \u003cli\u003e{@code getCanonicalName(\"java.lang.String\") \u003d \"java.lang.String\"}\u003c/li\u003e\n     * \u003c/ul\u003e\n     * \u003c/p\u003e\n     *\n     * @param className the name of class\n     * @return canonical form of class name\n     * @since 2.4\n     ",
      "child_ranges": [
        "(line 1071,col 9)-(line 1071,col 60)",
        "(line 1072,col 9)-(line 1100,col 9)"
      ]
    }
  ]
}