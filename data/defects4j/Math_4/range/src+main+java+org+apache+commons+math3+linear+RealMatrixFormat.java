{
  "filepath": "/tmp/Math-4b/src/main/java/org/apache/commons/math3/linear/RealMatrixFormat.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "RealMatrixFormat",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 55,
      "end_line": 395,
      "comment": "\n * Formats a {@code nxm} matrix in components list format\n * \"{{a\u003csub\u003e0\u003c/sub\u003e\u003csub\u003e0\u003c/sub\u003e,a\u003csub\u003e0\u003c/sub\u003e\u003csub\u003e1\u003c/sub\u003e, ...,\n * a\u003csub\u003e0\u003c/sub\u003e\u003csub\u003em-1\u003c/sub\u003e},{a\u003csub\u003e1\u003c/sub\u003e\u003csub\u003e0\u003c/sub\u003e,\n * a\u003csub\u003e1\u003c/sub\u003e\u003csub\u003e1\u003c/sub\u003e, ..., a\u003csub\u003e1\u003c/sub\u003e\u003csub\u003em-1\u003c/sub\u003e},{...},{\n * a\u003csub\u003en-1\u003c/sub\u003e\u003csub\u003e0\u003c/sub\u003e, a\u003csub\u003en-1\u003c/sub\u003e\u003csub\u003e1\u003c/sub\u003e, ...,\n * a\u003csub\u003en-1\u003c/sub\u003e\u003csub\u003em-1\u003c/sub\u003e}}\".\n * \u003cp\u003eThe prefix and suffix \"{\" and \"}\", the row prefix and suffix \"{\" and \"}\",\n * the row separator \",\" and the column separator \",\" can be replaced by any\n * user-defined strings. The number format for components can be configured.\u003c/p\u003e\n *\n * \u003cp\u003eWhite space is ignored at parse time, even if it is in the prefix, suffix\n * or separator specifications. So even if the default separator does include a space\n * character that is used at format time, both input string \"{{1,1,1}}\" and\n * \" { { 1 , 1 , 1 } } \" will be parsed without error and the same matrix will be\n * returned. In the second case, however, the parse position after parsing will be\n * just after the closing curly brace, i.e. just before the trailing space.\u003c/p\u003e\n *\n * \u003cp\u003e\u003cb\u003eNote:\u003c/b\u003e the grouping functionality of the used {@link NumberFormat} is\n * disabled to prevent problems when parsing (e.g. 1,345.34 would be a valid number\n * but conflicts with the default column separator).\u003c/p\u003e\n *\n * @since 3.1\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_PREFIX"
      ],
      "begin_line": 58,
      "end_line": 58,
      "comment": " The default prefix: \"{\". "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_SUFFIX"
      ],
      "begin_line": 60,
      "end_line": 60,
      "comment": " The default suffix: \"}\". "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_ROW_PREFIX"
      ],
      "begin_line": 62,
      "end_line": 62,
      "comment": " The default row prefix: \"{\". "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_ROW_SUFFIX"
      ],
      "begin_line": 64,
      "end_line": 64,
      "comment": " The default row suffix: \"}\". "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_ROW_SEPARATOR"
      ],
      "begin_line": 66,
      "end_line": 66,
      "comment": " The default row separator: \",\". "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_COLUMN_SEPARATOR"
      ],
      "begin_line": 68,
      "end_line": 68,
      "comment": " The default column separator: \",\". "
    },
    {
      "type": "field",
      "varNames": [
        "prefix"
      ],
      "begin_line": 70,
      "end_line": 70,
      "comment": " Prefix. "
    },
    {
      "type": "field",
      "varNames": [
        "suffix"
      ],
      "begin_line": 72,
      "end_line": 72,
      "comment": " Suffix. "
    },
    {
      "type": "field",
      "varNames": [
        "rowPrefix"
      ],
      "begin_line": 74,
      "end_line": 74,
      "comment": " Row prefix. "
    },
    {
      "type": "field",
      "varNames": [
        "rowSuffix"
      ],
      "begin_line": 76,
      "end_line": 76,
      "comment": " Row suffix. "
    },
    {
      "type": "field",
      "varNames": [
        "rowSeparator"
      ],
      "begin_line": 78,
      "end_line": 78,
      "comment": " Row separator. "
    },
    {
      "type": "field",
      "varNames": [
        "columnSeparator"
      ],
      "begin_line": 80,
      "end_line": 80,
      "comment": " Column separator. "
    },
    {
      "type": "field",
      "varNames": [
        "format"
      ],
      "begin_line": 82,
      "end_line": 82,
      "comment": " The format used for components. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.linear.RealMatrixFormat.RealMatrixFormat()",
      "begin_line": 89,
      "end_line": 92,
      "comment": "\n     * Create an instance with default settings.\n     * \u003cp\u003eThe instance uses the default prefix, suffix and row/column separator:\n     * \"[\", \"]\", \";\" and \", \" and the default number format for components.\u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 90,col 9)-(line 91,col 107)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.linear.RealMatrixFormat.RealMatrixFormat(java.text.NumberFormat)",
      "begin_line": 98,
      "end_line": 101,
      "comment": "\n     * Create an instance with a custom number format for components.\n     * @param format the custom format for components.\n     ",
      "child_ranges": [
        "(line 99,col 9)-(line 100,col 73)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.linear.RealMatrixFormat.RealMatrixFormat(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String)",
      "begin_line": 112,
      "end_line": 117,
      "comment": "\n     * Create an instance with custom prefix, suffix and separator.\n     * @param prefix prefix to use instead of the default \"{\"\n     * @param suffix suffix to use instead of the default \"}\"\n     * @param rowPrefix row prefix to use instead of the default \"{\"\n     * @param rowSuffix row suffix to use instead of the default \"}\"\n     * @param rowSeparator tow separator to use instead of the default \";\"\n     * @param columnSeparator column separator to use instead of the default \", \"\n     ",
      "child_ranges": [
        "(line 115,col 9)-(line 116,col 58)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.linear.RealMatrixFormat.RealMatrixFormat(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.text.NumberFormat)",
      "begin_line": 130,
      "end_line": 143,
      "comment": "\n     * Create an instance with custom prefix, suffix, separator and format\n     * for components.\n     * @param prefix prefix to use instead of the default \"{\"\n     * @param suffix suffix to use instead of the default \"}\"\n     * @param rowPrefix row prefix to use instead of the default \"{\"\n     * @param rowSuffix row suffix to use instead of the default \"}\"\n     * @param rowSeparator tow separator to use instead of the default \";\"\n     * @param columnSeparator column separator to use instead of the default \", \"\n     * @param format the custom format for components.\n     ",
      "child_ranges": [
        "(line 134,col 9)-(line 134,col 40)",
        "(line 135,col 9)-(line 135,col 40)",
        "(line 136,col 9)-(line 136,col 43)",
        "(line 137,col 9)-(line 137,col 43)",
        "(line 138,col 9)-(line 138,col 46)",
        "(line 139,col 9)-(line 139,col 49)",
        "(line 140,col 9)-(line 140,col 40)",
        "(line 142,col 9)-(line 142,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealMatrixFormat.getAvailableLocales()",
      "begin_line": 150,
      "end_line": 152,
      "comment": "\n     * Get the set of locales for which real vectors formats are available.\n     * \u003cp\u003eThis is the same set as the {@link NumberFormat} set.\u003c/p\u003e\n     * @return available real vector format locales.\n     ",
      "child_ranges": [
        "(line 151,col 9)-(line 151,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealMatrixFormat.getPrefix()",
      "begin_line": 158,
      "end_line": 160,
      "comment": "\n     * Get the format prefix.\n     * @return format prefix.\n     ",
      "child_ranges": [
        "(line 159,col 9)-(line 159,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealMatrixFormat.getSuffix()",
      "begin_line": 166,
      "end_line": 168,
      "comment": "\n     * Get the format suffix.\n     * @return format suffix.\n     ",
      "child_ranges": [
        "(line 167,col 9)-(line 167,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealMatrixFormat.getRowPrefix()",
      "begin_line": 174,
      "end_line": 176,
      "comment": "\n     * Get the format prefix.\n     * @return format prefix.\n     ",
      "child_ranges": [
        "(line 175,col 9)-(line 175,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealMatrixFormat.getRowSuffix()",
      "begin_line": 182,
      "end_line": 184,
      "comment": "\n     * Get the format suffix.\n     * @return format suffix.\n     ",
      "child_ranges": [
        "(line 183,col 9)-(line 183,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealMatrixFormat.getRowSeparator()",
      "begin_line": 190,
      "end_line": 192,
      "comment": "\n     * Get the format separator between rows of the matrix.\n     * @return format separator for rows.\n     ",
      "child_ranges": [
        "(line 191,col 9)-(line 191,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealMatrixFormat.getColumnSeparator()",
      "begin_line": 198,
      "end_line": 200,
      "comment": "\n     * Get the format separator between components.\n     * @return format separator between components.\n     ",
      "child_ranges": [
        "(line 199,col 9)-(line 199,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealMatrixFormat.getFormat()",
      "begin_line": 206,
      "end_line": 208,
      "comment": "\n     * Get the components format.\n     * @return components format.\n     ",
      "child_ranges": [
        "(line 207,col 9)-(line 207,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealMatrixFormat.getInstance()",
      "begin_line": 214,
      "end_line": 216,
      "comment": "\n     * Returns the default real vector format for the current locale.\n     * @return the default real vector format.\n     ",
      "child_ranges": [
        "(line 215,col 9)-(line 215,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealMatrixFormat.getInstance(java.util.Locale)",
      "begin_line": 223,
      "end_line": 225,
      "comment": "\n     * Returns the default real vector format for the given locale.\n     * @param locale the specific locale used by the format.\n     * @return the real vector format specific to the given locale.\n     ",
      "child_ranges": [
        "(line 224,col 9)-(line 224,col 84)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealMatrixFormat.format(org.apache.commons.math3.linear.RealMatrix)",
      "begin_line": 233,
      "end_line": 235,
      "comment": "\n     * This method calls {@link #format(RealMatrix,StringBuffer,FieldPosition)}.\n     *\n     * @param m RealMatrix object to format.\n     * @return a formatted matrix.\n     ",
      "child_ranges": [
        "(line 234,col 9)-(line 234,col 78)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealMatrixFormat.format(org.apache.commons.math3.linear.RealMatrix, java.lang.StringBuffer, java.text.FieldPosition)",
      "begin_line": 245,
      "end_line": 274,
      "comment": "\n     * Formats a {@link RealMatrix} object to produce a string.\n     * @param matrix the object to format.\n     * @param toAppendTo where the text is to be appended\n     * @param pos On input: an alignment field, if desired. On output: the\n     *            offsets of the alignment field\n     * @return the value passed in as toAppendTo.\n     ",
      "child_ranges": [
        "(line 248,col 9)-(line 248,col 29)",
        "(line 249,col 9)-(line 249,col 27)",
        "(line 252,col 9)-(line 252,col 34)",
        "(line 255,col 9)-(line 255,col 50)",
        "(line 256,col 9)-(line 268,col 9)",
        "(line 271,col 9)-(line 271,col 34)",
        "(line 273,col 9)-(line 273,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealMatrixFormat.parse(java.lang.String)",
      "begin_line": 284,
      "end_line": 293,
      "comment": "\n     * Parse a string to produce a {@link RealMatrix} object.\n     *\n     * @param source String to parse.\n     * @return the parsed {@link RealMatrix} object.\n     * @throws MathParseException if the beginning of the specified string\n     * cannot be parsed.\n     ",
      "child_ranges": [
        "(line 285,col 9)-(line 285,col 65)",
        "(line 286,col 9)-(line 286,col 63)",
        "(line 287,col 9)-(line 291,col 9)",
        "(line 292,col 9)-(line 292,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealMatrixFormat.parse(java.lang.String, java.text.ParsePosition)",
      "begin_line": 302,
      "end_line": 394,
      "comment": "\n     * Parse a string to produce a {@link RealMatrix} object.\n     *\n     * @param source String to parse.\n     * @param pos input/ouput parsing parameter.\n     * @return the parsed {@link RealMatrix} object.\n     ",
      "child_ranges": [
        "(line 303,col 9)-(line 303,col 42)",
        "(line 305,col 9)-(line 305,col 51)",
        "(line 306,col 9)-(line 306,col 51)",
        "(line 307,col 9)-(line 307,col 57)",
        "(line 308,col 9)-(line 308,col 57)",
        "(line 309,col 9)-(line 309,col 69)",
        "(line 310,col 9)-(line 310,col 63)",
        "(line 313,col 9)-(line 313,col 62)",
        "(line 314,col 9)-(line 316,col 9)",
        "(line 319,col 9)-(line 319,col 66)",
        "(line 320,col 9)-(line 320,col 61)",
        "(line 321,col 9)-(line 365,col 9)",
        "(line 367,col 9)-(line 369,col 9)",
        "(line 372,col 9)-(line 372,col 62)",
        "(line 373,col 9)-(line 375,col 9)",
        "(line 378,col 9)-(line 381,col 9)",
        "(line 384,col 9)-(line 384,col 54)",
        "(line 385,col 9)-(line 385,col 20)",
        "(line 386,col 9)-(line 392,col 9)",
        "(line 393,col 9)-(line 393,col 50)"
      ]
    }
  ]
}