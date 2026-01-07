{
  "filepath": "/tmp/Codec-13b/src/main/java/org/apache/commons/codec/digest/Md5Crypt.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Md5Crypt",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 48,
      "end_line": 302,
      "comment": "\n * The libc crypt() \"$1$\" and Apache \"$apr1$\" MD5-based hash algorithm.\n * \u003cp\u003e\n * Based on the public domain (\"beer-ware\") C implementation from Poul-Henning Kamp which was found at: \u003ca\n * href\u003d\"http://www.freebsd.org/cgi/cvsweb.cgi/src/lib/libcrypt/crypt-md5.c?rev\u003d1.1;content-type\u003dtext%2Fplain\"\u003e\n * crypt-md5.c @ freebsd.org\u003c/a\u003e\u003cbr\u003e\n * \u003cp\u003e\n * Source:\n *\n * \u003cpre\u003e\n * $FreeBSD: src/lib/libcrypt/crypt-md5.c,v 1.1 1999/01/21 13:50:09 brandon Exp $\n * \u003c/pre\u003e\n * \u003cp\u003e\n * Conversion to Kotlin and from there to Java in 2012.\n * \u003cp\u003e\n * The C style comments are from the original C code, the ones with \"//\" from the port.\n * \u003cp\u003e\n * This class is immutable and thread-safe.\n *\n * @version $Id$\n * @since 1.7\n "
    },
    {
      "type": "field",
      "varNames": [
        "APR1_PREFIX"
      ],
      "begin_line": 51,
      "end_line": 51,
      "comment": " The Identifier of the Apache variant. "
    },
    {
      "type": "field",
      "varNames": [
        "BLOCKSIZE"
      ],
      "begin_line": 54,
      "end_line": 54,
      "comment": " The number of bytes of the final hash. "
    },
    {
      "type": "field",
      "varNames": [
        "MD5_PREFIX"
      ],
      "begin_line": 57,
      "end_line": 57,
      "comment": " The Identifier of this crypt() variant. "
    },
    {
      "type": "field",
      "varNames": [
        "ROUNDS"
      ],
      "begin_line": 60,
      "end_line": 60,
      "comment": " The number of rounds of the big loop. "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.Md5Crypt.apr1Crypt(byte[])",
      "begin_line": 71,
      "end_line": 73,
      "comment": "\n     * See {@link #apr1Crypt(String, String)} for details.\n     *\n     * @param keyBytes\n     *            plaintext string to hash.\n     * @return the hash value\n     * @throws RuntimeException\n     *             when a {@link java.security.NoSuchAlgorithmException} is caught. *\n     ",
      "child_ranges": [
        "(line 72,col 9)-(line 72,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.Md5Crypt.apr1Crypt(byte[], java.lang.String)",
      "begin_line": 87,
      "end_line": 93,
      "comment": "\n     * See {@link #apr1Crypt(String, String)} for details.\n     *\n     * @param keyBytes\n     *            plaintext string to hash.\n     * @param salt An APR1 salt.\n     * @return the hash value\n     * @throws IllegalArgumentException\n     *             if the salt does not match the allowed pattern\n     * @throws RuntimeException\n     *             when a {@link java.security.NoSuchAlgorithmException} is caught.\n     ",
      "child_ranges": [
        "(line 89,col 9)-(line 91,col 9)",
        "(line 92,col 9)-(line 92,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.Md5Crypt.apr1Crypt(java.lang.String)",
      "begin_line": 104,
      "end_line": 106,
      "comment": "\n     * See {@link #apr1Crypt(String, String)} for details.\n     *\n     * @param keyBytes\n     *            plaintext string to hash.\n     * @return the hash value\n     * @throws RuntimeException\n     *             when a {@link java.security.NoSuchAlgorithmException} is caught.\n     ",
      "child_ranges": [
        "(line 105,col 9)-(line 105,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.Md5Crypt.apr1Crypt(java.lang.String, java.lang.String)",
      "begin_line": 125,
      "end_line": 127,
      "comment": "\n     * Generates an Apache htpasswd compatible \"$apr1$\" MD5 based hash value.\n     * \u003cp\u003e\n     * The algorithm is identical to the crypt(3) \"$1$\" one but produces different outputs due to the different salt\n     * prefix.\n     *\n     * @param keyBytes\n     *            plaintext string to hash.\n     * @param salt\n     *            salt string including the prefix and optionally garbage at the end. Will be generated randomly if\n     *            null.\n     * @return the hash value\n     * @throws IllegalArgumentException\n     *             if the salt does not match the allowed pattern\n     * @throws RuntimeException\n     *             when a {@link java.security.NoSuchAlgorithmException} is caught.\n     ",
      "child_ranges": [
        "(line 126,col 9)-(line 126,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.Md5Crypt.md5Crypt(byte[])",
      "begin_line": 140,
      "end_line": 142,
      "comment": "\n     * Generates a libc6 crypt() compatible \"$1$\" hash value.\n     * \u003cp\u003e\n     * See {@link Crypt#crypt(String, String)} for details.\n     *\n     * @param keyBytes\n     *            plaintext string to hash.\n     * @return the hash value\n     * @throws RuntimeException\n     *             when a {@link java.security.NoSuchAlgorithmException} is caught.\n     ",
      "child_ranges": [
        "(line 141,col 9)-(line 141,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.Md5Crypt.md5Crypt(byte[], java.lang.String)",
      "begin_line": 160,
      "end_line": 162,
      "comment": "\n     * Generates a libc crypt() compatible \"$1$\" MD5 based hash value.\n     * \u003cp\u003e\n     * See {@link Crypt#crypt(String, String)} for details.\n     *\n     * @param keyBytes\n     *            plaintext string to hash.\n     * @param salt\n     *            salt string including the prefix and optionally garbage at the end. Will be generated randomly if\n     *            null.\n     * @return the hash value\n     * @throws IllegalArgumentException\n     *             if the salt does not match the allowed pattern\n     * @throws RuntimeException\n     *             when a {@link java.security.NoSuchAlgorithmException} is caught.\n     ",
      "child_ranges": [
        "(line 161,col 9)-(line 161,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.Md5Crypt.md5Crypt(byte[], java.lang.String, java.lang.String)",
      "begin_line": 179,
      "end_line": 301,
      "comment": "\n     * Generates a libc6 crypt() \"$1$\" or Apache htpasswd \"$apr1$\" hash value.\n     * \u003cp\u003e\n     * See {@link Crypt#crypt(String, String)} or {@link #apr1Crypt(String, String)} for details.\n     *\n     * @param keyBytes\n     *            plaintext string to hash.\n     * @param salt May be null.\n     * @param prefix salt prefix\n     * @return the hash value\n     * @throws IllegalArgumentException\n     *             if the salt does not match the allowed pattern\n     * @throws RuntimeException\n     *             when a {@link java.security.NoSuchAlgorithmException} is caught.\n     ",
      "child_ranges": [
        "(line 180,col 9)-(line 180,col 43)",
        "(line 183,col 9)-(line 183,col 26)",
        "(line 184,col 9)-(line 193,col 9)",
        "(line 194,col 9)-(line 194,col 69)",
        "(line 196,col 9)-(line 196,col 61)",
        "(line 201,col 9)-(line 201,col 29)",
        "(line 206,col 9)-(line 206,col 52)",
        "(line 211,col 9)-(line 211,col 30)",
        "(line 216,col 9)-(line 216,col 56)",
        "(line 217,col 9)-(line 217,col 30)",
        "(line 218,col 9)-(line 218,col 31)",
        "(line 219,col 9)-(line 219,col 30)",
        "(line 220,col 9)-(line 220,col 38)",
        "(line 221,col 9)-(line 221,col 24)",
        "(line 222,col 9)-(line 225,col 9)",
        "(line 230,col 9)-(line 230,col 38)",
        "(line 235,col 9)-(line 235,col 20)",
        "(line 236,col 9)-(line 236,col 24)",
        "(line 237,col 9)-(line 244,col 9)",
        "(line 249,col 9)-(line 249,col 82)",
        "(line 250,col 9)-(line 250,col 30)",
        "(line 256,col 9)-(line 278,col 9)",
        "(line 283,col 9)-(line 283,col 70)",
        "(line 284,col 9)-(line 284,col 70)",
        "(line 285,col 9)-(line 285,col 70)",
        "(line 286,col 9)-(line 286,col 70)",
        "(line 287,col 9)-(line 287,col 70)",
        "(line 288,col 9)-(line 288,col 68)",
        "(line 294,col 9)-(line 294,col 20)",
        "(line 295,col 9)-(line 295,col 21)",
        "(line 296,col 9)-(line 296,col 40)",
        "(line 297,col 9)-(line 297,col 41)",
        "(line 298,col 9)-(line 298,col 38)",
        "(line 300,col 9)-(line 300,col 33)"
      ]
    }
  ]
}