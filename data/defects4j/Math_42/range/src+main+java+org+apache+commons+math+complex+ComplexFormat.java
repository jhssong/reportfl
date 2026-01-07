{
  "filepath": "/tmp/Math-42b/src/main/java/org/apache/commons/math/complex/ComplexFormat.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ComplexFormat",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 40,
      "end_line": 397,
      "comment": "\n * Formats a Complex number in cartesian format \"Re(c) + Im(c)i\".  \u0027i\u0027 can\n * be replaced with \u0027j\u0027 (or anything else), and the number format for both real\n * and imaginary parts can be configured.\n *\n * @version $Id$\n "
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
      "end_line": 196,
      "comment": "\n     * Formats a {@link Complex} object to produce a string.\n     *\n     * @param complex the object to format.\n     * @param toAppendTo where the text is to be appended\n     * @param pos On input: an alignment field, if desired. On output: the\n     *            offsets of the alignment field\n     * @return the value passed in as toAppendTo.\n     ",
      "child_ranges": [
        "(line 173,col 9)-(line 173,col 29)",
        "(line 174,col 9)-(line 174,col 27)",
        "(line 177,col 9)-(line 177,col 38)",
        "(line 178,col 9)-(line 178,col 75)",
        "(line 181,col 9)-(line 181,col 43)",
        "(line 182,col 9)-(line 182,col 53)",
        "(line 183,col 9)-(line 193,col 9)",
        "(line 195,col 9)-(line 195,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.complex.ComplexFormat.formatImaginary(double, java.lang.StringBuffer, java.text.FieldPosition)",
      "begin_line": 208,
      "end_line": 225,
      "comment": "\n     * Format the absolute value of the imaginary part.\n     *\n     * @param absIm Absolute value of the imaginary part of a complex number.\n     * @param toAppendTo where the text is to be appended.\n     * @param pos On input: an alignment field, if desired. On output: the\n     * offsets of the alignment field.\n     * @return the value passed in as toAppendTo.\n     * @throws MathInternalError if {@code absIm} is not positive.\n     ",
      "child_ranges": [
        "(line 211,col 9)-(line 213,col 9)",
        "(line 215,col 9)-(line 215,col 29)",
        "(line 216,col 9)-(line 216,col 27)",
        "(line 218,col 9)-(line 218,col 83)",
        "(line 219,col 9)-(line 222,col 9)",
        "(line 224,col 9)-(line 224,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.complex.ComplexFormat.format(java.lang.Object, java.lang.StringBuffer, java.text.FieldPosition)",
      "begin_line": 240,
      "end_line": 256,
      "comment": "\n     * Formats a object to produce a string.  {@code obj} must be either a\n     * {@link Complex} object or a {@link Number} object.  Any other type of\n     * object will result in an {@link IllegalArgumentException} being thrown.\n     *\n     * @param obj the object to format.\n     * @param toAppendTo where the text is to be appended\n     * @param pos On input: an alignment field, if desired. On output: the\n     *            offsets of the alignment field\n     * @return the value passed in as toAppendTo.\n     * @see java.text.Format#format(java.lang.Object, java.lang.StringBuffer, java.text.FieldPosition)\n     * @throws IllegalArgumentException is {@code obj} is not a valid type.\n     ",
      "child_ranges": [
        "(line 243,col 9)-(line 243,col 32)",
        "(line 245,col 9)-(line 253,col 9)",
        "(line 255,col 9)-(line 255,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.complex.ComplexFormat.getImaginaryCharacter()",
      "begin_line": 262,
      "end_line": 264,
      "comment": "\n     * Access the imaginaryCharacter.\n     * @return the imaginaryCharacter.\n     ",
      "child_ranges": [
        "(line 263,col 9)-(line 263,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.complex.ComplexFormat.getImaginaryFormat()",
      "begin_line": 270,
      "end_line": 272,
      "comment": "\n     * Access the imaginaryFormat.\n     * @return the imaginaryFormat.\n     ",
      "child_ranges": [
        "(line 271,col 9)-(line 271,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.complex.ComplexFormat.getInstance()",
      "begin_line": 278,
      "end_line": 280,
      "comment": "\n     * Returns the default complex format for the current locale.\n     * @return the default complex format.\n     ",
      "child_ranges": [
        "(line 279,col 9)-(line 279,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.complex.ComplexFormat.getInstance(java.util.Locale)",
      "begin_line": 287,
      "end_line": 290,
      "comment": "\n     * Returns the default complex format for the given locale.\n     * @param locale the specific locale used by the format.\n     * @return the complex format specific to the given locale.\n     ",
      "child_ranges": [
        "(line 288,col 9)-(line 288,col 72)",
        "(line 289,col 9)-(line 289,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.complex.ComplexFormat.getInstance(java.lang.String, java.util.Locale)",
      "begin_line": 298,
      "end_line": 302,
      "comment": "\n     * Returns the default complex format for the given locale.\n     * @param locale the specific locale used by the format.\n     * @param imaginaryCharacter Imaginary character.\n     * @return the complex format specific to the given locale.\n     ",
      "child_ranges": [
        "(line 300,col 9)-(line 300,col 72)",
        "(line 301,col 9)-(line 301,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.complex.ComplexFormat.getRealFormat()",
      "begin_line": 308,
      "end_line": 310,
      "comment": "\n     * Access the realFormat.\n     * @return the realFormat.\n     ",
      "child_ranges": [
        "(line 309,col 9)-(line 309,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.complex.ComplexFormat.parse(java.lang.String)",
      "begin_line": 320,
      "end_line": 329,
      "comment": "\n     * Parses a string to produce a {@link Complex} object.\n     *\n     * @param source the string to parse.\n     * @return the parsed {@link Complex} object.\n     * @throws MathParseException if the beginning of the specified string\n     * cannot be parsed.\n     ",
      "child_ranges": [
        "(line 321,col 9)-(line 321,col 59)",
        "(line 322,col 9)-(line 322,col 54)",
        "(line 323,col 9)-(line 327,col 9)",
        "(line 328,col 9)-(line 328,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.complex.ComplexFormat.parse(java.lang.String, java.text.ParsePosition)",
      "begin_line": 338,
      "end_line": 396,
      "comment": "\n     * Parses a string to produce a {@link Complex} object.\n     *\n     * @param source the string to parse\n     * @param pos input/ouput parsing parameter.\n     * @return the parsed {@link Complex} object.\n     ",
      "child_ranges": [
        "(line 339,col 9)-(line 339,col 42)",
        "(line 342,col 9)-(line 342,col 62)",
        "(line 345,col 9)-(line 345,col 78)",
        "(line 346,col 9)-(line 351,col 9)",
        "(line 354,col 9)-(line 354,col 40)",
        "(line 355,col 9)-(line 355,col 65)",
        "(line 356,col 9)-(line 356,col 21)",
        "(line 357,col 9)-(line 375,col 9)",
        "(line 378,col 9)-(line 378,col 62)",
        "(line 381,col 9)-(line 381,col 78)",
        "(line 382,col 9)-(line 387,col 9)",
        "(line 390,col 9)-(line 392,col 9)",
        "(line 394,col 9)-(line 394,col 70)"
      ]
    }
  ]
}