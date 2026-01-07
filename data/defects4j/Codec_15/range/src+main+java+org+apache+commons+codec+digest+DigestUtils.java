{
  "filepath": "/tmp/Codec-15b/src/main/java/org/apache/commons/codec/digest/DigestUtils.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "DigestUtils",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 35,
      "end_line": 1140,
      "comment": "\n * Operations to simplify common {@link java.security.MessageDigest} tasks.\n * This class is immutable and thread-safe.\n *\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "STREAM_BUFFER_LENGTH"
      ],
      "begin_line": 37,
      "end_line": 37,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.DigestUtils.digest(java.security.MessageDigest, java.nio.ByteBuffer)",
      "begin_line": 50,
      "end_line": 53,
      "comment": "\n     * Read through an ByteBuffer and returns the digest for the data\n     *\n     * @param digest\n     *            The MessageDigest to use (e.g. MD5)\n     * @param data\n     *            Data to digest\n     * @return the digest\n     * @throws IOException\n     *             On error reading from the stream\n     ",
      "child_ranges": [
        "(line 51,col 9)-(line 51,col 35)",
        "(line 52,col 9)-(line 52,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.DigestUtils.digest(java.security.MessageDigest, java.io.InputStream)",
      "begin_line": 66,
      "end_line": 68,
      "comment": "\n     * Read through an InputStream and returns the digest for the data\n     *\n     * @param digest\n     *            The MessageDigest to use (e.g. MD5)\n     * @param data\n     *            Data to digest\n     * @return the digest\n     * @throws IOException\n     *             On error reading from the stream\n     ",
      "child_ranges": [
        "(line 67,col 9)-(line 67,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.DigestUtils.getDigest(java.lang.String)",
      "begin_line": 83,
      "end_line": 89,
      "comment": "\n     * Returns a \u003ccode\u003eMessageDigest\u003c/code\u003e for the given \u003ccode\u003ealgorithm\u003c/code\u003e.\n     *\n     * @param algorithm\n     *            the name of the algorithm requested. See \u003ca\n     *            href\u003d\"http://docs.oracle.com/javase/6/docs/technotes/guides/security/crypto/CryptoSpec.html#AppA\"\n     *            \u003eAppendix A in the Java Cryptography Architecture Reference Guide\u003c/a\u003e for information about standard\n     *            algorithm names.\n     * @return A digest instance.\n     * @see MessageDigest#getInstance(String)\n     * @throws IllegalArgumentException\n     *             when a {@link NoSuchAlgorithmException} is caught.\n     ",
      "child_ranges": [
        "(line 84,col 9)-(line 88,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.DigestUtils.getMd2Digest()",
      "begin_line": 101,
      "end_line": 103,
      "comment": "\n     * Returns an MD2 MessageDigest.\n     *\n     * @return An MD2 digest instance.\n     * @throws IllegalArgumentException\n     *             when a {@link NoSuchAlgorithmException} is caught, which should never happen because MD2 is a\n     *             built-in algorithm\n     * @see MessageDigestAlgorithms#MD2\n     * @since 1.7\n     ",
      "child_ranges": [
        "(line 102,col 9)-(line 102,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.DigestUtils.getMd5Digest()",
      "begin_line": 114,
      "end_line": 116,
      "comment": "\n     * Returns an MD5 MessageDigest.\n     *\n     * @return An MD5 digest instance.\n     * @throws IllegalArgumentException\n     *             when a {@link NoSuchAlgorithmException} is caught, which should never happen because MD5 is a\n     *             built-in algorithm\n     * @see MessageDigestAlgorithms#MD5\n     ",
      "child_ranges": [
        "(line 115,col 9)-(line 115,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.DigestUtils.getSha1Digest()",
      "begin_line": 128,
      "end_line": 130,
      "comment": "\n     * Returns an SHA-1 digest.\n     *\n     * @return An SHA-1 digest instance.\n     * @throws IllegalArgumentException\n     *             when a {@link NoSuchAlgorithmException} is caught, which should never happen because SHA-1 is a\n     *             built-in algorithm\n     * @see MessageDigestAlgorithms#SHA_1\n     * @since 1.7\n     ",
      "child_ranges": [
        "(line 129,col 9)-(line 129,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.DigestUtils.getSha224Digest()",
      "begin_line": 144,
      "end_line": 146,
      "comment": "\n     * Returns an SHA-224 digest.\n     * \u003cp\u003e\n     * Java 8 only.\n     * \u003c/p\u003e\n     *\n     * @return An SHA-224 digest instance.\n     * @throws IllegalArgumentException\n     *             when a {@link NoSuchAlgorithmException} is caught on Java 7 and older, SHA-224 is a built-in\n     *             algorithm on Java 8\n     * @see MessageDigestAlgorithms#SHA_224\n     ",
      "child_ranges": [
        "(line 145,col 9)-(line 145,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.DigestUtils.getSha256Digest()",
      "begin_line": 160,
      "end_line": 162,
      "comment": "\n     * Returns an SHA-256 digest.\n     * \u003cp\u003e\n     * Throws a \u003ccode\u003eRuntimeException\u003c/code\u003e on JRE versions prior to 1.4.0.\n     * \u003c/p\u003e\n     *\n     * @return An SHA-256 digest instance.\n     * @throws IllegalArgumentException\n     *             when a {@link NoSuchAlgorithmException} is caught, which should never happen because SHA-256 is a\n     *             built-in algorithm\n     * @see MessageDigestAlgorithms#SHA_256\n     ",
      "child_ranges": [
        "(line 161,col 9)-(line 161,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.DigestUtils.getSha384Digest()",
      "begin_line": 176,
      "end_line": 178,
      "comment": "\n     * Returns an SHA-384 digest.\n     * \u003cp\u003e\n     * Throws a \u003ccode\u003eRuntimeException\u003c/code\u003e on JRE versions prior to 1.4.0.\n     * \u003c/p\u003e\n     *\n     * @return An SHA-384 digest instance.\n     * @throws IllegalArgumentException\n     *             when a {@link NoSuchAlgorithmException} is caught, which should never happen because SHA-384 is a\n     *             built-in algorithm\n     * @see MessageDigestAlgorithms#SHA_384\n     ",
      "child_ranges": [
        "(line 177,col 9)-(line 177,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.DigestUtils.getSha512Digest()",
      "begin_line": 192,
      "end_line": 194,
      "comment": "\n     * Returns an SHA-512 digest.\n     * \u003cp\u003e\n     * Throws a \u003ccode\u003eRuntimeException\u003c/code\u003e on JRE versions prior to 1.4.0.\n     * \u003c/p\u003e\n     *\n     * @return An SHA-512 digest instance.\n     * @throws IllegalArgumentException\n     *             when a {@link NoSuchAlgorithmException} is caught, which should never happen because SHA-512 is a\n     *             built-in algorithm\n     * @see MessageDigestAlgorithms#SHA_512\n     ",
      "child_ranges": [
        "(line 193,col 9)-(line 193,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.DigestUtils.getShaDigest()",
      "begin_line": 204,
      "end_line": 207,
      "comment": "\n     * Returns an SHA-1 digest.\n     *\n     * @return An SHA-1 digest instance.\n     * @throws IllegalArgumentException\n     *             when a {@link NoSuchAlgorithmException} is caught\n     * @deprecated Use {@link #getSha1Digest()}\n     ",
      "child_ranges": [
        "(line 206,col 9)-(line 206,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.DigestUtils.md2(byte[])",
      "begin_line": 217,
      "end_line": 219,
      "comment": "\n     * Calculates the MD2 digest and returns the value as a 16 element \u003ccode\u003ebyte[]\u003c/code\u003e.\n     *\n     * @param data\n     *            Data to digest\n     * @return MD2 digest\n     * @since 1.7\n     ",
      "child_ranges": [
        "(line 218,col 9)-(line 218,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.DigestUtils.md2(java.nio.ByteBuffer)",
      "begin_line": 229,
      "end_line": 231,
      "comment": "\n     * Calculates the MD2 digest and returns the value as a 16 element \u003ccode\u003ebyte[]\u003c/code\u003e.\n     *\n     * @param data\n     *            Data to digest\n     * @return MD2 digest\n     * @since 1.11\n     ",
      "child_ranges": [
        "(line 230,col 9)-(line 230,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.DigestUtils.md2(java.io.InputStream)",
      "begin_line": 243,
      "end_line": 245,
      "comment": "\n     * Calculates the MD2 digest and returns the value as a 16 element \u003ccode\u003ebyte[]\u003c/code\u003e.\n     *\n     * @param data\n     *            Data to digest\n     * @return MD2 digest\n     * @throws IOException\n     *             On error reading from the stream\n     * @since 1.7\n     ",
      "child_ranges": [
        "(line 244,col 9)-(line 244,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.DigestUtils.md2(java.lang.String)",
      "begin_line": 255,
      "end_line": 257,
      "comment": "\n     * Calculates the MD2 digest and returns the value as a 16 element \u003ccode\u003ebyte[]\u003c/code\u003e.\n     *\n     * @param data\n     *            Data to digest; converted to bytes using {@link StringUtils#getBytesUtf8(String)}\n     * @return MD2 digest\n     * @since 1.7\n     ",
      "child_ranges": [
        "(line 256,col 9)-(line 256,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.DigestUtils.md2Hex(byte[])",
      "begin_line": 267,
      "end_line": 269,
      "comment": "\n     * Calculates the MD2 digest and returns the value as a 32 character hex string.\n     *\n     * @param data\n     *            Data to digest\n     * @return MD2 digest as a hex string\n     * @since 1.7\n     ",
      "child_ranges": [
        "(line 268,col 9)-(line 268,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.DigestUtils.md2Hex(java.nio.ByteBuffer)",
      "begin_line": 279,
      "end_line": 281,
      "comment": "\n     * Calculates the MD2 digest and returns the value as a 32 character hex string.\n     *\n     * @param data\n     *            Data to digest\n     * @return MD2 digest as a hex string\n     * @since 1.11\n     ",
      "child_ranges": [
        "(line 280,col 9)-(line 280,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.DigestUtils.md2Hex(java.io.InputStream)",
      "begin_line": 293,
      "end_line": 295,
      "comment": "\n     * Calculates the MD2 digest and returns the value as a 32 character hex string.\n     *\n     * @param data\n     *            Data to digest\n     * @return MD2 digest as a hex string\n     * @throws IOException\n     *             On error reading from the stream\n     * @since 1.7\n     ",
      "child_ranges": [
        "(line 294,col 9)-(line 294,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.DigestUtils.md2Hex(java.lang.String)",
      "begin_line": 305,
      "end_line": 307,
      "comment": "\n     * Calculates the MD2 digest and returns the value as a 32 character hex string.\n     *\n     * @param data\n     *            Data to digest\n     * @return MD2 digest as a hex string\n     * @since 1.7\n     ",
      "child_ranges": [
        "(line 306,col 9)-(line 306,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.DigestUtils.md5(byte[])",
      "begin_line": 316,
      "end_line": 318,
      "comment": "\n     * Calculates the MD5 digest and returns the value as a 16 element \u003ccode\u003ebyte[]\u003c/code\u003e.\n     *\n     * @param data\n     *            Data to digest\n     * @return MD5 digest\n     ",
      "child_ranges": [
        "(line 317,col 9)-(line 317,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.DigestUtils.md5(java.nio.ByteBuffer)",
      "begin_line": 328,
      "end_line": 330,
      "comment": "\n     * Calculates the MD5 digest and returns the value as a 16 element \u003ccode\u003ebyte[]\u003c/code\u003e.\n     *\n     * @param data\n     *            Data to digest\n     * @return MD5 digest\n     * @since 1.11\n     ",
      "child_ranges": [
        "(line 329,col 9)-(line 329,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.DigestUtils.md5(java.io.InputStream)",
      "begin_line": 342,
      "end_line": 344,
      "comment": "\n     * Calculates the MD5 digest and returns the value as a 16 element \u003ccode\u003ebyte[]\u003c/code\u003e.\n     *\n     * @param data\n     *            Data to digest\n     * @return MD5 digest\n     * @throws IOException\n     *             On error reading from the stream\n     * @since 1.4\n     ",
      "child_ranges": [
        "(line 343,col 9)-(line 343,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.DigestUtils.md5(java.lang.String)",
      "begin_line": 353,
      "end_line": 355,
      "comment": "\n     * Calculates the MD5 digest and returns the value as a 16 element \u003ccode\u003ebyte[]\u003c/code\u003e.\n     *\n     * @param data\n     *            Data to digest; converted to bytes using {@link StringUtils#getBytesUtf8(String)}\n     * @return MD5 digest\n     ",
      "child_ranges": [
        "(line 354,col 9)-(line 354,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.DigestUtils.md5Hex(byte[])",
      "begin_line": 364,
      "end_line": 366,
      "comment": "\n     * Calculates the MD5 digest and returns the value as a 32 character hex string.\n     *\n     * @param data\n     *            Data to digest\n     * @return MD5 digest as a hex string\n     ",
      "child_ranges": [
        "(line 365,col 9)-(line 365,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.DigestUtils.md5Hex(java.nio.ByteBuffer)",
      "begin_line": 376,
      "end_line": 378,
      "comment": "\n     * Calculates the MD5 digest and returns the value as a 32 character hex string.\n     *\n     * @param data\n     *            Data to digest\n     * @return MD5 digest as a hex string\n     * @since 1.11\n     ",
      "child_ranges": [
        "(line 377,col 9)-(line 377,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.DigestUtils.md5Hex(java.io.InputStream)",
      "begin_line": 390,
      "end_line": 392,
      "comment": "\n         * Calculates the MD5 digest and returns the value as a 32 character hex string.\n         *\n         * @param data\n         *            Data to digest\n         * @return MD5 digest as a hex string\n         * @throws IOException\n         *             On error reading from the stream\n         * @since 1.4\n         ",
      "child_ranges": [
        "(line 391,col 13)-(line 391,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.DigestUtils.md5Hex(java.lang.String)",
      "begin_line": 401,
      "end_line": 403,
      "comment": "\n     * Calculates the MD5 digest and returns the value as a 32 character hex string.\n     *\n     * @param data\n     *            Data to digest\n     * @return MD5 digest as a hex string\n     ",
      "child_ranges": [
        "(line 402,col 9)-(line 402,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.DigestUtils.sha(byte[])",
      "begin_line": 413,
      "end_line": 416,
      "comment": "\n     * Calculates the SHA-1 digest and returns the value as a \u003ccode\u003ebyte[]\u003c/code\u003e.\n     *\n     * @param data\n     *            Data to digest\n     * @return SHA-1 digest\n     * @deprecated Use {@link #sha1(byte[])}\n     ",
      "child_ranges": [
        "(line 415,col 9)-(line 415,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.DigestUtils.sha(java.io.InputStream)",
      "begin_line": 429,
      "end_line": 432,
      "comment": "\n * Calculates the SHA-1 digest and returns the value as a \u003ccode\u003ebyte[]\u003c/code\u003e.\n *\n * @param data\n *            Data to digest\n * @return SHA-1 digest\n * @throws IOException\n *             On error reading from the stream\n * @since 1.4\n * @deprecated Use {@link #sha1(InputStream)}\n ",
      "child_ranges": [
        "(line 431,col 5)-(line 431,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.DigestUtils.sha(java.lang.String)",
      "begin_line": 442,
      "end_line": 445,
      "comment": "\n     * Calculates the SHA-1 digest and returns the value as a \u003ccode\u003ebyte[]\u003c/code\u003e.\n     *\n     * @param data\n     *            Data to digest\n     * @return SHA-1 digest\n     * @deprecated Use {@link #sha1(String)}\n     ",
      "child_ranges": [
        "(line 444,col 9)-(line 444,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.DigestUtils.sha1(byte[])",
      "begin_line": 455,
      "end_line": 457,
      "comment": "\n     * Calculates the SHA-1 digest and returns the value as a \u003ccode\u003ebyte[]\u003c/code\u003e.\n     *\n     * @param data\n     *            Data to digest\n     * @return SHA-1 digest\n     * @since 1.7\n     ",
      "child_ranges": [
        "(line 456,col 9)-(line 456,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.DigestUtils.sha1(java.nio.ByteBuffer)",
      "begin_line": 467,
      "end_line": 469,
      "comment": "\n     * Calculates the SHA-1 digest and returns the value as a \u003ccode\u003ebyte[]\u003c/code\u003e.\n     *\n     * @param data\n     *            Data to digest\n     * @return SHA-1 digest\n     * @since 1.11\n     ",
      "child_ranges": [
        "(line 468,col 9)-(line 468,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.DigestUtils.sha1(java.io.InputStream)",
      "begin_line": 481,
      "end_line": 483,
      "comment": "\n     * Calculates the SHA-1 digest and returns the value as a \u003ccode\u003ebyte[]\u003c/code\u003e.\n     *\n     * @param data\n     *            Data to digest\n     * @return SHA-1 digest\n     * @throws IOException\n     *             On error reading from the stream\n     * @since 1.7\n     ",
      "child_ranges": [
        "(line 482,col 9)-(line 482,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.DigestUtils.sha1(java.lang.String)",
      "begin_line": 492,
      "end_line": 494,
      "comment": "\n     * Calculates the SHA-1 digest and returns the value as a \u003ccode\u003ebyte[]\u003c/code\u003e.\n     *\n     * @param data\n     *            Data to digest; converted to bytes using {@link StringUtils#getBytesUtf8(String)}\n     * @return SHA-1 digest\n     ",
      "child_ranges": [
        "(line 493,col 9)-(line 493,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.DigestUtils.sha1Hex(byte[])",
      "begin_line": 504,
      "end_line": 506,
      "comment": "\n     * Calculates the SHA-1 digest and returns the value as a hex string.\n     *\n     * @param data\n     *            Data to digest\n     * @return SHA-1 digest as a hex string\n     * @since 1.7\n     ",
      "child_ranges": [
        "(line 505,col 9)-(line 505,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.DigestUtils.sha1Hex(java.nio.ByteBuffer)",
      "begin_line": 516,
      "end_line": 518,
      "comment": "\n     * Calculates the SHA-1 digest and returns the value as a hex string.\n     *\n     * @param data\n     *            Data to digest\n     * @return SHA-1 digest as a hex string\n     * @since 1.11\n     ",
      "child_ranges": [
        "(line 517,col 9)-(line 517,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.DigestUtils.sha1Hex(java.io.InputStream)",
      "begin_line": 530,
      "end_line": 532,
      "comment": "\n     * Calculates the SHA-1 digest and returns the value as a hex string.\n     *\n     * @param data\n     *            Data to digest\n     * @return SHA-1 digest as a hex string\n     * @throws IOException\n     *             On error reading from the stream\n     * @since 1.7\n     ",
      "child_ranges": [
        "(line 531,col 9)-(line 531,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.DigestUtils.sha1Hex(java.lang.String)",
      "begin_line": 542,
      "end_line": 544,
      "comment": "\n     * Calculates the SHA-1 digest and returns the value as a hex string.\n     *\n     * @param data\n     *            Data to digest\n     * @return SHA-1 digest as a hex string\n     * @since 1.7\n     ",
      "child_ranges": [
        "(line 543,col 9)-(line 543,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.DigestUtils.sha224(byte[])",
      "begin_line": 558,
      "end_line": 560,
      "comment": "\n     * Calculates the SHA-224 digest and returns the value as a \u003ccode\u003ebyte[]\u003c/code\u003e.\n     * \u003cp\u003e\n     * Throws a {@link IllegalArgumentException} on JRE versions prior to 1.4.0.\n     * \u003c/p\u003e\n     *\n     * @param data\n     *            Data to digest\n     * @return SHA-224 digest\n     * @throws IllegalArgumentException thrown on JRE versions prior to 1.8.0.\n     * @since 1.11\n     ",
      "child_ranges": [
        "(line 559,col 9)-(line 559,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.DigestUtils.sha224(java.nio.ByteBuffer)",
      "begin_line": 571,
      "end_line": 573,
      "comment": "\n     * Calculates the SHA-224 digest and returns the value as a \u003ccode\u003ebyte[]\u003c/code\u003e.\n     *\n     * @param data\n     *            Data to digest\n     * @return SHA-224 digest\n     * @throws IllegalArgumentException thrown on JRE versions prior to 1.8.0.\n     * @since 1.11\n     ",
      "child_ranges": [
        "(line 572,col 9)-(line 572,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.DigestUtils.sha224(java.io.InputStream)",
      "begin_line": 589,
      "end_line": 591,
      "comment": "\n     * Calculates the SHA-224 digest and returns the value as a \u003ccode\u003ebyte[]\u003c/code\u003e.\n     * \u003cp\u003e\n     * Throws a {@link IllegalArgumentException} on JRE versions prior to 1.4.0.\n     * \u003c/p\u003e\n     *\n     * @param data\n     *            Data to digest\n     * @return SHA-224 digest\n     * @throws IOException\n     *             On error reading from the stream\n     * @throws IllegalArgumentException thrown on JRE versions prior to 1.8.0.\n     * @since 1.11\n     ",
      "child_ranges": [
        "(line 590,col 9)-(line 590,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.DigestUtils.sha224(java.lang.String)",
      "begin_line": 605,
      "end_line": 607,
      "comment": "\n     * Calculates the SHA-224 digest and returns the value as a \u003ccode\u003ebyte[]\u003c/code\u003e.\n     * \u003cp\u003e\n     * Throws a {@link IllegalArgumentException} on JRE versions prior to 1.4.0.\n     * \u003c/p\u003e\n     *\n     * @param data\n     *            Data to digest; converted to bytes using {@link StringUtils#getBytesUtf8(String)}\n     * @return SHA-224 digest\n     * @throws IllegalArgumentException thrown on JRE versions prior to 1.8.0.\n     * @since 1.11\n     ",
      "child_ranges": [
        "(line 606,col 9)-(line 606,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.DigestUtils.sha224Hex(byte[])",
      "begin_line": 621,
      "end_line": 623,
      "comment": "\n     * Calculates the SHA-224 digest and returns the value as a hex string.\n     * \u003cp\u003e\n     * Throws a {@link IllegalArgumentException} on JRE versions prior to 1.4.0.\n     * \u003c/p\u003e\n     *\n     * @param data\n     *            Data to digest\n     * @return SHA-224 digest as a hex string\n     * @throws IllegalArgumentException thrown on JRE versions prior to 1.8.0.\n     * @since 1.11\n     ",
      "child_ranges": [
        "(line 622,col 9)-(line 622,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.DigestUtils.sha224Hex(java.nio.ByteBuffer)",
      "begin_line": 637,
      "end_line": 639,
      "comment": "\n     * Calculates the SHA-224 digest and returns the value as a hex string.\n     * \u003cp\u003e\n     * Throws a {@link IllegalArgumentException} on JRE versions prior to 1.4.0.\n     * \u003c/p\u003e\n     *\n     * @param data\n     *            Data to digest\n     * @return SHA-224 digest as a hex string\n     * @throws IllegalArgumentException thrown on JRE versions prior to 1.8.0.\n     * @since 1.11\n     ",
      "child_ranges": [
        "(line 638,col 9)-(line 638,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.DigestUtils.sha224Hex(java.io.InputStream)",
      "begin_line": 655,
      "end_line": 657,
      "comment": "\n     * Calculates the SHA-224 digest and returns the value as a hex string.\n     * \u003cp\u003e\n     * Throws a {@link IllegalArgumentException} on JRE versions prior to 1.4.0.\n     * \u003c/p\u003e\n     *\n     * @param data\n     *            Data to digest\n     * @return SHA-224 digest as a hex string\n     * @throws IOException\n     *             On error reading from the stream\n     * @throws IllegalArgumentException thrown on JRE versions prior to 1.8.0.\n     * @since 1.11\n     ",
      "child_ranges": [
        "(line 656,col 9)-(line 656,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.DigestUtils.sha224Hex(java.lang.String)",
      "begin_line": 671,
      "end_line": 673,
      "comment": "\n     * Calculates the SHA-224 digest and returns the value as a hex string.\n     * \u003cp\u003e\n     * Throws a {@link IllegalArgumentException} on JRE versions prior to 1.4.0.\n     * \u003c/p\u003e\n     *\n     * @param data\n     *            Data to digest\n     * @return SHA-224 digest as a hex string\n     * @throws IllegalArgumentException thrown on JRE versions prior to 1.8.0.\n     * @since 1.11\n     ",
      "child_ranges": [
        "(line 672,col 9)-(line 672,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.DigestUtils.sha256(byte[])",
      "begin_line": 686,
      "end_line": 688,
      "comment": "\n     * Calculates the SHA-256 digest and returns the value as a \u003ccode\u003ebyte[]\u003c/code\u003e.\n     * \u003cp\u003e\n     * Throws a \u003ccode\u003eRuntimeException\u003c/code\u003e on JRE versions prior to 1.4.0.\n     * \u003c/p\u003e\n     *\n     * @param data\n     *            Data to digest\n     * @return SHA-256 digest\n     * @since 1.4\n     ",
      "child_ranges": [
        "(line 687,col 9)-(line 687,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.DigestUtils.sha256(java.nio.ByteBuffer)",
      "begin_line": 698,
      "end_line": 700,
      "comment": "\n     * Calculates the SHA-256 digest and returns the value as a \u003ccode\u003ebyte[]\u003c/code\u003e.\n     *\n     * @param data\n     *            Data to digest\n     * @return SHA-256 digest\n     * @since 1.11\n     ",
      "child_ranges": [
        "(line 699,col 9)-(line 699,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.DigestUtils.sha256(java.io.InputStream)",
      "begin_line": 715,
      "end_line": 717,
      "comment": "\n     * Calculates the SHA-256 digest and returns the value as a \u003ccode\u003ebyte[]\u003c/code\u003e.\n     * \u003cp\u003e\n     * Throws a \u003ccode\u003eRuntimeException\u003c/code\u003e on JRE versions prior to 1.4.0.\n     * \u003c/p\u003e\n     *\n     * @param data\n     *            Data to digest\n     * @return SHA-256 digest\n     * @throws IOException\n     *             On error reading from the stream\n     * @since 1.4\n     ",
      "child_ranges": [
        "(line 716,col 9)-(line 716,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.DigestUtils.sha256(java.lang.String)",
      "begin_line": 730,
      "end_line": 732,
      "comment": "\n     * Calculates the SHA-256 digest and returns the value as a \u003ccode\u003ebyte[]\u003c/code\u003e.\n     * \u003cp\u003e\n     * Throws a \u003ccode\u003eRuntimeException\u003c/code\u003e on JRE versions prior to 1.4.0.\n     * \u003c/p\u003e\n     *\n     * @param data\n     *            Data to digest; converted to bytes using {@link StringUtils#getBytesUtf8(String)}\n     * @return SHA-256 digest\n     * @since 1.4\n     ",
      "child_ranges": [
        "(line 731,col 9)-(line 731,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.DigestUtils.sha256Hex(byte[])",
      "begin_line": 745,
      "end_line": 747,
      "comment": "\n     * Calculates the SHA-256 digest and returns the value as a hex string.\n     * \u003cp\u003e\n     * Throws a \u003ccode\u003eRuntimeException\u003c/code\u003e on JRE versions prior to 1.4.0.\n     * \u003c/p\u003e\n     *\n     * @param data\n     *            Data to digest\n     * @return SHA-256 digest as a hex string\n     * @since 1.4\n     ",
      "child_ranges": [
        "(line 746,col 9)-(line 746,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.DigestUtils.sha256Hex(java.nio.ByteBuffer)",
      "begin_line": 757,
      "end_line": 759,
      "comment": "\n     * Calculates the SHA-256 digest and returns the value as a hex string.\n     *\n     * @param data\n     *            Data to digest\n     * @return SHA-256 digest as a hex string\n     * @since 1.11\n     ",
      "child_ranges": [
        "(line 758,col 9)-(line 758,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.DigestUtils.sha256Hex(java.io.InputStream)",
      "begin_line": 774,
      "end_line": 776,
      "comment": "\n     * Calculates the SHA-256 digest and returns the value as a hex string.\n     * \u003cp\u003e\n     * Throws a \u003ccode\u003eRuntimeException\u003c/code\u003e on JRE versions prior to 1.4.0.\n     * \u003c/p\u003e\n     *\n     * @param data\n     *            Data to digest\n     * @return SHA-256 digest as a hex string\n     * @throws IOException\n     *             On error reading from the stream\n     * @since 1.4\n     ",
      "child_ranges": [
        "(line 775,col 9)-(line 775,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.DigestUtils.sha256Hex(java.lang.String)",
      "begin_line": 789,
      "end_line": 791,
      "comment": "\n     * Calculates the SHA-256 digest and returns the value as a hex string.\n     * \u003cp\u003e\n     * Throws a \u003ccode\u003eRuntimeException\u003c/code\u003e on JRE versions prior to 1.4.0.\n     * \u003c/p\u003e\n     *\n     * @param data\n     *            Data to digest\n     * @return SHA-256 digest as a hex string\n     * @since 1.4\n     ",
      "child_ranges": [
        "(line 790,col 9)-(line 790,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.DigestUtils.sha384(byte[])",
      "begin_line": 804,
      "end_line": 806,
      "comment": "\n     * Calculates the SHA-384 digest and returns the value as a \u003ccode\u003ebyte[]\u003c/code\u003e.\n     * \u003cp\u003e\n     * Throws a \u003ccode\u003eRuntimeException\u003c/code\u003e on JRE versions prior to 1.4.0.\n     * \u003c/p\u003e\n     *\n     * @param data\n     *            Data to digest\n     * @return SHA-384 digest\n     * @since 1.4\n     ",
      "child_ranges": [
        "(line 805,col 9)-(line 805,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.DigestUtils.sha384(java.nio.ByteBuffer)",
      "begin_line": 816,
      "end_line": 818,
      "comment": "\n     * Calculates the SHA-384 digest and returns the value as a \u003ccode\u003ebyte[]\u003c/code\u003e.\n     *\n     * @param data\n     *            Data to digest\n     * @return SHA-384 digest\n     * @since 1.11\n     ",
      "child_ranges": [
        "(line 817,col 9)-(line 817,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.DigestUtils.sha384(java.io.InputStream)",
      "begin_line": 833,
      "end_line": 835,
      "comment": "\n     * Calculates the SHA-384 digest and returns the value as a \u003ccode\u003ebyte[]\u003c/code\u003e.\n     * \u003cp\u003e\n     * Throws a \u003ccode\u003eRuntimeException\u003c/code\u003e on JRE versions prior to 1.4.0.\n     * \u003c/p\u003e\n     *\n     * @param data\n     *            Data to digest\n     * @return SHA-384 digest\n     * @throws IOException\n     *             On error reading from the stream\n     * @since 1.4\n     ",
      "child_ranges": [
        "(line 834,col 9)-(line 834,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.DigestUtils.sha384(java.lang.String)",
      "begin_line": 848,
      "end_line": 850,
      "comment": "\n     * Calculates the SHA-384 digest and returns the value as a \u003ccode\u003ebyte[]\u003c/code\u003e.\n     * \u003cp\u003e\n     * Throws a \u003ccode\u003eRuntimeException\u003c/code\u003e on JRE versions prior to 1.4.0.\n     * \u003c/p\u003e\n     *\n     * @param data\n     *            Data to digest; converted to bytes using {@link StringUtils#getBytesUtf8(String)}\n     * @return SHA-384 digest\n     * @since 1.4\n     ",
      "child_ranges": [
        "(line 849,col 9)-(line 849,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.DigestUtils.sha384Hex(byte[])",
      "begin_line": 863,
      "end_line": 865,
      "comment": "\n     * Calculates the SHA-384 digest and returns the value as a hex string.\n     * \u003cp\u003e\n     * Throws a \u003ccode\u003eRuntimeException\u003c/code\u003e on JRE versions prior to 1.4.0.\n     * \u003c/p\u003e\n     *\n     * @param data\n     *            Data to digest\n     * @return SHA-384 digest as a hex string\n     * @since 1.4\n     ",
      "child_ranges": [
        "(line 864,col 9)-(line 864,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.DigestUtils.sha384Hex(java.nio.ByteBuffer)",
      "begin_line": 875,
      "end_line": 877,
      "comment": "\n     * Calculates the SHA-384 digest and returns the value as a hex string.\n     *\n     * @param data\n     *            Data to digest\n     * @return SHA-384 digest as a hex string\n     * @since 1.11\n     ",
      "child_ranges": [
        "(line 876,col 9)-(line 876,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.DigestUtils.sha384Hex(java.io.InputStream)",
      "begin_line": 892,
      "end_line": 894,
      "comment": "\n     * Calculates the SHA-384 digest and returns the value as a hex string.\n     * \u003cp\u003e\n     * Throws a \u003ccode\u003eRuntimeException\u003c/code\u003e on JRE versions prior to 1.4.0.\n     * \u003c/p\u003e\n     *\n     * @param data\n     *            Data to digest\n     * @return SHA-384 digest as a hex string\n     * @throws IOException\n     *             On error reading from the stream\n     * @since 1.4\n     ",
      "child_ranges": [
        "(line 893,col 9)-(line 893,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.DigestUtils.sha384Hex(java.lang.String)",
      "begin_line": 907,
      "end_line": 909,
      "comment": "\n     * Calculates the SHA-384 digest and returns the value as a hex string.\n     * \u003cp\u003e\n     * Throws a \u003ccode\u003eRuntimeException\u003c/code\u003e on JRE versions prior to 1.4.0.\n     * \u003c/p\u003e\n     *\n     * @param data\n     *            Data to digest\n     * @return SHA-384 digest as a hex string\n     * @since 1.4\n     ",
      "child_ranges": [
        "(line 908,col 9)-(line 908,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.DigestUtils.sha512(byte[])",
      "begin_line": 922,
      "end_line": 924,
      "comment": "\n     * Calculates the SHA-512 digest and returns the value as a \u003ccode\u003ebyte[]\u003c/code\u003e.\n     * \u003cp\u003e\n     * Throws a \u003ccode\u003eRuntimeException\u003c/code\u003e on JRE versions prior to 1.4.0.\n     * \u003c/p\u003e\n     *\n     * @param data\n     *            Data to digest\n     * @return SHA-512 digest\n     * @since 1.4\n     ",
      "child_ranges": [
        "(line 923,col 9)-(line 923,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.DigestUtils.sha512(java.nio.ByteBuffer)",
      "begin_line": 934,
      "end_line": 936,
      "comment": "\n     * Calculates the SHA-512 digest and returns the value as a \u003ccode\u003ebyte[]\u003c/code\u003e.\n     *\n     * @param data\n     *            Data to digest\n     * @return SHA-512 digest\n     * @since 1.11\n     ",
      "child_ranges": [
        "(line 935,col 9)-(line 935,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.DigestUtils.sha512(java.io.InputStream)",
      "begin_line": 951,
      "end_line": 953,
      "comment": "\n     * Calculates the SHA-512 digest and returns the value as a \u003ccode\u003ebyte[]\u003c/code\u003e.\n     * \u003cp\u003e\n     * Throws a \u003ccode\u003eRuntimeException\u003c/code\u003e on JRE versions prior to 1.4.0.\n     * \u003c/p\u003e\n     *\n     * @param data\n     *            Data to digest\n     * @return SHA-512 digest\n     * @throws IOException\n     *             On error reading from the stream\n     * @since 1.4\n     ",
      "child_ranges": [
        "(line 952,col 9)-(line 952,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.DigestUtils.sha512(java.lang.String)",
      "begin_line": 966,
      "end_line": 968,
      "comment": "\n     * Calculates the SHA-512 digest and returns the value as a \u003ccode\u003ebyte[]\u003c/code\u003e.\n     * \u003cp\u003e\n     * Throws a \u003ccode\u003eRuntimeException\u003c/code\u003e on JRE versions prior to 1.4.0.\n     * \u003c/p\u003e\n     *\n     * @param data\n     *            Data to digest; converted to bytes using {@link StringUtils#getBytesUtf8(String)}\n     * @return SHA-512 digest\n     * @since 1.4\n     ",
      "child_ranges": [
        "(line 967,col 9)-(line 967,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.DigestUtils.sha512Hex(byte[])",
      "begin_line": 981,
      "end_line": 983,
      "comment": "\n     * Calculates the SHA-512 digest and returns the value as a hex string.\n     * \u003cp\u003e\n     * Throws a \u003ccode\u003eRuntimeException\u003c/code\u003e on JRE versions prior to 1.4.0.\n     * \u003c/p\u003e\n     *\n     * @param data\n     *            Data to digest\n     * @return SHA-512 digest as a hex string\n     * @since 1.4\n     ",
      "child_ranges": [
        "(line 982,col 9)-(line 982,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.DigestUtils.sha512Hex(java.nio.ByteBuffer)",
      "begin_line": 993,
      "end_line": 995,
      "comment": "\n     * Calculates the SHA-512 digest and returns the value as a hex string.\n     *\n     * @param data\n     *            Data to digest\n     * @return SHA-512 digest as a hex string\n     * @since 1.11\n     ",
      "child_ranges": [
        "(line 994,col 9)-(line 994,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.DigestUtils.sha512Hex(java.io.InputStream)",
      "begin_line": 1010,
      "end_line": 1012,
      "comment": "\n     * Calculates the SHA-512 digest and returns the value as a hex string.\n     * \u003cp\u003e\n     * Throws a \u003ccode\u003eRuntimeException\u003c/code\u003e on JRE versions prior to 1.4.0.\n     * \u003c/p\u003e\n     *\n     * @param data\n     *            Data to digest\n     * @return SHA-512 digest as a hex string\n     * @throws IOException\n     *             On error reading from the stream\n     * @since 1.4\n     ",
      "child_ranges": [
        "(line 1011,col 9)-(line 1011,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.DigestUtils.sha512Hex(java.lang.String)",
      "begin_line": 1025,
      "end_line": 1027,
      "comment": "\n     * Calculates the SHA-512 digest and returns the value as a hex string.\n     * \u003cp\u003e\n     * Throws a \u003ccode\u003eRuntimeException\u003c/code\u003e on JRE versions prior to 1.4.0.\n     * \u003c/p\u003e\n     *\n     * @param data\n     *            Data to digest\n     * @return SHA-512 digest as a hex string\n     * @since 1.4\n     ",
      "child_ranges": [
        "(line 1026,col 9)-(line 1026,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.DigestUtils.shaHex(byte[])",
      "begin_line": 1037,
      "end_line": 1040,
      "comment": "\n     * Calculates the SHA-1 digest and returns the value as a hex string.\n     *\n     * @param data\n     *            Data to digest\n     * @return SHA-1 digest as a hex string\n     * @deprecated Use {@link #sha1Hex(byte[])}\n     ",
      "child_ranges": [
        "(line 1039,col 9)-(line 1039,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.DigestUtils.shaHex(java.io.InputStream)",
      "begin_line": 1053,
      "end_line": 1056,
      "comment": "\n     * Calculates the SHA-1 digest and returns the value as a hex string.\n     *\n     * @param data\n     *            Data to digest\n     * @return SHA-1 digest as a hex string\n     * @throws IOException\n     *             On error reading from the stream\n     * @since 1.4\n     * @deprecated Use {@link #sha1Hex(InputStream)}\n     ",
      "child_ranges": [
        "(line 1055,col 9)-(line 1055,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.DigestUtils.shaHex(java.lang.String)",
      "begin_line": 1066,
      "end_line": 1069,
      "comment": "\n     * Calculates the SHA-1 digest and returns the value as a hex string.\n     *\n     * @param data\n     *            Data to digest\n     * @return SHA-1 digest as a hex string\n     * @deprecated Use {@link #sha1Hex(String)}\n     ",
      "child_ranges": [
        "(line 1068,col 9)-(line 1068,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.DigestUtils.updateDigest(java.security.MessageDigest, byte[])",
      "begin_line": 1081,
      "end_line": 1084,
      "comment": "\n     * Updates the given {@link MessageDigest}.\n     *\n     * @param messageDigest\n     *            the {@link MessageDigest} to update\n     * @param valueToDigest\n     *            the value to update the {@link MessageDigest} with\n     * @return the updated {@link MessageDigest}\n     * @since 1.7\n     ",
      "child_ranges": [
        "(line 1082,col 9)-(line 1082,col 44)",
        "(line 1083,col 9)-(line 1083,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.DigestUtils.updateDigest(java.security.MessageDigest, java.nio.ByteBuffer)",
      "begin_line": 1096,
      "end_line": 1099,
      "comment": "\n     * Updates the given {@link MessageDigest}.\n     *\n     * @param messageDigest\n     *            the {@link MessageDigest} to update\n     * @param valueToDigest\n     *            the value to update the {@link MessageDigest} with\n     * @return the updated {@link MessageDigest}\n     * @since 1.11\n     ",
      "child_ranges": [
        "(line 1097,col 9)-(line 1097,col 44)",
        "(line 1098,col 9)-(line 1098,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.DigestUtils.updateDigest(java.security.MessageDigest, java.io.InputStream)",
      "begin_line": 1113,
      "end_line": 1123,
      "comment": "\n     * Reads through an InputStream and updates the digest for the data\n     *\n     * @param digest\n     *            The MessageDigest to use (e.g. MD5)\n     * @param data\n     *            Data to digest\n     * @return the digest\n     * @throws IOException\n     *             On error reading from the stream\n     * @since 1.8\n     ",
      "child_ranges": [
        "(line 1114,col 9)-(line 1114,col 61)",
        "(line 1115,col 9)-(line 1115,col 62)",
        "(line 1117,col 9)-(line 1120,col 9)",
        "(line 1122,col 9)-(line 1122,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.DigestUtils.updateDigest(java.security.MessageDigest, java.lang.String)",
      "begin_line": 1136,
      "end_line": 1139,
      "comment": "\n     * Updates the given {@link MessageDigest}.\n     *\n     * @param messageDigest\n     *            the {@link MessageDigest} to update\n     * @param valueToDigest\n     *            the value to update the {@link MessageDigest} with;\n     *            converted to bytes using {@link StringUtils#getBytesUtf8(String)}\n     * @return the updated {@link MessageDigest}\n     * @since 1.7\n     ",
      "child_ranges": [
        "(line 1137,col 9)-(line 1137,col 70)",
        "(line 1138,col 9)-(line 1138,col 29)"
      ]
    }
  ]
}