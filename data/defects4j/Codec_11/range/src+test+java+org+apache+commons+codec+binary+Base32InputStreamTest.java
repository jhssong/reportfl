{
  "filepath": "/tmp/Codec-11b/src/test/java/org/apache/commons/codec/binary/Base32InputStreamTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Base32InputStreamTest",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 33,
      "end_line": 471,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "ENCODED_FOO"
      ],
      "begin_line": 35,
      "end_line": 35,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "CRLF"
      ],
      "begin_line": 37,
      "end_line": 37,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "LF"
      ],
      "begin_line": 39,
      "end_line": 39,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base32InputStreamTest.testCodec105()",
      "begin_line": 44,
      "end_line": 54,
      "comment": "\n     * Tests the bug reported in CODEC-105. Bad interactions with InputStream when reading one byte at a time.\n     ",
      "child_ranges": [
        "(line 46,col 9)-(line 46,col 100)",
        "(line 47,col 9)-(line 53,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base32InputStreamTest.testBase32EmptyInputStreamMimeChuckSize()",
      "begin_line": 128,
      "end_line": 131,
      "comment": "\n     * Tests the Base32InputStream implementation against empty input.\n     * \n     * @throws Exception\n     *             for some failure scenarios.\n     ",
      "child_ranges": [
        "(line 130,col 9)-(line 130,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base32InputStreamTest.testBase32EmptyInputStreamPemChuckSize()",
      "begin_line": 139,
      "end_line": 142,
      "comment": "\n     * Tests the Base32InputStream implementation against empty input.\n     * \n     * @throws Exception\n     *             for some failure scenarios.\n     ",
      "child_ranges": [
        "(line 141,col 9)-(line 141,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base32InputStreamTest.testBase32EmptyInputStream(int)",
      "begin_line": 144,
      "end_line": 149,
      "comment": "",
      "child_ranges": [
        "(line 145,col 9)-(line 145,col 42)",
        "(line 146,col 9)-(line 146,col 42)",
        "(line 147,col 9)-(line 147,col 68)",
        "(line 148,col 9)-(line 148,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base32InputStreamTest.testBase32InputStreamByChunk()",
      "begin_line": 157,
      "end_line": 188,
      "comment": "\n     * Tests the Base32InputStream implementation.\n     * \n     * @throws Exception\n     *             for some failure scenarios.\n     ",
      "child_ranges": [
        "(line 160,col 9)-(line 160,col 81)",
        "(line 161,col 9)-(line 161,col 81)",
        "(line 162,col 9)-(line 162,col 72)",
        "(line 165,col 9)-(line 165,col 59)",
        "(line 166,col 9)-(line 166,col 42)",
        "(line 167,col 9)-(line 167,col 72)",
        "(line 181,col 9)-(line 181,col 40)",
        "(line 182,col 9)-(line 187,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base32InputStreamTest.testBase32InputStreamByteByByte()",
      "begin_line": 196,
      "end_line": 222,
      "comment": "\n     * Tests the Base32InputStream implementation.\n     * \n     * @throws Exception\n     *             for some failure scenarios.\n     ",
      "child_ranges": [
        "(line 199,col 9)-(line 199,col 81)",
        "(line 200,col 9)-(line 200,col 81)",
        "(line 201,col 9)-(line 201,col 75)",
        "(line 204,col 9)-(line 204,col 59)",
        "(line 205,col 9)-(line 205,col 42)",
        "(line 206,col 9)-(line 206,col 75)",
        "(line 215,col 9)-(line 215,col 40)",
        "(line 216,col 9)-(line 221,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base32InputStreamTest.testByChunk(byte[], byte[], int, byte[])",
      "begin_line": 242,
      "end_line": 273,
      "comment": "\n     * Tests method does three tests on the supplied data: 1. encoded ---[DECODE]--\u003e decoded 2. decoded ---[ENCODE]--\u003e encoded 3. decoded\n     * ---[WRAP-WRAP-WRAP-etc...] --\u003e decoded\n     * \u003cp/\u003e\n     * By \"[WRAP-WRAP-WRAP-etc...]\" we mean situation where the Base32InputStream wraps itself in encode and decode mode over and over\n     * again.\n     * \n     * @param encoded\n     *            base32 encoded data\n     * @param decoded\n     *            the data from above, but decoded\n     * @param chunkSize\n     *            chunk size (line-length) of the base32 encoded data.\n     * @param seperator\n     *            Line separator in the base32 encoded data.\n     * @throws Exception\n     *             Usually signifies a bug in the Base32 commons-codec implementation.\n     ",
      "child_ranges": [
        "(line 245,col 9)-(line 245,col 59)",
        "(line 246,col 9)-(line 246,col 67)",
        "(line 247,col 9)-(line 247,col 57)",
        "(line 249,col 9)-(line 249,col 43)",
        "(line 250,col 9)-(line 250,col 49)",
        "(line 251,col 9)-(line 251,col 78)",
        "(line 254,col 9)-(line 254,col 47)",
        "(line 255,col 9)-(line 255,col 39)",
        "(line 256,col 9)-(line 256,col 50)",
        "(line 258,col 9)-(line 258,col 43)",
        "(line 259,col 9)-(line 259,col 49)",
        "(line 260,col 9)-(line 260,col 78)",
        "(line 263,col 9)-(line 263,col 47)",
        "(line 264,col 9)-(line 267,col 9)",
        "(line 268,col 9)-(line 268,col 50)",
        "(line 270,col 9)-(line 270,col 43)",
        "(line 271,col 9)-(line 271,col 49)",
        "(line 272,col 9)-(line 272,col 87)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base32InputStreamTest.testByteByByte(byte[], byte[], int, byte[])",
      "begin_line": 293,
      "end_line": 333,
      "comment": "\n     * Tests method does three tests on the supplied data: 1. encoded ---[DECODE]--\u003e decoded 2. decoded ---[ENCODE]--\u003e encoded 3. decoded\n     * ---[WRAP-WRAP-WRAP-etc...] --\u003e decoded\n     * \u003cp/\u003e\n     * By \"[WRAP-WRAP-WRAP-etc...]\" we mean situation where the Base32InputStream wraps itself in encode and decode mode over and over\n     * again.\n     * \n     * @param encoded\n     *            base32 encoded data\n     * @param decoded\n     *            the data from above, but decoded\n     * @param chunkSize\n     *            chunk size (line-length) of the base32 encoded data.\n     * @param seperator\n     *            Line separator in the base32 encoded data.\n     * @throws Exception\n     *             Usually signifies a bug in the Base32 commons-codec implementation.\n     ",
      "child_ranges": [
        "(line 296,col 9)-(line 296,col 59)",
        "(line 297,col 9)-(line 297,col 67)",
        "(line 298,col 9)-(line 298,col 49)",
        "(line 299,col 9)-(line 301,col 9)",
        "(line 303,col 9)-(line 303,col 43)",
        "(line 304,col 9)-(line 304,col 49)",
        "(line 305,col 9)-(line 305,col 78)",
        "(line 308,col 9)-(line 308,col 47)",
        "(line 309,col 9)-(line 309,col 39)",
        "(line 310,col 9)-(line 310,col 42)",
        "(line 311,col 9)-(line 313,col 9)",
        "(line 315,col 9)-(line 315,col 43)",
        "(line 316,col 9)-(line 316,col 49)",
        "(line 317,col 9)-(line 317,col 78)",
        "(line 320,col 9)-(line 320,col 47)",
        "(line 321,col 9)-(line 324,col 9)",
        "(line 325,col 9)-(line 325,col 42)",
        "(line 326,col 9)-(line 328,col 9)",
        "(line 330,col 9)-(line 330,col 43)",
        "(line 331,col 9)-(line 331,col 49)",
        "(line 332,col 9)-(line 332,col 87)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base32InputStreamTest.testMarkSupported()",
      "begin_line": 340,
      "end_line": 347,
      "comment": "\n     * Tests markSupported.\n     * \n     * @throws Exception\n     ",
      "child_ranges": [
        "(line 342,col 9)-(line 342,col 81)",
        "(line 343,col 9)-(line 343,col 69)",
        "(line 344,col 9)-(line 344,col 91)",
        "(line 346,col 9)-(line 346,col 86)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base32InputStreamTest.testRead0()",
      "begin_line": 354,
      "end_line": 363,
      "comment": "\n     * Tests read returning 0\n     * \n     * @throws Exception\n     ",
      "child_ranges": [
        "(line 356,col 9)-(line 356,col 81)",
        "(line 357,col 9)-(line 357,col 36)",
        "(line 358,col 9)-(line 358,col 26)",
        "(line 359,col 9)-(line 359,col 69)",
        "(line 360,col 9)-(line 360,col 91)",
        "(line 361,col 9)-(line 361,col 39)",
        "(line 362,col 9)-(line 362,col 82)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base32InputStreamTest.testReadNull()",
      "begin_line": 371,
      "end_line": 382,
      "comment": "\n     * Tests read with null.\n     * \n     * @throws Exception\n     *             for some failure scenarios.\n     ",
      "child_ranges": [
        "(line 373,col 9)-(line 373,col 81)",
        "(line 374,col 9)-(line 374,col 69)",
        "(line 375,col 9)-(line 375,col 91)",
        "(line 376,col 9)-(line 381,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base32InputStreamTest.testReadOutOfBounds()",
      "begin_line": 389,
      "end_line": 423,
      "comment": "\n     * Tests read throwing IndexOutOfBoundsException\n     * \n     * @throws Exception\n     ",
      "child_ranges": [
        "(line 391,col 9)-(line 391,col 81)",
        "(line 392,col 9)-(line 392,col 36)",
        "(line 393,col 9)-(line 393,col 69)",
        "(line 394,col 9)-(line 394,col 91)",
        "(line 396,col 9)-(line 401,col 9)",
        "(line 403,col 9)-(line 408,col 9)",
        "(line 410,col 9)-(line 415,col 9)",
        "(line 417,col 9)-(line 422,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base32InputStreamTest.testSkipNone()",
      "begin_line": 430,
      "end_line": 440,
      "comment": "\n     * Tests skipping as a noop\n     * \n     * @throws Throwable\n     ",
      "child_ranges": [
        "(line 432,col 9)-(line 432,col 95)",
        "(line 433,col 9)-(line 433,col 65)",
        "(line 434,col 9)-(line 434,col 41)",
        "(line 435,col 9)-(line 435,col 43)",
        "(line 436,col 9)-(line 436,col 59)",
        "(line 437,col 9)-(line 437,col 78)",
        "(line 439,col 9)-(line 439,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base32InputStreamTest.testSkipPastEnd()",
      "begin_line": 447,
      "end_line": 455,
      "comment": "\n     * Tests skipping past the end of a stream.\n     * \n     * @throws Throwable\n     ",
      "child_ranges": [
        "(line 449,col 9)-(line 449,col 95)",
        "(line 450,col 9)-(line 450,col 65)",
        "(line 451,col 9)-(line 451,col 44)",
        "(line 453,col 9)-(line 453,col 43)",
        "(line 454,col 9)-(line 454,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base32InputStreamTest.testSkipToEnd()",
      "begin_line": 462,
      "end_line": 470,
      "comment": "\n     * Tests skipping to the end of a stream.\n     * \n     * @throws Throwable\n     ",
      "child_ranges": [
        "(line 464,col 9)-(line 464,col 95)",
        "(line 465,col 9)-(line 465,col 65)",
        "(line 466,col 9)-(line 466,col 43)",
        "(line 468,col 9)-(line 468,col 43)",
        "(line 469,col 9)-(line 469,col 43)"
      ]
    }
  ]
}