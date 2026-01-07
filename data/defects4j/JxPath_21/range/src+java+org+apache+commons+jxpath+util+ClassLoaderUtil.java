{
  "filepath": "/tmp/JxPath-21b/src/java/org/apache/commons/jxpath/util/ClassLoaderUtil.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ClassLoaderUtil",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 38,
      "end_line": 177,
      "comment": "\n * Port of class loading methods from \u003ccode\u003eorg.apache.commons.lang.ClassUtils\u003c/code\u003e from \n * the Apache Commons Lang Component. Some adjustments made to remove dependency on \n * \u003ccode\u003eorg.apache.commons.lang.StringUtils\u003c/code\u003e. Also modified to fall back on the\n * current class loader when an attempt to load a class with the context class loader\n * results in a \u003ccode\u003ejava.lang.ClassNotFoundException\u003c/code\u003e. \n * \n * @see org.apache.commons.lang.ClassUtils\n * \n * @author Stephen Colebourne\n * @author Gary Gregory\n * @author Norm Deane\n * @author Alban Peignier\n * @author Tomasz Blachowicz\n * @author John Trimble\n "
    },
    {
      "type": "field",
      "varNames": [
        "abbreviationMap"
      ],
      "begin_line": 42,
      "end_line": 42,
      "comment": "\n   * Maps a primitive class name to its corresponding abbreviation used in array class names.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "reverseAbbreviationMap"
      ],
      "begin_line": 47,
      "end_line": 47,
      "comment": "\n   * Maps an abbreviation used in array class names to corresponding primitive class name.\n   "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.util.ClassLoaderUtil.addAbbreviation(java.lang.String, java.lang.String)",
      "begin_line": 55,
      "end_line": 58,
      "comment": "\n   * Add primitive type abbreviation to maps of abbreviations.\n   * \n   * @param primitive Canonical name of primitive type\n   * @param abbreviation Corresponding abbreviation of primitive type\n   ",
      "child_ranges": [
        "(line 56,col 7)-(line 56,col 51)",
        "(line 57,col 7)-(line 57,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.util.ClassLoaderUtil.getClass(java.lang.ClassLoader, java.lang.String, boolean)",
      "begin_line": 87,
      "end_line": 97,
      "comment": "\n   * Returns the class represented by \u003ccode\u003eclassName\u003c/code\u003e using the\n   * \u003ccode\u003eclassLoader\u003c/code\u003e.  This implementation supports names like\n   * \"\u003ccode\u003ejava.lang.String[]\u003c/code\u003e\" as well as \"\u003ccode\u003e[Ljava.lang.String;\u003c/code\u003e\".\n   *\n   * @param classLoader  the class loader to use to load the class\n   * @param className  the class name\n   * @param initialize  whether the class must be initialized\n   * @return the class represented by \u003ccode\u003eclassName\u003c/code\u003e using the \u003ccode\u003eclassLoader\u003c/code\u003e\n   * @throws ClassNotFoundException if the class is not found\n   ",
      "child_ranges": [
        "(line 89,col 7)-(line 89,col 18)",
        "(line 90,col 7)-(line 95,col 7)",
        "(line 96,col 7)-(line 96,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.util.ClassLoaderUtil.getClass(java.lang.ClassLoader, java.lang.String)",
      "begin_line": 110,
      "end_line": 112,
      "comment": "\n   * Returns the (initialized) class represented by \u003ccode\u003eclassName\u003c/code\u003e\n   * using the \u003ccode\u003eclassLoader\u003c/code\u003e.  This implementation supports names\n   * like \"\u003ccode\u003ejava.lang.String[]\u003c/code\u003e\" as well as\n   * \"\u003ccode\u003e[Ljava.lang.String;\u003c/code\u003e\".\n   *\n   * @param classLoader  the class loader to use to load the class\n   * @param className  the class name\n   * @return the class represented by \u003ccode\u003eclassName\u003c/code\u003e using the \u003ccode\u003eclassLoader\u003c/code\u003e\n   * @throws ClassNotFoundException if the class is not found\n   ",
      "child_ranges": [
        "(line 111,col 7)-(line 111,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.util.ClassLoaderUtil.getClass(java.lang.String)",
      "begin_line": 124,
      "end_line": 126,
      "comment": "\n   * Returns the (initialized) class represented by \u003ccode\u003eclassName\u003c/code\u003e\n   * using the current thread\u0027s context class loader. This implementation\n   * supports names like \"\u003ccode\u003ejava.lang.String[]\u003c/code\u003e\" as well as\n   * \"\u003ccode\u003e[Ljava.lang.String;\u003c/code\u003e\".\n   *\n   * @param className  the class name\n   * @return the class represented by \u003ccode\u003eclassName\u003c/code\u003e using the current thread\u0027s context class loader\n   * @throws ClassNotFoundException if the class is not found\n   ",
      "child_ranges": [
        "(line 125,col 7)-(line 125,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.util.ClassLoaderUtil.getClass(java.lang.String, boolean)",
      "begin_line": 139,
      "end_line": 150,
      "comment": "\n   * Returns the class represented by \u003ccode\u003eclassName\u003c/code\u003e using the\n   * current thread\u0027s context class loader. This implementation supports\n   * names like \"\u003ccode\u003ejava.lang.String[]\u003c/code\u003e\" as well as\n   * \"\u003ccode\u003e[Ljava.lang.String;\u003c/code\u003e\".\n   *\n   * @param className  the class name\n   * @param initialize  whether the class must be initialized\n   * @return the class represented by \u003ccode\u003eclassName\u003c/code\u003e using the current thread\u0027s context class loader\n   * @throws ClassNotFoundException if the class is not found\n   ",
      "child_ranges": [
        "(line 140,col 7)-(line 140,col 77)",
        "(line 141,col 7)-(line 141,col 69)",
        "(line 142,col 7)-(line 148,col 7)",
        "(line 149,col 7)-(line 149,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.util.ClassLoaderUtil.toCanonicalName(java.lang.String)",
      "begin_line": 158,
      "end_line": 176,
      "comment": "\n   * Converts a class name to a JLS style class name.\n   *\n   * @param className  the class name\n   * @return the converted name\n   ",
      "child_ranges": [
        "(line 159,col 7)-(line 174,col 7)",
        "(line 175,col 7)-(line 175,col 23)"
      ]
    }
  ]
}