{
  "filepath": "/tmp/Codec-13b/src/main/java/org/apache/commons/codec/digest/DigestUtils.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "DigestUtils",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 34,
      "end_line": 819,
      "comment": "\n * Operations to simplify common {@link java.security.MessageDigest} tasks.\n * This class is immutable and thread-safe.\n *\n * @version $Id$\n "
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
      "end_line": 51,
      "comment": "\n     * Read through an InputStream and returns the digest for the data\n     *\n     * @param digest\n     *            The MessageDigest to use (e.g. MD5)\n     * @param data\n     *            Data to digest\n     * @return the digest\n     * @throws IOException\n     *             On error reading from the stream\n     ",
      "child_ranges": [
        "(line 50,col 9)-(line 50,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.DigestUtils.getDigest(java.lang.String)",
      "begin_line": 66,
      "end_line": 72,
      "comment": "\n     * Returns a \u003ccode\u003eMessageDigest\u003c/code\u003e for the given \u003ccode\u003ealgorithm\u003c/code\u003e.\n     *\n     * @param algorithm\n     *            the name of the algorithm requested. See \u003ca\n     *            href\u003d\"http://docs.oracle.com/javase/6/docs/technotes/guides/security/crypto/CryptoSpec.html#AppA\"\u003eAppendix A in the Java\n     *            Cryptography Architecture Reference Guide\u003c/a\u003e for information about standard algorithm\n     *            names.\n     * @return A digest instance.\n     * @see MessageDigest#getInstance(String)\n     * @throws IllegalArgumentException\n     *             when a {@link NoSuchAlgorithmException} is caught.\n     ",
      "child_ranges": [
        "(line 67,col 9)-(line 71,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.DigestUtils.getMd2Digest()",
      "begin_line": 84,
      "end_line": 86,
      "comment": "\n     * Returns an MD2 MessageDigest.\n     *\n     * @return An MD2 digest instance.\n     * @throws IllegalArgumentException\n     *             when a {@link NoSuchAlgorithmException} is caught, which should never happen because MD2 is a\n     *             built-in algorithm\n     * @see MessageDigestAlgorithms#MD2\n     * @since 1.7\n     ",
      "child_ranges": [
        "(line 85,col 9)-(line 85,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.DigestUtils.getMd5Digest()",
      "begin_line": 97,
      "end_line": 99,
      "comment": "\n     * Returns an MD5 MessageDigest.\n     *\n     * @return An MD5 digest instance.\n     * @throws IllegalArgumentException\n     *             when a {@link NoSuchAlgorithmException} is caught, which should never happen because MD5 is a\n     *             built-in algorithm\n     * @see MessageDigestAlgorithms#MD5\n     ",
      "child_ranges": [
        "(line 98,col 9)-(line 98,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.DigestUtils.getSha1Digest()",
      "begin_line": 111,
      "end_line": 113,
      "comment": "\n     * Returns an SHA-1 digest.\n     *\n     * @return An SHA-1 digest instance.\n     * @throws IllegalArgumentException\n     *             when a {@link NoSuchAlgorithmException} is caught, which should never happen because SHA-1 is a\n     *             built-in algorithm\n     * @see MessageDigestAlgorithms#SHA_1\n     * @since 1.7\n     ",
      "child_ranges": [
        "(line 112,col 9)-(line 112,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.DigestUtils.getSha256Digest()",
      "begin_line": 127,
      "end_line": 129,
      "comment": "\n     * Returns an SHA-256 digest.\n     * \u003cp\u003e\n     * Throws a \u003ccode\u003eRuntimeException\u003c/code\u003e on JRE versions prior to 1.4.0.\n     * \u003c/p\u003e\n     *\n     * @return An SHA-256 digest instance.\n     * @throws IllegalArgumentException\n     *             when a {@link NoSuchAlgorithmException} is caught, which should never happen because SHA-256 is a\n     *             built-in algorithm\n     * @see MessageDigestAlgorithms#SHA_256\n     ",
      "child_ranges": [
        "(line 128,col 9)-(line 128,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.DigestUtils.getSha384Digest()",
      "begin_line": 143,
      "end_line": 145,
      "comment": "\n     * Returns an SHA-384 digest.\n     * \u003cp\u003e\n     * Throws a \u003ccode\u003eRuntimeException\u003c/code\u003e on JRE versions prior to 1.4.0.\n     * \u003c/p\u003e\n     *\n     * @return An SHA-384 digest instance.\n     * @throws IllegalArgumentException\n     *             when a {@link NoSuchAlgorithmException} is caught, which should never happen because SHA-384 is a\n     *             built-in algorithm\n     * @see MessageDigestAlgorithms#SHA_384\n     ",
      "child_ranges": [
        "(line 144,col 9)-(line 144,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.DigestUtils.getSha512Digest()",
      "begin_line": 159,
      "end_line": 161,
      "comment": "\n     * Returns an SHA-512 digest.\n     * \u003cp\u003e\n     * Throws a \u003ccode\u003eRuntimeException\u003c/code\u003e on JRE versions prior to 1.4.0.\n     * \u003c/p\u003e\n     *\n     * @return An SHA-512 digest instance.\n     * @throws IllegalArgumentException\n     *             when a {@link NoSuchAlgorithmException} is caught, which should never happen because SHA-512 is a\n     *             built-in algorithm\n     * @see MessageDigestAlgorithms#SHA_512\n     ",
      "child_ranges": [
        "(line 160,col 9)-(line 160,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.DigestUtils.getShaDigest()",
      "begin_line": 171,
      "end_line": 174,
      "comment": "\n     * Returns an SHA-1 digest.\n     *\n     * @return An SHA-1 digest instance.\n     * @throws IllegalArgumentException\n     *             when a {@link NoSuchAlgorithmException} is caught\n     * @deprecated Use {@link #getSha1Digest()}\n     ",
      "child_ranges": [
        "(line 173,col 9)-(line 173,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.DigestUtils.md2(byte[])",
      "begin_line": 184,
      "end_line": 186,
      "comment": "\n     * Calculates the MD2 digest and returns the value as a 16 element \u003ccode\u003ebyte[]\u003c/code\u003e.\n     *\n     * @param data\n     *            Data to digest\n     * @return MD2 digest\n     * @since 1.7\n     ",
      "child_ranges": [
        "(line 185,col 9)-(line 185,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.DigestUtils.md2(java.io.InputStream)",
      "begin_line": 198,
      "end_line": 200,
      "comment": "\n     * Calculates the MD2 digest and returns the value as a 16 element \u003ccode\u003ebyte[]\u003c/code\u003e.\n     *\n     * @param data\n     *            Data to digest\n     * @return MD2 digest\n     * @throws IOException\n     *             On error reading from the stream\n     * @since 1.7\n     ",
      "child_ranges": [
        "(line 199,col 9)-(line 199,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.DigestUtils.md2(java.lang.String)",
      "begin_line": 210,
      "end_line": 212,
      "comment": "\n     * Calculates the MD2 digest and returns the value as a 16 element \u003ccode\u003ebyte[]\u003c/code\u003e.\n     *\n     * @param data\n     *            Data to digest; converted to bytes using {@link StringUtils#getBytesUtf8(String)}\n     * @return MD2 digest\n     * @since 1.7\n     ",
      "child_ranges": [
        "(line 211,col 9)-(line 211,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.DigestUtils.md2Hex(byte[])",
      "begin_line": 222,
      "end_line": 224,
      "comment": "\n     * Calculates the MD2 digest and returns the value as a 32 character hex string.\n     *\n     * @param data\n     *            Data to digest\n     * @return MD2 digest as a hex string\n     * @since 1.7\n     ",
      "child_ranges": [
        "(line 223,col 9)-(line 223,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.DigestUtils.md2Hex(java.io.InputStream)",
      "begin_line": 236,
      "end_line": 238,
      "comment": "\n     * Calculates the MD2 digest and returns the value as a 32 character hex string.\n     *\n     * @param data\n     *            Data to digest\n     * @return MD2 digest as a hex string\n     * @throws IOException\n     *             On error reading from the stream\n     * @since 1.7\n     ",
      "child_ranges": [
        "(line 237,col 9)-(line 237,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.DigestUtils.md2Hex(java.lang.String)",
      "begin_line": 248,
      "end_line": 250,
      "comment": "\n     * Calculates the MD2 digest and returns the value as a 32 character hex string.\n     *\n     * @param data\n     *            Data to digest\n     * @return MD2 digest as a hex string\n     * @since 1.7\n     ",
      "child_ranges": [
        "(line 249,col 9)-(line 249,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.DigestUtils.md5(byte[])",
      "begin_line": 259,
      "end_line": 261,
      "comment": "\n     * Calculates the MD5 digest and returns the value as a 16 element \u003ccode\u003ebyte[]\u003c/code\u003e.\n     *\n     * @param data\n     *            Data to digest\n     * @return MD5 digest\n     ",
      "child_ranges": [
        "(line 260,col 9)-(line 260,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.DigestUtils.md5(java.io.InputStream)",
      "begin_line": 273,
      "end_line": 275,
      "comment": "\n     * Calculates the MD5 digest and returns the value as a 16 element \u003ccode\u003ebyte[]\u003c/code\u003e.\n     *\n     * @param data\n     *            Data to digest\n     * @return MD5 digest\n     * @throws IOException\n     *             On error reading from the stream\n     * @since 1.4\n     ",
      "child_ranges": [
        "(line 274,col 9)-(line 274,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.DigestUtils.md5(java.lang.String)",
      "begin_line": 284,
      "end_line": 286,
      "comment": "\n     * Calculates the MD5 digest and returns the value as a 16 element \u003ccode\u003ebyte[]\u003c/code\u003e.\n     *\n     * @param data\n     *            Data to digest; converted to bytes using {@link StringUtils#getBytesUtf8(String)}\n     * @return MD5 digest\n     ",
      "child_ranges": [
        "(line 285,col 9)-(line 285,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.DigestUtils.md5Hex(byte[])",
      "begin_line": 295,
      "end_line": 297,
      "comment": "\n     * Calculates the MD5 digest and returns the value as a 32 character hex string.\n     *\n     * @param data\n     *            Data to digest\n     * @return MD5 digest as a hex string\n     ",
      "child_ranges": [
        "(line 296,col 9)-(line 296,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.DigestUtils.md5Hex(java.io.InputStream)",
      "begin_line": 309,
      "end_line": 311,
      "comment": "\n     * Calculates the MD5 digest and returns the value as a 32 character hex string.\n     *\n     * @param data\n     *            Data to digest\n     * @return MD5 digest as a hex string\n     * @throws IOException\n     *             On error reading from the stream\n     * @since 1.4\n     ",
      "child_ranges": [
        "(line 310,col 9)-(line 310,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.DigestUtils.md5Hex(java.lang.String)",
      "begin_line": 320,
      "end_line": 322,
      "comment": "\n     * Calculates the MD5 digest and returns the value as a 32 character hex string.\n     *\n     * @param data\n     *            Data to digest\n     * @return MD5 digest as a hex string\n     ",
      "child_ranges": [
        "(line 321,col 9)-(line 321,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.DigestUtils.sha(byte[])",
      "begin_line": 332,
      "end_line": 335,
      "comment": "\n     * Calculates the SHA-1 digest and returns the value as a \u003ccode\u003ebyte[]\u003c/code\u003e.\n     *\n     * @param data\n     *            Data to digest\n     * @return SHA-1 digest\n     * @deprecated Use {@link #sha1(byte[])}\n     ",
      "child_ranges": [
        "(line 334,col 9)-(line 334,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.DigestUtils.sha(java.io.InputStream)",
      "begin_line": 348,
      "end_line": 351,
      "comment": "\n     * Calculates the SHA-1 digest and returns the value as a \u003ccode\u003ebyte[]\u003c/code\u003e.\n     *\n     * @param data\n     *            Data to digest\n     * @return SHA-1 digest\n     * @throws IOException\n     *             On error reading from the stream\n     * @since 1.4\n     * @deprecated Use {@link #sha1(InputStream)}\n     ",
      "child_ranges": [
        "(line 350,col 9)-(line 350,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.DigestUtils.sha(java.lang.String)",
      "begin_line": 361,
      "end_line": 364,
      "comment": "\n     * Calculates the SHA-1 digest and returns the value as a \u003ccode\u003ebyte[]\u003c/code\u003e.\n     *\n     * @param data\n     *            Data to digest\n     * @return SHA-1 digest\n     * @deprecated Use {@link #sha1(String)}\n     ",
      "child_ranges": [
        "(line 363,col 9)-(line 363,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.DigestUtils.sha1(byte[])",
      "begin_line": 374,
      "end_line": 376,
      "comment": "\n     * Calculates the SHA-1 digest and returns the value as a \u003ccode\u003ebyte[]\u003c/code\u003e.\n     *\n     * @param data\n     *            Data to digest\n     * @return SHA-1 digest\n     * @since 1.7\n     ",
      "child_ranges": [
        "(line 375,col 9)-(line 375,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.DigestUtils.sha1(java.io.InputStream)",
      "begin_line": 388,
      "end_line": 390,
      "comment": "\n     * Calculates the SHA-1 digest and returns the value as a \u003ccode\u003ebyte[]\u003c/code\u003e.\n     *\n     * @param data\n     *            Data to digest\n     * @return SHA-1 digest\n     * @throws IOException\n     *             On error reading from the stream\n     * @since 1.7\n     ",
      "child_ranges": [
        "(line 389,col 9)-(line 389,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.DigestUtils.sha1(java.lang.String)",
      "begin_line": 399,
      "end_line": 401,
      "comment": "\n     * Calculates the SHA-1 digest and returns the value as a \u003ccode\u003ebyte[]\u003c/code\u003e.\n     *\n     * @param data\n     *            Data to digest; converted to bytes using {@link StringUtils#getBytesUtf8(String)}\n     * @return SHA-1 digest\n     ",
      "child_ranges": [
        "(line 400,col 9)-(line 400,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.DigestUtils.sha1Hex(byte[])",
      "begin_line": 411,
      "end_line": 413,
      "comment": "\n     * Calculates the SHA-1 digest and returns the value as a hex string.\n     *\n     * @param data\n     *            Data to digest\n     * @return SHA-1 digest as a hex string\n     * @since 1.7\n     ",
      "child_ranges": [
        "(line 412,col 9)-(line 412,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.DigestUtils.sha1Hex(java.io.InputStream)",
      "begin_line": 425,
      "end_line": 427,
      "comment": "\n     * Calculates the SHA-1 digest and returns the value as a hex string.\n     *\n     * @param data\n     *            Data to digest\n     * @return SHA-1 digest as a hex string\n     * @throws IOException\n     *             On error reading from the stream\n     * @since 1.7\n     ",
      "child_ranges": [
        "(line 426,col 9)-(line 426,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.DigestUtils.sha1Hex(java.lang.String)",
      "begin_line": 437,
      "end_line": 439,
      "comment": "\n     * Calculates the SHA-1 digest and returns the value as a hex string.\n     *\n     * @param data\n     *            Data to digest\n     * @return SHA-1 digest as a hex string\n     * @since 1.7\n     ",
      "child_ranges": [
        "(line 438,col 9)-(line 438,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.DigestUtils.sha256(byte[])",
      "begin_line": 452,
      "end_line": 454,
      "comment": "\n     * Calculates the SHA-256 digest and returns the value as a \u003ccode\u003ebyte[]\u003c/code\u003e.\n     * \u003cp\u003e\n     * Throws a \u003ccode\u003eRuntimeException\u003c/code\u003e on JRE versions prior to 1.4.0.\n     * \u003c/p\u003e\n     *\n     * @param data\n     *            Data to digest\n     * @return SHA-256 digest\n     * @since 1.4\n     ",
      "child_ranges": [
        "(line 453,col 9)-(line 453,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.DigestUtils.sha256(java.io.InputStream)",
      "begin_line": 469,
      "end_line": 471,
      "comment": "\n     * Calculates the SHA-256 digest and returns the value as a \u003ccode\u003ebyte[]\u003c/code\u003e.\n     * \u003cp\u003e\n     * Throws a \u003ccode\u003eRuntimeException\u003c/code\u003e on JRE versions prior to 1.4.0.\n     * \u003c/p\u003e\n     *\n     * @param data\n     *            Data to digest\n     * @return SHA-256 digest\n     * @throws IOException\n     *             On error reading from the stream\n     * @since 1.4\n     ",
      "child_ranges": [
        "(line 470,col 9)-(line 470,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.DigestUtils.sha256(java.lang.String)",
      "begin_line": 484,
      "end_line": 486,
      "comment": "\n     * Calculates the SHA-256 digest and returns the value as a \u003ccode\u003ebyte[]\u003c/code\u003e.\n     * \u003cp\u003e\n     * Throws a \u003ccode\u003eRuntimeException\u003c/code\u003e on JRE versions prior to 1.4.0.\n     * \u003c/p\u003e\n     *\n     * @param data\n     *            Data to digest; converted to bytes using {@link StringUtils#getBytesUtf8(String)}\n     * @return SHA-256 digest\n     * @since 1.4\n     ",
      "child_ranges": [
        "(line 485,col 9)-(line 485,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.DigestUtils.sha256Hex(byte[])",
      "begin_line": 499,
      "end_line": 501,
      "comment": "\n     * Calculates the SHA-256 digest and returns the value as a hex string.\n     * \u003cp\u003e\n     * Throws a \u003ccode\u003eRuntimeException\u003c/code\u003e on JRE versions prior to 1.4.0.\n     * \u003c/p\u003e\n     *\n     * @param data\n     *            Data to digest\n     * @return SHA-256 digest as a hex string\n     * @since 1.4\n     ",
      "child_ranges": [
        "(line 500,col 9)-(line 500,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.DigestUtils.sha256Hex(java.io.InputStream)",
      "begin_line": 516,
      "end_line": 518,
      "comment": "\n     * Calculates the SHA-256 digest and returns the value as a hex string.\n     * \u003cp\u003e\n     * Throws a \u003ccode\u003eRuntimeException\u003c/code\u003e on JRE versions prior to 1.4.0.\n     * \u003c/p\u003e\n     *\n     * @param data\n     *            Data to digest\n     * @return SHA-256 digest as a hex string\n     * @throws IOException\n     *             On error reading from the stream\n     * @since 1.4\n     ",
      "child_ranges": [
        "(line 517,col 9)-(line 517,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.DigestUtils.sha256Hex(java.lang.String)",
      "begin_line": 531,
      "end_line": 533,
      "comment": "\n     * Calculates the SHA-256 digest and returns the value as a hex string.\n     * \u003cp\u003e\n     * Throws a \u003ccode\u003eRuntimeException\u003c/code\u003e on JRE versions prior to 1.4.0.\n     * \u003c/p\u003e\n     *\n     * @param data\n     *            Data to digest\n     * @return SHA-256 digest as a hex string\n     * @since 1.4\n     ",
      "child_ranges": [
        "(line 532,col 9)-(line 532,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.DigestUtils.sha384(byte[])",
      "begin_line": 546,
      "end_line": 548,
      "comment": "\n     * Calculates the SHA-384 digest and returns the value as a \u003ccode\u003ebyte[]\u003c/code\u003e.\n     * \u003cp\u003e\n     * Throws a \u003ccode\u003eRuntimeException\u003c/code\u003e on JRE versions prior to 1.4.0.\n     * \u003c/p\u003e\n     *\n     * @param data\n     *            Data to digest\n     * @return SHA-384 digest\n     * @since 1.4\n     ",
      "child_ranges": [
        "(line 547,col 9)-(line 547,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.DigestUtils.sha384(java.io.InputStream)",
      "begin_line": 563,
      "end_line": 565,
      "comment": "\n     * Calculates the SHA-384 digest and returns the value as a \u003ccode\u003ebyte[]\u003c/code\u003e.\n     * \u003cp\u003e\n     * Throws a \u003ccode\u003eRuntimeException\u003c/code\u003e on JRE versions prior to 1.4.0.\n     * \u003c/p\u003e\n     *\n     * @param data\n     *            Data to digest\n     * @return SHA-384 digest\n     * @throws IOException\n     *             On error reading from the stream\n     * @since 1.4\n     ",
      "child_ranges": [
        "(line 564,col 9)-(line 564,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.DigestUtils.sha384(java.lang.String)",
      "begin_line": 578,
      "end_line": 580,
      "comment": "\n     * Calculates the SHA-384 digest and returns the value as a \u003ccode\u003ebyte[]\u003c/code\u003e.\n     * \u003cp\u003e\n     * Throws a \u003ccode\u003eRuntimeException\u003c/code\u003e on JRE versions prior to 1.4.0.\n     * \u003c/p\u003e\n     *\n     * @param data\n     *            Data to digest; converted to bytes using {@link StringUtils#getBytesUtf8(String)}\n     * @return SHA-384 digest\n     * @since 1.4\n     ",
      "child_ranges": [
        "(line 579,col 9)-(line 579,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.DigestUtils.sha384Hex(byte[])",
      "begin_line": 593,
      "end_line": 595,
      "comment": "\n     * Calculates the SHA-384 digest and returns the value as a hex string.\n     * \u003cp\u003e\n     * Throws a \u003ccode\u003eRuntimeException\u003c/code\u003e on JRE versions prior to 1.4.0.\n     * \u003c/p\u003e\n     *\n     * @param data\n     *            Data to digest\n     * @return SHA-384 digest as a hex string\n     * @since 1.4\n     ",
      "child_ranges": [
        "(line 594,col 9)-(line 594,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.DigestUtils.sha384Hex(java.io.InputStream)",
      "begin_line": 610,
      "end_line": 612,
      "comment": "\n     * Calculates the SHA-384 digest and returns the value as a hex string.\n     * \u003cp\u003e\n     * Throws a \u003ccode\u003eRuntimeException\u003c/code\u003e on JRE versions prior to 1.4.0.\n     * \u003c/p\u003e\n     *\n     * @param data\n     *            Data to digest\n     * @return SHA-384 digest as a hex string\n     * @throws IOException\n     *             On error reading from the stream\n     * @since 1.4\n     ",
      "child_ranges": [
        "(line 611,col 9)-(line 611,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.DigestUtils.sha384Hex(java.lang.String)",
      "begin_line": 625,
      "end_line": 627,
      "comment": "\n     * Calculates the SHA-384 digest and returns the value as a hex string.\n     * \u003cp\u003e\n     * Throws a \u003ccode\u003eRuntimeException\u003c/code\u003e on JRE versions prior to 1.4.0.\n     * \u003c/p\u003e\n     *\n     * @param data\n     *            Data to digest\n     * @return SHA-384 digest as a hex string\n     * @since 1.4\n     ",
      "child_ranges": [
        "(line 626,col 9)-(line 626,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.DigestUtils.sha512(byte[])",
      "begin_line": 640,
      "end_line": 642,
      "comment": "\n     * Calculates the SHA-512 digest and returns the value as a \u003ccode\u003ebyte[]\u003c/code\u003e.\n     * \u003cp\u003e\n     * Throws a \u003ccode\u003eRuntimeException\u003c/code\u003e on JRE versions prior to 1.4.0.\n     * \u003c/p\u003e\n     *\n     * @param data\n     *            Data to digest\n     * @return SHA-512 digest\n     * @since 1.4\n     ",
      "child_ranges": [
        "(line 641,col 9)-(line 641,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.DigestUtils.sha512(java.io.InputStream)",
      "begin_line": 657,
      "end_line": 659,
      "comment": "\n     * Calculates the SHA-512 digest and returns the value as a \u003ccode\u003ebyte[]\u003c/code\u003e.\n     * \u003cp\u003e\n     * Throws a \u003ccode\u003eRuntimeException\u003c/code\u003e on JRE versions prior to 1.4.0.\n     * \u003c/p\u003e\n     *\n     * @param data\n     *            Data to digest\n     * @return SHA-512 digest\n     * @throws IOException\n     *             On error reading from the stream\n     * @since 1.4\n     ",
      "child_ranges": [
        "(line 658,col 9)-(line 658,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.DigestUtils.sha512(java.lang.String)",
      "begin_line": 672,
      "end_line": 674,
      "comment": "\n     * Calculates the SHA-512 digest and returns the value as a \u003ccode\u003ebyte[]\u003c/code\u003e.\n     * \u003cp\u003e\n     * Throws a \u003ccode\u003eRuntimeException\u003c/code\u003e on JRE versions prior to 1.4.0.\n     * \u003c/p\u003e\n     *\n     * @param data\n     *            Data to digest; converted to bytes using {@link StringUtils#getBytesUtf8(String)}\n     * @return SHA-512 digest\n     * @since 1.4\n     ",
      "child_ranges": [
        "(line 673,col 9)-(line 673,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.DigestUtils.sha512Hex(byte[])",
      "begin_line": 687,
      "end_line": 689,
      "comment": "\n     * Calculates the SHA-512 digest and returns the value as a hex string.\n     * \u003cp\u003e\n     * Throws a \u003ccode\u003eRuntimeException\u003c/code\u003e on JRE versions prior to 1.4.0.\n     * \u003c/p\u003e\n     *\n     * @param data\n     *            Data to digest\n     * @return SHA-512 digest as a hex string\n     * @since 1.4\n     ",
      "child_ranges": [
        "(line 688,col 9)-(line 688,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.DigestUtils.sha512Hex(java.io.InputStream)",
      "begin_line": 704,
      "end_line": 706,
      "comment": "\n     * Calculates the SHA-512 digest and returns the value as a hex string.\n     * \u003cp\u003e\n     * Throws a \u003ccode\u003eRuntimeException\u003c/code\u003e on JRE versions prior to 1.4.0.\n     * \u003c/p\u003e\n     *\n     * @param data\n     *            Data to digest\n     * @return SHA-512 digest as a hex string\n     * @throws IOException\n     *             On error reading from the stream\n     * @since 1.4\n     ",
      "child_ranges": [
        "(line 705,col 9)-(line 705,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.DigestUtils.sha512Hex(java.lang.String)",
      "begin_line": 719,
      "end_line": 721,
      "comment": "\n     * Calculates the SHA-512 digest and returns the value as a hex string.\n     * \u003cp\u003e\n     * Throws a \u003ccode\u003eRuntimeException\u003c/code\u003e on JRE versions prior to 1.4.0.\n     * \u003c/p\u003e\n     *\n     * @param data\n     *            Data to digest\n     * @return SHA-512 digest as a hex string\n     * @since 1.4\n     ",
      "child_ranges": [
        "(line 720,col 9)-(line 720,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.DigestUtils.shaHex(byte[])",
      "begin_line": 731,
      "end_line": 734,
      "comment": "\n     * Calculates the SHA-1 digest and returns the value as a hex string.\n     *\n     * @param data\n     *            Data to digest\n     * @return SHA-1 digest as a hex string\n     * @deprecated Use {@link #sha1Hex(byte[])}\n     ",
      "child_ranges": [
        "(line 733,col 9)-(line 733,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.DigestUtils.shaHex(java.io.InputStream)",
      "begin_line": 747,
      "end_line": 750,
      "comment": "\n     * Calculates the SHA-1 digest and returns the value as a hex string.\n     *\n     * @param data\n     *            Data to digest\n     * @return SHA-1 digest as a hex string\n     * @throws IOException\n     *             On error reading from the stream\n     * @since 1.4\n     * @deprecated Use {@link #sha1Hex(InputStream)}\n     ",
      "child_ranges": [
        "(line 749,col 9)-(line 749,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.DigestUtils.shaHex(java.lang.String)",
      "begin_line": 760,
      "end_line": 763,
      "comment": "\n     * Calculates the SHA-1 digest and returns the value as a hex string.\n     *\n     * @param data\n     *            Data to digest\n     * @return SHA-1 digest as a hex string\n     * @deprecated Use {@link #sha1Hex(String)}\n     ",
      "child_ranges": [
        "(line 762,col 9)-(line 762,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.DigestUtils.updateDigest(java.security.MessageDigest, byte[])",
      "begin_line": 775,
      "end_line": 778,
      "comment": "\n     * Updates the given {@link MessageDigest}.\n     *\n     * @param messageDigest\n     *            the {@link MessageDigest} to update\n     * @param valueToDigest\n     *            the value to update the {@link MessageDigest} with\n     * @return the updated {@link MessageDigest}\n     * @since 1.7\n     ",
      "child_ranges": [
        "(line 776,col 9)-(line 776,col 44)",
        "(line 777,col 9)-(line 777,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.DigestUtils.updateDigest(java.security.MessageDigest, java.io.InputStream)",
      "begin_line": 792,
      "end_line": 802,
      "comment": "\n     * Reads through an InputStream and updates the digest for the data\n     *\n     * @param digest\n     *            The MessageDigest to use (e.g. MD5)\n     * @param data\n     *            Data to digest\n     * @return the digest\n     * @throws IOException\n     *             On error reading from the stream\n     * @since 1.8\n     ",
      "child_ranges": [
        "(line 793,col 9)-(line 793,col 61)",
        "(line 794,col 9)-(line 794,col 62)",
        "(line 796,col 9)-(line 799,col 9)",
        "(line 801,col 9)-(line 801,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.DigestUtils.updateDigest(java.security.MessageDigest, java.lang.String)",
      "begin_line": 815,
      "end_line": 818,
      "comment": "\n     * Updates the given {@link MessageDigest}.\n     *\n     * @param messageDigest\n     *            the {@link MessageDigest} to update\n     * @param valueToDigest\n     *            the value to update the {@link MessageDigest} with;\n     *            converted to bytes using {@link StringUtils#getBytesUtf8(String)}\n     * @return the updated {@link MessageDigest}\n     * @since 1.7\n     ",
      "child_ranges": [
        "(line 816,col 9)-(line 816,col 70)",
        "(line 817,col 9)-(line 817,col 29)"
      ]
    }
  ]
}