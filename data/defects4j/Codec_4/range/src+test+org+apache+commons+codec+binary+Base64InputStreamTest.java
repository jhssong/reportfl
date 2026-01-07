{
  "filepath": "/tmp/Codec-4b/src/test/org/apache/commons/codec/binary/Base64InputStreamTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Base64InputStreamTest",
      "is_interface": false,
      "parent_types": [
        "TestCase"
      ],
      "begin_line": 31,
      "end_line": 332,
      "comment": "\n * @author Apache Software Foundation\n * @version $Id $\n * @since 1.4\n "
    },
    {
      "type": "field",
      "varNames": [
        "CRLF"
      ],
      "begin_line": 33,
      "end_line": 33,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "LF"
      ],
      "begin_line": 35,
      "end_line": 35,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "STRING_FIXTURE"
      ],
      "begin_line": 37,
      "end_line": 37,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.codec.binary.Base64InputStreamTest.Base64InputStreamTest(java.lang.String)",
      "begin_line": 45,
      "end_line": 47,
      "comment": "\n     * Construct a new instance of this test case.\n     * \n     * @param name\n     *            Name of the test case\n     ",
      "child_ranges": [
        "(line 46,col 9)-(line 46,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64InputStreamTest.testBase64EmptyInputStream()",
      "begin_line": 55,
      "end_line": 60,
      "comment": "\n     * Tests the Base64InputStream implementation against empty input.\n     * \n     * @throws Exception\n     *             for some failure scenarios.\n     ",
      "child_ranges": [
        "(line 56,col 9)-(line 56,col 42)",
        "(line 57,col 9)-(line 57,col 42)",
        "(line 58,col 9)-(line 58,col 61)",
        "(line 59,col 9)-(line 59,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64InputStreamTest.testBase64InputStreamByChunk()",
      "begin_line": 68,
      "end_line": 97,
      "comment": "\n     * Tests the Base64InputStream implementation.\n     * \n     * @throws Exception\n     *             for some failure scenarios.\n     ",
      "child_ranges": [
        "(line 70,col 9)-(line 70,col 74)",
        "(line 71,col 9)-(line 71,col 66)",
        "(line 72,col 9)-(line 72,col 48)",
        "(line 75,col 9)-(line 75,col 55)",
        "(line 76,col 9)-(line 76,col 39)",
        "(line 77,col 9)-(line 77,col 48)",
        "(line 80,col 9)-(line 80,col 85)",
        "(line 81,col 9)-(line 81,col 41)",
        "(line 82,col 9)-(line 82,col 46)",
        "(line 85,col 9)-(line 85,col 90)",
        "(line 86,col 9)-(line 86,col 55)",
        "(line 87,col 9)-(line 87,col 41)",
        "(line 88,col 9)-(line 88,col 45)",
        "(line 91,col 9)-(line 96,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64InputStreamTest.testBase64InputStreamByteByByte()",
      "begin_line": 105,
      "end_line": 134,
      "comment": "\n     * Tests the Base64InputStream implementation.\n     * \n     * @throws Exception\n     *             for some failure scenarios.\n     ",
      "child_ranges": [
        "(line 107,col 9)-(line 107,col 74)",
        "(line 108,col 9)-(line 108,col 66)",
        "(line 109,col 9)-(line 109,col 51)",
        "(line 112,col 9)-(line 112,col 55)",
        "(line 113,col 9)-(line 113,col 39)",
        "(line 114,col 9)-(line 114,col 51)",
        "(line 117,col 9)-(line 117,col 85)",
        "(line 118,col 9)-(line 118,col 41)",
        "(line 119,col 9)-(line 119,col 49)",
        "(line 122,col 9)-(line 122,col 90)",
        "(line 123,col 9)-(line 123,col 55)",
        "(line 124,col 9)-(line 124,col 41)",
        "(line 125,col 9)-(line 125,col 48)",
        "(line 128,col 9)-(line 133,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64InputStreamTest.testByChunk(byte[], byte[], int, byte[])",
      "begin_line": 154,
      "end_line": 185,
      "comment": "\n     * Tests method does three tests on the supplied data: 1. encoded ---[DECODE]--\u003e decoded 2. decoded ---[ENCODE]--\u003e\n     * encoded 3. decoded ---[WRAP-WRAP-WRAP-etc...] --\u003e decoded\n     * \u003cp/\u003e\n     * By \"[WRAP-WRAP-WRAP-etc...]\" we mean situation where the Base64InputStream wraps itself in encode and decode mode\n     * over and over again.\n     * \n     * @param encoded\n     *            base64 encoded data\n     * @param decoded\n     *            the data from above, but decoded\n     * @param chunkSize\n     *            chunk size (line-length) of the base64 encoded data.\n     * @param seperator\n     *            Line separator in the base64 encoded data.\n     * @throws Exception\n     *             Usually signifies a bug in the Base64 commons-codec implementation.\n     ",
      "child_ranges": [
        "(line 157,col 9)-(line 157,col 59)",
        "(line 158,col 9)-(line 158,col 67)",
        "(line 159,col 9)-(line 159,col 57)",
        "(line 161,col 9)-(line 161,col 43)",
        "(line 162,col 9)-(line 162,col 49)",
        "(line 163,col 9)-(line 163,col 78)",
        "(line 166,col 9)-(line 166,col 47)",
        "(line 167,col 9)-(line 167,col 39)",
        "(line 168,col 9)-(line 168,col 50)",
        "(line 170,col 9)-(line 170,col 43)",
        "(line 171,col 9)-(line 171,col 49)",
        "(line 172,col 9)-(line 172,col 78)",
        "(line 175,col 9)-(line 175,col 47)",
        "(line 176,col 9)-(line 179,col 9)",
        "(line 180,col 9)-(line 180,col 50)",
        "(line 182,col 9)-(line 182,col 43)",
        "(line 183,col 9)-(line 183,col 49)",
        "(line 184,col 9)-(line 184,col 87)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64InputStreamTest.testByteByByte(byte[], byte[], int, byte[])",
      "begin_line": 205,
      "end_line": 245,
      "comment": "\n     * Tests method does three tests on the supplied data: 1. encoded ---[DECODE]--\u003e decoded 2. decoded ---[ENCODE]--\u003e\n     * encoded 3. decoded ---[WRAP-WRAP-WRAP-etc...] --\u003e decoded\n     * \u003cp/\u003e\n     * By \"[WRAP-WRAP-WRAP-etc...]\" we mean situation where the Base64InputStream wraps itself in encode and decode mode\n     * over and over again.\n     * \n     * @param encoded\n     *            base64 encoded data\n     * @param decoded\n     *            the data from above, but decoded\n     * @param chunkSize\n     *            chunk size (line-length) of the base64 encoded data.\n     * @param seperator\n     *            Line separator in the base64 encoded data.\n     * @throws Exception\n     *             Usually signifies a bug in the Base64 commons-codec implementation.\n     ",
      "child_ranges": [
        "(line 208,col 9)-(line 208,col 59)",
        "(line 209,col 9)-(line 209,col 67)",
        "(line 210,col 9)-(line 210,col 49)",
        "(line 211,col 9)-(line 213,col 9)",
        "(line 215,col 9)-(line 215,col 43)",
        "(line 216,col 9)-(line 216,col 49)",
        "(line 217,col 9)-(line 217,col 78)",
        "(line 220,col 9)-(line 220,col 47)",
        "(line 221,col 9)-(line 221,col 39)",
        "(line 222,col 9)-(line 222,col 42)",
        "(line 223,col 9)-(line 225,col 9)",
        "(line 227,col 9)-(line 227,col 43)",
        "(line 228,col 9)-(line 228,col 49)",
        "(line 229,col 9)-(line 229,col 78)",
        "(line 232,col 9)-(line 232,col 47)",
        "(line 233,col 9)-(line 236,col 9)",
        "(line 237,col 9)-(line 237,col 42)",
        "(line 238,col 9)-(line 240,col 9)",
        "(line 242,col 9)-(line 242,col 43)",
        "(line 243,col 9)-(line 243,col 49)",
        "(line 244,col 9)-(line 244,col 87)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64InputStreamTest.testMarkSupported()",
      "begin_line": 252,
      "end_line": 258,
      "comment": "\n     * Tests markSupported.\n     * \n     * @throws Exception\n     ",
      "child_ranges": [
        "(line 253,col 9)-(line 253,col 66)",
        "(line 254,col 9)-(line 254,col 69)",
        "(line 255,col 9)-(line 255,col 88)",
        "(line 257,col 9)-(line 257,col 86)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64InputStreamTest.testRead0()",
      "begin_line": 265,
      "end_line": 273,
      "comment": "\n     * Tests read returning 0\n     * \n     * @throws Exception\n     ",
      "child_ranges": [
        "(line 266,col 9)-(line 266,col 66)",
        "(line 267,col 9)-(line 267,col 36)",
        "(line 268,col 9)-(line 268,col 26)",
        "(line 269,col 9)-(line 269,col 69)",
        "(line 270,col 9)-(line 270,col 88)",
        "(line 271,col 9)-(line 271,col 39)",
        "(line 272,col 9)-(line 272,col 82)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64InputStreamTest.testReadNull()",
      "begin_line": 281,
      "end_line": 291,
      "comment": "\n     * Tests read with null.\n     * \n     * @throws Exception\n     *             for some failure scenarios.\n     ",
      "child_ranges": [
        "(line 282,col 9)-(line 282,col 66)",
        "(line 283,col 9)-(line 283,col 69)",
        "(line 284,col 9)-(line 284,col 88)",
        "(line 285,col 9)-(line 290,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64InputStreamTest.testReadOutOfBounds()",
      "begin_line": 298,
      "end_line": 331,
      "comment": "\n     * Tests read throwing IndexOutOfBoundsException\n     * \n     * @throws Exception\n     ",
      "child_ranges": [
        "(line 299,col 9)-(line 299,col 66)",
        "(line 300,col 9)-(line 300,col 36)",
        "(line 301,col 9)-(line 301,col 69)",
        "(line 302,col 9)-(line 302,col 88)",
        "(line 304,col 9)-(line 309,col 9)",
        "(line 311,col 9)-(line 316,col 9)",
        "(line 318,col 9)-(line 323,col 9)",
        "(line 325,col 9)-(line 330,col 9)"
      ]
    }
  ]
}