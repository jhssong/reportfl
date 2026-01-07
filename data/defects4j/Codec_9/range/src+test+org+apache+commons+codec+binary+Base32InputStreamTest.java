{
  "filepath": "/tmp/Codec-9b/src/test/org/apache/commons/codec/binary/Base32InputStreamTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Base32InputStreamTest",
      "is_interface": false,
      "parent_types": [
        "TestCase"
      ],
      "begin_line": 27,
      "end_line": 412,
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
      "end_line": 182,
      "comment": "\n     * Tests the Base32InputStream implementation.\n     * \n     * @throws Exception\n     *             for some failure scenarios.\n     ",
      "child_ranges": [
        "(line 155,col 9)-(line 155,col 81)",
        "(line 156,col 9)-(line 156,col 81)",
        "(line 157,col 9)-(line 157,col 68)",
        "(line 160,col 9)-(line 160,col 55)",
        "(line 161,col 9)-(line 161,col 39)",
        "(line 176,col 9)-(line 181,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base32InputStreamTest.testBase32InputStreamByteByByte()",
      "begin_line": 190,
      "end_line": 214,
      "comment": "\n     * Tests the Base32InputStream implementation.\n     * \n     * @throws Exception\n     *             for some failure scenarios.\n     ",
      "child_ranges": [
        "(line 192,col 9)-(line 192,col 81)",
        "(line 193,col 9)-(line 193,col 81)",
        "(line 194,col 9)-(line 194,col 71)",
        "(line 197,col 9)-(line 197,col 55)",
        "(line 198,col 9)-(line 198,col 39)",
        "(line 208,col 9)-(line 213,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base32InputStreamTest.testByChunk(byte[], byte[], int, byte[])",
      "begin_line": 234,
      "end_line": 265,
      "comment": "\n     * Tests method does three tests on the supplied data: 1. encoded ---[DECODE]--\u003e decoded 2. decoded ---[ENCODE]--\u003e\n     * encoded 3. decoded ---[WRAP-WRAP-WRAP-etc...] --\u003e decoded\n     * \u003cp/\u003e\n     * By \"[WRAP-WRAP-WRAP-etc...]\" we mean situation where the Base32InputStream wraps itself in encode and decode mode\n     * over and over again.\n     * \n     * @param encoded\n     *            base32 encoded data\n     * @param decoded\n     *            the data from above, but decoded\n     * @param chunkSize\n     *            chunk size (line-length) of the base32 encoded data.\n     * @param seperator\n     *            Line separator in the base32 encoded data.\n     * @throws Exception\n     *             Usually signifies a bug in the Base32 commons-codec implementation.\n     ",
      "child_ranges": [
        "(line 237,col 9)-(line 237,col 59)",
        "(line 238,col 9)-(line 238,col 67)",
        "(line 239,col 9)-(line 239,col 57)",
        "(line 241,col 9)-(line 241,col 43)",
        "(line 242,col 9)-(line 242,col 49)",
        "(line 243,col 9)-(line 243,col 78)",
        "(line 246,col 9)-(line 246,col 47)",
        "(line 247,col 9)-(line 247,col 39)",
        "(line 248,col 9)-(line 248,col 50)",
        "(line 250,col 9)-(line 250,col 43)",
        "(line 251,col 9)-(line 251,col 49)",
        "(line 252,col 9)-(line 252,col 78)",
        "(line 255,col 9)-(line 255,col 47)",
        "(line 256,col 9)-(line 259,col 9)",
        "(line 260,col 9)-(line 260,col 50)",
        "(line 262,col 9)-(line 262,col 43)",
        "(line 263,col 9)-(line 263,col 49)",
        "(line 264,col 9)-(line 264,col 87)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base32InputStreamTest.testByteByByte(byte[], byte[], int, byte[])",
      "begin_line": 285,
      "end_line": 325,
      "comment": "\n     * Tests method does three tests on the supplied data: 1. encoded ---[DECODE]--\u003e decoded 2. decoded ---[ENCODE]--\u003e\n     * encoded 3. decoded ---[WRAP-WRAP-WRAP-etc...] --\u003e decoded\n     * \u003cp/\u003e\n     * By \"[WRAP-WRAP-WRAP-etc...]\" we mean situation where the Base32InputStream wraps itself in encode and decode mode\n     * over and over again.\n     * \n     * @param encoded\n     *            base32 encoded data\n     * @param decoded\n     *            the data from above, but decoded\n     * @param chunkSize\n     *            chunk size (line-length) of the base32 encoded data.\n     * @param seperator\n     *            Line separator in the base32 encoded data.\n     * @throws Exception\n     *             Usually signifies a bug in the Base32 commons-codec implementation.\n     ",
      "child_ranges": [
        "(line 288,col 9)-(line 288,col 59)",
        "(line 289,col 9)-(line 289,col 67)",
        "(line 290,col 9)-(line 290,col 49)",
        "(line 291,col 9)-(line 293,col 9)",
        "(line 295,col 9)-(line 295,col 43)",
        "(line 296,col 9)-(line 296,col 49)",
        "(line 297,col 9)-(line 297,col 78)",
        "(line 300,col 9)-(line 300,col 47)",
        "(line 301,col 9)-(line 301,col 39)",
        "(line 302,col 9)-(line 302,col 42)",
        "(line 303,col 9)-(line 305,col 9)",
        "(line 307,col 9)-(line 307,col 43)",
        "(line 308,col 9)-(line 308,col 49)",
        "(line 309,col 9)-(line 309,col 78)",
        "(line 312,col 9)-(line 312,col 47)",
        "(line 313,col 9)-(line 316,col 9)",
        "(line 317,col 9)-(line 317,col 42)",
        "(line 318,col 9)-(line 320,col 9)",
        "(line 322,col 9)-(line 322,col 43)",
        "(line 323,col 9)-(line 323,col 49)",
        "(line 324,col 9)-(line 324,col 87)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base32InputStreamTest.testMarkSupported()",
      "begin_line": 332,
      "end_line": 338,
      "comment": "\n     * Tests markSupported.\n     * \n     * @throws Exception\n     ",
      "child_ranges": [
        "(line 333,col 9)-(line 333,col 81)",
        "(line 334,col 9)-(line 334,col 69)",
        "(line 335,col 9)-(line 335,col 88)",
        "(line 337,col 9)-(line 337,col 86)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base32InputStreamTest.testRead0()",
      "begin_line": 345,
      "end_line": 353,
      "comment": "\n     * Tests read returning 0\n     * \n     * @throws Exception\n     ",
      "child_ranges": [
        "(line 346,col 9)-(line 346,col 81)",
        "(line 347,col 9)-(line 347,col 36)",
        "(line 348,col 9)-(line 348,col 26)",
        "(line 349,col 9)-(line 349,col 69)",
        "(line 350,col 9)-(line 350,col 88)",
        "(line 351,col 9)-(line 351,col 39)",
        "(line 352,col 9)-(line 352,col 82)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base32InputStreamTest.testReadNull()",
      "begin_line": 361,
      "end_line": 371,
      "comment": "\n     * Tests read with null.\n     * \n     * @throws Exception\n     *             for some failure scenarios.\n     ",
      "child_ranges": [
        "(line 362,col 9)-(line 362,col 81)",
        "(line 363,col 9)-(line 363,col 69)",
        "(line 364,col 9)-(line 364,col 88)",
        "(line 365,col 9)-(line 370,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base32InputStreamTest.testReadOutOfBounds()",
      "begin_line": 378,
      "end_line": 411,
      "comment": "\n     * Tests read throwing IndexOutOfBoundsException\n     * \n     * @throws Exception\n     ",
      "child_ranges": [
        "(line 379,col 9)-(line 379,col 81)",
        "(line 380,col 9)-(line 380,col 36)",
        "(line 381,col 9)-(line 381,col 69)",
        "(line 382,col 9)-(line 382,col 88)",
        "(line 384,col 9)-(line 389,col 9)",
        "(line 391,col 9)-(line 396,col 9)",
        "(line 398,col 9)-(line 403,col 9)",
        "(line 405,col 9)-(line 410,col 9)"
      ]
    }
  ]
}