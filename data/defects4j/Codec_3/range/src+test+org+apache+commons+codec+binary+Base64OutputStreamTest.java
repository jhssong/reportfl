{
  "filepath": "/tmp/Codec-3b/src/test/org/apache/commons/codec/binary/Base64OutputStreamTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Base64OutputStreamTest",
      "is_interface": false,
      "parent_types": [
        "TestCase"
      ],
      "begin_line": 31,
      "end_line": 310,
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
      "signature": "org.apache.commons.codec.binary.Base64OutputStreamTest.Base64OutputStreamTest(java.lang.String)",
      "begin_line": 45,
      "end_line": 47,
      "comment": "\n     * Construct a new instance of this test case.\n     * \n     * @param name\n     *            Name of the test case\n     ",
      "child_ranges": [
        "(line 46,col 9)-(line 46,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64OutputStreamTest.testBase64EmptyOutputStream()",
      "begin_line": 55,
      "end_line": 60,
      "comment": "\n     * Test the Base64OutputStream implementation against empty input.\n     * \n     * @throws Exception\n     *             for some failure scenarios.\n     ",
      "child_ranges": [
        "(line 56,col 9)-(line 56,col 42)",
        "(line 57,col 9)-(line 57,col 42)",
        "(line 58,col 9)-(line 58,col 61)",
        "(line 59,col 9)-(line 59,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64OutputStreamTest.testBase64OutputStreamByChunk()",
      "begin_line": 68,
      "end_line": 97,
      "comment": "\n     * Test the Base64OutputStream implementation\n     * \n     * @throws Exception\n     *             for some failure scenarios.\n     ",
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
      "signature": "org.apache.commons.codec.binary.Base64OutputStreamTest.testBase64OutputStreamByteByByte()",
      "begin_line": 105,
      "end_line": 134,
      "comment": "\n     * Test the Base64OutputStream implementation\n     * \n     * @throws Exception\n     *             for some failure scenarios.\n     ",
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
      "signature": "org.apache.commons.codec.binary.Base64OutputStreamTest.testByChunk(byte[], byte[], int, byte[])",
      "begin_line": 154,
      "end_line": 184,
      "comment": "\n     * Test method does three tests on the supplied data: 1. encoded ---[DECODE]--\u003e decoded 2. decoded ---[ENCODE]--\u003e\n     * encoded 3. decoded ---[WRAP-WRAP-WRAP-etc...] --\u003e decoded\n     * \u003cp/\u003e\n     * By \"[WRAP-WRAP-WRAP-etc...]\" we mean situation where the Base64OutputStream wraps itself in encode and decode\n     * mode over and over again.\n     * \n     * @param encoded\n     *            base64 encoded data\n     * @param decoded\n     *            the data from above, but decoded\n     * @param chunkSize\n     *            chunk size (line-length) of the base64 encoded data.\n     * @param seperator\n     *            Line separator in the base64 encoded data.\n     * @throws Exception\n     *             Usually signifies a bug in the Base64 commons-codec implementation.\n     ",
      "child_ranges": [
        "(line 157,col 9)-(line 157,col 68)",
        "(line 158,col 9)-(line 158,col 87)",
        "(line 159,col 9)-(line 159,col 27)",
        "(line 160,col 9)-(line 160,col 20)",
        "(line 161,col 9)-(line 161,col 46)",
        "(line 162,col 9)-(line 162,col 86)",
        "(line 165,col 9)-(line 165,col 46)",
        "(line 166,col 9)-(line 166,col 53)",
        "(line 167,col 9)-(line 167,col 27)",
        "(line 168,col 9)-(line 168,col 20)",
        "(line 169,col 9)-(line 169,col 39)",
        "(line 170,col 9)-(line 170,col 86)",
        "(line 173,col 9)-(line 173,col 46)",
        "(line 174,col 9)-(line 174,col 22)",
        "(line 175,col 9)-(line 178,col 9)",
        "(line 179,col 9)-(line 179,col 27)",
        "(line 180,col 9)-(line 180,col 20)",
        "(line 181,col 9)-(line 181,col 39)",
        "(line 183,col 9)-(line 183,col 95)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64OutputStreamTest.testByteByByte(byte[], byte[], int, byte[])",
      "begin_line": 204,
      "end_line": 251,
      "comment": "\n     * Test method does three tests on the supplied data: 1. encoded ---[DECODE]--\u003e decoded 2. decoded ---[ENCODE]--\u003e\n     * encoded 3. decoded ---[WRAP-WRAP-WRAP-etc...] --\u003e decoded\n     * \u003cp/\u003e\n     * By \"[WRAP-WRAP-WRAP-etc...]\" we mean situation where the Base64OutputStream wraps itself in encode and decode\n     * mode over and over again.\n     * \n     * @param encoded\n     *            base64 encoded data\n     * @param decoded\n     *            the data from above, but decoded\n     * @param chunkSize\n     *            chunk size (line-length) of the base64 encoded data.\n     * @param seperator\n     *            Line separator in the base64 encoded data.\n     * @throws Exception\n     *             Usually signifies a bug in the Base64 commons-codec implementation.\n     ",
      "child_ranges": [
        "(line 207,col 9)-(line 207,col 68)",
        "(line 208,col 9)-(line 208,col 87)",
        "(line 209,col 9)-(line 211,col 9)",
        "(line 212,col 9)-(line 212,col 20)",
        "(line 213,col 9)-(line 213,col 46)",
        "(line 214,col 9)-(line 214,col 91)",
        "(line 217,col 9)-(line 217,col 46)",
        "(line 218,col 9)-(line 218,col 53)",
        "(line 219,col 9)-(line 221,col 9)",
        "(line 222,col 9)-(line 222,col 20)",
        "(line 223,col 9)-(line 223,col 39)",
        "(line 224,col 9)-(line 224,col 91)",
        "(line 227,col 9)-(line 227,col 46)",
        "(line 228,col 9)-(line 228,col 53)",
        "(line 229,col 9)-(line 232,col 9)",
        "(line 233,col 9)-(line 233,col 20)",
        "(line 234,col 9)-(line 234,col 39)",
        "(line 235,col 9)-(line 235,col 99)",
        "(line 238,col 9)-(line 238,col 46)",
        "(line 239,col 9)-(line 239,col 22)",
        "(line 240,col 9)-(line 243,col 9)",
        "(line 244,col 9)-(line 246,col 9)",
        "(line 247,col 9)-(line 247,col 20)",
        "(line 248,col 9)-(line 248,col 39)",
        "(line 250,col 9)-(line 250,col 100)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64OutputStreamTest.testWriteOutOfBounds()",
      "begin_line": 259,
      "end_line": 291,
      "comment": "\n     * Tests Base64OutputStream.write for expected IndexOutOfBoundsException conditions.\n     * \n     * @throws Exception\n     *             for some failure scenarios.\n     ",
      "child_ranges": [
        "(line 260,col 9)-(line 260,col 36)",
        "(line 261,col 9)-(line 261,col 65)",
        "(line 262,col 9)-(line 262,col 62)",
        "(line 264,col 9)-(line 269,col 9)",
        "(line 271,col 9)-(line 276,col 9)",
        "(line 278,col 9)-(line 283,col 9)",
        "(line 285,col 9)-(line 290,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64OutputStreamTest.testWriteToNullCoverage()",
      "begin_line": 299,
      "end_line": 308,
      "comment": "\n     * Tests Base64OutputStream.write(null).\n     * \n     * @throws Exception\n     *             for some failure scenarios.\n     ",
      "child_ranges": [
        "(line 300,col 9)-(line 300,col 65)",
        "(line 301,col 9)-(line 301,col 62)",
        "(line 302,col 9)-(line 307,col 9)"
      ]
    }
  ]
}