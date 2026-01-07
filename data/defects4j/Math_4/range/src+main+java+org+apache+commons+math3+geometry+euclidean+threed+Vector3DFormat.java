{
  "filepath": "/tmp/Math-4b/src/main/java/org/apache/commons/math3/geometry/euclidean/threed/Vector3DFormat.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Vector3DFormat",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.geometry.VectorFormat\u003corg.apache.commons.math3.geometry.euclidean.threed.Euclidean3D\u003e"
      ],
      "begin_line": 46,
      "end_line": 156,
      "comment": "\n * Formats a 3D vector in components list format \"{x; y; z}\".\n * \u003cp\u003eThe prefix and suffix \"{\" and \"}\" and the separator \"; \" can be replaced by\n * any user-defined strings. The number format for components can be configured.\u003c/p\u003e\n * \u003cp\u003eWhite space is ignored at parse time, even if it is in the prefix, suffix\n * or separator specifications. So even if the default separator does include a space\n * character that is used at format time, both input string \"{1;1;1}\" and\n * \" { 1 ; 1 ; 1 } \" will be parsed without error and the same vector will be\n * returned. In the second case, however, the parse position after parsing will be\n * just after the closing curly brace, i.e. just before the trailing space.\u003c/p\u003e\n * \u003cp\u003e\u003cb\u003eNote:\u003c/b\u003e using \",\" as a separator may interfere with the grouping separator\n * of the default {@link NumberFormat} for the current locale. Thus it is advised\n * to use a {@link NumberFormat} instance with disabled grouping in such a case.\u003c/p\u003e\n *\n * @version $Id$\n "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.geometry.euclidean.threed.Vector3DFormat.Vector3DFormat()",
      "begin_line": 53,
      "end_line": 56,
      "comment": "\n     * Create an instance with default settings.\n     * \u003cp\u003eThe instance uses the default prefix, suffix and separator:\n     * \"{\", \"}\", and \"; \" and the default number format for components.\u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 54,col 9)-(line 55,col 56)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.geometry.euclidean.threed.Vector3DFormat.Vector3DFormat(java.text.NumberFormat)",
      "begin_line": 62,
      "end_line": 64,
      "comment": "\n     * Create an instance with a custom number format for components.\n     * @param format the custom format for components.\n     ",
      "child_ranges": [
        "(line 63,col 9)-(line 63,col 73)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.geometry.euclidean.threed.Vector3DFormat.Vector3DFormat(java.lang.String, java.lang.String, java.lang.String)",
      "begin_line": 72,
      "end_line": 75,
      "comment": "\n     * Create an instance with custom prefix, suffix and separator.\n     * @param prefix prefix to use instead of the default \"{\"\n     * @param suffix suffix to use instead of the default \"}\"\n     * @param separator separator to use instead of the default \"; \"\n     ",
      "child_ranges": [
        "(line 74,col 9)-(line 74,col 83)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.geometry.euclidean.threed.Vector3DFormat.Vector3DFormat(java.lang.String, java.lang.String, java.lang.String, java.text.NumberFormat)",
      "begin_line": 85,
      "end_line": 88,
      "comment": "\n     * Create an instance with custom prefix, suffix, separator and format\n     * for components.\n     * @param prefix prefix to use instead of the default \"{\"\n     * @param suffix suffix to use instead of the default \"}\"\n     * @param separator separator to use instead of the default \"; \"\n     * @param format the custom format for components.\n     ",
      "child_ranges": [
        "(line 87,col 9)-(line 87,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.threed.Vector3DFormat.getInstance()",
      "begin_line": 94,
      "end_line": 96,
      "comment": "\n     * Returns the default 3D vector format for the current locale.\n     * @return the default 3D vector format.\n     ",
      "child_ranges": [
        "(line 95,col 9)-(line 95,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.threed.Vector3DFormat.getInstance(java.util.Locale)",
      "begin_line": 103,
      "end_line": 105,
      "comment": "\n     * Returns the default 3D vector format for the given locale.\n     * @param locale the specific locale used by the format.\n     * @return the 3D vector format specific to the given locale.\n     ",
      "child_ranges": [
        "(line 104,col 9)-(line 104,col 82)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.threed.Vector3DFormat.format(org.apache.commons.math3.geometry.Vector\u003corg.apache.commons.math3.geometry.euclidean.threed.Euclidean3D\u003e, java.lang.StringBuffer, java.text.FieldPosition)",
      "begin_line": 115,
      "end_line": 120,
      "comment": "\n     * Formats a {@link Vector3D} object to produce a string.\n     * @param vector the object to format.\n     * @param toAppendTo where the text is to be appended\n     * @param pos On input: an alignment field, if desired. On output: the\n     *            offsets of the alignment field\n     * @return the value passed in as toAppendTo.\n     ",
      "child_ranges": [
        "(line 118,col 9)-(line 118,col 46)",
        "(line 119,col 9)-(line 119,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.threed.Vector3DFormat.parse(java.lang.String)",
      "begin_line": 129,
      "end_line": 139,
      "comment": "\n     * Parses a string to produce a {@link Vector3D} object.\n     * @param source the string to parse\n     * @return the parsed {@link Vector3D} object.\n     * @throws MathParseException if the beginning of the specified string\n     * cannot be parsed.\n     ",
      "child_ranges": [
        "(line 131,col 9)-(line 131,col 59)",
        "(line 132,col 9)-(line 132,col 55)",
        "(line 133,col 9)-(line 137,col 9)",
        "(line 138,col 9)-(line 138,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.threed.Vector3DFormat.parse(java.lang.String, java.text.ParsePosition)",
      "begin_line": 147,
      "end_line": 154,
      "comment": "\n     * Parses a string to produce a {@link Vector3D} object.\n     * @param source the string to parse\n     * @param pos input/ouput parsing parameter.\n     * @return the parsed {@link Vector3D} object.\n     ",
      "child_ranges": [
        "(line 149,col 9)-(line 149,col 70)",
        "(line 150,col 9)-(line 152,col 9)",
        "(line 153,col 9)-(line 153,col 76)"
      ]
    }
  ]
}