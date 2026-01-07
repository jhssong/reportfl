{
  "filepath": "/tmp/Lang-47b/src/java/org/apache/commons/lang/ClassUtils.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ClassUtils",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 42,
      "end_line": 924,
      "comment": "\n * \u003cp\u003eOperates on classes without using reflection.\u003c/p\u003e\n *\n * \u003cp\u003eThis class handles invalid \u003ccode\u003enull\u003c/code\u003e inputs as best it can.\n * Each method documents its behaviour in more detail.\u003c/p\u003e\n *\n * @author Stephen Colebourne\n * @author Gary Gregory\n * @author Norm Deane\n * @author Alban Peignier\n * @author Tomasz Blachowicz\n * @since 2.0\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "PACKAGE_SEPARATOR_CHAR"
      ],
      "begin_line": 47,
      "end_line": 47,
      "comment": "\n     * \u003cp\u003eThe package separator character: \u003ccode\u003e\u0027\u0026#x2e;\u0027 \u003d\u003d {@value}\u003c/code\u003e.\u003c/p\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "PACKAGE_SEPARATOR"
      ],
      "begin_line": 52,
      "end_line": 52,
      "comment": "\n     * \u003cp\u003eThe package separator String: \u003ccode\u003e\"\u0026#x2e;\"\u003c/code\u003e.\u003c/p\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "INNER_CLASS_SEPARATOR_CHAR"
      ],
      "begin_line": 57,
      "end_line": 57,
      "comment": "\n     * \u003cp\u003eThe inner class separator character: \u003ccode\u003e\u0027$\u0027 \u003d\u003d {@value}\u003c/code\u003e.\u003c/p\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "INNER_CLASS_SEPARATOR"
      ],
      "begin_line": 62,
      "end_line": 62,
      "comment": "\n     * \u003cp\u003eThe inner class separator String: \u003ccode\u003e\"$\"\u003c/code\u003e.\u003c/p\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "primitiveWrapperMap"
      ],
      "begin_line": 67,
      "end_line": 67,
      "comment": "\n     * Maps primitive \u003ccode\u003eClass\u003c/code\u003ees to their corresponding wrapper \u003ccode\u003eClass\u003c/code\u003e.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "wrapperPrimitiveMap"
      ],
      "begin_line": 83,
      "end_line": 83,
      "comment": "\n     * Maps wrapper \u003ccode\u003eClass\u003c/code\u003ees to their corresponding primitive types.\n     "
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
      "signature": "org.apache.commons.lang.ClassUtils.addAbbreviation(java.lang.String, java.lang.String)",
      "begin_line": 110,
      "end_line": 113,
      "comment": "\n     * Add primitive type abbreviation to maps of abbreviations.\n     * \n     * @param primitive Canonical name of primitive type\n     * @param abbreviation Corresponding abbreviation of primitive type\n     ",
      "child_ranges": [
        "(line 111,col 9)-(line 111,col 53)",
        "(line 112,col 9)-(line 112,col 60)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.ClassUtils.ClassUtils()",
      "begin_line": 137,
      "end_line": 139,
      "comment": "\n     * \u003cp\u003eClassUtils instances should NOT be constructed in standard programming.\n     * Instead, the class should be used as\n     * \u003ccode\u003eClassUtils.getShortClassName(cls)\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis constructor is public to permit tools that require a JavaBean\n     * instance to operate.\u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 138,col 7)-(line 138,col 14)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.ClassUtils.getShortClassName(java.lang.Object, java.lang.String)",
      "begin_line": 150,
      "end_line": 155,
      "comment": "\n     * \u003cp\u003eGets the class name minus the package name for an \u003ccode\u003eObject\u003c/code\u003e.\u003c/p\u003e\n     *\n     * @param object  the class to get the short name for, may be null\n     * @param valueIfNull  the value to return if null\n     * @return the class name of the object without the package name, or the null value\n     ",
      "child_ranges": [
        "(line 151,col 9)-(line 153,col 9)",
        "(line 154,col 9)-(line 154,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.ClassUtils.getShortClassName(java.lang.Class)",
      "begin_line": 163,
      "end_line": 168,
      "comment": "\n     * \u003cp\u003eGets the class name minus the package name from a \u003ccode\u003eClass\u003c/code\u003e.\u003c/p\u003e\n     *\n     * @param cls  the class to get the short name for.\n     * @return the class name without the package name or an empty string\n     ",
      "child_ranges": [
        "(line 164,col 9)-(line 166,col 9)",
        "(line 167,col 9)-(line 167,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.ClassUtils.getShortClassName(java.lang.String)",
      "begin_line": 178,
      "end_line": 194,
      "comment": "\n     * \u003cp\u003eGets the class name minus the package name from a String.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe string passed in is assumed to be a class name - it is not checked.\u003c/p\u003e\n     *\n     * @param className  the className to get the short name for\n     * @return the class name of the class without the package name or an empty string\n     ",
      "child_ranges": [
        "(line 179,col 9)-(line 181,col 9)",
        "(line 182,col 9)-(line 184,col 9)",
        "(line 186,col 9)-(line 186,col 71)",
        "(line 187,col 9)-(line 188,col 83)",
        "(line 189,col 9)-(line 189,col 57)",
        "(line 190,col 9)-(line 192,col 9)",
        "(line 193,col 9)-(line 193,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.ClassUtils.getPackageName(java.lang.Object, java.lang.String)",
      "begin_line": 205,
      "end_line": 210,
      "comment": "\n     * \u003cp\u003eGets the package name of an \u003ccode\u003eObject\u003c/code\u003e.\u003c/p\u003e\n     *\n     * @param object  the class to get the package name for, may be null\n     * @param valueIfNull  the value to return if null\n     * @return the package name of the object, or the null value\n     ",
      "child_ranges": [
        "(line 206,col 9)-(line 208,col 9)",
        "(line 209,col 9)-(line 209,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.ClassUtils.getPackageName(java.lang.Class)",
      "begin_line": 218,
      "end_line": 223,
      "comment": "\n     * \u003cp\u003eGets the package name of a \u003ccode\u003eClass\u003c/code\u003e.\u003c/p\u003e\n     *\n     * @param cls  the class to get the package name for, may be \u003ccode\u003enull\u003c/code\u003e.\n     * @return the package name or an empty string\n     ",
      "child_ranges": [
        "(line 219,col 9)-(line 221,col 9)",
        "(line 222,col 9)-(line 222,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.ClassUtils.getPackageName(java.lang.String)",
      "begin_line": 234,
      "end_line": 243,
      "comment": "\n     * \u003cp\u003eGets the package name from a \u003ccode\u003eString\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe string passed in is assumed to be a class name - it is not checked.\u003c/p\u003e\n     * \u003cp\u003eIf the class is unpackaged, return an empty string.\u003c/p\u003e\n     *\n     * @param className  the className to get the package name for, may be \u003ccode\u003enull\u003c/code\u003e\n     * @return the package name or an empty string\n     ",
      "child_ranges": [
        "(line 235,col 9)-(line 237,col 9)",
        "(line 238,col 9)-(line 238,col 62)",
        "(line 239,col 9)-(line 241,col 9)",
        "(line 242,col 9)-(line 242,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.ClassUtils.getAllSuperclasses(java.lang.Class)",
      "begin_line": 254,
      "end_line": 265,
      "comment": "\n     * \u003cp\u003eGets a \u003ccode\u003eList\u003c/code\u003e of superclasses for the given class.\u003c/p\u003e\n     *\n     * @param cls  the class to look up, may be \u003ccode\u003enull\u003c/code\u003e\n     * @return the \u003ccode\u003eList\u003c/code\u003e of superclasses in order going up from this one\n     *  \u003ccode\u003enull\u003c/code\u003e if null input\n     ",
      "child_ranges": [
        "(line 255,col 9)-(line 257,col 9)",
        "(line 258,col 9)-(line 258,col 39)",
        "(line 259,col 9)-(line 259,col 47)",
        "(line 260,col 9)-(line 263,col 9)",
        "(line 264,col 9)-(line 264,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.ClassUtils.getAllInterfaces(java.lang.Class)",
      "begin_line": 280,
      "end_line": 302,
      "comment": "\n     * \u003cp\u003eGets a \u003ccode\u003eList\u003c/code\u003e of all interfaces implemented by the given\n     * class and its superclasses.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe order is determined by looking through each interface in turn as\n     * declared in the source file and following its hierarchy up. Then each\n     * superclass is considered in the same way. Later duplicates are ignored,\n     * so the order is maintained.\u003c/p\u003e\n     *\n     * @param cls  the class to look up, may be \u003ccode\u003enull\u003c/code\u003e\n     * @return the \u003ccode\u003eList\u003c/code\u003e of interfaces in order,\n     *  \u003ccode\u003enull\u003c/code\u003e if null input\n     ",
      "child_ranges": [
        "(line 281,col 9)-(line 283,col 9)",
        "(line 284,col 9)-(line 284,col 36)",
        "(line 285,col 9)-(line 300,col 9)",
        "(line 301,col 9)-(line 301,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.ClassUtils.convertClassNamesToClasses(java.util.List)",
      "begin_line": 318,
      "end_line": 332,
      "comment": "\n     * \u003cp\u003eGiven a \u003ccode\u003eList\u003c/code\u003e of class names, this method converts them into classes.\u003c/p\u003e\n     *\n     * \u003cp\u003eA new \u003ccode\u003eList\u003c/code\u003e is returned. If the class name cannot be found, \u003ccode\u003enull\u003c/code\u003e\n     * is stored in the \u003ccode\u003eList\u003c/code\u003e. If the class name in the \u003ccode\u003eList\u003c/code\u003e is\n     * \u003ccode\u003enull\u003c/code\u003e, \u003ccode\u003enull\u003c/code\u003e is stored in the output \u003ccode\u003eList\u003c/code\u003e.\u003c/p\u003e\n     *\n     * @param classNames  the classNames to change\n     * @return a \u003ccode\u003eList\u003c/code\u003e of Class objects corresponding to the class names,\n     *  \u003ccode\u003enull\u003c/code\u003e if null input\n     * @throws ClassCastException if classNames contains a non String entry\n     ",
      "child_ranges": [
        "(line 319,col 9)-(line 321,col 9)",
        "(line 322,col 9)-(line 322,col 56)",
        "(line 323,col 9)-(line 330,col 9)",
        "(line 331,col 9)-(line 331,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.ClassUtils.convertClassesToClassNames(java.util.List)",
      "begin_line": 346,
      "end_line": 360,
      "comment": "\n     * \u003cp\u003eGiven a \u003ccode\u003eList\u003c/code\u003e of \u003ccode\u003eClass\u003c/code\u003e objects, this method converts\n     * them into class names.\u003c/p\u003e\n     *\n     * \u003cp\u003eA new \u003ccode\u003eList\u003c/code\u003e is returned. \u003ccode\u003enull\u003c/code\u003e objects will be copied into\n     * the returned list as \u003ccode\u003enull\u003c/code\u003e.\u003c/p\u003e\n     *\n     * @param classes  the classes to change\n     * @return a \u003ccode\u003eList\u003c/code\u003e of class names corresponding to the Class objects,\n     *  \u003ccode\u003enull\u003c/code\u003e if null input\n     * @throws ClassCastException if \u003ccode\u003eclasses\u003c/code\u003e contains a non-\u003ccode\u003eClass\u003c/code\u003e entry\n     ",
      "child_ranges": [
        "(line 347,col 9)-(line 349,col 9)",
        "(line 350,col 9)-(line 350,col 56)",
        "(line 351,col 9)-(line 358,col 9)",
        "(line 359,col 9)-(line 359,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.ClassUtils.isAssignable(java.lang.Class[], java.lang.Class[])",
      "begin_line": 395,
      "end_line": 411,
      "comment": "\n     * \u003cp\u003eChecks if an array of Classes can be assigned to another array of Classes.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method calls {@link #isAssignable(Class, Class) isAssignable} for each\n     * Class pair in the input arrays. It can be used to check if a set of arguments\n     * (the first parameter) are suitably compatible with a set of method parameter types\n     * (the second parameter).\u003c/p\u003e\n     *\n     * \u003cp\u003eUnlike the {@link Class#isAssignableFrom(java.lang.Class)} method, this\n     * method takes into account widenings of primitive classes and\n     * \u003ccode\u003enull\u003c/code\u003es.\u003c/p\u003e\n     *\n     * \u003cp\u003ePrimitive widenings allow an int to be assigned to a \u003ccode\u003elong\u003c/code\u003e,\n     * \u003ccode\u003efloat\u003c/code\u003e or \u003ccode\u003edouble\u003c/code\u003e. This method returns the correct\n     * result for these cases.\u003c/p\u003e\n     *\n     * \u003cp\u003e\u003ccode\u003eNull\u003c/code\u003e may be assigned to any reference type. This method will\n     * return \u003ccode\u003etrue\u003c/code\u003e if \u003ccode\u003enull\u003c/code\u003e is passed in and the toClass is\n     * non-primitive.\u003c/p\u003e\n     *\n     * \u003cp\u003eSpecifically, this method tests whether the type represented by the\n     * specified \u003ccode\u003eClass\u003c/code\u003e parameter can be converted to the type\n     * represented by this \u003ccode\u003eClass\u003c/code\u003e object via an identity conversion\n     * widening primitive or widening reference conversion. See\n     * \u003cem\u003e\u003ca href\u003d\"http://java.sun.com/docs/books/jls/\"\u003eThe Java Language Specification\u003c/a\u003e\u003c/em\u003e,\n     * sections 5.1.1, 5.1.2 and 5.1.4 for details.\u003c/p\u003e\n     *\n     * @param classArray  the array of Classes to check, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param toClassArray  the array of Classes to try to assign into, may be \u003ccode\u003enull\u003c/code\u003e\n     * @return \u003ccode\u003etrue\u003c/code\u003e if assignment possible\n     ",
      "child_ranges": [
        "(line 396,col 9)-(line 398,col 9)",
        "(line 399,col 9)-(line 401,col 9)",
        "(line 402,col 9)-(line 404,col 9)",
        "(line 405,col 9)-(line 409,col 9)",
        "(line 410,col 9)-(line 410,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.ClassUtils.isAssignable(java.lang.Class, java.lang.Class)",
      "begin_line": 439,
      "end_line": 495,
      "comment": "\n     * \u003cp\u003eChecks if one \u003ccode\u003eClass\u003c/code\u003e can be assigned to a variable of\n     * another \u003ccode\u003eClass\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cp\u003eUnlike the {@link Class#isAssignableFrom(java.lang.Class)} method,\n     * this method takes into account widenings of primitive classes and\n     * \u003ccode\u003enull\u003c/code\u003es.\u003c/p\u003e\n     *\n     * \u003cp\u003ePrimitive widenings allow an int to be assigned to a long, float or\n     * double. This method returns the correct result for these cases.\u003c/p\u003e\n     *\n     * \u003cp\u003e\u003ccode\u003eNull\u003c/code\u003e may be assigned to any reference type. This method\n     * will return \u003ccode\u003etrue\u003c/code\u003e if \u003ccode\u003enull\u003c/code\u003e is passed in and the\n     * toClass is non-primitive.\u003c/p\u003e\n     *\n     * \u003cp\u003eSpecifically, this method tests whether the type represented by the\n     * specified \u003ccode\u003eClass\u003c/code\u003e parameter can be converted to the type\n     * represented by this \u003ccode\u003eClass\u003c/code\u003e object via an identity conversion\n     * widening primitive or widening reference conversion. See\n     * \u003cem\u003e\u003ca href\u003d\"http://java.sun.com/docs/books/jls/\"\u003eThe Java Language Specification\u003c/a\u003e\u003c/em\u003e,\n     * sections 5.1.1, 5.1.2 and 5.1.4 for details.\u003c/p\u003e\n     *\n     * @param cls  the Class to check, may be null\n     * @param toClass  the Class to try to assign into, returns false if null\n     * @return \u003ccode\u003etrue\u003c/code\u003e if assignment possible\n     ",
      "child_ranges": [
        "(line 440,col 9)-(line 442,col 9)",
        "(line 444,col 9)-(line 446,col 9)",
        "(line 447,col 9)-(line 449,col 9)",
        "(line 450,col 9)-(line 493,col 9)",
        "(line 494,col 9)-(line 494,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.ClassUtils.primitiveToWrapper(java.lang.Class)",
      "begin_line": 509,
      "end_line": 515,
      "comment": "\n     * \u003cp\u003eConverts the specified primitive Class object to its corresponding\n     * wrapper Class object.\u003c/p\u003e\n     *\n     * \u003cp\u003eNOTE: From v2.2, this method handles \u003ccode\u003eVoid.TYPE\u003c/code\u003e,\n     * returning \u003ccode\u003eVoid.TYPE\u003c/code\u003e.\u003c/p\u003e\n     *\n     * @param cls  the class to convert, may be null\n     * @return the wrapper class for \u003ccode\u003ecls\u003c/code\u003e or \u003ccode\u003ecls\u003c/code\u003e if\n     * \u003ccode\u003ecls\u003c/code\u003e is not a primitive. \u003ccode\u003enull\u003c/code\u003e if null input.\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 510,col 9)-(line 510,col 35)",
        "(line 511,col 9)-(line 513,col 9)",
        "(line 514,col 9)-(line 514,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.ClassUtils.primitivesToWrappers(java.lang.Class[])",
      "begin_line": 527,
      "end_line": 541,
      "comment": "\n     * \u003cp\u003eConverts the specified array of primitive Class objects to an array of\n     * its corresponding wrapper Class objects.\u003c/p\u003e\n     *\n     * @param classes  the class array to convert, may be null or empty\n     * @return an array which contains for each given class, the wrapper class or\n     * the original class if class is not a primitive. \u003ccode\u003enull\u003c/code\u003e if null input.\n     * Empty array if an empty array passed in.\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 528,col 9)-(line 530,col 9)",
        "(line 532,col 9)-(line 534,col 9)",
        "(line 536,col 9)-(line 536,col 61)",
        "(line 537,col 9)-(line 539,col 9)",
        "(line 540,col 9)-(line 540,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.ClassUtils.wrapperToPrimitive(java.lang.Class)",
      "begin_line": 559,
      "end_line": 561,
      "comment": "\n     * \u003cp\u003eConverts the specified wrapper class to its corresponding primitive\n     * class.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method is the counter part of \u003ccode\u003eprimitiveToWrapper()\u003c/code\u003e.\n     * If the passed in class is a wrapper class for a primitive type, this\n     * primitive type will be returned (e.g. \u003ccode\u003eInteger.TYPE\u003c/code\u003e for\n     * \u003ccode\u003eInteger.class\u003c/code\u003e). For other classes, or if the parameter is\n     * \u003cb\u003enull\u003c/b\u003e, the return value is \u003cb\u003enull\u003c/b\u003e.\u003c/p\u003e\n     *\n     * @param cls the class to convert, may be \u003cb\u003enull\u003c/b\u003e\n     * @return the corresponding primitive type if \u003ccode\u003ecls\u003c/code\u003e is a\n     * wrapper class, \u003cb\u003enull\u003c/b\u003e otherwise\n     * @see #primitiveToWrapper(Class)\n     * @since 2.4\n     ",
      "child_ranges": [
        "(line 560,col 9)-(line 560,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.ClassUtils.wrappersToPrimitives(java.lang.Class[])",
      "begin_line": 577,
      "end_line": 591,
      "comment": "\n     * \u003cp\u003eConverts the specified array of wrapper Class objects to an array of\n     * its corresponding primitive Class objects.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method invokes \u003ccode\u003ewrapperToPrimitive()\u003c/code\u003e for each element\n     * of the passed in array.\u003c/p\u003e\n     *\n     * @param classes  the class array to convert, may be null or empty\n     * @return an array which contains for each given class, the primitive class or\n     * \u003cb\u003enull\u003c/b\u003e if the original class is not a wrapper class. \u003ccode\u003enull\u003c/code\u003e if null input.\n     * Empty array if an empty array passed in.\n     * @see #wrapperToPrimitive(Class)\n     * @since 2.4\n     ",
      "child_ranges": [
        "(line 578,col 9)-(line 580,col 9)",
        "(line 582,col 9)-(line 584,col 9)",
        "(line 586,col 9)-(line 586,col 61)",
        "(line 587,col 9)-(line 589,col 9)",
        "(line 590,col 9)-(line 590,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.ClassUtils.isInnerClass(java.lang.Class)",
      "begin_line": 602,
      "end_line": 607,
      "comment": "\n     * \u003cp\u003eIs the specified class an inner class or static nested class.\u003c/p\u003e\n     *\n     * @param cls  the class to check, may be null\n     * @return \u003ccode\u003etrue\u003c/code\u003e if the class is an inner or static nested class,\n     *  false if not or \u003ccode\u003enull\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 603,col 9)-(line 605,col 9)",
        "(line 606,col 9)-(line 606,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.ClassUtils.getClass(java.lang.ClassLoader, java.lang.String, boolean)",
      "begin_line": 622,
      "end_line": 632,
      "comment": "\n     * Returns the class represented by \u003ccode\u003eclassName\u003c/code\u003e using the\n     * \u003ccode\u003eclassLoader\u003c/code\u003e.  This implementation supports names like\n     * \"\u003ccode\u003ejava.lang.String[]\u003c/code\u003e\" as well as \"\u003ccode\u003e[Ljava.lang.String;\u003c/code\u003e\".\n     *\n     * @param classLoader  the class loader to use to load the class\n     * @param className  the class name\n     * @param initialize  whether the class must be initialized\n     * @return the class represented by \u003ccode\u003eclassName\u003c/code\u003e using the \u003ccode\u003eclassLoader\u003c/code\u003e\n     * @throws ClassNotFoundException if the class is not found\n     ",
      "child_ranges": [
        "(line 624,col 9)-(line 624,col 20)",
        "(line 625,col 9)-(line 630,col 9)",
        "(line 631,col 9)-(line 631,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.ClassUtils.getClass(java.lang.ClassLoader, java.lang.String)",
      "begin_line": 645,
      "end_line": 647,
      "comment": "\n     * Returns the (initialized) class represented by \u003ccode\u003eclassName\u003c/code\u003e\n     * using the \u003ccode\u003eclassLoader\u003c/code\u003e.  This implementation supports names\n     * like \"\u003ccode\u003ejava.lang.String[]\u003c/code\u003e\" as well as\n     * \"\u003ccode\u003e[Ljava.lang.String;\u003c/code\u003e\".\n     *\n     * @param classLoader  the class loader to use to load the class\n     * @param className  the class name\n     * @return the class represented by \u003ccode\u003eclassName\u003c/code\u003e using the \u003ccode\u003eclassLoader\u003c/code\u003e\n     * @throws ClassNotFoundException if the class is not found\n     ",
      "child_ranges": [
        "(line 646,col 9)-(line 646,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.ClassUtils.getClass(java.lang.String)",
      "begin_line": 659,
      "end_line": 661,
      "comment": "\n     * Returns the (initialized )class represented by \u003ccode\u003eclassName\u003c/code\u003e\n     * using the current thread\u0027s context class loader. This implementation\n     * supports names like \"\u003ccode\u003ejava.lang.String[]\u003c/code\u003e\" as well as\n     * \"\u003ccode\u003e[Ljava.lang.String;\u003c/code\u003e\".\n     *\n     * @param className  the class name\n     * @return the class represented by \u003ccode\u003eclassName\u003c/code\u003e using the current thread\u0027s context class loader\n     * @throws ClassNotFoundException if the class is not found\n     ",
      "child_ranges": [
        "(line 660,col 9)-(line 660,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.ClassUtils.getClass(java.lang.String, boolean)",
      "begin_line": 674,
      "end_line": 678,
      "comment": "\n     * Returns the class represented by \u003ccode\u003eclassName\u003c/code\u003e using the\n     * current thread\u0027s context class loader. This implementation supports\n     * names like \"\u003ccode\u003ejava.lang.String[]\u003c/code\u003e\" as well as\n     * \"\u003ccode\u003e[Ljava.lang.String;\u003c/code\u003e\".\n     *\n     * @param className  the class name\n     * @param initialize  whether the class must be initialized\n     * @return the class represented by \u003ccode\u003eclassName\u003c/code\u003e using the current thread\u0027s context class loader\n     * @throws ClassNotFoundException if the class is not found\n     ",
      "child_ranges": [
        "(line 675,col 9)-(line 675,col 79)",
        "(line 676,col 9)-(line 676,col 95)",
        "(line 677,col 9)-(line 677,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.ClassUtils.getPublicMethod(java.lang.Class, java.lang.String, java.lang.Class[])",
      "begin_line": 703,
      "end_line": 733,
      "comment": "\n     * \u003cp\u003eReturns the desired Method much like \u003ccode\u003eClass.getMethod\u003c/code\u003e, however \n     * it ensures that the returned Method is from a public class or interface and not \n     * from an anonymous inner class. This means that the Method is invokable and \n     * doesn\u0027t fall foul of Java bug \n     * \u003ca href\u003d\"http://bugs.sun.com/bugdatabase/view_bug.do?bug_id\u003d4071957\"\u003e4071957\u003c/a\u003e).\n     *\n     *  \u003ccode\u003e\u003cpre\u003eSet set \u003d Collections.unmodifiableSet(...);\n     *  Method method \u003d ClassUtils.getPublicMethod(set.getClass(), \"isEmpty\",  new Class[0]);\n     *  Object result \u003d method.invoke(set, new Object[]);\u003c/pre\u003e\u003c/code\u003e\n     * \u003c/p\u003e\n     *\n     * @param cls  the class to check, not null\n     * @param methodName  the name of the method\n     * @param parameterTypes  the list of parameters\n     * @return the method\n     * @throws NullPointerException if the class is null\n     * @throws SecurityException if a a security violation occured\n     * @throws NoSuchMethodException if the method is not found in the given class\n     *  or if the metothod doen\u0027t conform with the requirements\n     ",
      "child_ranges": [
        "(line 706,col 9)-(line 706,col 74)",
        "(line 707,col 9)-(line 709,col 9)",
        "(line 711,col 9)-(line 711,col 48)",
        "(line 712,col 9)-(line 712,col 55)",
        "(line 713,col 9)-(line 713,col 57)",
        "(line 715,col 9)-(line 729,col 9)",
        "(line 731,col 9)-(line 732,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.ClassUtils.toCanonicalName(java.lang.String)",
      "begin_line": 742,
      "end_line": 761,
      "comment": "\n     * Converts a class name to a JLS style class name.\n     *\n     * @param className  the class name\n     * @return the converted name\n     ",
      "child_ranges": [
        "(line 743,col 9)-(line 743,col 60)",
        "(line 744,col 9)-(line 759,col 9)",
        "(line 760,col 9)-(line 760,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.ClassUtils.toClass(java.lang.Object[])",
      "begin_line": 772,
      "end_line": 784,
      "comment": "\n     * \u003cp\u003eConverts an array of \u003ccode\u003eObject\u003c/code\u003e in to an array of \u003ccode\u003eClass\u003c/code\u003e objects.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method returns \u003ccode\u003enull\u003c/code\u003e for a \u003ccode\u003enull\u003c/code\u003e input array.\u003c/p\u003e\n     *\n     * @param array an \u003ccode\u003eObject\u003c/code\u003e array\n     * @return a \u003ccode\u003eClass\u003c/code\u003e array, \u003ccode\u003enull\u003c/code\u003e if null array input\n     * @since 2.4\n     ",
      "child_ranges": [
        "(line 774,col 9)-(line 778,col 9)",
        "(line 779,col 9)-(line 779,col 50)",
        "(line 780,col 9)-(line 782,col 9)",
        "(line 783,col 9)-(line 783,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.ClassUtils.getShortCanonicalName(java.lang.Object, java.lang.String)",
      "begin_line": 796,
      "end_line": 801,
      "comment": "\n     * \u003cp\u003eGets the canonical name minus the package name for an \u003ccode\u003eObject\u003c/code\u003e.\u003c/p\u003e\n     *\n     * @param object  the class to get the short name for, may be null\n     * @param valueIfNull  the value to return if null\n     * @return the canonical name of the object without the package name, or the null value\n     * @since 2.4\n     ",
      "child_ranges": [
        "(line 797,col 9)-(line 799,col 9)",
        "(line 800,col 9)-(line 800,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.ClassUtils.getShortCanonicalName(java.lang.Class)",
      "begin_line": 810,
      "end_line": 815,
      "comment": "\n     * \u003cp\u003eGets the canonical name minus the package name from a \u003ccode\u003eClass\u003c/code\u003e.\u003c/p\u003e\n     *\n     * @param cls  the class to get the short name for.\n     * @return the canonical name without the package name or an empty string\n     * @since 2.4\n     ",
      "child_ranges": [
        "(line 811,col 9)-(line 813,col 9)",
        "(line 814,col 9)-(line 814,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.ClassUtils.getShortCanonicalName(java.lang.String)",
      "begin_line": 826,
      "end_line": 828,
      "comment": "\n     * \u003cp\u003eGets the canonical name minus the package name from a String.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe string passed in is assumed to be a canonical name - it is not checked.\u003c/p\u003e\n     *\n     * @param canonicalName  the class name to get the short name for\n     * @return the canonical name of the class without the package name or an empty string\n     * @since 2.4\n     ",
      "child_ranges": [
        "(line 827,col 9)-(line 827,col 77)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.ClassUtils.getPackageCanonicalName(java.lang.Object, java.lang.String)",
      "begin_line": 840,
      "end_line": 845,
      "comment": "\n     * \u003cp\u003eGets the package name from the canonical name of an \u003ccode\u003eObject\u003c/code\u003e.\u003c/p\u003e\n     *\n     * @param object  the class to get the package name for, may be null\n     * @param valueIfNull  the value to return if null\n     * @return the package name of the object, or the null value\n     * @since 2.4\n     ",
      "child_ranges": [
        "(line 841,col 9)-(line 843,col 9)",
        "(line 844,col 9)-(line 844,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.ClassUtils.getPackageCanonicalName(java.lang.Class)",
      "begin_line": 854,
      "end_line": 859,
      "comment": "\n     * \u003cp\u003eGets the package name from the canonical name of a \u003ccode\u003eClass\u003c/code\u003e.\u003c/p\u003e\n     *\n     * @param cls  the class to get the package name for, may be \u003ccode\u003enull\u003c/code\u003e.\n     * @return the package name or an empty string\n     * @since 2.4\n     ",
      "child_ranges": [
        "(line 855,col 9)-(line 857,col 9)",
        "(line 858,col 9)-(line 858,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.ClassUtils.getPackageCanonicalName(java.lang.String)",
      "begin_line": 871,
      "end_line": 873,
      "comment": "\n     * \u003cp\u003eGets the package name from the canonical name. \u003c/p\u003e\n     *\n     * \u003cp\u003eThe string passed in is assumed to be a canonical name - it is not checked.\u003c/p\u003e\n     * \u003cp\u003eIf the class is unpackaged, return an empty string.\u003c/p\u003e\n     *\n     * @param canonicalName  the canonical name to get the package name for, may be \u003ccode\u003enull\u003c/code\u003e\n     * @return the package name or an empty string\n     * @since 2.4\n     ",
      "child_ranges": [
        "(line 872,col 9)-(line 872,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.ClassUtils.getCanonicalName(java.lang.String)",
      "begin_line": 891,
      "end_line": 923,
      "comment": "\n     * \u003cp\u003eConverts a given name of class into canonical format.\n     * If name of class is not a name of array class it returns\n     * unchanged name.\u003c/p\u003e\n     * \u003cp\u003eExample:\n     * \u003cul\u003e\n     * \u003cli\u003e\u003ccode\u003egetCanonicalName(\"[I\") \u003d \"int[]\"\u003c/code\u003e\u003c/li\u003e\n     * \u003cli\u003e\u003ccode\u003egetCanonicalName(\"[Ljava.lang.String;\") \u003d \"java.lang.String[]\"\u003c/code\u003e\u003c/li\u003e\n     * \u003cli\u003e\u003ccode\u003egetCanonicalName(\"java.lang.String\") \u003d \"java.lang.String\"\u003c/code\u003e\u003c/li\u003e\n     * \u003c/ul\u003e\n     * \u003c/p\u003e\n     * \n     * @param className the name of class\n     * @return canonical form of class name\n     * @since 2.4\n     ",
      "child_ranges": [
        "(line 892,col 9)-(line 892,col 60)",
        "(line 893,col 9)-(line 922,col 9)"
      ]
    }
  ]
}