{
  "filepath": "/tmp/Lang-65b/src/java/org/apache/commons/lang/ClassUtils.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ClassUtils",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 40,
      "end_line": 678,
      "comment": "\n * \u003cp\u003eOperates on classes without using reflection.\u003c/p\u003e\n *\n * \u003cp\u003eThis class handles invalid \u003ccode\u003enull\u003c/code\u003e inputs as best it can.\n * Each method documents its behaviour in more detail.\u003c/p\u003e\n *\n * @author Stephen Colebourne\n * @author Gary Gregory\n * @author Norm Deane\n * @author Alban Peignier\n * @since 2.0\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "PACKAGE_SEPARATOR_CHAR"
      ],
      "begin_line": 45,
      "end_line": 45,
      "comment": "\n     * \u003cp\u003eThe package separator character: \u003ccode\u003e\u0027\u0026#x2e;\u0027 \u003d\u003d {@value}\u003c/code\u003e.\u003c/p\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "PACKAGE_SEPARATOR"
      ],
      "begin_line": 50,
      "end_line": 50,
      "comment": "\n     * \u003cp\u003eThe package separator String: \u003ccode\u003e\"\u0026#x2e;\"\u003c/code\u003e.\u003c/p\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "INNER_CLASS_SEPARATOR_CHAR"
      ],
      "begin_line": 55,
      "end_line": 55,
      "comment": "\n     * \u003cp\u003eThe inner class separator character: \u003ccode\u003e\u0027$\u0027 \u003d\u003d {@value}\u003c/code\u003e.\u003c/p\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "INNER_CLASS_SEPARATOR"
      ],
      "begin_line": 60,
      "end_line": 60,
      "comment": "\n     * \u003cp\u003eThe inner class separator String: \u003ccode\u003e\"$\"\u003c/code\u003e.\u003c/p\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "primitiveWrapperMap"
      ],
      "begin_line": 65,
      "end_line": 65,
      "comment": "\n     * Maps primitive \u003ccode\u003eClass\u003c/code\u003ees to their corresponding wrapper \u003ccode\u003eClass\u003c/code\u003e.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "abbreviationMap"
      ],
      "begin_line": 81,
      "end_line": 81,
      "comment": "\n     * Maps a primitive class name to its corresponding abbreviation used in array class names.\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.ClassUtils.ClassUtils()",
      "begin_line": 101,
      "end_line": 103,
      "comment": "\n     * \u003cp\u003eClassUtils instances should NOT be constructed in standard programming.\n     * Instead, the class should be used as\n     * \u003ccode\u003eClassUtils.getShortClassName(cls)\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis constructor is public to permit tools that require a JavaBean\n     * instance to operate.\u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 102,col 7)-(line 102,col 14)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.ClassUtils.getShortClassName(java.lang.Object, java.lang.String)",
      "begin_line": 114,
      "end_line": 119,
      "comment": "\n     * \u003cp\u003eGets the class name minus the package name for an \u003ccode\u003eObject\u003c/code\u003e.\u003c/p\u003e\n     *\n     * @param object  the class to get the short name for, may be null\n     * @param valueIfNull  the value to return if null\n     * @return the class name of the object without the package name, or the null value\n     ",
      "child_ranges": [
        "(line 115,col 9)-(line 117,col 9)",
        "(line 118,col 9)-(line 118,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.ClassUtils.getShortClassName(java.lang.Class)",
      "begin_line": 127,
      "end_line": 132,
      "comment": "\n     * \u003cp\u003eGets the class name minus the package name from a \u003ccode\u003eClass\u003c/code\u003e.\u003c/p\u003e\n     *\n     * @param cls  the class to get the short name for.\n     * @return the class name without the package name or an empty string\n     ",
      "child_ranges": [
        "(line 128,col 9)-(line 130,col 9)",
        "(line 131,col 9)-(line 131,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.ClassUtils.getShortClassName(java.lang.String)",
      "begin_line": 142,
      "end_line": 159,
      "comment": "\n     * \u003cp\u003eGets the class name minus the package name from a String.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe string passed in is assumed to be a class name - it is not checked.\u003c/p\u003e\n     *\n     * @param className  the className to get the short name for\n     * @return the class name of the class without the package name or an empty string\n     ",
      "child_ranges": [
        "(line 143,col 9)-(line 145,col 9)",
        "(line 146,col 9)-(line 148,col 9)",
        "(line 149,col 9)-(line 149,col 47)",
        "(line 150,col 9)-(line 150,col 24)",
        "(line 151,col 9)-(line 157,col 9)",
        "(line 158,col 9)-(line 158,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.ClassUtils.getPackageName(java.lang.Object, java.lang.String)",
      "begin_line": 170,
      "end_line": 175,
      "comment": "\n     * \u003cp\u003eGets the package name of an \u003ccode\u003eObject\u003c/code\u003e.\u003c/p\u003e\n     *\n     * @param object  the class to get the package name for, may be null\n     * @param valueIfNull  the value to return if null\n     * @return the package name of the object, or the null value\n     ",
      "child_ranges": [
        "(line 171,col 9)-(line 173,col 9)",
        "(line 174,col 9)-(line 174,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.ClassUtils.getPackageName(java.lang.Class)",
      "begin_line": 183,
      "end_line": 188,
      "comment": "\n     * \u003cp\u003eGets the package name of a \u003ccode\u003eClass\u003c/code\u003e.\u003c/p\u003e\n     *\n     * @param cls  the class to get the package name for, may be \u003ccode\u003enull\u003c/code\u003e.\n     * @return the package name or an empty string\n     ",
      "child_ranges": [
        "(line 184,col 9)-(line 186,col 9)",
        "(line 187,col 9)-(line 187,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.ClassUtils.getPackageName(java.lang.String)",
      "begin_line": 199,
      "end_line": 208,
      "comment": "\n     * \u003cp\u003eGets the package name from a \u003ccode\u003eString\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe string passed in is assumed to be a class name - it is not checked.\u003c/p\u003e\n     * \u003cp\u003eIf the class is unpackaged, return an empty string.\u003c/p\u003e\n     *\n     * @param className  the className to get the package name for, may be \u003ccode\u003enull\u003c/code\u003e\n     * @return the package name or an empty string\n     ",
      "child_ranges": [
        "(line 200,col 9)-(line 202,col 9)",
        "(line 203,col 9)-(line 203,col 62)",
        "(line 204,col 9)-(line 206,col 9)",
        "(line 207,col 9)-(line 207,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.ClassUtils.getAllSuperclasses(java.lang.Class)",
      "begin_line": 219,
      "end_line": 230,
      "comment": "\n     * \u003cp\u003eGets a \u003ccode\u003eList\u003c/code\u003e of superclasses for the given class.\u003c/p\u003e\n     *\n     * @param cls  the class to look up, may be \u003ccode\u003enull\u003c/code\u003e\n     * @return the \u003ccode\u003eList\u003c/code\u003e of superclasses in order going up from this one\n     *  \u003ccode\u003enull\u003c/code\u003e if null input\n     ",
      "child_ranges": [
        "(line 220,col 9)-(line 222,col 9)",
        "(line 223,col 9)-(line 223,col 39)",
        "(line 224,col 9)-(line 224,col 47)",
        "(line 225,col 9)-(line 228,col 9)",
        "(line 229,col 9)-(line 229,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.ClassUtils.getAllInterfaces(java.lang.Class)",
      "begin_line": 245,
      "end_line": 267,
      "comment": "\n     * \u003cp\u003eGets a \u003ccode\u003eList\u003c/code\u003e of all interfaces implemented by the given\n     * class and its superclasses.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe order is determined by looking through each interface in turn as\n     * declared in the source file and following its hierarchy up. Then each\n     * superclass is considered in the same way. Later duplicates are ignored,\n     * so the order is maintained.\u003c/p\u003e\n     *\n     * @param cls  the class to look up, may be \u003ccode\u003enull\u003c/code\u003e\n     * @return the \u003ccode\u003eList\u003c/code\u003e of interfaces in order,\n     *  \u003ccode\u003enull\u003c/code\u003e if null input\n     ",
      "child_ranges": [
        "(line 246,col 9)-(line 248,col 9)",
        "(line 249,col 9)-(line 249,col 36)",
        "(line 250,col 9)-(line 265,col 9)",
        "(line 266,col 9)-(line 266,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.ClassUtils.convertClassNamesToClasses(java.util.List)",
      "begin_line": 283,
      "end_line": 297,
      "comment": "\n     * \u003cp\u003eGiven a \u003ccode\u003eList\u003c/code\u003e of class names, this method converts them into classes.\u003c/p\u003e\n     *\n     * \u003cp\u003eA new \u003ccode\u003eList\u003c/code\u003e is returned. If the class name cannot be found, \u003ccode\u003enull\u003c/code\u003e\n     * is stored in the \u003ccode\u003eList\u003c/code\u003e. If the class name in the \u003ccode\u003eList\u003c/code\u003e is\n     * \u003ccode\u003enull\u003c/code\u003e, \u003ccode\u003enull\u003c/code\u003e is stored in the output \u003ccode\u003eList\u003c/code\u003e.\u003c/p\u003e\n     *\n     * @param classNames  the classNames to change\n     * @return a \u003ccode\u003eList\u003c/code\u003e of Class objects corresponding to the class names,\n     *  \u003ccode\u003enull\u003c/code\u003e if null input\n     * @throws ClassCastException if classNames contains a non String entry\n     ",
      "child_ranges": [
        "(line 284,col 9)-(line 286,col 9)",
        "(line 287,col 9)-(line 287,col 56)",
        "(line 288,col 9)-(line 295,col 9)",
        "(line 296,col 9)-(line 296,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.ClassUtils.convertClassesToClassNames(java.util.List)",
      "begin_line": 311,
      "end_line": 325,
      "comment": "\n     * \u003cp\u003eGiven a \u003ccode\u003eList\u003c/code\u003e of \u003ccode\u003eClass\u003c/code\u003e objects, this method converts\n     * them into class names.\u003c/p\u003e\n     *\n     * \u003cp\u003eA new \u003ccode\u003eList\u003c/code\u003e is returned. \u003ccode\u003enull\u003c/code\u003e objects will be copied into\n     * the returned list as \u003ccode\u003enull\u003c/code\u003e.\u003c/p\u003e\n     *\n     * @param classes  the classes to change\n     * @return a \u003ccode\u003eList\u003c/code\u003e of class names corresponding to the Class objects,\n     *  \u003ccode\u003enull\u003c/code\u003e if null input\n     * @throws ClassCastException if \u003ccode\u003eclasses\u003c/code\u003e contains a non-\u003ccode\u003eClass\u003c/code\u003e entry\n     ",
      "child_ranges": [
        "(line 312,col 9)-(line 314,col 9)",
        "(line 315,col 9)-(line 315,col 56)",
        "(line 316,col 9)-(line 323,col 9)",
        "(line 324,col 9)-(line 324,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.ClassUtils.isAssignable(java.lang.Class[], java.lang.Class[])",
      "begin_line": 360,
      "end_line": 376,
      "comment": "\n     * \u003cp\u003eChecks if an array of Classes can be assigned to another array of Classes.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method calls {@link #isAssignable(Class, Class) isAssignable} for each\n     * Class pair in the input arrays. It can be used to check if a set of arguments\n     * (the first parameter) are suitably compatible with a set of method parameter types\n     * (the second parameter).\u003c/p\u003e\n     *\n     * \u003cp\u003eUnlike the {@link Class#isAssignableFrom(java.lang.Class)} method, this\n     * method takes into account widenings of primitive classes and\n     * \u003ccode\u003enull\u003c/code\u003es.\u003c/p\u003e\n     *\n     * \u003cp\u003ePrimitive widenings allow an int to be assigned to a \u003ccode\u003elong\u003c/code\u003e,\n     * \u003ccode\u003efloat\u003c/code\u003e or \u003ccode\u003edouble\u003c/code\u003e. This method returns the correct\n     * result for these cases.\u003c/p\u003e\n     *\n     * \u003cp\u003e\u003ccode\u003eNull\u003c/code\u003e may be assigned to any reference type. This method will\n     * return \u003ccode\u003etrue\u003c/code\u003e if \u003ccode\u003enull\u003c/code\u003e is passed in and the toClass is\n     * non-primitive.\u003c/p\u003e\n     *\n     * \u003cp\u003eSpecifically, this method tests whether the type represented by the\n     * specified \u003ccode\u003eClass\u003c/code\u003e parameter can be converted to the type\n     * represented by this \u003ccode\u003eClass\u003c/code\u003e object via an identity conversion\n     * widening primitive or widening reference conversion. See\n     * \u003cem\u003e\u003ca href\u003d\"http://java.sun.com/docs/books/jls/\"\u003eThe Java Language Specification\u003c/a\u003e\u003c/em\u003e,\n     * sections 5.1.1, 5.1.2 and 5.1.4 for details.\u003c/p\u003e\n     *\n     * @param classArray  the array of Classes to check, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param toClassArray  the array of Classes to try to assign into, may be \u003ccode\u003enull\u003c/code\u003e\n     * @return \u003ccode\u003etrue\u003c/code\u003e if assignment possible\n     ",
      "child_ranges": [
        "(line 361,col 9)-(line 363,col 9)",
        "(line 364,col 9)-(line 366,col 9)",
        "(line 367,col 9)-(line 369,col 9)",
        "(line 370,col 9)-(line 374,col 9)",
        "(line 375,col 9)-(line 375,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.ClassUtils.isAssignable(java.lang.Class, java.lang.Class)",
      "begin_line": 404,
      "end_line": 460,
      "comment": "\n     * \u003cp\u003eChecks if one \u003ccode\u003eClass\u003c/code\u003e can be assigned to a variable of\n     * another \u003ccode\u003eClass\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cp\u003eUnlike the {@link Class#isAssignableFrom(java.lang.Class)} method,\n     * this method takes into account widenings of primitive classes and\n     * \u003ccode\u003enull\u003c/code\u003es.\u003c/p\u003e\n     *\n     * \u003cp\u003ePrimitive widenings allow an int to be assigned to a long, float or\n     * double. This method returns the correct result for these cases.\u003c/p\u003e\n     *\n     * \u003cp\u003e\u003ccode\u003eNull\u003c/code\u003e may be assigned to any reference type. This method\n     * will return \u003ccode\u003etrue\u003c/code\u003e if \u003ccode\u003enull\u003c/code\u003e is passed in and the\n     * toClass is non-primitive.\u003c/p\u003e\n     *\n     * \u003cp\u003eSpecifically, this method tests whether the type represented by the\n     * specified \u003ccode\u003eClass\u003c/code\u003e parameter can be converted to the type\n     * represented by this \u003ccode\u003eClass\u003c/code\u003e object via an identity conversion\n     * widening primitive or widening reference conversion. See\n     * \u003cem\u003e\u003ca href\u003d\"http://java.sun.com/docs/books/jls/\"\u003eThe Java Language Specification\u003c/a\u003e\u003c/em\u003e,\n     * sections 5.1.1, 5.1.2 and 5.1.4 for details.\u003c/p\u003e\n     *\n     * @param cls  the Class to check, may be null\n     * @param toClass  the Class to try to assign into, returns false if null\n     * @return \u003ccode\u003etrue\u003c/code\u003e if assignment possible\n     ",
      "child_ranges": [
        "(line 405,col 9)-(line 407,col 9)",
        "(line 409,col 9)-(line 411,col 9)",
        "(line 412,col 9)-(line 414,col 9)",
        "(line 415,col 9)-(line 458,col 9)",
        "(line 459,col 9)-(line 459,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.ClassUtils.primitiveToWrapper(java.lang.Class)",
      "begin_line": 474,
      "end_line": 480,
      "comment": "\n     * \u003cp\u003eConverts the specified primitive Class object to its corresponding\n     * wrapper Class object.\u003c/p\u003e\n     *\n     * \u003cp\u003eNOTE: From v2.2, this method handles \u003ccode\u003eVoid.TYPE\u003c/code\u003e,\n     * returning \u003ccode\u003eVoid.TYPE\u003c/code\u003e.\u003c/p\u003e\n     *\n     * @param cls  the class to convert, may be null\n     * @return the wrapper class for \u003ccode\u003ecls\u003c/code\u003e or \u003ccode\u003ecls\u003c/code\u003e if\n     * \u003ccode\u003ecls\u003c/code\u003e is not a primitive. \u003ccode\u003enull\u003c/code\u003e if null input.\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 475,col 9)-(line 475,col 35)",
        "(line 476,col 9)-(line 478,col 9)",
        "(line 479,col 9)-(line 479,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.ClassUtils.primitivesToWrappers(java.lang.Class[])",
      "begin_line": 492,
      "end_line": 506,
      "comment": "\n     * \u003cp\u003eConverts the specified array of primitive Class objects to an array of\n     * its corresponding wrapper Class objects.\u003c/p\u003e\n     *\n     * @param classes  the class array to convert, may be null or empty\n     * @return an array which contains for each given class, the wrapper class or\n     * the original class if class is not a primitive. \u003ccode\u003enull\u003c/code\u003e if null input.\n     * Empty array if an empty array passed in.\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 493,col 9)-(line 495,col 9)",
        "(line 497,col 9)-(line 499,col 9)",
        "(line 501,col 9)-(line 501,col 61)",
        "(line 502,col 9)-(line 504,col 9)",
        "(line 505,col 9)-(line 505,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.ClassUtils.isInnerClass(java.lang.Class)",
      "begin_line": 517,
      "end_line": 522,
      "comment": "\n     * \u003cp\u003eIs the specified class an inner class or static nested class.\u003c/p\u003e\n     *\n     * @param cls  the class to check, may be null\n     * @return \u003ccode\u003etrue\u003c/code\u003e if the class is an inner or static nested class,\n     *  false if not or \u003ccode\u003enull\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 518,col 9)-(line 520,col 9)",
        "(line 521,col 9)-(line 521,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.ClassUtils.getClass(java.lang.ClassLoader, java.lang.String, boolean)",
      "begin_line": 537,
      "end_line": 547,
      "comment": "\n     * Returns the class represented by \u003ccode\u003eclassName\u003c/code\u003e using the\n     * \u003ccode\u003eclassLoader\u003c/code\u003e.  This implementation supports names like\n     * \"\u003ccode\u003ejava.lang.String[]\u003c/code\u003e\" as well as \"\u003ccode\u003e[Ljava.lang.String;\u003c/code\u003e\".\n     *\n     * @param classLoader  the class loader to use to load the class\n     * @param className  the class name\n     * @param initialize  whether the class must be initialized\n     * @return the class represented by \u003ccode\u003eclassName\u003c/code\u003e using the \u003ccode\u003eclassLoader\u003c/code\u003e\n     * @throws ClassNotFoundException if the class is not found\n     ",
      "child_ranges": [
        "(line 539,col 9)-(line 539,col 20)",
        "(line 540,col 9)-(line 545,col 9)",
        "(line 546,col 9)-(line 546,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.ClassUtils.getClass(java.lang.ClassLoader, java.lang.String)",
      "begin_line": 560,
      "end_line": 562,
      "comment": "\n     * Returns the (initialized) class represented by \u003ccode\u003eclassName\u003c/code\u003e\n     * using the \u003ccode\u003eclassLoader\u003c/code\u003e.  This implementation supports names\n     * like \"\u003ccode\u003ejava.lang.String[]\u003c/code\u003e\" as well as\n     * \"\u003ccode\u003e[Ljava.lang.String;\u003c/code\u003e\".\n     *\n     * @param classLoader  the class loader to use to load the class\n     * @param className  the class name\n     * @return the class represented by \u003ccode\u003eclassName\u003c/code\u003e using the \u003ccode\u003eclassLoader\u003c/code\u003e\n     * @throws ClassNotFoundException if the class is not found\n     ",
      "child_ranges": [
        "(line 561,col 9)-(line 561,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.ClassUtils.getClass(java.lang.String)",
      "begin_line": 574,
      "end_line": 576,
      "comment": "\n     * Returns the (initialized )class represented by \u003ccode\u003eclassName\u003c/code\u003e\n     * using the current thread\u0027s context class loader. This implementation\n     * supports names like \"\u003ccode\u003ejava.lang.String[]\u003c/code\u003e\" as well as\n     * \"\u003ccode\u003e[Ljava.lang.String;\u003c/code\u003e\".\n     *\n     * @param className  the class name\n     * @return the class represented by \u003ccode\u003eclassName\u003c/code\u003e using the current thread\u0027s context class loader\n     * @throws ClassNotFoundException if the class is not found\n     ",
      "child_ranges": [
        "(line 575,col 9)-(line 575,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.ClassUtils.getClass(java.lang.String, boolean)",
      "begin_line": 589,
      "end_line": 593,
      "comment": "\n     * Returns the class represented by \u003ccode\u003eclassName\u003c/code\u003e using the\n     * current thread\u0027s context class loader. This implementation supports\n     * names like \"\u003ccode\u003ejava.lang.String[]\u003c/code\u003e\" as well as\n     * \"\u003ccode\u003e[Ljava.lang.String;\u003c/code\u003e\".\n     *\n     * @param className  the class name\n     * @param initialize  whether the class must be initialized\n     * @return the class represented by \u003ccode\u003eclassName\u003c/code\u003e using the current thread\u0027s context class loader\n     * @throws ClassNotFoundException if the class is not found\n     ",
      "child_ranges": [
        "(line 590,col 9)-(line 590,col 79)",
        "(line 591,col 9)-(line 591,col 95)",
        "(line 592,col 9)-(line 592,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.ClassUtils.getPublicMethod(java.lang.Class, java.lang.String, java.lang.Class[])",
      "begin_line": 618,
      "end_line": 648,
      "comment": "\n     * \u003cp\u003eReturns the desired Method much like \u003ccode\u003eClass.getMethod\u003c/code\u003e, however \n     * it ensures that the returned Method is from a public class or interface and not \n     * from an anonymous inner class. This means that the Method is invokable and \n     * doesn\u0027t fall foul of Java bug \n     * \u003ca href\u003d\"http://bugs.sun.com/bugdatabase/view_bug.do?bug_id\u003d4071957\"\u003e4071957\u003c/a\u003e).\n     *\n     *  \u003ccode\u003e\u003cpre\u003eSet set \u003d Collections.unmodifiableSet(...);\n     *  Method method \u003d ClassUtils.getPublicMethod(set.getClass(), \"isEmpty\",  new Class[0]);\n     *  Object result \u003d method.invoke(set, new Object[]);\u003c/pre\u003e\u003c/code\u003e\n     * \u003c/p\u003e\n     *\n     * @param cls  the class to check, not null\n     * @param methodName  the name of the method\n     * @param parameterTypes  the list of parameters\n     * @return the method\n     * @throws NullPointerException if the class is null\n     * @throws SecurityException if a a security violation occured\n     * @throws NoSuchMethodException if the method is not found in the given class\n     *  or if the metothod doen\u0027t conform with the requirements\n     ",
      "child_ranges": [
        "(line 621,col 9)-(line 621,col 74)",
        "(line 622,col 9)-(line 624,col 9)",
        "(line 626,col 9)-(line 626,col 48)",
        "(line 627,col 9)-(line 627,col 55)",
        "(line 628,col 9)-(line 628,col 57)",
        "(line 630,col 9)-(line 644,col 9)",
        "(line 646,col 9)-(line 647,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.ClassUtils.toProperClassName(java.lang.String)",
      "begin_line": 657,
      "end_line": 676,
      "comment": "\n     * Converts a class name to a JLS style class name.\n     *\n     * @param className  the class name\n     * @return the converted name\n     ",
      "child_ranges": [
        "(line 658,col 9)-(line 658,col 60)",
        "(line 659,col 9)-(line 674,col 9)",
        "(line 675,col 9)-(line 675,col 25)"
      ]
    }
  ]
}