{
  "filepath": "/tmp/Codec-17b/src/main/java/org/apache/commons/codec/cli/Digest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Digest",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 36,
      "end_line": 150,
      "comment": "\r\n * A minimal command line to run digest over files, directories or a string\r\n *\r\n * @see #main(String[])\r\n * @since 1.11\r\n "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.cli.Digest.main(java.lang.String[])",
      "begin_line": 52,
      "end_line": 54,
      "comment": "\r\n     * Runs the digest algorithm in {@code args[0]} on the file in {@code args[1]}. If there is no {@code args[1]}, use\r\n     * standard input.\r\n     *\r\n     * \u003cp\u003e\r\n     * The algorithm can also be {@code ALL} or {@code *} to output one line for each known algorithm.\r\n     * \u003c/p\u003e\r\n     *\r\n     * @param args\r\n     *            {@code args[0]} is one of {@link MessageDigestAlgorithms} name,\r\n     *            {@link MessageDigest} name, {@code ALL}, or {@code *}.\r\n     *            {@code args[1+]} is a FILE/DIRECTORY/String.\r\n     * @throws IOException if an error occurs\r\n     ",
      "child_ranges": [
        "(line 53,col 9)-(line 53,col 31)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "algorithm"
      ],
      "begin_line": 56,
      "end_line": 56,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "args"
      ],
      "begin_line": 57,
      "end_line": 57,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "inputs"
      ],
      "begin_line": 58,
      "end_line": 58,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.codec.cli.Digest.Digest(java.lang.String[])",
      "begin_line": 60,
      "end_line": 76,
      "comment": "",
      "child_ranges": [
        "(line 61,col 9)-(line 63,col 9)",
        "(line 64,col 9)-(line 67,col 9)",
        "(line 68,col 9)-(line 68,col 25)",
        "(line 69,col 9)-(line 69,col 28)",
        "(line 70,col 9)-(line 75,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.cli.Digest.println(java.lang.String, byte[])",
      "begin_line": 78,
      "end_line": 80,
      "comment": "",
      "child_ranges": [
        "(line 79,col 9)-(line 79,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.cli.Digest.println(java.lang.String, byte[], java.lang.String)",
      "begin_line": 82,
      "end_line": 89,
      "comment": "",
      "child_ranges": [
        "(line 88,col 9)-(line 88,col 109)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.cli.Digest.run()",
      "begin_line": 91,
      "end_line": 102,
      "comment": "",
      "child_ranges": [
        "(line 92,col 9)-(line 95,col 9)",
        "(line 96,col 9)-(line 96,col 83)",
        "(line 97,col 9)-(line 101,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.cli.Digest.run(java.lang.String[])",
      "begin_line": 104,
      "end_line": 110,
      "comment": "",
      "child_ranges": [
        "(line 105,col 9)-(line 109,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.cli.Digest.run(java.lang.String, java.security.MessageDigest)",
      "begin_line": 112,
      "end_line": 132,
      "comment": "",
      "child_ranges": [
        "(line 113,col 9)-(line 116,col 9)",
        "(line 117,col 9)-(line 131,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.cli.Digest.run(java.lang.String, java.security.MessageDigest, java.io.File[])",
      "begin_line": 134,
      "end_line": 140,
      "comment": "",
      "child_ranges": [
        "(line 135,col 9)-(line 139,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.cli.Digest.run(java.lang.String, java.lang.String)",
      "begin_line": 142,
      "end_line": 144,
      "comment": "",
      "child_ranges": [
        "(line 143,col 9)-(line 143,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.cli.Digest.toString()",
      "begin_line": 146,
      "end_line": 149,
      "comment": "",
      "child_ranges": [
        "(line 148,col 9)-(line 148,col 79)"
      ]
    }
  ]
}