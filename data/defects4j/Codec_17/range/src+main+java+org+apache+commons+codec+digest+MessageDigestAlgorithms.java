{
  "filepath": "/tmp/Codec-17b/src/main/java/org/apache/commons/codec/digest/MessageDigestAlgorithms.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "MessageDigestAlgorithms",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 49,
      "end_line": 148,
      "comment": "\n * Standard {@link MessageDigest} algorithm names from the \u003ccite\u003eJava Cryptography Architecture Standard Algorithm Name\n * Documentation\u003c/cite\u003e.\n * \u003cp\u003e\n * This class is immutable and thread-safe.\n * \u003c/p\u003e\n * \u003cp\u003e\n * Java 8 and up: SHA-224.\n * \u003c/p\u003e\n * \u003cp\u003e\n * Java 9 and up: SHA3-224, SHA3-256, SHA3-384, SHA3-512.\n * \u003c/p\u003e\n *\n * @see \u003ca href\u003d\"http://docs.oracle.com/javase/6/docs/technotes/guides/security/StandardNames.html#MessageDigest\"\u003e\n *      Java 6 Cryptography Architecture Standard Algorithm Name Documentation\u003c/a\u003e\n * @see \u003ca href\u003d\"http://docs.oracle.com/javase/7/docs/technotes/guides/security/StandardNames.html#MessageDigest\"\u003e\n *      Java 7 Cryptography Architecture Standard Algorithm Name Documentation\u003c/a\u003e\n * @see \u003ca href\u003d\"http://docs.oracle.com/javase/8/docs/technotes/guides/security/StandardNames.html#MessageDigest\"\u003e\n *      Java 8 Cryptography Architecture Standard Algorithm Name Documentation\u003c/a\u003e\n * @see \u003ca href\u003d\"http://download.java.net/java/jdk9/docs/technotes/guides/security/StandardNames.html#MessageDigest\"\u003e\n *      Java 9 Cryptography Architecture Standard Algorithm Name Documentation\u003c/a\u003e\n *\n * @see \u003ca href\u003d\"http://dx.doi.org/10.6028/NIST.FIPS.180-4\"\u003eFIPS PUB 180-4\u003c/a\u003e\n * @see \u003ca href\u003d\"http://dx.doi.org/10.6028/NIST.FIPS.202\"\u003eFIPS PUB 202\u003c/a\u003e\n * @since 1.7\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "MD2"
      ],
      "begin_line": 54,
      "end_line": 54,
      "comment": "\n     * The MD2 message digest algorithm defined in RFC 1319.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "MD5"
      ],
      "begin_line": 59,
      "end_line": 59,
      "comment": "\n     * The MD5 message digest algorithm defined in RFC 1321.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "SHA_1"
      ],
      "begin_line": 64,
      "end_line": 64,
      "comment": "\n     * The SHA-1 hash algorithm defined in the FIPS PUB 180-2.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "SHA_224"
      ],
      "begin_line": 74,
      "end_line": 74,
      "comment": "\n     * The SHA-224 hash algorithm defined in the FIPS PUB 180-3.\n     * \u003cp\u003e\n     * Present in Oracle Java 8.\n     * \u003c/p\u003e\n     *\n     * @since 1.11\n     "
    },
    {
      "type": "field",
      "varNames": [
        "SHA_256"
      ],
      "begin_line": 79,
      "end_line": 79,
      "comment": "\n     * The SHA-256 hash algorithm defined in the FIPS PUB 180-2.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "SHA_384"
      ],
      "begin_line": 84,
      "end_line": 84,
      "comment": "\n     * The SHA-384 hash algorithm defined in the FIPS PUB 180-2.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "SHA_512"
      ],
      "begin_line": 89,
      "end_line": 89,
      "comment": "\n     * The SHA-512 hash algorithm defined in the FIPS PUB 180-2.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "SHA3_224"
      ],
      "begin_line": 99,
      "end_line": 99,
      "comment": "\n     * The SHA3-224 hash algorithm defined in the FIPS PUB 202.\n     * \u003cp\u003e\n     * Likely to be included in Oracle Java 9 GA.\n     * \u003c/p\u003e\n     *\n     * @since 1.11\n     "
    },
    {
      "type": "field",
      "varNames": [
        "SHA3_256"
      ],
      "begin_line": 109,
      "end_line": 109,
      "comment": "\n     * The SHA3-256 hash algorithm defined in the FIPS PUB 202.\n     * \u003cp\u003e\n     * Likely to be included in Oracle Java 9 GA.\n     * \u003c/p\u003e\n     *\n     * @since 1.11\n     "
    },
    {
      "type": "field",
      "varNames": [
        "SHA3_384"
      ],
      "begin_line": 119,
      "end_line": 119,
      "comment": "\n     * The SHA3-384 hash algorithm defined in the FIPS PUB 202.\n     * \u003cp\u003e\n     * Likely to be included in Oracle Java 9 GA.\n     * \u003c/p\u003e\n     *\n     * @since 1.11\n     "
    },
    {
      "type": "field",
      "varNames": [
        "SHA3_512"
      ],
      "begin_line": 129,
      "end_line": 129,
      "comment": "\n     * The SHA3-512 hash algorithm defined in the FIPS PUB 202.\n     * \u003cp\u003e\n     * Likely to be included in Oracle Java 9 GA.\n     * \u003c/p\u003e\n     *\n     * @since 1.11\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.MessageDigestAlgorithms.values()",
      "begin_line": 137,
      "end_line": 142,
      "comment": "\n     * Gets all constant values defined in this class.\n     *\n     * @return all constant values defined in this class.\n     * @since 1.11\n     ",
      "child_ranges": [
        "(line 139,col 9)-(line 141,col 10)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.codec.digest.MessageDigestAlgorithms.MessageDigestAlgorithms()",
      "begin_line": 144,
      "end_line": 146,
      "comment": "",
      "child_ranges": []
    }
  ]
}