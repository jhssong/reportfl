{
  "filepath": "/tmp/Codec-13b/src/main/java/org/apache/commons/codec/digest/Sha2Crypt.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Sha2Crypt",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 41,
      "end_line": 545,
      "comment": "\n * SHA2-based Unix crypt implementation.\n * \u003cp\u003e\n * Based on the C implementation released into the Public Domain by Ulrich Drepper \u0026lt;drepper@redhat.com\u0026gt;\n * http://www.akkadia.org/drepper/SHA-crypt.txt\n * \u003cp\u003e\n * Conversion to Kotlin and from there to Java in 2012 by Christian Hammers \u0026lt;ch@lathspell.de\u0026gt; and likewise put\n * into the Public Domain.\n * \u003cp\u003e\n * This class is immutable and thread-safe.\n *\n * @version $Id$\n * @since 1.7\n "
    },
    {
      "type": "field",
      "varNames": [
        "ROUNDS_DEFAULT"
      ],
      "begin_line": 44,
      "end_line": 44,
      "comment": " Default number of rounds if not explicitly specified. "
    },
    {
      "type": "field",
      "varNames": [
        "ROUNDS_MAX"
      ],
      "begin_line": 47,
      "end_line": 47,
      "comment": " Maximum number of rounds. "
    },
    {
      "type": "field",
      "varNames": [
        "ROUNDS_MIN"
      ],
      "begin_line": 50,
      "end_line": 50,
      "comment": " Minimum number of rounds. "
    },
    {
      "type": "field",
      "varNames": [
        "ROUNDS_PREFIX"
      ],
      "begin_line": 53,
      "end_line": 53,
      "comment": " Prefix for optional rounds specification. "
    },
    {
      "type": "field",
      "varNames": [
        "SHA256_BLOCKSIZE"
      ],
      "begin_line": 56,
      "end_line": 56,
      "comment": " The number of bytes the final hash value will have (SHA-256 variant). "
    },
    {
      "type": "field",
      "varNames": [
        "SHA256_PREFIX"
      ],
      "begin_line": 59,
      "end_line": 59,
      "comment": " The prefixes that can be used to identify this crypt() variant (SHA-256). "
    },
    {
      "type": "field",
      "varNames": [
        "SHA512_BLOCKSIZE"
      ],
      "begin_line": 62,
      "end_line": 62,
      "comment": " The number of bytes the final hash value will have (SHA-512 variant). "
    },
    {
      "type": "field",
      "varNames": [
        "SHA512_PREFIX"
      ],
      "begin_line": 65,
      "end_line": 65,
      "comment": " The prefixes that can be used to identify this crypt() variant (SHA-512). "
    },
    {
      "type": "field",
      "varNames": [
        "SALT_PATTERN"
      ],
      "begin_line": 68,
      "end_line": 69,
      "comment": " The pattern to match valid salt values. "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.Sha2Crypt.sha256Crypt(byte[])",
      "begin_line": 82,
      "end_line": 84,
      "comment": "\n     * Generates a libc crypt() compatible \"$5$\" hash value with random salt.\n     * \u003cp\u003e\n     * See {@link Crypt#crypt(String, String)} for details.\n     *\n     * @param keyBytes\n     *            plaintext to hash\n     * @return complete hash value\n     * @throws RuntimeException\n     *             when a {@link java.security.NoSuchAlgorithmException} is caught.\n     ",
      "child_ranges": [
        "(line 83,col 9)-(line 83,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.Sha2Crypt.sha256Crypt(byte[], java.lang.String)",
      "begin_line": 101,
      "end_line": 106,
      "comment": "\n     * Generates a libc6 crypt() compatible \"$5$\" hash value.\n     * \u003cp\u003e\n     * See {@link Crypt#crypt(String, String)} for details.\n     *\n     * @param keyBytes\n     *            plaintext to hash\n     * @param salt\n     *            real salt value without prefix or \"rounds\u003d\"\n     * @return complete hash value including salt\n     * @throws IllegalArgumentException\n     *             if the salt does not match the allowed pattern\n     * @throws RuntimeException\n     *             when a {@link java.security.NoSuchAlgorithmException} is caught.\n     ",
      "child_ranges": [
        "(line 102,col 9)-(line 104,col 9)",
        "(line 105,col 9)-(line 105,col 107)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.Sha2Crypt.sha2Crypt(byte[], java.lang.String, java.lang.String, int, java.lang.String)",
      "begin_line": 133,
      "end_line": 507,
      "comment": "\n     * Generates a libc6 crypt() compatible \"$5$\" or \"$6$\" SHA2 based hash value.\n     * \u003cp\u003e\n     * This is a nearly line by line conversion of the original C function. The numbered comments are from the algorithm\n     * description, the short C-style ones from the original C code and the ones with \"Remark\" from me.\n     * \u003cp\u003e\n     * See {@link Crypt#crypt(String, String)} for details.\n     *\n     * @param keyBytes\n     *            plaintext to hash\n     * @param salt\n     *            real salt value without prefix or \"rounds\u003d\"\n     * @param saltPrefix\n     *            either $5$ or $6$\n     * @param blocksize\n     *            a value that differs between $5$ and $6$\n     * @param algorithm\n     *            {@link MessageDigest} algorithm identifier string\n     * @return complete hash value including prefix and salt\n     * @throws IllegalArgumentException\n     *             if the given salt is {@code null} or does not match the allowed pattern\n     * @throws IllegalArgumentException\n     *             when a {@link NoSuchAlgorithmException} is caught\n     * @see MessageDigestAlgorithms\n     ",
      "child_ranges": [
        "(line 136,col 9)-(line 136,col 43)",
        "(line 139,col 9)-(line 139,col 36)",
        "(line 140,col 9)-(line 140,col 37)",
        "(line 141,col 9)-(line 143,col 9)",
        "(line 145,col 9)-(line 145,col 53)",
        "(line 146,col 9)-(line 148,col 9)",
        "(line 149,col 9)-(line 153,col 9)",
        "(line 154,col 9)-(line 154,col 45)",
        "(line 155,col 9)-(line 155,col 69)",
        "(line 156,col 9)-(line 156,col 45)",
        "(line 160,col 9)-(line 160,col 61)",
        "(line 166,col 9)-(line 166,col 29)",
        "(line 181,col 9)-(line 181,col 30)",
        "(line 188,col 9)-(line 188,col 64)",
        "(line 194,col 9)-(line 194,col 32)",
        "(line 200,col 9)-(line 200,col 33)",
        "(line 206,col 9)-(line 206,col 32)",
        "(line 212,col 9)-(line 212,col 43)",
        "(line 222,col 9)-(line 222,col 34)",
        "(line 223,col 9)-(line 226,col 9)",
        "(line 230,col 9)-(line 230,col 38)",
        "(line 246,col 9)-(line 246,col 30)",
        "(line 247,col 9)-(line 254,col 9)",
        "(line 260,col 9)-(line 260,col 33)",
        "(line 266,col 9)-(line 266,col 50)",
        "(line 275,col 9)-(line 277,col 9)",
        "(line 283,col 9)-(line 283,col 44)",
        "(line 295,col 9)-(line 295,col 47)",
        "(line 296,col 9)-(line 296,col 19)",
        "(line 297,col 9)-(line 300,col 9)",
        "(line 301,col 9)-(line 301,col 65)",
        "(line 307,col 9)-(line 307,col 50)",
        "(line 316,col 9)-(line 318,col 9)",
        "(line 324,col 9)-(line 324,col 37)",
        "(line 337,col 9)-(line 337,col 48)",
        "(line 338,col 9)-(line 338,col 15)",
        "(line 339,col 9)-(line 342,col 9)",
        "(line 343,col 9)-(line 343,col 66)",
        "(line 356,col 9)-(line 406,col 9)",
        "(line 423,col 9)-(line 423,col 67)",
        "(line 424,col 9)-(line 428,col 9)",
        "(line 429,col 9)-(line 429,col 34)",
        "(line 430,col 9)-(line 430,col 27)",
        "(line 456,col 9)-(line 491,col 9)",
        "(line 498,col 9)-(line 498,col 42)",
        "(line 499,col 9)-(line 499,col 38)",
        "(line 500,col 9)-(line 500,col 38)",
        "(line 501,col 9)-(line 501,col 20)",
        "(line 502,col 9)-(line 502,col 23)",
        "(line 503,col 9)-(line 503,col 40)",
        "(line 504,col 9)-(line 504,col 41)",
        "(line 506,col 9)-(line 506,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.Sha2Crypt.sha512Crypt(byte[])",
      "begin_line": 520,
      "end_line": 522,
      "comment": "\n     * Generates a libc crypt() compatible \"$6$\" hash value with random salt.\n     * \u003cp\u003e\n     * See {@link Crypt#crypt(String, String)} for details.\n     *\n     * @param keyBytes\n     *            plaintext to hash\n     * @return complete hash value\n     * @throws RuntimeException\n     *             when a {@link java.security.NoSuchAlgorithmException} is caught.\n     ",
      "child_ranges": [
        "(line 521,col 9)-(line 521,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.Sha2Crypt.sha512Crypt(byte[], java.lang.String)",
      "begin_line": 539,
      "end_line": 544,
      "comment": "\n     * Generates a libc6 crypt() compatible \"$6$\" hash value.\n     * \u003cp\u003e\n     * See {@link Crypt#crypt(String, String)} for details.\n     *\n     * @param keyBytes\n     *            plaintext to hash\n     * @param salt\n     *            real salt value without prefix or \"rounds\u003d\"\n     * @return complete hash value including salt\n     * @throws IllegalArgumentException\n     *             if the salt does not match the allowed pattern\n     * @throws RuntimeException\n     *             when a {@link java.security.NoSuchAlgorithmException} is caught.\n     ",
      "child_ranges": [
        "(line 540,col 9)-(line 542,col 9)",
        "(line 543,col 9)-(line 543,col 107)"
      ]
    }
  ]
}