{
  "filepath": "/tmp/Lang-57b/src/java/org/apache/commons/lang/ClassUtils.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ClassUtils",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 41,
      "end_line": 679,
      "comment": "\n * \u003cp\u003eOperates on classes without using reflection.\u003c/p\u003e\n *\n * \u003cp\u003eThis class handles invalid \u003ccode\u003enull\u003c/code\u003e inputs as best it can.\n * Each method documents its behaviour in more detail.\u003c/p\u003e\n *\n * @author Stephen Colebourne\n * @author Gary Gregory\n * @author Norm Deane\n * @author Alban Peignier\n * @since 2.0\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "PACKAGE_SEPARATOR_CHAR"
      ],
      "begin_line": 46,
      "end_line": 46,
      "comment": "\n     * \u003cp\u003eThe package separator character: \u003ccode\u003e\u0027\u0026#x2e;\u0027 \u003d\u003d {@value}\u003c/code\u003e.\u003c/p\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "PACKAGE_SEPARATOR"
      ],
      "begin_line": 51,
      "end_line": 51,
      "comment": "\n     * \u003cp\u003eThe package separator String: \u003ccode\u003e\"\u0026#x2e;\"\u003c/code\u003e.\u003c/p\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "INNER_CLASS_SEPARATOR_CHAR"
      ],
      "begin_line": 56,
      "end_line": 56,
      "comment": "\n     * \u003cp\u003eThe inner class separator character: \u003ccode\u003e\u0027$\u0027 \u003d\u003d {@value}\u003c/code\u003e.\u003c/p\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "INNER_CLASS_SEPARATOR"
      ],
      "begin_line": 61,
      "end_line": 61,
      "comment": "\n     * \u003cp\u003eThe inner class separator String: \u003ccode\u003e\"$\"\u003c/code\u003e.\u003c/p\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "primitiveWrapperMap"
      ],
      "begin_line": 66,
      "end_line": 66,
      "comment": "\n     * Maps primitive \u003ccode\u003eClass\u003c/code\u003ees to their corresponding wrapper \u003ccode\u003eClass\u003c/code\u003e.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "abbreviationMap"
      ],
      "begin_line": 82,
      "end_line": 82,
      "comment": "\n     * Maps a primitive class name to its corresponding abbreviation used in array class names.\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.ClassUtils.ClassUtils()",
      "begin_line": 102,
      "end_line": 104,
      "comment": "\n     * \u003cp\u003eClassUtils instances should NOT be constructed in standard programming.\n     * Instead, the class should be used as\n     * \u003ccode\u003eClassUtils.getShortClassName(cls)\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis constructor is public to permit tools that require a JavaBean\n     * instance to operate.\u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 103,col 7)-(line 103,col 14)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.ClassUtils.getShortClassName(java.lang.Object, java.lang.String)",
      "begin_line": 115,
      "end_line": 120,
      "comment": "\n     * \u003cp\u003eGets the class name minus the package name for an \u003ccode\u003eObject\u003c/code\u003e.\u003c/p\u003e\n     *\n     * @param object  the class to get the short name for, may be null\n     * @param valueIfNull  the value to return if null\n     * @return the class name of the object without the package name, or the null value\n     ",
      "child_ranges": [
        "(line 116,col 9)-(line 118,col 9)",
        "(line 119,col 9)-(line 119,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.ClassUtils.getShortClassName(java.lang.Class)",
      "begin_line": 128,
      "end_line": 133,
      "comment": "\n     * \u003cp\u003eGets the class name minus the package name from a \u003ccode\u003eClass\u003c/code\u003e.\u003c/p\u003e\n     *\n     * @param cls  the class to get the short name for.\n     * @return the class name without the package name or an empty string\n     ",
      "child_ranges": [
        "(line 129,col 9)-(line 131,col 9)",
        "(line 132,col 9)-(line 132,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.ClassUtils.getShortClassName(java.lang.String)",
      "begin_line": 143,
      "end_line": 160,
      "comment": "\n     * \u003cp\u003eGets the class name minus the package name from a String.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe string passed in is assumed to be a class name - it is not checked.\u003c/p\u003e\n     *\n     * @param className  the className to get the short name for\n     * @return the class name of the class without the package name or an empty string\n     ",
      "child_ranges": [
        "(line 144,col 9)-(line 146,col 9)",
        "(line 147,col 9)-(line 149,col 9)",
        "(line 150,col 9)-(line 150,col 47)",
        "(line 151,col 9)-(line 151,col 24)",
        "(line 152,col 9)-(line 158,col 9)",
        "(line 159,col 9)-(line 159,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.ClassUtils.getPackageName(java.lang.Object, java.lang.String)",
      "begin_line": 171,
      "end_line": 176,
      "comment": "\n     * \u003cp\u003eGets the package name of an \u003ccode\u003eObject\u003c/code\u003e.\u003c/p\u003e\n     *\n     * @param object  the class to get the package name for, may be null\n     * @param valueIfNull  the value to return if null\n     * @return the package name of the object, or the null value\n     ",
      "child_ranges": [
        "(line 172,col 9)-(line 174,col 9)",
        "(line 175,col 9)-(line 175,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.ClassUtils.getPackageName(java.lang.Class)",
      "begin_line": 184,
      "end_line": 189,
      "comment": "\n     * \u003cp\u003eGets the package name of a \u003ccode\u003eClass\u003c/code\u003e.\u003c/p\u003e\n     *\n     * @param cls  the class to get the package name for, may be \u003ccode\u003enull\u003c/code\u003e.\n     * @return the package name or an empty string\n     ",
      "child_ranges": [
        "(line 185,col 9)-(line 187,col 9)",
        "(line 188,col 9)-(line 188,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.ClassUtils.getPackageName(java.lang.String)",
      "begin_line": 200,
      "end_line": 209,
      "comment": "\n     * \u003cp\u003eGets the package name from a \u003ccode\u003eString\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe string passed in is assumed to be a class name - it is not checked.\u003c/p\u003e\n     * \u003cp\u003eIf the class is unpackaged, return an empty string.\u003c/p\u003e\n     *\n     * @param className  the className to get the package name for, may be \u003ccode\u003enull\u003c/code\u003e\n     * @return the package name or an empty string\n     ",
      "child_ranges": [
        "(line 201,col 9)-(line 203,col 9)",
        "(line 204,col 9)-(line 204,col 62)",
        "(line 205,col 9)-(line 207,col 9)",
        "(line 208,col 9)-(line 208,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.ClassUtils.getAllSuperclasses(java.lang.Class)",
      "begin_line": 220,
      "end_line": 231,
      "comment": "\n     * \u003cp\u003eGets a \u003ccode\u003eList\u003c/code\u003e of superclasses for the given class.\u003c/p\u003e\n     *\n     * @param cls  the class to look up, may be \u003ccode\u003enull\u003c/code\u003e\n     * @return the \u003ccode\u003eList\u003c/code\u003e of superclasses in order going up from this one\n     *  \u003ccode\u003enull\u003c/code\u003e if null input\n     ",
      "child_ranges": [
        "(line 221,col 9)-(line 223,col 9)",
        "(line 224,col 9)-(line 224,col 39)",
        "(line 225,col 9)-(line 225,col 47)",
        "(line 226,col 9)-(line 229,col 9)",
        "(line 230,col 9)-(line 230,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.ClassUtils.getAllInterfaces(java.lang.Class)",
      "begin_line": 246,
      "end_line": 268,
      "comment": "\n     * \u003cp\u003eGets a \u003ccode\u003eList\u003c/code\u003e of all interfaces implemented by the given\n     * class and its superclasses.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe order is determined by looking through each interface in turn as\n     * declared in the source file and following its hierarchy up. Then each\n     * superclass is considered in the same way. Later duplicates are ignored,\n     * so the order is maintained.\u003c/p\u003e\n     *\n     * @param cls  the class to look up, may be \u003ccode\u003enull\u003c/code\u003e\n     * @return the \u003ccode\u003eList\u003c/code\u003e of interfaces in order,\n     *  \u003ccode\u003enull\u003c/code\u003e if null input\n     ",
      "child_ranges": [
        "(line 247,col 9)-(line 249,col 9)",
        "(line 250,col 9)-(line 250,col 36)",
        "(line 251,col 9)-(line 266,col 9)",
        "(line 267,col 9)-(line 267,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.ClassUtils.convertClassNamesToClasses(java.util.List)",
      "begin_line": 284,
      "end_line": 298,
      "comment": "\n     * \u003cp\u003eGiven a \u003ccode\u003eList\u003c/code\u003e of class names, this method converts them into classes.\u003c/p\u003e\n     *\n     * \u003cp\u003eA new \u003ccode\u003eList\u003c/code\u003e is returned. If the class name cannot be found, \u003ccode\u003enull\u003c/code\u003e\n     * is stored in the \u003ccode\u003eList\u003c/code\u003e. If the class name in the \u003ccode\u003eList\u003c/code\u003e is\n     * \u003ccode\u003enull\u003c/code\u003e, \u003ccode\u003enull\u003c/code\u003e is stored in the output \u003ccode\u003eList\u003c/code\u003e.\u003c/p\u003e\n     *\n     * @param classNames  the classNames to change\n     * @return a \u003ccode\u003eList\u003c/code\u003e of Class objects corresponding to the class names,\n     *  \u003ccode\u003enull\u003c/code\u003e if null input\n     * @throws ClassCastException if classNames contains a non String entry\n     ",
      "child_ranges": [
        "(line 285,col 9)-(line 287,col 9)",
        "(line 288,col 9)-(line 288,col 56)",
        "(line 289,col 9)-(line 296,col 9)",
        "(line 297,col 9)-(line 297,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.ClassUtils.convertClassesToClassNames(java.util.List)",
      "begin_line": 312,
      "end_line": 326,
      "comment": "\n     * \u003cp\u003eGiven a \u003ccode\u003eList\u003c/code\u003e of \u003ccode\u003eClass\u003c/code\u003e objects, this method converts\n     * them into class names.\u003c/p\u003e\n     *\n     * \u003cp\u003eA new \u003ccode\u003eList\u003c/code\u003e is returned. \u003ccode\u003enull\u003c/code\u003e objects will be copied into\n     * the returned list as \u003ccode\u003enull\u003c/code\u003e.\u003c/p\u003e\n     *\n     * @param classes  the classes to change\n     * @return a \u003ccode\u003eList\u003c/code\u003e of class names corresponding to the Class objects,\n     *  \u003ccode\u003enull\u003c/code\u003e if null input\n     * @throws ClassCastException if \u003ccode\u003eclasses\u003c/code\u003e contains a non-\u003ccode\u003eClass\u003c/code\u003e entry\n     ",
      "child_ranges": [
        "(line 313,col 9)-(line 315,col 9)",
        "(line 316,col 9)-(line 316,col 56)",
        "(line 317,col 9)-(line 324,col 9)",
        "(line 325,col 9)-(line 325,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.ClassUtils.isAssignable(java.lang.Class[], java.lang.Class[])",
      "begin_line": 361,
      "end_line": 377,
      "comment": "\n     * \u003cp\u003eChecks if an array of Classes can be assigned to another array of Classes.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method calls {@link #isAssignable(Class, Class) isAssignable} for each\n     * Class pair in the input arrays. It can be used to check if a set of arguments\n     * (the first parameter) are suitably compatible with a set of method parameter types\n     * (the second parameter).\u003c/p\u003e\n     *\n     * \u003cp\u003eUnlike the {@link Class#isAssignableFrom(java.lang.Class)} method, this\n     * method takes into account widenings of primitive classes and\n     * \u003ccode\u003enull\u003c/code\u003es.\u003c/p\u003e\n     *\n     * \u003cp\u003ePrimitive widenings allow an int to be assigned to a \u003ccode\u003elong\u003c/code\u003e,\n     * \u003ccode\u003efloat\u003c/code\u003e or \u003ccode\u003edouble\u003c/code\u003e. This method returns the correct\n     * result for these cases.\u003c/p\u003e\n     *\n     * \u003cp\u003e\u003ccode\u003eNull\u003c/code\u003e may be assigned to any reference type. This method will\n     * return \u003ccode\u003etrue\u003c/code\u003e if \u003ccode\u003enull\u003c/code\u003e is passed in and the toClass is\n     * non-primitive.\u003c/p\u003e\n     *\n     * \u003cp\u003eSpecifically, this method tests whether the type represented by the\n     * specified \u003ccode\u003eClass\u003c/code\u003e parameter can be converted to the type\n     * represented by this \u003ccode\u003eClass\u003c/code\u003e object via an identity conversion\n     * widening primitive or widening reference conversion. See\n     * \u003cem\u003e\u003ca href\u003d\"http://java.sun.com/docs/books/jls/\"\u003eThe Java Language Specification\u003c/a\u003e\u003c/em\u003e,\n     * sections 5.1.1, 5.1.2 and 5.1.4 for details.\u003c/p\u003e\n     *\n     * @param classArray  the array of Classes to check, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param toClassArray  the array of Classes to try to assign into, may be \u003ccode\u003enull\u003c/code\u003e\n     * @return \u003ccode\u003etrue\u003c/code\u003e if assignment possible\n     ",
      "child_ranges": [
        "(line 362,col 9)-(line 364,col 9)",
        "(line 365,col 9)-(line 367,col 9)",
        "(line 368,col 9)-(line 370,col 9)",
        "(line 371,col 9)-(line 375,col 9)",
        "(line 376,col 9)-(line 376,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.ClassUtils.isAssignable(java.lang.Class, java.lang.Class)",
      "begin_line": 405,
      "end_line": 461,
      "comment": "\n     * \u003cp\u003eChecks if one \u003ccode\u003eClass\u003c/code\u003e can be assigned to a variable of\n     * another \u003ccode\u003eClass\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cp\u003eUnlike the {@link Class#isAssignableFrom(java.lang.Class)} method,\n     * this method takes into account widenings of primitive classes and\n     * \u003ccode\u003enull\u003c/code\u003es.\u003c/p\u003e\n     *\n     * \u003cp\u003ePrimitive widenings allow an int to be assigned to a long, float or\n     * double. This method returns the correct result for these cases.\u003c/p\u003e\n     *\n     * \u003cp\u003e\u003ccode\u003eNull\u003c/code\u003e may be assigned to any reference type. This method\n     * will return \u003ccode\u003etrue\u003c/code\u003e if \u003ccode\u003enull\u003c/code\u003e is passed in and the\n     * toClass is non-primitive.\u003c/p\u003e\n     *\n     * \u003cp\u003eSpecifically, this method tests whether the type represented by the\n     * specified \u003ccode\u003eClass\u003c/code\u003e parameter can be converted to the type\n     * represented by this \u003ccode\u003eClass\u003c/code\u003e object via an identity conversion\n     * widening primitive or widening reference conversion. See\n     * \u003cem\u003e\u003ca href\u003d\"http://java.sun.com/docs/books/jls/\"\u003eThe Java Language Specification\u003c/a\u003e\u003c/em\u003e,\n     * sections 5.1.1, 5.1.2 and 5.1.4 for details.\u003c/p\u003e\n     *\n     * @param cls  the Class to check, may be null\n     * @param toClass  the Class to try to assign into, returns false if null\n     * @return \u003ccode\u003etrue\u003c/code\u003e if assignment possible\n     ",
      "child_ranges": [
        "(line 406,col 9)-(line 408,col 9)",
        "(line 410,col 9)-(line 412,col 9)",
        "(line 413,col 9)-(line 415,col 9)",
        "(line 416,col 9)-(line 459,col 9)",
        "(line 460,col 9)-(line 460,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.ClassUtils.primitiveToWrapper(java.lang.Class)",
      "begin_line": 475,
      "end_line": 481,
      "comment": "\n     * \u003cp\u003eConverts the specified primitive Class object to its corresponding\n     * wrapper Class object.\u003c/p\u003e\n     *\n     * \u003cp\u003eNOTE: From v2.2, this method handles \u003ccode\u003eVoid.TYPE\u003c/code\u003e,\n     * returning \u003ccode\u003eVoid.TYPE\u003c/code\u003e.\u003c/p\u003e\n     *\n     * @param cls  the class to convert, may be null\n     * @return the wrapper class for \u003ccode\u003ecls\u003c/code\u003e or \u003ccode\u003ecls\u003c/code\u003e if\n     * \u003ccode\u003ecls\u003c/code\u003e is not a primitive. \u003ccode\u003enull\u003c/code\u003e if null input.\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 476,col 9)-(line 476,col 35)",
        "(line 477,col 9)-(line 479,col 9)",
        "(line 480,col 9)-(line 480,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.ClassUtils.primitivesToWrappers(java.lang.Class[])",
      "begin_line": 493,
      "end_line": 507,
      "comment": "\n     * \u003cp\u003eConverts the specified array of primitive Class objects to an array of\n     * its corresponding wrapper Class objects.\u003c/p\u003e\n     *\n     * @param classes  the class array to convert, may be null or empty\n     * @return an array which contains for each given class, the wrapper class or\n     * the original class if class is not a primitive. \u003ccode\u003enull\u003c/code\u003e if null input.\n     * Empty array if an empty array passed in.\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 494,col 9)-(line 496,col 9)",
        "(line 498,col 9)-(line 500,col 9)",
        "(line 502,col 9)-(line 502,col 61)",
        "(line 503,col 9)-(line 505,col 9)",
        "(line 506,col 9)-(line 506,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.ClassUtils.isInnerClass(java.lang.Class)",
      "begin_line": 518,
      "end_line": 523,
      "comment": "\n     * \u003cp\u003eIs the specified class an inner class or static nested class.\u003c/p\u003e\n     *\n     * @param cls  the class to check, may be null\n     * @return \u003ccode\u003etrue\u003c/code\u003e if the class is an inner or static nested class,\n     *  false if not or \u003ccode\u003enull\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 519,col 9)-(line 521,col 9)",
        "(line 522,col 9)-(line 522,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.ClassUtils.getClass(java.lang.ClassLoader, java.lang.String, boolean)",
      "begin_line": 538,
      "end_line": 548,
      "comment": "\n     * Returns the class represented by \u003ccode\u003eclassName\u003c/code\u003e using the\n     * \u003ccode\u003eclassLoader\u003c/code\u003e.  This implementation supports names like\n     * \"\u003ccode\u003ejava.lang.String[]\u003c/code\u003e\" as well as \"\u003ccode\u003e[Ljava.lang.String;\u003c/code\u003e\".\n     *\n     * @param classLoader  the class loader to use to load the class\n     * @param className  the class name\n     * @param initialize  whether the class must be initialized\n     * @return the class represented by \u003ccode\u003eclassName\u003c/code\u003e using the \u003ccode\u003eclassLoader\u003c/code\u003e\n     * @throws ClassNotFoundException if the class is not found\n     ",
      "child_ranges": [
        "(line 540,col 9)-(line 540,col 20)",
        "(line 541,col 9)-(line 546,col 9)",
        "(line 547,col 9)-(line 547,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.ClassUtils.getClass(java.lang.ClassLoader, java.lang.String)",
      "begin_line": 561,
      "end_line": 563,
      "comment": "\n     * Returns the (initialized) class represented by \u003ccode\u003eclassName\u003c/code\u003e\n     * using the \u003ccode\u003eclassLoader\u003c/code\u003e.  This implementation supports names\n     * like \"\u003ccode\u003ejava.lang.String[]\u003c/code\u003e\" as well as\n     * \"\u003ccode\u003e[Ljava.lang.String;\u003c/code\u003e\".\n     *\n     * @param classLoader  the class loader to use to load the class\n     * @param className  the class name\n     * @return the class represented by \u003ccode\u003eclassName\u003c/code\u003e using the \u003ccode\u003eclassLoader\u003c/code\u003e\n     * @throws ClassNotFoundException if the class is not found\n     ",
      "child_ranges": [
        "(line 562,col 9)-(line 562,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.ClassUtils.getClass(java.lang.String)",
      "begin_line": 575,
      "end_line": 577,
      "comment": "\n     * Returns the (initialized )class represented by \u003ccode\u003eclassName\u003c/code\u003e\n     * using the current thread\u0027s context class loader. This implementation\n     * supports names like \"\u003ccode\u003ejava.lang.String[]\u003c/code\u003e\" as well as\n     * \"\u003ccode\u003e[Ljava.lang.String;\u003c/code\u003e\".\n     *\n     * @param className  the class name\n     * @return the class represented by \u003ccode\u003eclassName\u003c/code\u003e using the current thread\u0027s context class loader\n     * @throws ClassNotFoundException if the class is not found\n     ",
      "child_ranges": [
        "(line 576,col 9)-(line 576,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.ClassUtils.getClass(java.lang.String, boolean)",
      "begin_line": 590,
      "end_line": 594,
      "comment": "\n     * Returns the class represented by \u003ccode\u003eclassName\u003c/code\u003e using the\n     * current thread\u0027s context class loader. This implementation supports\n     * names like \"\u003ccode\u003ejava.lang.String[]\u003c/code\u003e\" as well as\n     * \"\u003ccode\u003e[Ljava.lang.String;\u003c/code\u003e\".\n     *\n     * @param className  the class name\n     * @param initialize  whether the class must be initialized\n     * @return the class represented by \u003ccode\u003eclassName\u003c/code\u003e using the current thread\u0027s context class loader\n     * @throws ClassNotFoundException if the class is not found\n     ",
      "child_ranges": [
        "(line 591,col 9)-(line 591,col 79)",
        "(line 592,col 9)-(line 592,col 95)",
        "(line 593,col 9)-(line 593,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.ClassUtils.getPublicMethod(java.lang.Class, java.lang.String, java.lang.Class[])",
      "begin_line": 619,
      "end_line": 649,
      "comment": "\n     * \u003cp\u003eReturns the desired Method much like \u003ccode\u003eClass.getMethod\u003c/code\u003e, however \n     * it ensures that the returned Method is from a public class or interface and not \n     * from an anonymous inner class. This means that the Method is invokable and \n     * doesn\u0027t fall foul of Java bug \n     * \u003ca href\u003d\"http://bugs.sun.com/bugdatabase/view_bug.do?bug_id\u003d4071957\"\u003e4071957\u003c/a\u003e).\n     *\n     *  \u003ccode\u003e\u003cpre\u003eSet set \u003d Collections.unmodifiableSet(...);\n     *  Method method \u003d ClassUtils.getPublicMethod(set.getClass(), \"isEmpty\",  new Class[0]);\n     *  Object result \u003d method.invoke(set, new Object[]);\u003c/pre\u003e\u003c/code\u003e\n     * \u003c/p\u003e\n     *\n     * @param cls  the class to check, not null\n     * @param methodName  the name of the method\n     * @param parameterTypes  the list of parameters\n     * @return the method\n     * @throws NullPointerException if the class is null\n     * @throws SecurityException if a a security violation occured\n     * @throws NoSuchMethodException if the method is not found in the given class\n     *  or if the metothod doen\u0027t conform with the requirements\n     ",
      "child_ranges": [
        "(line 622,col 9)-(line 622,col 74)",
        "(line 623,col 9)-(line 625,col 9)",
        "(line 627,col 9)-(line 627,col 48)",
        "(line 628,col 9)-(line 628,col 55)",
        "(line 629,col 9)-(line 629,col 57)",
        "(line 631,col 9)-(line 645,col 9)",
        "(line 647,col 9)-(line 648,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.ClassUtils.toProperClassName(java.lang.String)",
      "begin_line": 658,
      "end_line": 677,
      "comment": "\n     * Converts a class name to a JLS style class name.\n     *\n     * @param className  the class name\n     * @return the converted name\n     ",
      "child_ranges": [
        "(line 659,col 9)-(line 659,col 60)",
        "(line 660,col 9)-(line 675,col 9)",
        "(line 676,col 9)-(line 676,col 25)"
      ]
    }
  ]
}