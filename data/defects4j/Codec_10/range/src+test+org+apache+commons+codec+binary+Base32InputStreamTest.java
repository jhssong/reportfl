{
  "filepath": "/tmp/Codec-10b/src/test/org/apache/commons/codec/binary/Base32InputStreamTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Base32InputStreamTest",
      "is_interface": false,
      "parent_types": [
        "TestCase"
      ],
      "begin_line": 27,
      "end_line": 414,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "CRLF"
      ],
      "begin_line": 29,
      "end_line": 29,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "LF"
      ],
      "begin_line": 31,
      "end_line": 31,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.codec.binary.Base32InputStreamTest.Base32InputStreamTest(java.lang.String)",
      "begin_line": 39,
      "end_line": 41,
      "comment": "\n     * Construct a new instance of this test case.\n     * \n     * @param name\n     *            Name of the test case\n     ",
      "child_ranges": [
        "(line 40,col 9)-(line 40,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base32InputStreamTest.testCodec105()",
      "begin_line": 46,
      "end_line": 51,
      "comment": "\n     * Tests the bug reported in CODEC-105. Bad interactions with InputStream when reading one byte at a time.\n     ",
      "child_ranges": [
        "(line 47,col 9)-(line 47,col 100)",
        "(line 48,col 9)-(line 50,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base32InputStreamTest.testBase32EmptyInputStreamMimeChuckSize()",
      "begin_line": 126,
      "end_line": 128,
      "comment": "\n     * Tests the Base32InputStream implementation against empty input.\n     * \n     * @throws Exception\n     *             for some failure scenarios.\n     ",
      "child_ranges": [
        "(line 127,col 9)-(line 127,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base32InputStreamTest.testBase32EmptyInputStreamPemChuckSize()",
      "begin_line": 136,
      "end_line": 138,
      "comment": "\n     * Tests the Base32InputStream implementation against empty input.\n     * \n     * @throws Exception\n     *             for some failure scenarios.\n     ",
      "child_ranges": [
        "(line 137,col 9)-(line 137,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base32InputStreamTest.testBase32EmptyInputStream(int)",
      "begin_line": 140,
      "end_line": 145,
      "comment": "",
      "child_ranges": [
        "(line 141,col 9)-(line 141,col 42)",
        "(line 142,col 9)-(line 142,col 42)",
        "(line 143,col 9)-(line 143,col 68)",
        "(line 144,col 9)-(line 144,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base32InputStreamTest.testBase32InputStreamByChunk()",
      "begin_line": 153,
      "end_line": 183,
      "comment": "\n     * Tests the Base32InputStream implementation.\n     * \n     * @throws Exception\n     *             for some failure scenarios.\n     ",
      "child_ranges": [
        "(line 155,col 9)-(line 155,col 81)",
        "(line 156,col 9)-(line 156,col 81)",
        "(line 157,col 9)-(line 157,col 68)",
        "(line 160,col 9)-(line 160,col 59)",
        "(line 161,col 9)-(line 161,col 39)",
        "(line 162,col 9)-(line 162,col 68)",
        "(line 176,col 9)-(line 176,col 40)",
        "(line 177,col 9)-(line 182,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base32InputStreamTest.testBase32InputStreamByteByByte()",
      "begin_line": 191,
      "end_line": 216,
      "comment": "\n     * Tests the Base32InputStream implementation.\n     * \n     * @throws Exception\n     *             for some failure scenarios.\n     ",
      "child_ranges": [
        "(line 193,col 9)-(line 193,col 81)",
        "(line 194,col 9)-(line 194,col 81)",
        "(line 195,col 9)-(line 195,col 71)",
        "(line 198,col 9)-(line 198,col 59)",
        "(line 199,col 9)-(line 199,col 39)",
        "(line 200,col 9)-(line 200,col 71)",
        "(line 209,col 9)-(line 209,col 40)",
        "(line 210,col 9)-(line 215,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base32InputStreamTest.testByChunk(byte[], byte[], int, byte[])",
      "begin_line": 236,
      "end_line": 267,
      "comment": "\n     * Tests method does three tests on the supplied data: 1. encoded ---[DECODE]--\u003e decoded 2. decoded ---[ENCODE]--\u003e\n     * encoded 3. decoded ---[WRAP-WRAP-WRAP-etc...] --\u003e decoded\n     * \u003cp/\u003e\n     * By \"[WRAP-WRAP-WRAP-etc...]\" we mean situation where the Base32InputStream wraps itself in encode and decode mode\n     * over and over again.\n     * \n     * @param encoded\n     *            base32 encoded data\n     * @param decoded\n     *            the data from above, but decoded\n     * @param chunkSize\n     *            chunk size (line-length) of the base32 encoded data.\n     * @param seperator\n     *            Line separator in the base32 encoded data.\n     * @throws Exception\n     *             Usually signifies a bug in the Base32 commons-codec implementation.\n     ",
      "child_ranges": [
        "(line 239,col 9)-(line 239,col 59)",
        "(line 240,col 9)-(line 240,col 67)",
        "(line 241,col 9)-(line 241,col 57)",
        "(line 243,col 9)-(line 243,col 43)",
        "(line 244,col 9)-(line 244,col 49)",
        "(line 245,col 9)-(line 245,col 78)",
        "(line 248,col 9)-(line 248,col 47)",
        "(line 249,col 9)-(line 249,col 39)",
        "(line 250,col 9)-(line 250,col 50)",
        "(line 252,col 9)-(line 252,col 43)",
        "(line 253,col 9)-(line 253,col 49)",
        "(line 254,col 9)-(line 254,col 78)",
        "(line 257,col 9)-(line 257,col 47)",
        "(line 258,col 9)-(line 261,col 9)",
        "(line 262,col 9)-(line 262,col 50)",
        "(line 264,col 9)-(line 264,col 43)",
        "(line 265,col 9)-(line 265,col 49)",
        "(line 266,col 9)-(line 266,col 87)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base32InputStreamTest.testByteByByte(byte[], byte[], int, byte[])",
      "begin_line": 287,
      "end_line": 327,
      "comment": "\n     * Tests method does three tests on the supplied data: 1. encoded ---[DECODE]--\u003e decoded 2. decoded ---[ENCODE]--\u003e\n     * encoded 3. decoded ---[WRAP-WRAP-WRAP-etc...] --\u003e decoded\n     * \u003cp/\u003e\n     * By \"[WRAP-WRAP-WRAP-etc...]\" we mean situation where the Base32InputStream wraps itself in encode and decode mode\n     * over and over again.\n     * \n     * @param encoded\n     *            base32 encoded data\n     * @param decoded\n     *            the data from above, but decoded\n     * @param chunkSize\n     *            chunk size (line-length) of the base32 encoded data.\n     * @param seperator\n     *            Line separator in the base32 encoded data.\n     * @throws Exception\n     *             Usually signifies a bug in the Base32 commons-codec implementation.\n     ",
      "child_ranges": [
        "(line 290,col 9)-(line 290,col 59)",
        "(line 291,col 9)-(line 291,col 67)",
        "(line 292,col 9)-(line 292,col 49)",
        "(line 293,col 9)-(line 295,col 9)",
        "(line 297,col 9)-(line 297,col 43)",
        "(line 298,col 9)-(line 298,col 49)",
        "(line 299,col 9)-(line 299,col 78)",
        "(line 302,col 9)-(line 302,col 47)",
        "(line 303,col 9)-(line 303,col 39)",
        "(line 304,col 9)-(line 304,col 42)",
        "(line 305,col 9)-(line 307,col 9)",
        "(line 309,col 9)-(line 309,col 43)",
        "(line 310,col 9)-(line 310,col 49)",
        "(line 311,col 9)-(line 311,col 78)",
        "(line 314,col 9)-(line 314,col 47)",
        "(line 315,col 9)-(line 318,col 9)",
        "(line 319,col 9)-(line 319,col 42)",
        "(line 320,col 9)-(line 322,col 9)",
        "(line 324,col 9)-(line 324,col 43)",
        "(line 325,col 9)-(line 325,col 49)",
        "(line 326,col 9)-(line 326,col 87)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base32InputStreamTest.testMarkSupported()",
      "begin_line": 334,
      "end_line": 340,
      "comment": "\n     * Tests markSupported.\n     * \n     * @throws Exception\n     ",
      "child_ranges": [
        "(line 335,col 9)-(line 335,col 81)",
        "(line 336,col 9)-(line 336,col 69)",
        "(line 337,col 9)-(line 337,col 88)",
        "(line 339,col 9)-(line 339,col 86)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base32InputStreamTest.testRead0()",
      "begin_line": 347,
      "end_line": 355,
      "comment": "\n     * Tests read returning 0\n     * \n     * @throws Exception\n     ",
      "child_ranges": [
        "(line 348,col 9)-(line 348,col 81)",
        "(line 349,col 9)-(line 349,col 36)",
        "(line 350,col 9)-(line 350,col 26)",
        "(line 351,col 9)-(line 351,col 69)",
        "(line 352,col 9)-(line 352,col 88)",
        "(line 353,col 9)-(line 353,col 39)",
        "(line 354,col 9)-(line 354,col 82)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base32InputStreamTest.testReadNull()",
      "begin_line": 363,
      "end_line": 373,
      "comment": "\n     * Tests read with null.\n     * \n     * @throws Exception\n     *             for some failure scenarios.\n     ",
      "child_ranges": [
        "(line 364,col 9)-(line 364,col 81)",
        "(line 365,col 9)-(line 365,col 69)",
        "(line 366,col 9)-(line 366,col 88)",
        "(line 367,col 9)-(line 372,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base32InputStreamTest.testReadOutOfBounds()",
      "begin_line": 380,
      "end_line": 413,
      "comment": "\n     * Tests read throwing IndexOutOfBoundsException\n     * \n     * @throws Exception\n     ",
      "child_ranges": [
        "(line 381,col 9)-(line 381,col 81)",
        "(line 382,col 9)-(line 382,col 36)",
        "(line 383,col 9)-(line 383,col 69)",
        "(line 384,col 9)-(line 384,col 88)",
        "(line 386,col 9)-(line 391,col 9)",
        "(line 393,col 9)-(line 398,col 9)",
        "(line 400,col 9)-(line 405,col 9)",
        "(line 407,col 9)-(line 412,col 9)"
      ]
    }
  ]
}