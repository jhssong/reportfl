{
  "filepath": "/tmp/JxPath-7b/src/java/org/apache/commons/jxpath/util/TypeUtils.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "TypeUtils",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 27,
      "end_line": 81,
      "comment": "\n * Global type conversion utilities.\n *\n * @author Dmitri Plotnikov\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "field",
      "varNames": [
        "typeConverter"
      ],
      "begin_line": 28,
      "end_line": 28,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "PRIMITIVE_TYPE_MAP"
      ],
      "begin_line": 29,
      "end_line": 40,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.util.TypeUtils.setTypeConverter(org.apache.commons.jxpath.util.TypeConverter)",
      "begin_line": 45,
      "end_line": 47,
      "comment": "\n     * Install an alternative type converter.\n     ",
      "child_ranges": [
        "(line 46,col 9)-(line 46,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.util.TypeUtils.getTypeConverter()",
      "begin_line": 52,
      "end_line": 54,
      "comment": "\n     * Returns the current type converter.\n     ",
      "child_ranges": [
        "(line 53,col 9)-(line 53,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.util.TypeUtils.canConvert(java.lang.Object, java.lang.Class)",
      "begin_line": 60,
      "end_line": 62,
      "comment": "\n     * Returns true if the global converter can convert the supplied\n     * object to the specified type.\n     ",
      "child_ranges": [
        "(line 61,col 9)-(line 61,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.util.TypeUtils.convert(java.lang.Object, java.lang.Class)",
      "begin_line": 68,
      "end_line": 70,
      "comment": "\n     * Converts the supplied object to the specified type. May\n     * throw a RuntimeException.\n     ",
      "child_ranges": [
        "(line 69,col 9)-(line 69,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.util.TypeUtils.wrapPrimitive(java.lang.Class)",
      "begin_line": 78,
      "end_line": 80,
      "comment": "\n     * Return the appropriate wrapper type for the specified class.\n     * @param p Class for which to retrieve a wrapper class.\n     * @return the wrapper if \u003ccode\u003ep\u003c/code\u003e is primitive, else \u003ccode\u003ep\u003c/code\u003e.\n     * @since JXPath 1.3\n     ",
      "child_ranges": [
        "(line 79,col 9)-(line 79,col 71)"
      ]
    }
  ]
}