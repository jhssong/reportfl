{
  "filepath": "/tmp/JxPath-22b/src/java/org/apache/commons/jxpath/util/TypeUtils.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "TypeUtils",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 27,
      "end_line": 89,
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
      "begin_line": 46,
      "end_line": 48,
      "comment": "\n     * Install an alternative type converter.\n     * @param converter new TypeConverter\n     ",
      "child_ranges": [
        "(line 47,col 9)-(line 47,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.util.TypeUtils.getTypeConverter()",
      "begin_line": 54,
      "end_line": 56,
      "comment": "\n     * Returns the current type converter.\n     * @return TypeConverter\n     ",
      "child_ranges": [
        "(line 55,col 9)-(line 55,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.util.TypeUtils.canConvert(java.lang.Object, java.lang.Class)",
      "begin_line": 65,
      "end_line": 67,
      "comment": "\n     * Returns true if the global converter can convert the supplied\n     * object to the specified type.\n     * @param object object to test\n     * @param toType target class\n     * @return boolean\n     ",
      "child_ranges": [
        "(line 66,col 9)-(line 66,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.util.TypeUtils.convert(java.lang.Object, java.lang.Class)",
      "begin_line": 76,
      "end_line": 78,
      "comment": "\n     * Converts the supplied object to the specified type. May\n     * throw a RuntimeException.\n     * @param object object to convert\n     * @param toType target class\n     * @return resulting Object\n     ",
      "child_ranges": [
        "(line 77,col 9)-(line 77,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.util.TypeUtils.wrapPrimitive(java.lang.Class)",
      "begin_line": 86,
      "end_line": 88,
      "comment": "\n     * Return the appropriate wrapper type for the specified class.\n     * @param p Class for which to retrieve a wrapper class.\n     * @return the wrapper if \u003ccode\u003ep\u003c/code\u003e is primitive, else \u003ccode\u003ep\u003c/code\u003e.\n     * @since JXPath 1.3\n     ",
      "child_ranges": [
        "(line 87,col 9)-(line 87,col 71)"
      ]
    }
  ]
}