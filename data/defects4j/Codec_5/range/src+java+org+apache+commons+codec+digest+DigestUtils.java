{
  "filepath": "/tmp/Codec-5b/src/java/org/apache/commons/codec/digest/DigestUtils.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "DigestUtils",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 34,
      "end_line": 582,
      "comment": "\n * Operations to simplifiy common {@link java.security.MessageDigest} tasks. This class is thread safe.\n * \n * @author Apache Software Foundation\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "STREAM_BUFFER_LENGTH"
      ],
      "begin_line": 36,
      "end_line": 36,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.DigestUtils.digest(java.security.MessageDigest, java.io.InputStream)",
      "begin_line": 49,
      "end_line": 59,
      "comment": "\n     * Read through an InputStream and returns the digest for the data\n     * \n     * @param digest\n     *            The MessageDigest to use (e.g. MD5)\n     * @param data\n     *            Data to digest\n     * @return MD5 digest\n     * @throws IOException\n     *             On error reading from the stream\n     ",
      "child_ranges": [
        "(line 50,col 9)-(line 50,col 55)",
        "(line 51,col 9)-(line 51,col 62)",
        "(line 53,col 9)-(line 56,col 9)",
        "(line 58,col 9)-(line 58,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.DigestUtils.getBytesUtf8(java.lang.String)",
      "begin_line": 68,
      "end_line": 70,
      "comment": "\n     * Calls {@link StringUtils#getBytesUtf8(String)}\n     * \n     * @param data\n     *            the String to encode\n     * @return encoded bytes\n     ",
      "child_ranges": [
        "(line 69,col 9)-(line 69,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.DigestUtils.getDigest(java.lang.String)",
      "begin_line": 85,
      "end_line": 91,
      "comment": "\n     * Returns a \u003ccode\u003eMessageDigest\u003c/code\u003e for the given \u003ccode\u003ealgorithm\u003c/code\u003e.\n     * \n     * @param algorithm\n     *            the name of the algorithm requested. See \u003ca\n     *            href\u003d\"http://java.sun.com/j2se/1.3/docs/guide/security/CryptoSpec.html#AppA\"\u003eAppendix A in the Java\n     *            Cryptography Architecture API Specification \u0026 Reference\u003c/a\u003e for information about standard algorithm\n     *            names.\n     * @return An MD5 digest instance.\n     * @see MessageDigest#getInstance(String)\n     * @throws RuntimeException\n     *             when a {@link java.security.NoSuchAlgorithmException} is caught.\n     ",
      "child_ranges": [
        "(line 86,col 9)-(line 90,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.DigestUtils.getMd5Digest()",
      "begin_line": 100,
      "end_line": 102,
      "comment": "\n     * Returns an MD5 MessageDigest.\n     * \n     * @return An MD5 digest instance.\n     * @throws RuntimeException\n     *             when a {@link java.security.NoSuchAlgorithmException} is caught.\n     ",
      "child_ranges": [
        "(line 101,col 9)-(line 101,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.DigestUtils.getSha256Digest()",
      "begin_line": 114,
      "end_line": 116,
      "comment": "\n     * Returns an SHA-256 digest.\n     * \u003cp\u003e\n     * Throws a \u003ccode\u003eRuntimeException\u003c/code\u003e on JRE versions prior to 1.4.0.\n     * \u003c/p\u003e\n     * \n     * @return An SHA-256 digest instance.\n     * @throws RuntimeException\n     *             when a {@link java.security.NoSuchAlgorithmException} is caught.\n     ",
      "child_ranges": [
        "(line 115,col 9)-(line 115,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.DigestUtils.getSha384Digest()",
      "begin_line": 128,
      "end_line": 130,
      "comment": "\n     * Returns an SHA-384 digest.\n     * \u003cp\u003e\n     * Throws a \u003ccode\u003eRuntimeException\u003c/code\u003e on JRE versions prior to 1.4.0.\n     * \u003c/p\u003e\n     * \n     * @return An SHA-384 digest instance.\n     * @throws RuntimeException\n     *             when a {@link java.security.NoSuchAlgorithmException} is caught.\n     ",
      "child_ranges": [
        "(line 129,col 9)-(line 129,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.DigestUtils.getSha512Digest()",
      "begin_line": 142,
      "end_line": 144,
      "comment": "\n     * Returns an SHA-512 digest.\n     * \u003cp\u003e\n     * Throws a \u003ccode\u003eRuntimeException\u003c/code\u003e on JRE versions prior to 1.4.0.\n     * \u003c/p\u003e\n     * \n     * @return An SHA-512 digest instance.\n     * @throws RuntimeException\n     *             when a {@link java.security.NoSuchAlgorithmException} is caught.\n     ",
      "child_ranges": [
        "(line 143,col 9)-(line 143,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.DigestUtils.getShaDigest()",
      "begin_line": 153,
      "end_line": 155,
      "comment": "\n     * Returns an SHA-1 digest.\n     * \n     * @return An SHA-1 digest instance.\n     * @throws RuntimeException\n     *             when a {@link java.security.NoSuchAlgorithmException} is caught.\n     ",
      "child_ranges": [
        "(line 154,col 9)-(line 154,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.DigestUtils.md5(byte[])",
      "begin_line": 164,
      "end_line": 166,
      "comment": "\n     * Calculates the MD5 digest and returns the value as a 16 element \u003ccode\u003ebyte[]\u003c/code\u003e.\n     * \n     * @param data\n     *            Data to digest\n     * @return MD5 digest\n     ",
      "child_ranges": [
        "(line 165,col 9)-(line 165,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.DigestUtils.md5(java.io.InputStream)",
      "begin_line": 178,
      "end_line": 180,
      "comment": "\n     * Calculates the MD5 digest and returns the value as a 16 element \u003ccode\u003ebyte[]\u003c/code\u003e.\n     * \n     * @param data\n     *            Data to digest\n     * @return MD5 digest\n     * @throws IOException\n     *             On error reading from the stream\n     * @since 1.4\n     ",
      "child_ranges": [
        "(line 179,col 9)-(line 179,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.DigestUtils.md5(java.lang.String)",
      "begin_line": 189,
      "end_line": 191,
      "comment": "\n     * Calculates the MD5 digest and returns the value as a 16 element \u003ccode\u003ebyte[]\u003c/code\u003e.\n     * \n     * @param data\n     *            Data to digest\n     * @return MD5 digest\n     ",
      "child_ranges": [
        "(line 190,col 9)-(line 190,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.DigestUtils.md5Hex(byte[])",
      "begin_line": 200,
      "end_line": 202,
      "comment": "\n     * Calculates the MD5 digest and returns the value as a 32 character hex string.\n     * \n     * @param data\n     *            Data to digest\n     * @return MD5 digest as a hex string\n     ",
      "child_ranges": [
        "(line 201,col 9)-(line 201,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.DigestUtils.md5Hex(java.io.InputStream)",
      "begin_line": 214,
      "end_line": 216,
      "comment": "\n     * Calculates the MD5 digest and returns the value as a 32 character hex string.\n     * \n     * @param data\n     *            Data to digest\n     * @return MD5 digest as a hex string\n     * @throws IOException\n     *             On error reading from the stream\n     * @since 1.4\n     ",
      "child_ranges": [
        "(line 215,col 9)-(line 215,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.DigestUtils.md5Hex(java.lang.String)",
      "begin_line": 225,
      "end_line": 227,
      "comment": "\n     * Calculates the MD5 digest and returns the value as a 32 character hex string.\n     * \n     * @param data\n     *            Data to digest\n     * @return MD5 digest as a hex string\n     ",
      "child_ranges": [
        "(line 226,col 9)-(line 226,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.DigestUtils.sha(byte[])",
      "begin_line": 236,
      "end_line": 238,
      "comment": "\n     * Calculates the SHA-1 digest and returns the value as a \u003ccode\u003ebyte[]\u003c/code\u003e.\n     * \n     * @param data\n     *            Data to digest\n     * @return SHA-1 digest\n     ",
      "child_ranges": [
        "(line 237,col 9)-(line 237,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.DigestUtils.sha(java.io.InputStream)",
      "begin_line": 250,
      "end_line": 252,
      "comment": "\n     * Calculates the SHA-1 digest and returns the value as a \u003ccode\u003ebyte[]\u003c/code\u003e.\n     * \n     * @param data\n     *            Data to digest\n     * @return SHA-1 digest\n     * @throws IOException\n     *             On error reading from the stream\n     * @since 1.4\n     ",
      "child_ranges": [
        "(line 251,col 9)-(line 251,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.DigestUtils.sha(java.lang.String)",
      "begin_line": 261,
      "end_line": 263,
      "comment": "\n     * Calculates the SHA-1 digest and returns the value as a \u003ccode\u003ebyte[]\u003c/code\u003e.\n     * \n     * @param data\n     *            Data to digest\n     * @return SHA-1 digest\n     ",
      "child_ranges": [
        "(line 262,col 9)-(line 262,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.DigestUtils.sha256(byte[])",
      "begin_line": 276,
      "end_line": 278,
      "comment": "\n     * Calculates the SHA-256 digest and returns the value as a \u003ccode\u003ebyte[]\u003c/code\u003e.\n     * \u003cp\u003e\n     * Throws a \u003ccode\u003eRuntimeException\u003c/code\u003e on JRE versions prior to 1.4.0.\n     * \u003c/p\u003e\n     * \n     * @param data\n     *            Data to digest\n     * @return SHA-256 digest\n     * @since 1.4\n     ",
      "child_ranges": [
        "(line 277,col 9)-(line 277,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.DigestUtils.sha256(java.io.InputStream)",
      "begin_line": 293,
      "end_line": 295,
      "comment": "\n     * Calculates the SHA-256 digest and returns the value as a \u003ccode\u003ebyte[]\u003c/code\u003e.\n     * \u003cp\u003e\n     * Throws a \u003ccode\u003eRuntimeException\u003c/code\u003e on JRE versions prior to 1.4.0.\n     * \u003c/p\u003e\n     * \n     * @param data\n     *            Data to digest\n     * @return SHA-256 digest\n     * @throws IOException\n     *             On error reading from the stream\n     * @since 1.4\n     ",
      "child_ranges": [
        "(line 294,col 9)-(line 294,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.DigestUtils.sha256(java.lang.String)",
      "begin_line": 308,
      "end_line": 310,
      "comment": "\n     * Calculates the SHA-256 digest and returns the value as a \u003ccode\u003ebyte[]\u003c/code\u003e.\n     * \u003cp\u003e\n     * Throws a \u003ccode\u003eRuntimeException\u003c/code\u003e on JRE versions prior to 1.4.0.\n     * \u003c/p\u003e\n     * \n     * @param data\n     *            Data to digest\n     * @return SHA-256 digest\n     * @since 1.4\n     ",
      "child_ranges": [
        "(line 309,col 9)-(line 309,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.DigestUtils.sha256Hex(byte[])",
      "begin_line": 323,
      "end_line": 325,
      "comment": "\n     * Calculates the SHA-256 digest and returns the value as a hex string.\n     * \u003cp\u003e\n     * Throws a \u003ccode\u003eRuntimeException\u003c/code\u003e on JRE versions prior to 1.4.0.\n     * \u003c/p\u003e\n     * \n     * @param data\n     *            Data to digest\n     * @return SHA-256 digest as a hex string\n     * @since 1.4\n     ",
      "child_ranges": [
        "(line 324,col 9)-(line 324,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.DigestUtils.sha256Hex(java.io.InputStream)",
      "begin_line": 340,
      "end_line": 342,
      "comment": "\n     * Calculates the SHA-256 digest and returns the value as a hex string.\n     * \u003cp\u003e\n     * Throws a \u003ccode\u003eRuntimeException\u003c/code\u003e on JRE versions prior to 1.4.0.\n     * \u003c/p\u003e\n     * \n     * @param data\n     *            Data to digest\n     * @return SHA-256 digest as a hex string\n     * @throws IOException\n     *             On error reading from the stream\n     * @since 1.4\n     ",
      "child_ranges": [
        "(line 341,col 9)-(line 341,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.DigestUtils.sha256Hex(java.lang.String)",
      "begin_line": 355,
      "end_line": 357,
      "comment": "\n     * Calculates the SHA-256 digest and returns the value as a hex string.\n     * \u003cp\u003e\n     * Throws a \u003ccode\u003eRuntimeException\u003c/code\u003e on JRE versions prior to 1.4.0.\n     * \u003c/p\u003e\n     * \n     * @param data\n     *            Data to digest\n     * @return SHA-256 digest as a hex string\n     * @since 1.4\n     ",
      "child_ranges": [
        "(line 356,col 9)-(line 356,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.DigestUtils.sha384(byte[])",
      "begin_line": 370,
      "end_line": 372,
      "comment": "\n     * Calculates the SHA-384 digest and returns the value as a \u003ccode\u003ebyte[]\u003c/code\u003e.\n     * \u003cp\u003e\n     * Throws a \u003ccode\u003eRuntimeException\u003c/code\u003e on JRE versions prior to 1.4.0.\n     * \u003c/p\u003e\n     * \n     * @param data\n     *            Data to digest\n     * @return SHA-384 digest\n     * @since 1.4\n     ",
      "child_ranges": [
        "(line 371,col 9)-(line 371,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.DigestUtils.sha384(java.io.InputStream)",
      "begin_line": 387,
      "end_line": 389,
      "comment": "\n     * Calculates the SHA-384 digest and returns the value as a \u003ccode\u003ebyte[]\u003c/code\u003e.\n     * \u003cp\u003e\n     * Throws a \u003ccode\u003eRuntimeException\u003c/code\u003e on JRE versions prior to 1.4.0.\n     * \u003c/p\u003e\n     * \n     * @param data\n     *            Data to digest\n     * @return SHA-384 digest\n     * @throws IOException\n     *             On error reading from the stream\n     * @since 1.4\n     ",
      "child_ranges": [
        "(line 388,col 9)-(line 388,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.DigestUtils.sha384(java.lang.String)",
      "begin_line": 402,
      "end_line": 404,
      "comment": "\n     * Calculates the SHA-384 digest and returns the value as a \u003ccode\u003ebyte[]\u003c/code\u003e.\n     * \u003cp\u003e\n     * Throws a \u003ccode\u003eRuntimeException\u003c/code\u003e on JRE versions prior to 1.4.0.\n     * \u003c/p\u003e\n     * \n     * @param data\n     *            Data to digest\n     * @return SHA-384 digest\n     * @since 1.4\n     ",
      "child_ranges": [
        "(line 403,col 9)-(line 403,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.DigestUtils.sha384Hex(byte[])",
      "begin_line": 417,
      "end_line": 419,
      "comment": "\n     * Calculates the SHA-384 digest and returns the value as a hex string.\n     * \u003cp\u003e\n     * Throws a \u003ccode\u003eRuntimeException\u003c/code\u003e on JRE versions prior to 1.4.0.\n     * \u003c/p\u003e\n     * \n     * @param data\n     *            Data to digest\n     * @return SHA-384 digest as a hex string\n     * @since 1.4\n     ",
      "child_ranges": [
        "(line 418,col 9)-(line 418,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.DigestUtils.sha384Hex(java.io.InputStream)",
      "begin_line": 434,
      "end_line": 436,
      "comment": "\n     * Calculates the SHA-384 digest and returns the value as a hex string.\n     * \u003cp\u003e\n     * Throws a \u003ccode\u003eRuntimeException\u003c/code\u003e on JRE versions prior to 1.4.0.\n     * \u003c/p\u003e\n     * \n     * @param data\n     *            Data to digest\n     * @return SHA-384 digest as a hex string\n     * @throws IOException\n     *             On error reading from the stream\n     * @since 1.4\n     ",
      "child_ranges": [
        "(line 435,col 9)-(line 435,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.DigestUtils.sha384Hex(java.lang.String)",
      "begin_line": 449,
      "end_line": 451,
      "comment": "\n     * Calculates the SHA-384 digest and returns the value as a hex string.\n     * \u003cp\u003e\n     * Throws a \u003ccode\u003eRuntimeException\u003c/code\u003e on JRE versions prior to 1.4.0.\n     * \u003c/p\u003e\n     * \n     * @param data\n     *            Data to digest\n     * @return SHA-384 digest as a hex string\n     * @since 1.4\n     ",
      "child_ranges": [
        "(line 450,col 9)-(line 450,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.DigestUtils.sha512(byte[])",
      "begin_line": 464,
      "end_line": 466,
      "comment": "\n     * Calculates the SHA-512 digest and returns the value as a \u003ccode\u003ebyte[]\u003c/code\u003e.\n     * \u003cp\u003e\n     * Throws a \u003ccode\u003eRuntimeException\u003c/code\u003e on JRE versions prior to 1.4.0.\n     * \u003c/p\u003e\n     * \n     * @param data\n     *            Data to digest\n     * @return SHA-512 digest\n     * @since 1.4\n     ",
      "child_ranges": [
        "(line 465,col 9)-(line 465,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.DigestUtils.sha512(java.io.InputStream)",
      "begin_line": 481,
      "end_line": 483,
      "comment": "\n     * Calculates the SHA-512 digest and returns the value as a \u003ccode\u003ebyte[]\u003c/code\u003e.\n     * \u003cp\u003e\n     * Throws a \u003ccode\u003eRuntimeException\u003c/code\u003e on JRE versions prior to 1.4.0.\n     * \u003c/p\u003e\n     * \n     * @param data\n     *            Data to digest\n     * @return SHA-512 digest\n     * @throws IOException\n     *             On error reading from the stream\n     * @since 1.4\n     ",
      "child_ranges": [
        "(line 482,col 9)-(line 482,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.DigestUtils.sha512(java.lang.String)",
      "begin_line": 496,
      "end_line": 498,
      "comment": "\n     * Calculates the SHA-512 digest and returns the value as a \u003ccode\u003ebyte[]\u003c/code\u003e.\n     * \u003cp\u003e\n     * Throws a \u003ccode\u003eRuntimeException\u003c/code\u003e on JRE versions prior to 1.4.0.\n     * \u003c/p\u003e\n     * \n     * @param data\n     *            Data to digest\n     * @return SHA-512 digest\n     * @since 1.4\n     ",
      "child_ranges": [
        "(line 497,col 9)-(line 497,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.DigestUtils.sha512Hex(byte[])",
      "begin_line": 511,
      "end_line": 513,
      "comment": "\n     * Calculates the SHA-512 digest and returns the value as a hex string.\n     * \u003cp\u003e\n     * Throws a \u003ccode\u003eRuntimeException\u003c/code\u003e on JRE versions prior to 1.4.0.\n     * \u003c/p\u003e\n     * \n     * @param data\n     *            Data to digest\n     * @return SHA-512 digest as a hex string\n     * @since 1.4\n     ",
      "child_ranges": [
        "(line 512,col 9)-(line 512,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.DigestUtils.sha512Hex(java.io.InputStream)",
      "begin_line": 528,
      "end_line": 530,
      "comment": "\n     * Calculates the SHA-512 digest and returns the value as a hex string.\n     * \u003cp\u003e\n     * Throws a \u003ccode\u003eRuntimeException\u003c/code\u003e on JRE versions prior to 1.4.0.\n     * \u003c/p\u003e\n     * \n     * @param data\n     *            Data to digest\n     * @return SHA-512 digest as a hex string\n     * @throws IOException\n     *             On error reading from the stream\n     * @since 1.4\n     ",
      "child_ranges": [
        "(line 529,col 9)-(line 529,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.DigestUtils.sha512Hex(java.lang.String)",
      "begin_line": 543,
      "end_line": 545,
      "comment": "\n     * Calculates the SHA-512 digest and returns the value as a hex string.\n     * \u003cp\u003e\n     * Throws a \u003ccode\u003eRuntimeException\u003c/code\u003e on JRE versions prior to 1.4.0.\n     * \u003c/p\u003e\n     * \n     * @param data\n     *            Data to digest\n     * @return SHA-512 digest as a hex string\n     * @since 1.4\n     ",
      "child_ranges": [
        "(line 544,col 9)-(line 544,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.DigestUtils.shaHex(byte[])",
      "begin_line": 554,
      "end_line": 556,
      "comment": "\n     * Calculates the SHA-1 digest and returns the value as a hex string.\n     * \n     * @param data\n     *            Data to digest\n     * @return SHA-1 digest as a hex string\n     ",
      "child_ranges": [
        "(line 555,col 9)-(line 555,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.DigestUtils.shaHex(java.io.InputStream)",
      "begin_line": 568,
      "end_line": 570,
      "comment": "\n     * Calculates the SHA-1 digest and returns the value as a hex string.\n     * \n     * @param data\n     *            Data to digest\n     * @return SHA-1 digest as a hex string\n     * @throws IOException\n     *             On error reading from the stream\n     * @since 1.4\n     ",
      "child_ranges": [
        "(line 569,col 9)-(line 569,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.DigestUtils.shaHex(java.lang.String)",
      "begin_line": 579,
      "end_line": 581,
      "comment": "\n     * Calculates the SHA-1 digest and returns the value as a hex string.\n     * \n     * @param data\n     *            Data to digest\n     * @return SHA-1 digest as a hex string\n     ",
      "child_ranges": [
        "(line 580,col 9)-(line 580,col 46)"
      ]
    }
  ]
}