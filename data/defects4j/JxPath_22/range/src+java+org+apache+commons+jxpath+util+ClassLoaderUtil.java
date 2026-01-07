{
  "filepath": "/tmp/JxPath-22b/src/java/org/apache/commons/jxpath/util/ClassLoaderUtil.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ClassLoaderUtil",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 38,
      "end_line": 171,
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
      "type": "method",
      "signature": "org.apache.commons.jxpath.util.ClassLoaderUtil.addAbbreviation(java.lang.String, java.lang.String)",
      "begin_line": 50,
      "end_line": 52,
      "comment": "\n   * Add primitive type abbreviation to maps of abbreviations.\n   * \n   * @param primitive Canonical name of primitive type\n   * @param abbreviation Corresponding abbreviation of primitive type\n   ",
      "child_ranges": [
        "(line 51,col 7)-(line 51,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.util.ClassLoaderUtil.getClass(java.lang.ClassLoader, java.lang.String, boolean)",
      "begin_line": 81,
      "end_line": 91,
      "comment": "\n   * Returns the class represented by \u003ccode\u003eclassName\u003c/code\u003e using the\n   * \u003ccode\u003eclassLoader\u003c/code\u003e.  This implementation supports names like\n   * \"\u003ccode\u003ejava.lang.String[]\u003c/code\u003e\" as well as \"\u003ccode\u003e[Ljava.lang.String;\u003c/code\u003e\".\n   *\n   * @param classLoader  the class loader to use to load the class\n   * @param className  the class name\n   * @param initialize  whether the class must be initialized\n   * @return the class represented by \u003ccode\u003eclassName\u003c/code\u003e using the \u003ccode\u003eclassLoader\u003c/code\u003e\n   * @throws ClassNotFoundException if the class is not found\n   ",
      "child_ranges": [
        "(line 83,col 7)-(line 83,col 18)",
        "(line 84,col 7)-(line 89,col 7)",
        "(line 90,col 7)-(line 90,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.util.ClassLoaderUtil.getClass(java.lang.ClassLoader, java.lang.String)",
      "begin_line": 104,
      "end_line": 106,
      "comment": "\n   * Returns the (initialized) class represented by \u003ccode\u003eclassName\u003c/code\u003e\n   * using the \u003ccode\u003eclassLoader\u003c/code\u003e.  This implementation supports names\n   * like \"\u003ccode\u003ejava.lang.String[]\u003c/code\u003e\" as well as\n   * \"\u003ccode\u003e[Ljava.lang.String;\u003c/code\u003e\".\n   *\n   * @param classLoader  the class loader to use to load the class\n   * @param className  the class name\n   * @return the class represented by \u003ccode\u003eclassName\u003c/code\u003e using the \u003ccode\u003eclassLoader\u003c/code\u003e\n   * @throws ClassNotFoundException if the class is not found\n   ",
      "child_ranges": [
        "(line 105,col 7)-(line 105,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.util.ClassLoaderUtil.getClass(java.lang.String)",
      "begin_line": 118,
      "end_line": 120,
      "comment": "\n   * Returns the (initialized) class represented by \u003ccode\u003eclassName\u003c/code\u003e\n   * using the current thread\u0027s context class loader. This implementation\n   * supports names like \"\u003ccode\u003ejava.lang.String[]\u003c/code\u003e\" as well as\n   * \"\u003ccode\u003e[Ljava.lang.String;\u003c/code\u003e\".\n   *\n   * @param className  the class name\n   * @return the class represented by \u003ccode\u003eclassName\u003c/code\u003e using the current thread\u0027s context class loader\n   * @throws ClassNotFoundException if the class is not found\n   ",
      "child_ranges": [
        "(line 119,col 7)-(line 119,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.util.ClassLoaderUtil.getClass(java.lang.String, boolean)",
      "begin_line": 133,
      "end_line": 144,
      "comment": "\n   * Returns the class represented by \u003ccode\u003eclassName\u003c/code\u003e using the\n   * current thread\u0027s context class loader. This implementation supports\n   * names like \"\u003ccode\u003ejava.lang.String[]\u003c/code\u003e\" as well as\n   * \"\u003ccode\u003e[Ljava.lang.String;\u003c/code\u003e\".\n   *\n   * @param className  the class name\n   * @param initialize  whether the class must be initialized\n   * @return the class represented by \u003ccode\u003eclassName\u003c/code\u003e using the current thread\u0027s context class loader\n   * @throws ClassNotFoundException if the class is not found\n   ",
      "child_ranges": [
        "(line 134,col 7)-(line 134,col 77)",
        "(line 135,col 7)-(line 135,col 69)",
        "(line 136,col 7)-(line 142,col 7)",
        "(line 143,col 7)-(line 143,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.util.ClassLoaderUtil.toCanonicalName(java.lang.String)",
      "begin_line": 152,
      "end_line": 170,
      "comment": "\n   * Converts a class name to a JLS style class name.\n   *\n   * @param className  the class name\n   * @return the converted name\n   ",
      "child_ranges": [
        "(line 153,col 7)-(line 168,col 7)",
        "(line 169,col 7)-(line 169,col 23)"
      ]
    }
  ]
}