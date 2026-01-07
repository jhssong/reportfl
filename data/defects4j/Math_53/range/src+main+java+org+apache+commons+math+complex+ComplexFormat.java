{
  "filepath": "/tmp/Math-53b/src/main/java/org/apache/commons/math/complex/ComplexFormat.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ComplexFormat",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 39,
      "end_line": 364,
      "comment": "\n * Formats a Complex number in cartesian format \"Re(c) + Im(c)i\".  \u0027i\u0027 can\n * be replaced with \u0027j\u0027 (or anything else), and the number format for both real\n * and imaginary parts can be configured.\n *\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_IMAGINARY_CHARACTER"
      ],
      "begin_line": 42,
      "end_line": 42,
      "comment": " The default imaginary character. "
    },
    {
      "type": "field",
      "varNames": [
        "imaginaryCharacter"
      ],
      "begin_line": 44,
      "end_line": 44,
      "comment": " The notation used to signify the imaginary part of the complex number. "
    },
    {
      "type": "field",
      "varNames": [
        "imaginaryFormat"
      ],
      "begin_line": 46,
      "end_line": 46,
      "comment": " The format used for the imaginary part. "
    },
    {
      "type": "field",
      "varNames": [
        "realFormat"
      ],
      "begin_line": 48,
      "end_line": 48,
      "comment": " The format used for the real part. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.complex.ComplexFormat.ComplexFormat()",
      "begin_line": 54,
      "end_line": 56,
      "comment": "\n     * Create an instance with the default imaginary character, \u0027i\u0027, and the\n     * default number format for both real and imaginary parts.\n     ",
      "child_ranges": [
        "(line 55,col 9)-(line 55,col 84)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.complex.ComplexFormat.ComplexFormat(java.text.NumberFormat)",
      "begin_line": 63,
      "end_line": 65,
      "comment": "\n     * Create an instance with a custom number format for both real and\n     * imaginary parts.\n     * @param format the custom format for both real and imaginary parts.\n     ",
      "child_ranges": [
        "(line 64,col 9)-(line 64,col 50)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.complex.ComplexFormat.ComplexFormat(java.text.NumberFormat, java.text.NumberFormat)",
      "begin_line": 73,
      "end_line": 75,
      "comment": "\n     * Create an instance with a custom number format for the real part and a\n     * custom number format for the imaginary part.\n     * @param realFormat the custom format for the real part.\n     * @param imaginaryFormat the custom format for the imaginary part.\n     ",
      "child_ranges": [
        "(line 74,col 9)-(line 74,col 71)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.complex.ComplexFormat.ComplexFormat(java.lang.String)",
      "begin_line": 82,
      "end_line": 84,
      "comment": "\n     * Create an instance with a custom imaginary character, and the default\n     * number format for both real and imaginary parts.\n     * @param imaginaryCharacter The custom imaginary character.\n     ",
      "child_ranges": [
        "(line 83,col 9)-(line 83,col 75)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.complex.ComplexFormat.ComplexFormat(java.lang.String, java.text.NumberFormat)",
      "begin_line": 92,
      "end_line": 94,
      "comment": "\n     * Create an instance with a custom imaginary character, and a custom number\n     * format for both real and imaginary parts.\n     * @param imaginaryCharacter The custom imaginary character.\n     * @param format the custom format for both real and imaginary parts.\n     ",
      "child_ranges": [
        "(line 93,col 9)-(line 93,col 49)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.complex.ComplexFormat.ComplexFormat(java.lang.String, java.text.NumberFormat, java.text.NumberFormat)",
      "begin_line": 111,
      "end_line": 130,
      "comment": "\n     * Create an instance with a custom imaginary character, a custom number\n     * format for the real part, and a custom number format for the imaginary\n     * part.\n     *\n     * @param imaginaryCharacter The custom imaginary character.\n     * @param realFormat the custom format for the real part.\n     * @param imaginaryFormat the custom format for the imaginary part.\n     * @throws NullArgumentException if {@code imaginaryCharacter} is\n     * {@code null}.\n     * @throws NoDataException if {@code imaginaryCharacter} is an\n     * empty string.\n     * @throws NullArgumentException if {@code imaginaryFormat} is {@code null}.\n     * @throws NullArgumentException if {@code realFormat} is {@code null}.\n     ",
      "child_ranges": [
        "(line 114,col 9)-(line 116,col 9)",
        "(line 117,col 9)-(line 119,col 9)",
        "(line 120,col 9)-(line 122,col 9)",
        "(line 123,col 9)-(line 125,col 9)",
        "(line 127,col 9)-(line 127,col 53)",
        "(line 128,col 9)-(line 128,col 47)",
        "(line 129,col 9)-(line 129,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.complex.ComplexFormat.getAvailableLocales()",
      "begin_line": 137,
      "end_line": 139,
      "comment": "\n     * Get the set of locales for which complex formats are available.\n     * \u003cp\u003eThis is the same set as the {@link NumberFormat} set.\u003c/p\u003e\n     * @return available complex format locales.\n     ",
      "child_ranges": [
        "(line 138,col 9)-(line 138,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.complex.ComplexFormat.format(org.apache.commons.math.complex.Complex)",
      "begin_line": 147,
      "end_line": 149,
      "comment": "\n     * This method calls {@link #format(Object,StringBuffer,FieldPosition)}.\n     *\n     * @param c Complex object to format.\n     * @return A formatted number in the form \"Re(c) + Im(c)i\".\n     ",
      "child_ranges": [
        "(line 148,col 9)-(line 148,col 78)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.complex.ComplexFormat.format(java.lang.Double)",
      "begin_line": 157,
      "end_line": 159,
      "comment": "\n     * This method calls {@link #format(Object,StringBuffer,FieldPosition)}.\n     *\n     * @param c Double object to format.\n     * @return A formatted number.\n     ",
      "child_ranges": [
        "(line 158,col 9)-(line 158,col 94)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.complex.ComplexFormat.format(org.apache.commons.math.complex.Complex, java.lang.StringBuffer, java.text.FieldPosition)",
      "begin_line": 170,
      "end_line": 192,
      "comment": "\n     * Formats a {@link Complex} object to produce a string.\n     *\n     * @param complex the object to format.\n     * @param toAppendTo where the text is to be appended\n     * @param pos On input: an alignment field, if desired. On output: the\n     *            offsets of the alignment field\n     * @return the value passed in as toAppendTo.\n     ",
      "child_ranges": [
        "(line 172,col 9)-(line 172,col 29)",
        "(line 173,col 9)-(line 173,col 27)",
        "(line 176,col 9)-(line 176,col 38)",
        "(line 177,col 9)-(line 177,col 75)",
        "(line 180,col 9)-(line 180,col 43)",
        "(line 181,col 9)-(line 189,col 9)",
        "(line 191,col 9)-(line 191,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.complex.ComplexFormat.format(java.lang.Object, java.lang.StringBuffer, java.text.FieldPosition)",
      "begin_line": 207,
      "end_line": 223,
      "comment": "\n     * Formats a object to produce a string.  {@code obj} must be either a\n     * {@link Complex} object or a {@link Number} object.  Any other type of\n     * object will result in an {@link IllegalArgumentException} being thrown.\n     *\n     * @param obj the object to format.\n     * @param toAppendTo where the text is to be appended\n     * @param pos On input: an alignment field, if desired. On output: the\n     *            offsets of the alignment field\n     * @return the value passed in as toAppendTo.\n     * @see java.text.Format#format(java.lang.Object, java.lang.StringBuffer, java.text.FieldPosition)\n     * @throws IllegalArgumentException is {@code obj} is not a valid type.\n     ",
      "child_ranges": [
        "(line 210,col 9)-(line 210,col 32)",
        "(line 212,col 9)-(line 220,col 9)",
        "(line 222,col 9)-(line 222,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.complex.ComplexFormat.getImaginaryCharacter()",
      "begin_line": 229,
      "end_line": 231,
      "comment": "\n     * Access the imaginaryCharacter.\n     * @return the imaginaryCharacter.\n     ",
      "child_ranges": [
        "(line 230,col 9)-(line 230,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.complex.ComplexFormat.getImaginaryFormat()",
      "begin_line": 237,
      "end_line": 239,
      "comment": "\n     * Access the imaginaryFormat.\n     * @return the imaginaryFormat.\n     ",
      "child_ranges": [
        "(line 238,col 9)-(line 238,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.complex.ComplexFormat.getInstance()",
      "begin_line": 245,
      "end_line": 247,
      "comment": "\n     * Returns the default complex format for the current locale.\n     * @return the default complex format.\n     ",
      "child_ranges": [
        "(line 246,col 9)-(line 246,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.complex.ComplexFormat.getInstance(java.util.Locale)",
      "begin_line": 254,
      "end_line": 257,
      "comment": "\n     * Returns the default complex format for the given locale.\n     * @param locale the specific locale used by the format.\n     * @return the complex format specific to the given locale.\n     ",
      "child_ranges": [
        "(line 255,col 9)-(line 255,col 72)",
        "(line 256,col 9)-(line 256,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.complex.ComplexFormat.getInstance(java.lang.String, java.util.Locale)",
      "begin_line": 265,
      "end_line": 269,
      "comment": "\n     * Returns the default complex format for the given locale.\n     * @param locale the specific locale used by the format.\n     * @param imaginaryCharacter Imaginary character.\n     * @return the complex format specific to the given locale.\n     ",
      "child_ranges": [
        "(line 267,col 9)-(line 267,col 72)",
        "(line 268,col 9)-(line 268,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.complex.ComplexFormat.getRealFormat()",
      "begin_line": 275,
      "end_line": 277,
      "comment": "\n     * Access the realFormat.\n     * @return the realFormat.\n     ",
      "child_ranges": [
        "(line 276,col 9)-(line 276,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.complex.ComplexFormat.parse(java.lang.String)",
      "begin_line": 287,
      "end_line": 296,
      "comment": "\n     * Parses a string to produce a {@link Complex} object.\n     *\n     * @param source the string to parse.\n     * @return the parsed {@link Complex} object.\n     * @throws MathParseException if the beginning of the specified string\n     * cannot be parsed.\n     ",
      "child_ranges": [
        "(line 288,col 9)-(line 288,col 59)",
        "(line 289,col 9)-(line 289,col 54)",
        "(line 290,col 9)-(line 294,col 9)",
        "(line 295,col 9)-(line 295,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.complex.ComplexFormat.parse(java.lang.String, java.text.ParsePosition)",
      "begin_line": 305,
      "end_line": 363,
      "comment": "\n     * Parses a string to produce a {@link Complex} object.\n     *\n     * @param source the string to parse\n     * @param pos input/ouput parsing parameter.\n     * @return the parsed {@link Complex} object.\n     ",
      "child_ranges": [
        "(line 306,col 9)-(line 306,col 42)",
        "(line 309,col 9)-(line 309,col 62)",
        "(line 312,col 9)-(line 312,col 78)",
        "(line 313,col 9)-(line 318,col 9)",
        "(line 321,col 9)-(line 321,col 40)",
        "(line 322,col 9)-(line 322,col 65)",
        "(line 323,col 9)-(line 323,col 21)",
        "(line 324,col 9)-(line 342,col 9)",
        "(line 345,col 9)-(line 345,col 62)",
        "(line 348,col 9)-(line 348,col 78)",
        "(line 349,col 9)-(line 354,col 9)",
        "(line 357,col 9)-(line 359,col 9)",
        "(line 361,col 9)-(line 361,col 70)"
      ]
    }
  ]
}