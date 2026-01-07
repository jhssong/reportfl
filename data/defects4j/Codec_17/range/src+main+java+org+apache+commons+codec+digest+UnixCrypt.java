{
  "filepath": "/tmp/Codec-17b/src/main/java/org/apache/commons/codec/digest/UnixCrypt.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "UnixCrypt",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 40,
      "end_line": 413,
      "comment": "\n * Unix crypt(3) algorithm implementation.\n * \u003cp\u003e\n * This class only implements the traditional 56 bit DES based algorithm. Please use DigestUtils.crypt() for a method\n * that distinguishes between all the algorithms supported in the current glibc\u0027s crypt().\n * \u003cp\u003e\n * The Java implementation was taken from the JetSpeed Portal project (see\n * org.apache.jetspeed.services.security.ldap.UnixCrypt).\n * \u003cp\u003e\n * This class is slightly incompatible if the given salt contains characters that are not part of the allowed range\n * [a-zA-Z0-9./].\n * \u003cp\u003e\n * This class is immutable and thread-safe.\n *\n * @version $Id$\n * @since 1.7\n "
    },
    {
      "type": "field",
      "varNames": [
        "CON_SALT"
      ],
      "begin_line": 42,
      "end_line": 46,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "COV2CHAR"
      ],
      "begin_line": 48,
      "end_line": 50,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "SALT_CHARS"
      ],
      "begin_line": 52,
      "end_line": 53,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "SHIFT2"
      ],
      "begin_line": 55,
      "end_line": 56,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "SKB"
      ],
      "begin_line": 58,
      "end_line": 115,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "SPTRANS"
      ],
      "begin_line": 117,
      "end_line": 170,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.UnixCrypt.crypt(byte[])",
      "begin_line": 181,
      "end_line": 183,
      "comment": "\n     * Generates a crypt(3) compatible hash using the DES algorithm.\n     * \u003cp\u003e\n     * As no salt is given, a random one will be used.\n     *\n     * @param original\n     *            plaintext password\n     * @return a 13 character string starting with the salt string\n     ",
      "child_ranges": [
        "(line 182,col 9)-(line 182,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.UnixCrypt.crypt(byte[], java.lang.String)",
      "begin_line": 198,
      "end_line": 251,
      "comment": "\n     * Generates a crypt(3) compatible hash using the DES algorithm.\n     * \u003cp\u003e\n     * Using unspecified characters as salt results incompatible hash values.\n     *\n     * @param original\n     *            plaintext password\n     * @param salt\n     *            a two character string drawn from [a-zA-Z0-9./] or null for a random one\n     * @return a 13 character string starting with the salt string\n     * @throws IllegalArgumentException\n     *             if the salt does not match the allowed pattern\n     ",
      "child_ranges": [
        "(line 199,col 9)-(line 206,col 9)",
        "(line 208,col 9)-(line 208,col 72)",
        "(line 209,col 9)-(line 209,col 45)",
        "(line 210,col 9)-(line 210,col 44)",
        "(line 211,col 9)-(line 211,col 38)",
        "(line 212,col 9)-(line 212,col 37)",
        "(line 213,col 9)-(line 213,col 46)",
        "(line 214,col 9)-(line 214,col 50)",
        "(line 215,col 9)-(line 215,col 39)",
        "(line 216,col 9)-(line 218,col 9)",
        "(line 220,col 9)-(line 223,col 9)",
        "(line 225,col 9)-(line 225,col 46)",
        "(line 226,col 9)-(line 226,col 57)",
        "(line 227,col 9)-(line 227,col 37)",
        "(line 228,col 9)-(line 228,col 37)",
        "(line 229,col 9)-(line 229,col 37)",
        "(line 230,col 9)-(line 230,col 17)",
        "(line 231,col 9)-(line 231,col 18)",
        "(line 232,col 9)-(line 232,col 18)",
        "(line 233,col 9)-(line 233,col 20)",
        "(line 234,col 9)-(line 249,col 9)",
        "(line 250,col 9)-(line 250,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.UnixCrypt.crypt(java.lang.String)",
      "begin_line": 262,
      "end_line": 264,
      "comment": "\n     * Generates a crypt(3) compatible hash using the DES algorithm.\n     * \u003cp\u003e\n     * As no salt is given, a random one is used.\n     *\n     * @param original\n     *            plaintext password\n     * @return a 13 character string starting with the salt string\n     ",
      "child_ranges": [
        "(line 263,col 9)-(line 263,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.UnixCrypt.crypt(java.lang.String, java.lang.String)",
      "begin_line": 277,
      "end_line": 279,
      "comment": "\n     * Generates a crypt(3) compatible hash using the DES algorithm.\n     *\n     * @param original\n     *            plaintext password\n     * @param salt\n     *            a two character string drawn from [a-zA-Z0-9./] or null for a random one\n     * @return a 13 character string starting with the salt string\n     * @throws IllegalArgumentException\n     *             if the salt does not match the allowed pattern\n     ",
      "child_ranges": [
        "(line 278,col 9)-(line 278,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.UnixCrypt.body(int[], int, int)",
      "begin_line": 281,
      "end_line": 318,
      "comment": "",
      "child_ranges": [
        "(line 282,col 9)-(line 282,col 21)",
        "(line 283,col 9)-(line 283,col 22)",
        "(line 284,col 9)-(line 284,col 18)",
        "(line 285,col 9)-(line 293,col 9)",
        "(line 295,col 9)-(line 295,col 18)",
        "(line 296,col 9)-(line 296,col 40)",
        "(line 297,col 9)-(line 297,col 33)",
        "(line 298,col 9)-(line 298,col 41)",
        "(line 299,col 9)-(line 299,col 52)",
        "(line 300,col 9)-(line 300,col 27)",
        "(line 301,col 9)-(line 301,col 26)",
        "(line 302,col 9)-(line 302,col 50)",
        "(line 303,col 9)-(line 303,col 26)",
        "(line 304,col 9)-(line 304,col 27)",
        "(line 305,col 9)-(line 305,col 52)",
        "(line 306,col 9)-(line 306,col 27)",
        "(line 307,col 9)-(line 307,col 26)",
        "(line 308,col 9)-(line 308,col 48)",
        "(line 309,col 9)-(line 309,col 26)",
        "(line 310,col 9)-(line 310,col 27)",
        "(line 311,col 9)-(line 311,col 51)",
        "(line 312,col 9)-(line 312,col 27)",
        "(line 313,col 9)-(line 313,col 26)",
        "(line 314,col 9)-(line 314,col 37)",
        "(line 315,col 9)-(line 315,col 22)",
        "(line 316,col 9)-(line 316,col 23)",
        "(line 317,col 9)-(line 317,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.UnixCrypt.byteToUnsigned(byte)",
      "begin_line": 320,
      "end_line": 323,
      "comment": "",
      "child_ranges": [
        "(line 321,col 9)-(line 321,col 28)",
        "(line 322,col 9)-(line 322,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.UnixCrypt.dEncrypt(int, int, int, int, int, int[])",
      "begin_line": 325,
      "end_line": 336,
      "comment": "",
      "child_ranges": [
        "(line 326,col 9)-(line 326,col 29)",
        "(line 327,col 9)-(line 327,col 23)",
        "(line 328,col 9)-(line 328,col 16)",
        "(line 329,col 9)-(line 329,col 38)",
        "(line 330,col 9)-(line 330,col 46)",
        "(line 331,col 9)-(line 331,col 30)",
        "(line 332,col 9)-(line 334,col 74)",
        "(line 335,col 9)-(line 335,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.UnixCrypt.desSetKey(byte[])",
      "begin_line": 338,
      "end_line": 382,
      "comment": "",
      "child_ranges": [
        "(line 339,col 9)-(line 339,col 43)",
        "(line 340,col 9)-(line 340,col 39)",
        "(line 341,col 9)-(line 341,col 39)",
        "(line 342,col 9)-(line 342,col 41)",
        "(line 343,col 9)-(line 343,col 44)",
        "(line 344,col 9)-(line 344,col 23)",
        "(line 345,col 9)-(line 345,col 23)",
        "(line 346,col 9)-(line 346,col 39)",
        "(line 347,col 9)-(line 347,col 39)",
        "(line 348,col 9)-(line 348,col 45)",
        "(line 349,col 9)-(line 349,col 23)",
        "(line 350,col 9)-(line 350,col 23)",
        "(line 351,col 9)-(line 351,col 43)",
        "(line 352,col 9)-(line 352,col 23)",
        "(line 353,col 9)-(line 353,col 23)",
        "(line 354,col 9)-(line 354,col 45)",
        "(line 355,col 9)-(line 355,col 23)",
        "(line 356,col 9)-(line 356,col 23)",
        "(line 357,col 9)-(line 357,col 91)",
        "(line 358,col 9)-(line 358,col 23)",
        "(line 359,col 9)-(line 359,col 18)",
        "(line 360,col 9)-(line 379,col 9)",
        "(line 381,col 9)-(line 381,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.UnixCrypt.fourBytesToInt(byte[], int)",
      "begin_line": 384,
      "end_line": 390,
      "comment": "",
      "child_ranges": [
        "(line 385,col 9)-(line 385,col 48)",
        "(line 386,col 9)-(line 386,col 50)",
        "(line 387,col 9)-(line 387,col 51)",
        "(line 388,col 9)-(line 388,col 51)",
        "(line 389,col 9)-(line 389,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.UnixCrypt.hPermOp(int, int, int)",
      "begin_line": 392,
      "end_line": 396,
      "comment": "",
      "child_ranges": [
        "(line 393,col 9)-(line 393,col 44)",
        "(line 394,col 9)-(line 394,col 33)",
        "(line 395,col 9)-(line 395,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.UnixCrypt.intToFourBytes(int, byte[], int)",
      "begin_line": 398,
      "end_line": 403,
      "comment": "",
      "child_ranges": [
        "(line 399,col 9)-(line 399,col 45)",
        "(line 400,col 9)-(line 400,col 51)",
        "(line 401,col 9)-(line 401,col 52)",
        "(line 402,col 9)-(line 402,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.UnixCrypt.permOp(int, int, int, int, int[])",
      "begin_line": 405,
      "end_line": 411,
      "comment": "",
      "child_ranges": [
        "(line 406,col 9)-(line 406,col 40)",
        "(line 407,col 9)-(line 407,col 20)",
        "(line 408,col 9)-(line 408,col 15)",
        "(line 409,col 9)-(line 409,col 23)",
        "(line 410,col 9)-(line 410,col 23)"
      ]
    }
  ]
}