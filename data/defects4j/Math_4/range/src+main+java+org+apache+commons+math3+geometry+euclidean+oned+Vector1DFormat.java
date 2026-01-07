{
  "filepath": "/tmp/Math-4b/src/main/java/org/apache/commons/math3/geometry/euclidean/oned/Vector1DFormat.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Vector1DFormat",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.geometry.VectorFormat\u003corg.apache.commons.math3.geometry.euclidean.oned.Euclidean1D\u003e"
      ],
      "begin_line": 47,
      "end_line": 136,
      "comment": "\n * Formats a 1D vector in components list format \"{x}\".\n * \u003cp\u003eThe prefix and suffix \"{\" and \"}\" can be replaced by\n * any user-defined strings. The number format for components can be configured.\u003c/p\u003e\n * \u003cp\u003eWhite space is ignored at parse time, even if it is in the prefix, suffix\n * or separator specifications. So even if the default separator does include a space\n * character that is used at format time, both input string \"{1}\" and\n * \" { 1 } \" will be parsed without error and the same vector will be\n * returned. In the second case, however, the parse position after parsing will be\n * just after the closing curly brace, i.e. just before the trailing space.\u003c/p\u003e\n * \u003cp\u003e\u003cb\u003eNote:\u003c/b\u003e using \",\" as a separator may interfere with the grouping separator\n * of the default {@link NumberFormat} for the current locale. Thus it is advised\n * to use a {@link NumberFormat} instance with disabled grouping in such a case.\u003c/p\u003e\n *\n * @version $Id$\n * @since 3.0\n "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.geometry.euclidean.oned.Vector1DFormat.Vector1DFormat()",
      "begin_line": 54,
      "end_line": 57,
      "comment": "\n     * Create an instance with default settings.\n     * \u003cp\u003eThe instance uses the default prefix, suffix and separator:\n     * \"{\", \"}\", and \"; \" and the default number format for components.\u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 55,col 9)-(line 56,col 56)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.geometry.euclidean.oned.Vector1DFormat.Vector1DFormat(java.text.NumberFormat)",
      "begin_line": 63,
      "end_line": 65,
      "comment": "\n     * Create an instance with a custom number format for components.\n     * @param format the custom format for components.\n     ",
      "child_ranges": [
        "(line 64,col 9)-(line 64,col 73)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.geometry.euclidean.oned.Vector1DFormat.Vector1DFormat(java.lang.String, java.lang.String)",
      "begin_line": 72,
      "end_line": 74,
      "comment": "\n     * Create an instance with custom prefix, suffix and separator.\n     * @param prefix prefix to use instead of the default \"{\"\n     * @param suffix suffix to use instead of the default \"}\"\n     ",
      "child_ranges": [
        "(line 73,col 9)-(line 73,col 91)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.geometry.euclidean.oned.Vector1DFormat.Vector1DFormat(java.lang.String, java.lang.String, java.text.NumberFormat)",
      "begin_line": 83,
      "end_line": 86,
      "comment": "\n     * Create an instance with custom prefix, suffix, separator and format\n     * for components.\n     * @param prefix prefix to use instead of the default \"{\"\n     * @param suffix suffix to use instead of the default \"}\"\n     * @param format the custom format for components.\n     ",
      "child_ranges": [
        "(line 85,col 9)-(line 85,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.oned.Vector1DFormat.getInstance()",
      "begin_line": 92,
      "end_line": 94,
      "comment": "\n     * Returns the default 1D vector format for the current locale.\n     * @return the default 1D vector format.\n     ",
      "child_ranges": [
        "(line 93,col 9)-(line 93,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.oned.Vector1DFormat.getInstance(java.util.Locale)",
      "begin_line": 101,
      "end_line": 103,
      "comment": "\n     * Returns the default 1D vector format for the given locale.\n     * @param locale the specific locale used by the format.\n     * @return the 1D vector format specific to the given locale.\n     ",
      "child_ranges": [
        "(line 102,col 9)-(line 102,col 82)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.oned.Vector1DFormat.format(org.apache.commons.math3.geometry.Vector\u003corg.apache.commons.math3.geometry.euclidean.oned.Euclidean1D\u003e, java.lang.StringBuffer, java.text.FieldPosition)",
      "begin_line": 106,
      "end_line": 111,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 109,col 9)-(line 109,col 46)",
        "(line 110,col 9)-(line 110,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.oned.Vector1DFormat.parse(java.lang.String)",
      "begin_line": 114,
      "end_line": 124,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 116,col 9)-(line 116,col 59)",
        "(line 117,col 9)-(line 117,col 55)",
        "(line 118,col 9)-(line 122,col 9)",
        "(line 123,col 9)-(line 123,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.oned.Vector1DFormat.parse(java.lang.String, java.text.ParsePosition)",
      "begin_line": 127,
      "end_line": 134,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 129,col 9)-(line 129,col 70)",
        "(line 130,col 9)-(line 132,col 9)",
        "(line 133,col 9)-(line 133,col 44)"
      ]
    }
  ]
}