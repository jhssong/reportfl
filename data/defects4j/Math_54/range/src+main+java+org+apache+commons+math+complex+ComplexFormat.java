{
  "filepath": "/tmp/Math-54b/src/main/java/org/apache/commons/math/complex/ComplexFormat.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ComplexFormat",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 39,
      "end_line": 365,
      "comment": "\n * Formats a Complex number in cartesian format \"Re(c) + Im(c)i\".  \u0027i\u0027 can\n * be replaced with \u0027j\u0027 (or anything else), and the number format for both real\n * and imaginary parts can be configured.\n *\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 41,
      "end_line": 41,
      "comment": " Serializable version identifier "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_IMAGINARY_CHARACTER"
      ],
      "begin_line": 43,
      "end_line": 43,
      "comment": " The default imaginary character. "
    },
    {
      "type": "field",
      "varNames": [
        "imaginaryCharacter"
      ],
      "begin_line": 45,
      "end_line": 45,
      "comment": " The notation used to signify the imaginary part of the complex number. "
    },
    {
      "type": "field",
      "varNames": [
        "imaginaryFormat"
      ],
      "begin_line": 47,
      "end_line": 47,
      "comment": " The format used for the imaginary part. "
    },
    {
      "type": "field",
      "varNames": [
        "realFormat"
      ],
      "begin_line": 49,
      "end_line": 49,
      "comment": " The format used for the real part. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.complex.ComplexFormat.ComplexFormat()",
      "begin_line": 55,
      "end_line": 57,
      "comment": "\n     * Create an instance with the default imaginary character, \u0027i\u0027, and the\n     * default number format for both real and imaginary parts.\n     ",
      "child_ranges": [
        "(line 56,col 9)-(line 56,col 84)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.complex.ComplexFormat.ComplexFormat(java.text.NumberFormat)",
      "begin_line": 64,
      "end_line": 66,
      "comment": "\n     * Create an instance with a custom number format for both real and\n     * imaginary parts.\n     * @param format the custom format for both real and imaginary parts.\n     ",
      "child_ranges": [
        "(line 65,col 9)-(line 65,col 50)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.complex.ComplexFormat.ComplexFormat(java.text.NumberFormat, java.text.NumberFormat)",
      "begin_line": 74,
      "end_line": 76,
      "comment": "\n     * Create an instance with a custom number format for the real part and a\n     * custom number format for the imaginary part.\n     * @param realFormat the custom format for the real part.\n     * @param imaginaryFormat the custom format for the imaginary part.\n     ",
      "child_ranges": [
        "(line 75,col 9)-(line 75,col 71)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.complex.ComplexFormat.ComplexFormat(java.lang.String)",
      "begin_line": 83,
      "end_line": 85,
      "comment": "\n     * Create an instance with a custom imaginary character, and the default\n     * number format for both real and imaginary parts.\n     * @param imaginaryCharacter The custom imaginary character.\n     ",
      "child_ranges": [
        "(line 84,col 9)-(line 84,col 75)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.complex.ComplexFormat.ComplexFormat(java.lang.String, java.text.NumberFormat)",
      "begin_line": 93,
      "end_line": 95,
      "comment": "\n     * Create an instance with a custom imaginary character, and a custom number\n     * format for both real and imaginary parts.\n     * @param imaginaryCharacter The custom imaginary character.\n     * @param format the custom format for both real and imaginary parts.\n     ",
      "child_ranges": [
        "(line 94,col 9)-(line 94,col 49)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.complex.ComplexFormat.ComplexFormat(java.lang.String, java.text.NumberFormat, java.text.NumberFormat)",
      "begin_line": 112,
      "end_line": 131,
      "comment": "\n     * Create an instance with a custom imaginary character, a custom number\n     * format for the real part, and a custom number format for the imaginary\n     * part.\n     *\n     * @param imaginaryCharacter The custom imaginary character.\n     * @param realFormat the custom format for the real part.\n     * @param imaginaryFormat the custom format for the imaginary part.\n     * @throws NullArgumentException if {@code imaginaryCharacter} is\n     * {@code null}.\n     * @throws NoDataException if {@code imaginaryCharacter} is an\n     * empty string.\n     * @throws NullArgumentException if {@code imaginaryFormat} is {@code null}.\n     * @throws NullArgumentException if {@code realFormat} is {@code null}.\n     ",
      "child_ranges": [
        "(line 115,col 9)-(line 117,col 9)",
        "(line 118,col 9)-(line 120,col 9)",
        "(line 121,col 9)-(line 123,col 9)",
        "(line 124,col 9)-(line 126,col 9)",
        "(line 128,col 9)-(line 128,col 53)",
        "(line 129,col 9)-(line 129,col 47)",
        "(line 130,col 9)-(line 130,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.complex.ComplexFormat.getAvailableLocales()",
      "begin_line": 138,
      "end_line": 140,
      "comment": "\n     * Get the set of locales for which complex formats are available.\n     * \u003cp\u003eThis is the same set as the {@link NumberFormat} set.\u003c/p\u003e\n     * @return available complex format locales.\n     ",
      "child_ranges": [
        "(line 139,col 9)-(line 139,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.complex.ComplexFormat.format(org.apache.commons.math.complex.Complex)",
      "begin_line": 148,
      "end_line": 150,
      "comment": "\n     * This method calls {@link #format(Object,StringBuffer,FieldPosition)}.\n     *\n     * @param c Complex object to format.\n     * @return A formatted number in the form \"Re(c) + Im(c)i\".\n     ",
      "child_ranges": [
        "(line 149,col 9)-(line 149,col 78)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.complex.ComplexFormat.format(java.lang.Double)",
      "begin_line": 158,
      "end_line": 160,
      "comment": "\n     * This method calls {@link #format(Object,StringBuffer,FieldPosition)}.\n     *\n     * @param c Double object to format.\n     * @return A formatted number.\n     ",
      "child_ranges": [
        "(line 159,col 9)-(line 159,col 94)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.complex.ComplexFormat.format(org.apache.commons.math.complex.Complex, java.lang.StringBuffer, java.text.FieldPosition)",
      "begin_line": 171,
      "end_line": 193,
      "comment": "\n     * Formats a {@link Complex} object to produce a string.\n     *\n     * @param complex the object to format.\n     * @param toAppendTo where the text is to be appended\n     * @param pos On input: an alignment field, if desired. On output: the\n     *            offsets of the alignment field\n     * @return the value passed in as toAppendTo.\n     ",
      "child_ranges": [
        "(line 173,col 9)-(line 173,col 29)",
        "(line 174,col 9)-(line 174,col 27)",
        "(line 177,col 9)-(line 177,col 38)",
        "(line 178,col 9)-(line 178,col 75)",
        "(line 181,col 9)-(line 181,col 43)",
        "(line 182,col 9)-(line 190,col 9)",
        "(line 192,col 9)-(line 192,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.complex.ComplexFormat.format(java.lang.Object, java.lang.StringBuffer, java.text.FieldPosition)",
      "begin_line": 208,
      "end_line": 224,
      "comment": "\n     * Formats a object to produce a string.  {@code obj} must be either a\n     * {@link Complex} object or a {@link Number} object.  Any other type of\n     * object will result in an {@link IllegalArgumentException} being thrown.\n     *\n     * @param obj the object to format.\n     * @param toAppendTo where the text is to be appended\n     * @param pos On input: an alignment field, if desired. On output: the\n     *            offsets of the alignment field\n     * @return the value passed in as toAppendTo.\n     * @see java.text.Format#format(java.lang.Object, java.lang.StringBuffer, java.text.FieldPosition)\n     * @throws IllegalArgumentException is {@code obj} is not a valid type.\n     ",
      "child_ranges": [
        "(line 211,col 9)-(line 211,col 32)",
        "(line 213,col 9)-(line 221,col 9)",
        "(line 223,col 9)-(line 223,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.complex.ComplexFormat.getImaginaryCharacter()",
      "begin_line": 230,
      "end_line": 232,
      "comment": "\n     * Access the imaginaryCharacter.\n     * @return the imaginaryCharacter.\n     ",
      "child_ranges": [
        "(line 231,col 9)-(line 231,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.complex.ComplexFormat.getImaginaryFormat()",
      "begin_line": 238,
      "end_line": 240,
      "comment": "\n     * Access the imaginaryFormat.\n     * @return the imaginaryFormat.\n     ",
      "child_ranges": [
        "(line 239,col 9)-(line 239,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.complex.ComplexFormat.getInstance()",
      "begin_line": 246,
      "end_line": 248,
      "comment": "\n     * Returns the default complex format for the current locale.\n     * @return the default complex format.\n     ",
      "child_ranges": [
        "(line 247,col 9)-(line 247,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.complex.ComplexFormat.getInstance(java.util.Locale)",
      "begin_line": 255,
      "end_line": 258,
      "comment": "\n     * Returns the default complex format for the given locale.\n     * @param locale the specific locale used by the format.\n     * @return the complex format specific to the given locale.\n     ",
      "child_ranges": [
        "(line 256,col 9)-(line 256,col 72)",
        "(line 257,col 9)-(line 257,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.complex.ComplexFormat.getInstance(java.lang.String, java.util.Locale)",
      "begin_line": 266,
      "end_line": 270,
      "comment": "\n     * Returns the default complex format for the given locale.\n     * @param locale the specific locale used by the format.\n     * @param imaginaryCharacter Imaginary character.\n     * @return the complex format specific to the given locale.\n     ",
      "child_ranges": [
        "(line 268,col 9)-(line 268,col 72)",
        "(line 269,col 9)-(line 269,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.complex.ComplexFormat.getRealFormat()",
      "begin_line": 276,
      "end_line": 278,
      "comment": "\n     * Access the realFormat.\n     * @return the realFormat.\n     ",
      "child_ranges": [
        "(line 277,col 9)-(line 277,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.complex.ComplexFormat.parse(java.lang.String)",
      "begin_line": 288,
      "end_line": 297,
      "comment": "\n     * Parses a string to produce a {@link Complex} object.\n     *\n     * @param source the string to parse.\n     * @return the parsed {@link Complex} object.\n     * @throws MathParseException if the beginning of the specified string\n     * cannot be parsed.\n     ",
      "child_ranges": [
        "(line 289,col 9)-(line 289,col 59)",
        "(line 290,col 9)-(line 290,col 54)",
        "(line 291,col 9)-(line 295,col 9)",
        "(line 296,col 9)-(line 296,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.complex.ComplexFormat.parse(java.lang.String, java.text.ParsePosition)",
      "begin_line": 306,
      "end_line": 364,
      "comment": "\n     * Parses a string to produce a {@link Complex} object.\n     *\n     * @param source the string to parse\n     * @param pos input/ouput parsing parameter.\n     * @return the parsed {@link Complex} object.\n     ",
      "child_ranges": [
        "(line 307,col 9)-(line 307,col 42)",
        "(line 310,col 9)-(line 310,col 62)",
        "(line 313,col 9)-(line 313,col 78)",
        "(line 314,col 9)-(line 319,col 9)",
        "(line 322,col 9)-(line 322,col 40)",
        "(line 323,col 9)-(line 323,col 65)",
        "(line 324,col 9)-(line 324,col 21)",
        "(line 325,col 9)-(line 343,col 9)",
        "(line 346,col 9)-(line 346,col 62)",
        "(line 349,col 9)-(line 349,col 78)",
        "(line 350,col 9)-(line 355,col 9)",
        "(line 358,col 9)-(line 360,col 9)",
        "(line 362,col 9)-(line 362,col 70)"
      ]
    }
  ]
}