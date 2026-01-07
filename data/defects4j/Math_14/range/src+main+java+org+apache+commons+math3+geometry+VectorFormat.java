{
  "filepath": "/tmp/Math-14b/src/main/java/org/apache/commons/math3/geometry/VectorFormat.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "VectorFormat",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 43,
      "end_line": 290,
      "comment": "\n * Formats a vector in components list format \"{x; y; ...}\".\n * \u003cp\u003eThe prefix and suffix \"{\" and \"}\" and the separator \"; \" can be replaced by\n * any user-defined strings. The number format for components can be configured.\u003c/p\u003e\n * \u003cp\u003eWhite space is ignored at parse time, even if it is in the prefix, suffix\n * or separator specifications. So even if the default separator does include a space\n * character that is used at format time, both input string \"{1;1;1}\" and\n * \" { 1 ; 1 ; 1 } \" will be parsed without error and the same vector will be\n * returned. In the second case, however, the parse position after parsing will be\n * just after the closing curly brace, i.e. just before the trailing space.\u003c/p\u003e\n *\n * @param \u003cS\u003e Type of the space.\n * @version $Id$\n * @since 3.0\n "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_PREFIX"
      ],
      "begin_line": 46,
      "end_line": 46,
      "comment": " The default prefix: \"{\". "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_SUFFIX"
      ],
      "begin_line": 49,
      "end_line": 49,
      "comment": " The default suffix: \"}\". "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_SEPARATOR"
      ],
      "begin_line": 52,
      "end_line": 52,
      "comment": " The default separator: \", \". "
    },
    {
      "type": "field",
      "varNames": [
        "prefix"
      ],
      "begin_line": 55,
      "end_line": 55,
      "comment": " Prefix. "
    },
    {
      "type": "field",
      "varNames": [
        "suffix"
      ],
      "begin_line": 58,
      "end_line": 58,
      "comment": " Suffix. "
    },
    {
      "type": "field",
      "varNames": [
        "separator"
      ],
      "begin_line": 61,
      "end_line": 61,
      "comment": " Separator. "
    },
    {
      "type": "field",
      "varNames": [
        "trimmedPrefix"
      ],
      "begin_line": 64,
      "end_line": 64,
      "comment": " Trimmed prefix. "
    },
    {
      "type": "field",
      "varNames": [
        "trimmedSuffix"
      ],
      "begin_line": 67,
      "end_line": 67,
      "comment": " Trimmed suffix. "
    },
    {
      "type": "field",
      "varNames": [
        "trimmedSeparator"
      ],
      "begin_line": 70,
      "end_line": 70,
      "comment": " Trimmed separator. "
    },
    {
      "type": "field",
      "varNames": [
        "format"
      ],
      "begin_line": 73,
      "end_line": 73,
      "comment": " The format used for components. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.geometry.VectorFormat.VectorFormat()",
      "begin_line": 80,
      "end_line": 83,
      "comment": "\n     * Create an instance with default settings.\n     * \u003cp\u003eThe instance uses the default prefix, suffix and separator:\n     * \"{\", \"}\", and \"; \" and the default number format for components.\u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 81,col 9)-(line 82,col 55)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.geometry.VectorFormat.VectorFormat(java.text.NumberFormat)",
      "begin_line": 89,
      "end_line": 91,
      "comment": "\n     * Create an instance with a custom number format for components.\n     * @param format the custom format for components.\n     ",
      "child_ranges": [
        "(line 90,col 9)-(line 90,col 72)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.geometry.VectorFormat.VectorFormat(java.lang.String, java.lang.String, java.lang.String)",
      "begin_line": 99,
      "end_line": 102,
      "comment": "\n     * Create an instance with custom prefix, suffix and separator.\n     * @param prefix prefix to use instead of the default \"{\"\n     * @param suffix suffix to use instead of the default \"}\"\n     * @param separator separator to use instead of the default \"; \"\n     ",
      "child_ranges": [
        "(line 101,col 9)-(line 101,col 82)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.geometry.VectorFormat.VectorFormat(java.lang.String, java.lang.String, java.lang.String, java.text.NumberFormat)",
      "begin_line": 112,
      "end_line": 121,
      "comment": "\n     * Create an instance with custom prefix, suffix, separator and format\n     * for components.\n     * @param prefix prefix to use instead of the default \"{\"\n     * @param suffix suffix to use instead of the default \"}\"\n     * @param separator separator to use instead of the default \"; \"\n     * @param format the custom format for components.\n     ",
      "child_ranges": [
        "(line 114,col 9)-(line 114,col 34)",
        "(line 115,col 9)-(line 115,col 34)",
        "(line 116,col 9)-(line 116,col 37)",
        "(line 117,col 9)-(line 117,col 41)",
        "(line 118,col 9)-(line 118,col 41)",
        "(line 119,col 9)-(line 119,col 44)",
        "(line 120,col 9)-(line 120,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.VectorFormat.getAvailableLocales()",
      "begin_line": 128,
      "end_line": 130,
      "comment": "\n     * Get the set of locales for which point/vector formats are available.\n     * \u003cp\u003eThis is the same set as the {@link NumberFormat} set.\u003c/p\u003e\n     * @return available point/vector format locales.\n     ",
      "child_ranges": [
        "(line 129,col 9)-(line 129,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.VectorFormat.getPrefix()",
      "begin_line": 136,
      "end_line": 138,
      "comment": "\n     * Get the format prefix.\n     * @return format prefix.\n     ",
      "child_ranges": [
        "(line 137,col 9)-(line 137,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.VectorFormat.getSuffix()",
      "begin_line": 144,
      "end_line": 146,
      "comment": "\n     * Get the format suffix.\n     * @return format suffix.\n     ",
      "child_ranges": [
        "(line 145,col 9)-(line 145,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.VectorFormat.getSeparator()",
      "begin_line": 152,
      "end_line": 154,
      "comment": "\n     * Get the format separator between components.\n     * @return format separator.\n     ",
      "child_ranges": [
        "(line 153,col 9)-(line 153,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.VectorFormat.getFormat()",
      "begin_line": 160,
      "end_line": 162,
      "comment": "\n     * Get the components format.\n     * @return components format.\n     ",
      "child_ranges": [
        "(line 161,col 9)-(line 161,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.VectorFormat.format(org.apache.commons.math3.geometry.Vector\u003cS\u003e)",
      "begin_line": 169,
      "end_line": 171,
      "comment": "\n     * Formats a {@link Vector} object to produce a string.\n     * @param vector the object to format.\n     * @return a formatted string.\n     ",
      "child_ranges": [
        "(line 170,col 9)-(line 170,col 83)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.VectorFormat.format(org.apache.commons.math3.geometry.Vector\u003cS\u003e, java.lang.StringBuffer, java.text.FieldPosition)",
      "begin_line": 181,
      "end_line": 182,
      "comment": "\n     * Formats a {@link Vector} object to produce a string.\n     * @param vector the object to format.\n     * @param toAppendTo where the text is to be appended\n     * @param pos On input: an alignment field, if desired. On output: the\n     *            offsets of the alignment field\n     * @return the value passed in as toAppendTo.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.VectorFormat.format(java.lang.StringBuffer, java.text.FieldPosition, double...)",
      "begin_line": 192,
      "end_line": 214,
      "comment": "\n     * Formats the coordinates of a {@link Vector} to produce a string.\n     * @param toAppendTo where the text is to be appended\n     * @param pos On input: an alignment field, if desired. On output: the\n     *            offsets of the alignment field\n     * @param coordinates coordinates of the object to format.\n     * @return the value passed in as toAppendTo.\n     ",
      "child_ranges": [
        "(line 195,col 9)-(line 195,col 29)",
        "(line 196,col 9)-(line 196,col 27)",
        "(line 199,col 9)-(line 199,col 34)",
        "(line 202,col 9)-(line 207,col 9)",
        "(line 210,col 9)-(line 210,col 34)",
        "(line 212,col 9)-(line 212,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.VectorFormat.parse(java.lang.String)",
      "begin_line": 223,
      "end_line": 223,
      "comment": "\n     * Parses a string to produce a {@link Vector} object.\n     * @param source the string to parse\n     * @return the parsed {@link Vector} object.\n     * @throws MathParseException if the beginning of the specified string\n     * cannot be parsed.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.VectorFormat.parse(java.lang.String, java.text.ParsePosition)",
      "begin_line": 231,
      "end_line": 231,
      "comment": "\n     * Parses a string to produce a {@link Vector} object.\n     * @param source the string to parse\n     * @param pos input/output parsing parameter.\n     * @return the parsed {@link Vector} object.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.VectorFormat.parseCoordinates(int, java.lang.String, java.text.ParsePosition)",
      "begin_line": 240,
      "end_line": 288,
      "comment": "\n     * Parses a string to produce an array of coordinates.\n     * @param dimension dimension of the space\n     * @param source the string to parse\n     * @param pos input/output parsing parameter.\n     * @return coordinates array.\n     ",
      "child_ranges": [
        "(line 242,col 9)-(line 242,col 42)",
        "(line 243,col 9)-(line 243,col 53)",
        "(line 246,col 9)-(line 246,col 62)",
        "(line 247,col 9)-(line 249,col 9)",
        "(line 251,col 9)-(line 278,col 9)",
        "(line 281,col 9)-(line 281,col 62)",
        "(line 282,col 9)-(line 284,col 9)",
        "(line 286,col 9)-(line 286,col 27)"
      ]
    }
  ]
}