{
  "filepath": "/tmp/Codec-2b/src/test/org/apache/commons/codec/binary/Base64InputStreamTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Base64InputStreamTest",
      "is_interface": false,
      "parent_types": [
        "TestCase"
      ],
      "begin_line": 31,
      "end_line": 224,
      "comment": "\r\n * @author Apache Software Foundation\r\n * @version $Id $\r\n "
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
      "begin_line": 34,
      "end_line": 34,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.codec.binary.Base64InputStreamTest.Base64InputStreamTest(java.lang.String)",
      "begin_line": 41,
      "end_line": 43,
      "comment": "\r\n     * Construct a new instance of this test case.\r\n     *\r\n     * @param name Name of the test case\r\n     ",
      "child_ranges": [
        "(line 42,col 9)-(line 42,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64InputStreamTest.testBase64EmptyInputStream()",
      "begin_line": 50,
      "end_line": 55,
      "comment": "\r\n     * Test the Base64InputStream implementation against empty input.\r\n     *\r\n     * @throws Exception for some failure scenarios.\r\n     ",
      "child_ranges": [
        "(line 51,col 9)-(line 51,col 42)",
        "(line 52,col 9)-(line 52,col 42)",
        "(line 53,col 9)-(line 53,col 61)",
        "(line 54,col 9)-(line 54,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64InputStreamTest.testBase64InputStreamByteByByte()",
      "begin_line": 62,
      "end_line": 83,
      "comment": "\r\n     * Test the Base64InputStream implementation.\r\n     *\r\n     * @throws Exception for some failure scenarios.\r\n     ",
      "child_ranges": [
        "(line 64,col 9)-(line 64,col 66)",
        "(line 65,col 9)-(line 65,col 57)",
        "(line 66,col 9)-(line 66,col 51)",
        "(line 69,col 9)-(line 69,col 47)",
        "(line 70,col 9)-(line 70,col 39)",
        "(line 71,col 9)-(line 71,col 51)",
        "(line 74,col 9)-(line 74,col 59)",
        "(line 75,col 9)-(line 75,col 41)",
        "(line 76,col 9)-(line 76,col 49)",
        "(line 79,col 9)-(line 79,col 72)",
        "(line 80,col 9)-(line 80,col 47)",
        "(line 81,col 9)-(line 81,col 41)",
        "(line 82,col 9)-(line 82,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64InputStreamTest.testBase64InputStreamByChunk()",
      "begin_line": 90,
      "end_line": 111,
      "comment": "\r\n     * Test the Base64InputStream implementation.\r\n     *\r\n     * @throws Exception for some failure scenarios.\r\n     ",
      "child_ranges": [
        "(line 92,col 9)-(line 92,col 66)",
        "(line 93,col 9)-(line 93,col 57)",
        "(line 94,col 9)-(line 94,col 48)",
        "(line 97,col 9)-(line 97,col 47)",
        "(line 98,col 9)-(line 98,col 39)",
        "(line 99,col 9)-(line 99,col 48)",
        "(line 102,col 9)-(line 102,col 59)",
        "(line 103,col 9)-(line 103,col 41)",
        "(line 104,col 9)-(line 104,col 46)",
        "(line 107,col 9)-(line 107,col 72)",
        "(line 108,col 9)-(line 108,col 47)",
        "(line 109,col 9)-(line 109,col 41)",
        "(line 110,col 9)-(line 110,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64InputStreamTest.testByteByByte(byte[], byte[], int, byte[])",
      "begin_line": 130,
      "end_line": 172,
      "comment": "\r\n     * Test method does three tests on the supplied data:\r\n     * 1. encoded ---[DECODE]--\u003e decoded\r\n     * 2. decoded ---[ENCODE]--\u003e encoded\r\n     * 3. decoded ---[WRAP-WRAP-WRAP-etc...] --\u003e decoded\r\n     * \u003cp/\u003e\r\n     * By \"[WRAP-WRAP-WRAP-etc...]\" we mean situation where the\r\n     * Base64InputStream wraps itself in encode and decode mode\r\n     * over and over again.\r\n     *\r\n     * @param encoded   base64 encoded data\r\n     * @param decoded   the data from above, but decoded\r\n     * @param chunkSize chunk size (line-length) of the base64 encoded data.\r\n     * @param seperator Line separator in the base64 encoded data.\r\n     * @throws Exception Usually signifies a bug in the Base64 commons-codec implementation.\r\n     ",
      "child_ranges": [
        "(line 135,col 9)-(line 135,col 59)",
        "(line 136,col 9)-(line 136,col 67)",
        "(line 137,col 9)-(line 137,col 49)",
        "(line 138,col 9)-(line 140,col 9)",
        "(line 142,col 9)-(line 142,col 43)",
        "(line 143,col 9)-(line 143,col 49)",
        "(line 144,col 9)-(line 144,col 78)",
        "(line 147,col 9)-(line 147,col 47)",
        "(line 148,col 9)-(line 148,col 39)",
        "(line 149,col 9)-(line 149,col 42)",
        "(line 150,col 9)-(line 152,col 9)",
        "(line 154,col 9)-(line 154,col 43)",
        "(line 155,col 9)-(line 155,col 49)",
        "(line 156,col 9)-(line 156,col 78)",
        "(line 159,col 9)-(line 159,col 47)",
        "(line 160,col 9)-(line 163,col 9)",
        "(line 164,col 9)-(line 164,col 42)",
        "(line 165,col 9)-(line 167,col 9)",
        "(line 169,col 9)-(line 169,col 43)",
        "(line 170,col 9)-(line 170,col 49)",
        "(line 171,col 9)-(line 171,col 87)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64InputStreamTest.testByChunk(byte[], byte[], int, byte[])",
      "begin_line": 190,
      "end_line": 223,
      "comment": "\r\n     * Test method does three tests on the supplied data:\r\n     * 1. encoded ---[DECODE]--\u003e decoded\r\n     * 2. decoded ---[ENCODE]--\u003e encoded\r\n     * 3. decoded ---[WRAP-WRAP-WRAP-etc...] --\u003e decoded\r\n     * \u003cp/\u003e\r\n     * By \"[WRAP-WRAP-WRAP-etc...]\" we mean situation where the\r\n     * Base64InputStream wraps itself in encode and decode mode\r\n     * over and over again.\r\n     *\r\n     * @param encoded   base64 encoded data\r\n     * @param decoded   the data from above, but decoded\r\n     * @param chunkSize chunk size (line-length) of the base64 encoded data.\r\n     * @param seperator Line separator in the base64 encoded data.\r\n     * @throws Exception Usually signifies a bug in the Base64 commons-codec implementation.\r\n     ",
      "child_ranges": [
        "(line 195,col 9)-(line 195,col 59)",
        "(line 196,col 9)-(line 196,col 67)",
        "(line 197,col 9)-(line 197,col 57)",
        "(line 199,col 9)-(line 199,col 43)",
        "(line 200,col 9)-(line 200,col 49)",
        "(line 201,col 9)-(line 201,col 78)",
        "(line 204,col 9)-(line 204,col 47)",
        "(line 205,col 9)-(line 205,col 39)",
        "(line 206,col 9)-(line 206,col 50)",
        "(line 208,col 9)-(line 208,col 43)",
        "(line 209,col 9)-(line 209,col 49)",
        "(line 210,col 9)-(line 210,col 78)",
        "(line 213,col 9)-(line 213,col 47)",
        "(line 214,col 9)-(line 217,col 9)",
        "(line 218,col 9)-(line 218,col 50)",
        "(line 220,col 9)-(line 220,col 43)",
        "(line 221,col 9)-(line 221,col 49)",
        "(line 222,col 9)-(line 222,col 87)"
      ]
    }
  ]
}