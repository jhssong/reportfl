{
  "filepath": "/tmp/Math-57b/src/main/java/org/apache/commons/math/geometry/Vector3DFormat.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Vector3DFormat",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 41,
      "end_line": 290,
      "comment": "\n * Formats a 3D vector in components list format \"{x; y; z}\".\n * \u003cp\u003eThe prefix and suffix \"{\" and \"}\" and the separator \"; \" can be replaced by\n * any user-defined strings. The number format for components can be configured.\u003c/p\u003e\n * \u003cp\u003eWhite space is ignored at parse time, even if it is in the prefix, suffix\n * or separator specifications. So even if the default separator does include a space\n * character that is used at format time, both input string \"{1;1;1}\" and\n * \" { 1 ; 1 ; 1 } \" will be parsed without error and the same vector will be\n * returned. In the second case, however, the parse position after parsing will be\n * just after the closing curly brace, i.e. just before the trailing space.\u003c/p\u003e\n *\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 43,
      "end_line": 43,
      "comment": " Serializable version identifier "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_PREFIX"
      ],
      "begin_line": 45,
      "end_line": 45,
      "comment": " The default prefix: \"{\". "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_SUFFIX"
      ],
      "begin_line": 47,
      "end_line": 47,
      "comment": " The default suffix: \"}\". "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_SEPARATOR"
      ],
      "begin_line": 49,
      "end_line": 49,
      "comment": " The default separator: \", \". "
    },
    {
      "type": "field",
      "varNames": [
        "prefix"
      ],
      "begin_line": 51,
      "end_line": 51,
      "comment": " Prefix. "
    },
    {
      "type": "field",
      "varNames": [
        "suffix"
      ],
      "begin_line": 53,
      "end_line": 53,
      "comment": " Suffix. "
    },
    {
      "type": "field",
      "varNames": [
        "separator"
      ],
      "begin_line": 55,
      "end_line": 55,
      "comment": " Separator. "
    },
    {
      "type": "field",
      "varNames": [
        "trimmedPrefix"
      ],
      "begin_line": 57,
      "end_line": 57,
      "comment": " Trimmed prefix. "
    },
    {
      "type": "field",
      "varNames": [
        "trimmedSuffix"
      ],
      "begin_line": 59,
      "end_line": 59,
      "comment": " Trimmed suffix. "
    },
    {
      "type": "field",
      "varNames": [
        "trimmedSeparator"
      ],
      "begin_line": 61,
      "end_line": 61,
      "comment": " Trimmed separator. "
    },
    {
      "type": "field",
      "varNames": [
        "format"
      ],
      "begin_line": 63,
      "end_line": 63,
      "comment": " The format used for components. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.geometry.Vector3DFormat.Vector3DFormat()",
      "begin_line": 70,
      "end_line": 73,
      "comment": "\n     * Create an instance with default settings.\n     * \u003cp\u003eThe instance uses the default prefix, suffix and separator:\n     * \"{\", \"}\", and \"; \" and the default number format for components.\u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 71,col 9)-(line 72,col 55)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.geometry.Vector3DFormat.Vector3DFormat(java.text.NumberFormat)",
      "begin_line": 79,
      "end_line": 81,
      "comment": "\n     * Create an instance with a custom number format for components.\n     * @param format the custom format for components.\n     ",
      "child_ranges": [
        "(line 80,col 9)-(line 80,col 72)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.geometry.Vector3DFormat.Vector3DFormat(java.lang.String, java.lang.String, java.lang.String)",
      "begin_line": 89,
      "end_line": 92,
      "comment": "\n     * Create an instance with custom prefix, suffix and separator.\n     * @param prefix prefix to use instead of the default \"{\"\n     * @param suffix suffix to use instead of the default \"}\"\n     * @param separator separator to use instead of the default \"; \"\n     ",
      "child_ranges": [
        "(line 91,col 9)-(line 91,col 82)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.geometry.Vector3DFormat.Vector3DFormat(java.lang.String, java.lang.String, java.lang.String, java.text.NumberFormat)",
      "begin_line": 102,
      "end_line": 111,
      "comment": "\n     * Create an instance with custom prefix, suffix, separator and format\n     * for components.\n     * @param prefix prefix to use instead of the default \"{\"\n     * @param suffix suffix to use instead of the default \"}\"\n     * @param separator separator to use instead of the default \"; \"\n     * @param format the custom format for components.\n     ",
      "child_ranges": [
        "(line 104,col 9)-(line 104,col 34)",
        "(line 105,col 9)-(line 105,col 34)",
        "(line 106,col 9)-(line 106,col 37)",
        "(line 107,col 9)-(line 107,col 41)",
        "(line 108,col 9)-(line 108,col 41)",
        "(line 109,col 9)-(line 109,col 44)",
        "(line 110,col 9)-(line 110,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.Vector3DFormat.getAvailableLocales()",
      "begin_line": 118,
      "end_line": 120,
      "comment": "\n     * Get the set of locales for which 3D vectors formats are available.\n     * \u003cp\u003eThis is the same set as the {@link NumberFormat} set.\u003c/p\u003e\n     * @return available 3D vector format locales.\n     ",
      "child_ranges": [
        "(line 119,col 9)-(line 119,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.Vector3DFormat.getPrefix()",
      "begin_line": 126,
      "end_line": 128,
      "comment": "\n     * Get the format prefix.\n     * @return format prefix.\n     ",
      "child_ranges": [
        "(line 127,col 9)-(line 127,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.Vector3DFormat.getSuffix()",
      "begin_line": 134,
      "end_line": 136,
      "comment": "\n     * Get the format suffix.\n     * @return format suffix.\n     ",
      "child_ranges": [
        "(line 135,col 9)-(line 135,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.Vector3DFormat.getSeparator()",
      "begin_line": 142,
      "end_line": 144,
      "comment": "\n     * Get the format separator between components.\n     * @return format separator.\n     ",
      "child_ranges": [
        "(line 143,col 9)-(line 143,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.Vector3DFormat.getFormat()",
      "begin_line": 150,
      "end_line": 152,
      "comment": "\n     * Get the components format.\n     * @return components format.\n     ",
      "child_ranges": [
        "(line 151,col 9)-(line 151,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.Vector3DFormat.getInstance()",
      "begin_line": 158,
      "end_line": 160,
      "comment": "\n     * Returns the default 3D vector format for the current locale.\n     * @return the default 3D vector format.\n     ",
      "child_ranges": [
        "(line 159,col 9)-(line 159,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.Vector3DFormat.getInstance(java.util.Locale)",
      "begin_line": 167,
      "end_line": 169,
      "comment": "\n     * Returns the default 3D vector format for the given locale.\n     * @param locale the specific locale used by the format.\n     * @return the 3D vector format specific to the given locale.\n     ",
      "child_ranges": [
        "(line 168,col 9)-(line 168,col 82)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.Vector3DFormat.format(org.apache.commons.math.geometry.Vector3D)",
      "begin_line": 177,
      "end_line": 179,
      "comment": "\n     * This method calls {@link #format(Vector3D,StringBuffer,FieldPosition)}.\n     *\n     * @param v Vector3D object to format.\n     * @return a formatted vector.\n     ",
      "child_ranges": [
        "(line 178,col 9)-(line 178,col 78)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.Vector3DFormat.format(org.apache.commons.math.geometry.Vector3D, java.lang.StringBuffer, java.text.FieldPosition)",
      "begin_line": 189,
      "end_line": 209,
      "comment": "\n     * Formats a {@link Vector3D} object to produce a string.\n     * @param vector the object to format.\n     * @param toAppendTo where the text is to be appended\n     * @param pos On input: an alignment field, if desired. On output: the\n     *            offsets of the alignment field\n     * @return the value passed in as toAppendTo.\n     ",
      "child_ranges": [
        "(line 192,col 9)-(line 192,col 29)",
        "(line 193,col 9)-(line 193,col 27)",
        "(line 196,col 9)-(line 196,col 34)",
        "(line 199,col 9)-(line 199,col 77)",
        "(line 200,col 9)-(line 200,col 37)",
        "(line 201,col 9)-(line 201,col 77)",
        "(line 202,col 9)-(line 202,col 37)",
        "(line 203,col 9)-(line 203,col 77)",
        "(line 206,col 9)-(line 206,col 34)",
        "(line 208,col 9)-(line 208,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.Vector3DFormat.parse(java.lang.String)",
      "begin_line": 218,
      "end_line": 227,
      "comment": "\n     * Parses a string to produce a {@link Vector3D} object.\n     * @param source the string to parse\n     * @return the parsed {@link Vector3D} object.\n     * @throws MathParseException if the beginning of the specified string\n     * cannot be parsed.\n     ",
      "child_ranges": [
        "(line 219,col 9)-(line 219,col 59)",
        "(line 220,col 9)-(line 220,col 55)",
        "(line 221,col 9)-(line 225,col 9)",
        "(line 226,col 9)-(line 226,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.Vector3DFormat.parse(java.lang.String, java.text.ParsePosition)",
      "begin_line": 235,
      "end_line": 289,
      "comment": "\n     * Parses a string to produce a {@link Vector3D} object.\n     * @param source the string to parse\n     * @param pos input/ouput parsing parameter.\n     * @return the parsed {@link Vector3D} object.\n     ",
      "child_ranges": [
        "(line 236,col 9)-(line 236,col 42)",
        "(line 239,col 9)-(line 239,col 62)",
        "(line 240,col 9)-(line 242,col 9)",
        "(line 245,col 9)-(line 245,col 62)",
        "(line 246,col 9)-(line 246,col 68)",
        "(line 247,col 9)-(line 252,col 9)",
        "(line 255,col 9)-(line 255,col 62)",
        "(line 256,col 9)-(line 258,col 9)",
        "(line 259,col 9)-(line 259,col 62)",
        "(line 260,col 9)-(line 260,col 68)",
        "(line 261,col 9)-(line 266,col 9)",
        "(line 269,col 9)-(line 269,col 62)",
        "(line 270,col 9)-(line 272,col 9)",
        "(line 273,col 9)-(line 273,col 62)",
        "(line 274,col 9)-(line 274,col 68)",
        "(line 275,col 9)-(line 280,col 9)",
        "(line 283,col 9)-(line 283,col 62)",
        "(line 284,col 9)-(line 286,col 9)",
        "(line 288,col 9)-(line 288,col 79)"
      ]
    }
  ]
}