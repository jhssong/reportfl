{
  "filepath": "/tmp/JxPath-14b/src/java/org/apache/commons/jxpath/util/TypeConverter.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "TypeConverter",
      "is_interface": true,
      "parent_types": [],
      "begin_line": 29,
      "end_line": 43,
      "comment": "\n * A type converter can be installed on TypeUtils to introduce\n * additional type conversions for JXPath. Most of\n * the time BasicTypeConverter should be used as the superclass.\n *\n * @see TypeUtils#setTypeConverter\n *\n * @author Dmitri Plotnikov\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.util.TypeConverter.canConvert(java.lang.Object, java.lang.Class)",
      "begin_line": 35,
      "end_line": 35,
      "comment": "\n     * Returns true if it can convert the supplied\n     * object to the specified class.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.util.TypeConverter.convert(java.lang.Object, java.lang.Class)",
      "begin_line": 42,
      "end_line": 42,
      "comment": "\n     * Converts the supplied object to the specified\n     * type. Throws a runtime exception if the conversion is\n     * not possible.\n     ",
      "child_ranges": []
    }
  ]
}