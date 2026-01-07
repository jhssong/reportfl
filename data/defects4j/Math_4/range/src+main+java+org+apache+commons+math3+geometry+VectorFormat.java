{
  "filepath": "/tmp/Math-4b/src/main/java/org/apache/commons/math3/geometry/VectorFormat.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "VectorFormat",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 46,
      "end_line": 291,
      "comment": "\n * Formats a vector in components list format \"{x; y; ...}\".\n * \u003cp\u003eThe prefix and suffix \"{\" and \"}\" and the separator \"; \" can be replaced by\n * any user-defined strings. The number format for components can be configured.\u003c/p\u003e\n * \u003cp\u003eWhite space is ignored at parse time, even if it is in the prefix, suffix\n * or separator specifications. So even if the default separator does include a space\n * character that is used at format time, both input string \"{1;1;1}\" and\n * \" { 1 ; 1 ; 1 } \" will be parsed without error and the same vector will be\n * returned. In the second case, however, the parse position after parsing will be\n * just after the closing curly brace, i.e. just before the trailing space.\u003c/p\u003e\n * \u003cp\u003e\u003cb\u003eNote:\u003c/b\u003e using \",\" as a separator may interfere with the grouping separator\n * of the default {@link NumberFormat} for the current locale. Thus it is advised\n * to use a {@link NumberFormat} instance with disabled grouping in such a case.\u003c/p\u003e\n *\n * @param \u003cS\u003e Type of the space.\n * @version $Id$\n * @since 3.0\n "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_PREFIX"
      ],
      "begin_line": 49,
      "end_line": 49,
      "comment": " The default prefix: \"{\". "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_SUFFIX"
      ],
      "begin_line": 52,
      "end_line": 52,
      "comment": " The default suffix: \"}\". "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_SEPARATOR"
      ],
      "begin_line": 55,
      "end_line": 55,
      "comment": " The default separator: \", \". "
    },
    {
      "type": "field",
      "varNames": [
        "prefix"
      ],
      "begin_line": 58,
      "end_line": 58,
      "comment": " Prefix. "
    },
    {
      "type": "field",
      "varNames": [
        "suffix"
      ],
      "begin_line": 61,
      "end_line": 61,
      "comment": " Suffix. "
    },
    {
      "type": "field",
      "varNames": [
        "separator"
      ],
      "begin_line": 64,
      "end_line": 64,
      "comment": " Separator. "
    },
    {
      "type": "field",
      "varNames": [
        "trimmedPrefix"
      ],
      "begin_line": 67,
      "end_line": 67,
      "comment": " Trimmed prefix. "
    },
    {
      "type": "field",
      "varNames": [
        "trimmedSuffix"
      ],
      "begin_line": 70,
      "end_line": 70,
      "comment": " Trimmed suffix. "
    },
    {
      "type": "field",
      "varNames": [
        "trimmedSeparator"
      ],
      "begin_line": 73,
      "end_line": 73,
      "comment": " Trimmed separator. "
    },
    {
      "type": "field",
      "varNames": [
        "format"
      ],
      "begin_line": 76,
      "end_line": 76,
      "comment": " The format used for components. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.geometry.VectorFormat.VectorFormat()",
      "begin_line": 83,
      "end_line": 86,
      "comment": "\n     * Create an instance with default settings.\n     * \u003cp\u003eThe instance uses the default prefix, suffix and separator:\n     * \"{\", \"}\", and \"; \" and the default number format for components.\u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 84,col 9)-(line 85,col 55)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.geometry.VectorFormat.VectorFormat(java.text.NumberFormat)",
      "begin_line": 92,
      "end_line": 94,
      "comment": "\n     * Create an instance with a custom number format for components.\n     * @param format the custom format for components.\n     ",
      "child_ranges": [
        "(line 93,col 9)-(line 93,col 72)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.geometry.VectorFormat.VectorFormat(java.lang.String, java.lang.String, java.lang.String)",
      "begin_line": 102,
      "end_line": 105,
      "comment": "\n     * Create an instance with custom prefix, suffix and separator.\n     * @param prefix prefix to use instead of the default \"{\"\n     * @param suffix suffix to use instead of the default \"}\"\n     * @param separator separator to use instead of the default \"; \"\n     ",
      "child_ranges": [
        "(line 104,col 9)-(line 104,col 82)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.geometry.VectorFormat.VectorFormat(java.lang.String, java.lang.String, java.lang.String, java.text.NumberFormat)",
      "begin_line": 115,
      "end_line": 124,
      "comment": "\n     * Create an instance with custom prefix, suffix, separator and format\n     * for components.\n     * @param prefix prefix to use instead of the default \"{\"\n     * @param suffix suffix to use instead of the default \"}\"\n     * @param separator separator to use instead of the default \"; \"\n     * @param format the custom format for components.\n     ",
      "child_ranges": [
        "(line 117,col 9)-(line 117,col 34)",
        "(line 118,col 9)-(line 118,col 34)",
        "(line 119,col 9)-(line 119,col 37)",
        "(line 120,col 9)-(line 120,col 41)",
        "(line 121,col 9)-(line 121,col 41)",
        "(line 122,col 9)-(line 122,col 44)",
        "(line 123,col 9)-(line 123,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.VectorFormat.getAvailableLocales()",
      "begin_line": 131,
      "end_line": 133,
      "comment": "\n     * Get the set of locales for which point/vector formats are available.\n     * \u003cp\u003eThis is the same set as the {@link NumberFormat} set.\u003c/p\u003e\n     * @return available point/vector format locales.\n     ",
      "child_ranges": [
        "(line 132,col 9)-(line 132,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.VectorFormat.getPrefix()",
      "begin_line": 139,
      "end_line": 141,
      "comment": "\n     * Get the format prefix.\n     * @return format prefix.\n     ",
      "child_ranges": [
        "(line 140,col 9)-(line 140,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.VectorFormat.getSuffix()",
      "begin_line": 147,
      "end_line": 149,
      "comment": "\n     * Get the format suffix.\n     * @return format suffix.\n     ",
      "child_ranges": [
        "(line 148,col 9)-(line 148,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.VectorFormat.getSeparator()",
      "begin_line": 155,
      "end_line": 157,
      "comment": "\n     * Get the format separator between components.\n     * @return format separator.\n     ",
      "child_ranges": [
        "(line 156,col 9)-(line 156,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.VectorFormat.getFormat()",
      "begin_line": 163,
      "end_line": 165,
      "comment": "\n     * Get the components format.\n     * @return components format.\n     ",
      "child_ranges": [
        "(line 164,col 9)-(line 164,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.VectorFormat.format(org.apache.commons.math3.geometry.Vector\u003cS\u003e)",
      "begin_line": 172,
      "end_line": 174,
      "comment": "\n     * Formats a {@link Vector} object to produce a string.\n     * @param vector the object to format.\n     * @return a formatted string.\n     ",
      "child_ranges": [
        "(line 173,col 9)-(line 173,col 83)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.VectorFormat.format(org.apache.commons.math3.geometry.Vector\u003cS\u003e, java.lang.StringBuffer, java.text.FieldPosition)",
      "begin_line": 184,
      "end_line": 185,
      "comment": "\n     * Formats a {@link Vector} object to produce a string.\n     * @param vector the object to format.\n     * @param toAppendTo where the text is to be appended\n     * @param pos On input: an alignment field, if desired. On output: the\n     *            offsets of the alignment field\n     * @return the value passed in as toAppendTo.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.VectorFormat.format(java.lang.StringBuffer, java.text.FieldPosition, double...)",
      "begin_line": 195,
      "end_line": 217,
      "comment": "\n     * Formats the coordinates of a {@link Vector} to produce a string.\n     * @param toAppendTo where the text is to be appended\n     * @param pos On input: an alignment field, if desired. On output: the\n     *            offsets of the alignment field\n     * @param coordinates coordinates of the object to format.\n     * @return the value passed in as toAppendTo.\n     ",
      "child_ranges": [
        "(line 198,col 9)-(line 198,col 29)",
        "(line 199,col 9)-(line 199,col 27)",
        "(line 202,col 9)-(line 202,col 34)",
        "(line 205,col 9)-(line 210,col 9)",
        "(line 213,col 9)-(line 213,col 34)",
        "(line 215,col 9)-(line 215,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.VectorFormat.parse(java.lang.String)",
      "begin_line": 226,
      "end_line": 226,
      "comment": "\n     * Parses a string to produce a {@link Vector} object.\n     * @param source the string to parse\n     * @return the parsed {@link Vector} object.\n     * @throws MathParseException if the beginning of the specified string\n     * cannot be parsed.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.VectorFormat.parse(java.lang.String, java.text.ParsePosition)",
      "begin_line": 234,
      "end_line": 234,
      "comment": "\n     * Parses a string to produce a {@link Vector} object.\n     * @param source the string to parse\n     * @param pos input/output parsing parameter.\n     * @return the parsed {@link Vector} object.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.VectorFormat.parseCoordinates(int, java.lang.String, java.text.ParsePosition)",
      "begin_line": 243,
      "end_line": 289,
      "comment": "\n     * Parses a string to produce an array of coordinates.\n     * @param dimension dimension of the space\n     * @param source the string to parse\n     * @param pos input/output parsing parameter.\n     * @return coordinates array.\n     ",
      "child_ranges": [
        "(line 245,col 9)-(line 245,col 42)",
        "(line 246,col 9)-(line 246,col 53)",
        "(line 249,col 9)-(line 249,col 62)",
        "(line 250,col 9)-(line 252,col 9)",
        "(line 254,col 9)-(line 279,col 9)",
        "(line 282,col 9)-(line 282,col 62)",
        "(line 283,col 9)-(line 285,col 9)",
        "(line 287,col 9)-(line 287,col 27)"
      ]
    }
  ]
}