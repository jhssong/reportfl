{
  "filepath": "/tmp/Math-35b/src/main/java/org/apache/commons/math3/geometry/euclidean/oned/Vector1DFormat.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Vector1DFormat",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.geometry.VectorFormat\u003corg.apache.commons.math3.geometry.euclidean.oned.Euclidean1D\u003e"
      ],
      "begin_line": 44,
      "end_line": 133,
      "comment": "\n * Formats a 1D vector in components list format \"{x}\".\n * \u003cp\u003eThe prefix and suffix \"{\" and \"}\" can be replaced by\n * any user-defined strings. The number format for components can be configured.\u003c/p\u003e\n * \u003cp\u003eWhite space is ignored at parse time, even if it is in the prefix, suffix\n * or separator specifications. So even if the default separator does include a space\n * character that is used at format time, both input string \"{1}\" and\n * \" { 1 } \" will be parsed without error and the same vector will be\n * returned. In the second case, however, the parse position after parsing will be\n * just after the closing curly brace, i.e. just before the trailing space.\u003c/p\u003e\n *\n * @version $Id$\n * @since 3.0\n "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.geometry.euclidean.oned.Vector1DFormat.Vector1DFormat()",
      "begin_line": 51,
      "end_line": 54,
      "comment": "\n     * Create an instance with default settings.\n     * \u003cp\u003eThe instance uses the default prefix, suffix and separator:\n     * \"{\", \"}\", and \"; \" and the default number format for components.\u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 52,col 9)-(line 53,col 56)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.geometry.euclidean.oned.Vector1DFormat.Vector1DFormat(java.text.NumberFormat)",
      "begin_line": 60,
      "end_line": 62,
      "comment": "\n     * Create an instance with a custom number format for components.\n     * @param format the custom format for components.\n     ",
      "child_ranges": [
        "(line 61,col 9)-(line 61,col 73)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.geometry.euclidean.oned.Vector1DFormat.Vector1DFormat(java.lang.String, java.lang.String)",
      "begin_line": 69,
      "end_line": 71,
      "comment": "\n     * Create an instance with custom prefix, suffix and separator.\n     * @param prefix prefix to use instead of the default \"{\"\n     * @param suffix suffix to use instead of the default \"}\"\n     ",
      "child_ranges": [
        "(line 70,col 9)-(line 70,col 91)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.geometry.euclidean.oned.Vector1DFormat.Vector1DFormat(java.lang.String, java.lang.String, java.text.NumberFormat)",
      "begin_line": 80,
      "end_line": 83,
      "comment": "\n     * Create an instance with custom prefix, suffix, separator and format\n     * for components.\n     * @param prefix prefix to use instead of the default \"{\"\n     * @param suffix suffix to use instead of the default \"}\"\n     * @param format the custom format for components.\n     ",
      "child_ranges": [
        "(line 82,col 9)-(line 82,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.oned.Vector1DFormat.getInstance()",
      "begin_line": 89,
      "end_line": 91,
      "comment": "\n     * Returns the default 1D vector format for the current locale.\n     * @return the default 1D vector format.\n     ",
      "child_ranges": [
        "(line 90,col 9)-(line 90,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.oned.Vector1DFormat.getInstance(java.util.Locale)",
      "begin_line": 98,
      "end_line": 100,
      "comment": "\n     * Returns the default 1D vector format for the given locale.\n     * @param locale the specific locale used by the format.\n     * @return the 1D vector format specific to the given locale.\n     ",
      "child_ranges": [
        "(line 99,col 9)-(line 99,col 82)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.oned.Vector1DFormat.format(org.apache.commons.math3.geometry.Vector\u003corg.apache.commons.math3.geometry.euclidean.oned.Euclidean1D\u003e, java.lang.StringBuffer, java.text.FieldPosition)",
      "begin_line": 103,
      "end_line": 108,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 106,col 9)-(line 106,col 46)",
        "(line 107,col 9)-(line 107,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.oned.Vector1DFormat.parse(java.lang.String)",
      "begin_line": 111,
      "end_line": 121,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 113,col 9)-(line 113,col 59)",
        "(line 114,col 9)-(line 114,col 55)",
        "(line 115,col 9)-(line 119,col 9)",
        "(line 120,col 9)-(line 120,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.oned.Vector1DFormat.parse(java.lang.String, java.text.ParsePosition)",
      "begin_line": 124,
      "end_line": 131,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 126,col 9)-(line 126,col 70)",
        "(line 127,col 9)-(line 129,col 9)",
        "(line 130,col 9)-(line 130,col 44)"
      ]
    }
  ]
}