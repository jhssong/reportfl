{
  "filepath": "/tmp/Math-59b/src/main/java/org/apache/commons/math/linear/RealVectorFormat.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "RealVectorFormat",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 44,
      "end_line": 290,
      "comment": "\n * Formats a vector in components list format \"{v0; v1; ...; vk-1}\".\n * \u003cp\u003eThe prefix and suffix \"{\" and \"}\" and the separator \"; \" can be replaced by\n * any user-defined strings. The number format for components can be configured.\u003c/p\u003e\n * \u003cp\u003eWhite space is ignored at parse time, even if it is in the prefix, suffix\n * or separator specifications. So even if the default separator does include a space\n * character that is used at format time, both input string \"{1;1;1}\" and\n * \" { 1 ; 1 ; 1 } \" will be parsed without error and the same vector will be\n * returned. In the second case, however, the parse position after parsing will be\n * just after the closing curly brace, i.e. just before the trailing space.\u003c/p\u003e\n *\n * @version $Revision$ $Date$\n * @since 2.0\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 46,
      "end_line": 46,
      "comment": " Serializable version identifier "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_PREFIX"
      ],
      "begin_line": 48,
      "end_line": 48,
      "comment": " The default prefix: \"{\". "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_SUFFIX"
      ],
      "begin_line": 50,
      "end_line": 50,
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
      "begin_line": 54,
      "end_line": 54,
      "comment": " Prefix. "
    },
    {
      "type": "field",
      "varNames": [
        "suffix"
      ],
      "begin_line": 56,
      "end_line": 56,
      "comment": " Suffix. "
    },
    {
      "type": "field",
      "varNames": [
        "separator"
      ],
      "begin_line": 58,
      "end_line": 58,
      "comment": " Separator. "
    },
    {
      "type": "field",
      "varNames": [
        "trimmedPrefix"
      ],
      "begin_line": 60,
      "end_line": 60,
      "comment": " Trimmed prefix. "
    },
    {
      "type": "field",
      "varNames": [
        "trimmedSuffix"
      ],
      "begin_line": 62,
      "end_line": 62,
      "comment": " Trimmed suffix. "
    },
    {
      "type": "field",
      "varNames": [
        "trimmedSeparator"
      ],
      "begin_line": 64,
      "end_line": 64,
      "comment": " Trimmed separator. "
    },
    {
      "type": "field",
      "varNames": [
        "format"
      ],
      "begin_line": 66,
      "end_line": 66,
      "comment": " The format used for components. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.RealVectorFormat.RealVectorFormat()",
      "begin_line": 73,
      "end_line": 76,
      "comment": "\n     * Create an instance with default settings.\n     * \u003cp\u003eThe instance uses the default prefix, suffix and separator:\n     * \"{\", \"}\", and \"; \" and the default number format for components.\u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 74,col 9)-(line 75,col 55)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.RealVectorFormat.RealVectorFormat(java.text.NumberFormat)",
      "begin_line": 82,
      "end_line": 84,
      "comment": "\n     * Create an instance with a custom number format for components.\n     * @param format the custom format for components.\n     ",
      "child_ranges": [
        "(line 83,col 9)-(line 83,col 72)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.RealVectorFormat.RealVectorFormat(java.lang.String, java.lang.String, java.lang.String)",
      "begin_line": 92,
      "end_line": 96,
      "comment": "\n     * Create an instance with custom prefix, suffix and separator.\n     * @param prefix prefix to use instead of the default \"{\"\n     * @param suffix suffix to use instead of the default \"}\"\n     * @param separator separator to use instead of the default \"; \"\n     ",
      "child_ranges": [
        "(line 94,col 9)-(line 95,col 55)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.RealVectorFormat.RealVectorFormat(java.lang.String, java.lang.String, java.lang.String, java.text.NumberFormat)",
      "begin_line": 106,
      "end_line": 115,
      "comment": "\n     * Create an instance with custom prefix, suffix, separator and format\n     * for components.\n     * @param prefix prefix to use instead of the default \"{\"\n     * @param suffix suffix to use instead of the default \"}\"\n     * @param separator separator to use instead of the default \"; \"\n     * @param format the custom format for components.\n     ",
      "child_ranges": [
        "(line 108,col 9)-(line 108,col 34)",
        "(line 109,col 9)-(line 109,col 34)",
        "(line 110,col 9)-(line 110,col 37)",
        "(line 111,col 9)-(line 111,col 41)",
        "(line 112,col 9)-(line 112,col 41)",
        "(line 113,col 9)-(line 113,col 44)",
        "(line 114,col 9)-(line 114,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVectorFormat.getAvailableLocales()",
      "begin_line": 122,
      "end_line": 124,
      "comment": "\n     * Get the set of locales for which real vectors formats are available.\n     * \u003cp\u003eThis is the same set as the {@link NumberFormat} set.\u003c/p\u003e\n     * @return available real vector format locales.\n     ",
      "child_ranges": [
        "(line 123,col 9)-(line 123,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVectorFormat.getPrefix()",
      "begin_line": 130,
      "end_line": 132,
      "comment": "\n     * Get the format prefix.\n     * @return format prefix.\n     ",
      "child_ranges": [
        "(line 131,col 9)-(line 131,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVectorFormat.getSuffix()",
      "begin_line": 138,
      "end_line": 140,
      "comment": "\n     * Get the format suffix.\n     * @return format suffix.\n     ",
      "child_ranges": [
        "(line 139,col 9)-(line 139,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVectorFormat.getSeparator()",
      "begin_line": 146,
      "end_line": 148,
      "comment": "\n     * Get the format separator between components.\n     * @return format separator.\n     ",
      "child_ranges": [
        "(line 147,col 9)-(line 147,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVectorFormat.getFormat()",
      "begin_line": 154,
      "end_line": 156,
      "comment": "\n     * Get the components format.\n     * @return components format.\n     ",
      "child_ranges": [
        "(line 155,col 9)-(line 155,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVectorFormat.getInstance()",
      "begin_line": 162,
      "end_line": 164,
      "comment": "\n     * Returns the default real vector format for the current locale.\n     * @return the default real vector format.\n     ",
      "child_ranges": [
        "(line 163,col 9)-(line 163,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVectorFormat.getInstance(java.util.Locale)",
      "begin_line": 171,
      "end_line": 173,
      "comment": "\n     * Returns the default real vector format for the given locale.\n     * @param locale the specific locale used by the format.\n     * @return the real vector format specific to the given locale.\n     ",
      "child_ranges": [
        "(line 172,col 9)-(line 172,col 84)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVectorFormat.format(org.apache.commons.math.linear.RealVector)",
      "begin_line": 181,
      "end_line": 183,
      "comment": "\n     * This method calls {@link #format(RealVector,StringBuffer,FieldPosition)}.\n     *\n     * @param v RealVector object to format.\n     * @return a formatted vector.\n     ",
      "child_ranges": [
        "(line 182,col 9)-(line 182,col 78)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVectorFormat.format(org.apache.commons.math.linear.RealVector, java.lang.StringBuffer, java.text.FieldPosition)",
      "begin_line": 193,
      "end_line": 214,
      "comment": "\n     * Formats a {@link RealVector} object to produce a string.\n     * @param vector the object to format.\n     * @param toAppendTo where the text is to be appended\n     * @param pos On input: an alignment field, if desired. On output: the\n     *            offsets of the alignment field\n     * @return the value passed in as toAppendTo.\n     ",
      "child_ranges": [
        "(line 196,col 9)-(line 196,col 29)",
        "(line 197,col 9)-(line 197,col 27)",
        "(line 200,col 9)-(line 200,col 34)",
        "(line 203,col 9)-(line 208,col 9)",
        "(line 211,col 9)-(line 211,col 34)",
        "(line 213,col 9)-(line 213,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVectorFormat.parse(java.lang.String)",
      "begin_line": 224,
      "end_line": 233,
      "comment": "\n     * Parse a string to produce a {@link RealVector} object.\n     *\n     * @param source String to parse.\n     * @return the parsed {@link RealVector} object.\n     * @throws MathParseException if the beginning of the specified string\n     * cannot be parsed.\n     ",
      "child_ranges": [
        "(line 225,col 9)-(line 225,col 65)",
        "(line 226,col 9)-(line 226,col 68)",
        "(line 227,col 9)-(line 231,col 9)",
        "(line 232,col 9)-(line 232,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVectorFormat.parse(java.lang.String, java.text.ParsePosition)",
      "begin_line": 242,
      "end_line": 289,
      "comment": "\n     * Parse a string to produce a {@link RealVector} object.\n     *\n     * @param source String to parse.\n     * @param pos input/ouput parsing parameter.\n     * @return the parsed {@link RealVector} object.\n     ",
      "child_ranges": [
        "(line 243,col 9)-(line 243,col 42)",
        "(line 246,col 9)-(line 246,col 62)",
        "(line 247,col 9)-(line 249,col 9)",
        "(line 252,col 9)-(line 252,col 58)",
        "(line 253,col 9)-(line 275,col 9)",
        "(line 278,col 9)-(line 278,col 62)",
        "(line 279,col 9)-(line 281,col 9)",
        "(line 284,col 9)-(line 284,col 54)",
        "(line 285,col 9)-(line 287,col 9)",
        "(line 288,col 9)-(line 288,col 48)"
      ]
    }
  ]
}