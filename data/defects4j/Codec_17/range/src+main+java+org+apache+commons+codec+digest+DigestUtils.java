{
  "filepath": "/tmp/Codec-17b/src/main/java/org/apache/commons/codec/digest/DigestUtils.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "DigestUtils",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 53,
      "end_line": 1142,
      "comment": "\n * Operations to simplify common {@link java.security.MessageDigest} tasks.\n * This class is immutable and thread-safe.\n * However the MessageDigest instances it creates generally won\u0027t be.\n * \u003cp\u003e\n * The {@link MessageDigestAlgorithms} class provides constants for standard\n * digest algorithms that can be used with the {@link #getDigest(String)} method\n * and other methods that require the Digest algorithm name.\n * \u003cp\u003e\n * Note: the class has short-hand methods for all the algorithms present as standard in Java 6.\n * This approach requires lots of methods for each algorithm, and quickly becomes unwieldy.\n * The following code works with all algorithms:\n * \u003cpre\u003e\n * import static org.apache.commons.codec.digest.MessageDigestAlgorithms.SHA_224;\n * ...\n * byte [] digest \u003d new DigestUtils(SHA_224).digest(dataToDigest);\n * String hdigest \u003d new DigestUtils(SHA_224).digestAsHex(new File(\"pom.xml\"));\n * \u003c/pre\u003e\n * @see MessageDigestAlgorithms\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "STREAM_BUFFER_LENGTH"
      ],
      "begin_line": 55,
      "end_line": 55,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.DigestUtils.digest(java.security.MessageDigest, byte[])",
      "begin_line": 67,
      "end_line": 69,
      "comment": "\n     * Reads through a byte array and returns the digest for the data. Provided for symmetry with other methods.\n     *\n     * @param messageDigest\n     *            The MessageDigest to use (e.g. MD5)\n     * @param data\n     *            Data to digest\n     * @return the digest\n     * @since 1.11\n     ",
      "child_ranges": [
        "(line 68,col 9)-(line 68,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.DigestUtils.digest(java.security.MessageDigest, java.nio.ByteBuffer)",
      "begin_line": 82,
      "end_line": 85,
      "comment": "\n     * Reads through a ByteBuffer and returns the digest for the data\n     *\n     * @param messageDigest\n     *            The MessageDigest to use (e.g. MD5)\n     * @param data\n     *            Data to digest\n     * @return the digest\n     *\n     * @since 1.11\n     ",
      "child_ranges": [
        "(line 83,col 9)-(line 83,col 35)",
        "(line 84,col 9)-(line 84,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.DigestUtils.digest(java.security.MessageDigest, java.io.File)",
      "begin_line": 99,
      "end_line": 101,
      "comment": "\n     * Reads through a File and returns the digest for the data\n     *\n     * @param messageDigest\n     *            The MessageDigest to use (e.g. MD5)\n     * @param data\n     *            Data to digest\n     * @return the digest\n     * @throws IOException\n     *             On error reading from the stream\n     * @since 1.11\n     ",
      "child_ranges": [
        "(line 100,col 9)-(line 100,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.DigestUtils.digest(java.security.MessageDigest, java.io.InputStream)",
      "begin_line": 115,
      "end_line": 117,
      "comment": "\n     * Reads through an InputStream and returns the digest for the data\n     *\n     * @param messageDigest\n     *            The MessageDigest to use (e.g. MD5)\n     * @param data\n     *            Data to digest\n     * @return the digest\n     * @throws IOException\n     *             On error reading from the stream\n     * @since 1.11 (was private)\n     ",
      "child_ranges": [
        "(line 116,col 9)-(line 116,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.DigestUtils.getDigest(java.lang.String)",
      "begin_line": 132,
      "end_line": 138,
      "comment": "\n     * Returns a \u003ccode\u003eMessageDigest\u003c/code\u003e for the given \u003ccode\u003ealgorithm\u003c/code\u003e.\n     *\n     * @param algorithm\n     *            the name of the algorithm requested. See \u003ca\n     *            href\u003d\"http://docs.oracle.com/javase/6/docs/technotes/guides/security/crypto/CryptoSpec.html#AppA\"\n     *            \u003eAppendix A in the Java Cryptography Architecture Reference Guide\u003c/a\u003e for information about standard\n     *            algorithm names.\n     * @return A digest instance.\n     * @see MessageDigest#getInstance(String)\n     * @throws IllegalArgumentException\n     *             when a {@link NoSuchAlgorithmException} is caught.\n     ",
      "child_ranges": [
        "(line 133,col 9)-(line 137,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.DigestUtils.getDigest(java.lang.String, java.security.MessageDigest)",
      "begin_line": 157,
      "end_line": 163,
      "comment": "\n     * Returns a \u003ccode\u003eMessageDigest\u003c/code\u003e for the given \u003ccode\u003ealgorithm\u003c/code\u003e or a default if there is a problem\n     * getting the algorithm.\n     *\n     * @param algorithm\n     *            the name of the algorithm requested. See\n     *            \u003ca href\u003d\"http://docs.oracle.com/javase/6/docs/technotes/guides/security/crypto/CryptoSpec.html#AppA\" \u003e\n     *            Appendix A in the Java Cryptography Architecture Reference Guide\u003c/a\u003e for information about standard\n     *            algorithm names.\n     * @param defaultMessageDigest\n     *            The default MessageDigest.\n     * @return A digest instance.\n     * @see MessageDigest#getInstance(String)\n     * @throws IllegalArgumentException\n     *             when a {@link NoSuchAlgorithmException} is caught.\n     * @since 1.11\n     ",
      "child_ranges": [
        "(line 158,col 9)-(line 162,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.DigestUtils.getMd2Digest()",
      "begin_line": 175,
      "end_line": 177,
      "comment": "\n     * Returns an MD2 MessageDigest.\n     *\n     * @return An MD2 digest instance.\n     * @throws IllegalArgumentException\n     *             when a {@link NoSuchAlgorithmException} is caught, which should never happen because MD2 is a\n     *             built-in algorithm\n     * @see MessageDigestAlgorithms#MD2\n     * @since 1.7\n     ",
      "child_ranges": [
        "(line 176,col 9)-(line 176,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.DigestUtils.getMd5Digest()",
      "begin_line": 188,
      "end_line": 190,
      "comment": "\n     * Returns an MD5 MessageDigest.\n     *\n     * @return An MD5 digest instance.\n     * @throws IllegalArgumentException\n     *             when a {@link NoSuchAlgorithmException} is caught, which should never happen because MD5 is a\n     *             built-in algorithm\n     * @see MessageDigestAlgorithms#MD5\n     ",
      "child_ranges": [
        "(line 189,col 9)-(line 189,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.DigestUtils.getSha1Digest()",
      "begin_line": 202,
      "end_line": 204,
      "comment": "\n     * Returns an SHA-1 digest.\n     *\n     * @return An SHA-1 digest instance.\n     * @throws IllegalArgumentException\n     *             when a {@link NoSuchAlgorithmException} is caught, which should never happen because SHA-1 is a\n     *             built-in algorithm\n     * @see MessageDigestAlgorithms#SHA_1\n     * @since 1.7\n     ",
      "child_ranges": [
        "(line 203,col 9)-(line 203,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.DigestUtils.getSha256Digest()",
      "begin_line": 218,
      "end_line": 220,
      "comment": "\n     * Returns an SHA-256 digest.\n     * \u003cp\u003e\n     * Throws a \u003ccode\u003eRuntimeException\u003c/code\u003e on JRE versions prior to 1.4.0.\n     * \u003c/p\u003e\n     *\n     * @return An SHA-256 digest instance.\n     * @throws IllegalArgumentException\n     *             when a {@link NoSuchAlgorithmException} is caught, which should never happen because SHA-256 is a\n     *             built-in algorithm\n     * @see MessageDigestAlgorithms#SHA_256\n     ",
      "child_ranges": [
        "(line 219,col 9)-(line 219,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.DigestUtils.getSha384Digest()",
      "begin_line": 234,
      "end_line": 236,
      "comment": "\n     * Returns an SHA-384 digest.\n     * \u003cp\u003e\n     * Throws a \u003ccode\u003eRuntimeException\u003c/code\u003e on JRE versions prior to 1.4.0.\n     * \u003c/p\u003e\n     *\n     * @return An SHA-384 digest instance.\n     * @throws IllegalArgumentException\n     *             when a {@link NoSuchAlgorithmException} is caught, which should never happen because SHA-384 is a\n     *             built-in algorithm\n     * @see MessageDigestAlgorithms#SHA_384\n     ",
      "child_ranges": [
        "(line 235,col 9)-(line 235,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.DigestUtils.getSha512Digest()",
      "begin_line": 250,
      "end_line": 252,
      "comment": "\n     * Returns an SHA-512 digest.\n     * \u003cp\u003e\n     * Throws a \u003ccode\u003eRuntimeException\u003c/code\u003e on JRE versions prior to 1.4.0.\n     * \u003c/p\u003e\n     *\n     * @return An SHA-512 digest instance.\n     * @throws IllegalArgumentException\n     *             when a {@link NoSuchAlgorithmException} is caught, which should never happen because SHA-512 is a\n     *             built-in algorithm\n     * @see MessageDigestAlgorithms#SHA_512\n     ",
      "child_ranges": [
        "(line 251,col 9)-(line 251,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.DigestUtils.getShaDigest()",
      "begin_line": 262,
      "end_line": 265,
      "comment": "\n     * Returns an SHA-1 digest.\n     *\n     * @return An SHA-1 digest instance.\n     * @throws IllegalArgumentException\n     *             when a {@link NoSuchAlgorithmException} is caught\n     * @deprecated Use {@link #getSha1Digest()}\n     ",
      "child_ranges": [
        "(line 264,col 9)-(line 264,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.DigestUtils.md2(byte[])",
      "begin_line": 275,
      "end_line": 277,
      "comment": "\n     * Calculates the MD2 digest and returns the value as a 16 element \u003ccode\u003ebyte[]\u003c/code\u003e.\n     *\n     * @param data\n     *            Data to digest\n     * @return MD2 digest\n     * @since 1.7\n     ",
      "child_ranges": [
        "(line 276,col 9)-(line 276,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.DigestUtils.md2(java.io.InputStream)",
      "begin_line": 289,
      "end_line": 291,
      "comment": "\n     * Calculates the MD2 digest and returns the value as a 16 element \u003ccode\u003ebyte[]\u003c/code\u003e.\n     *\n     * @param data\n     *            Data to digest\n     * @return MD2 digest\n     * @throws IOException\n     *             On error reading from the stream\n     * @since 1.7\n     ",
      "child_ranges": [
        "(line 290,col 9)-(line 290,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.DigestUtils.md2(java.lang.String)",
      "begin_line": 301,
      "end_line": 303,
      "comment": "\n     * Calculates the MD2 digest and returns the value as a 16 element \u003ccode\u003ebyte[]\u003c/code\u003e.\n     *\n     * @param data\n     *            Data to digest; converted to bytes using {@link StringUtils#getBytesUtf8(String)}\n     * @return MD2 digest\n     * @since 1.7\n     ",
      "child_ranges": [
        "(line 302,col 9)-(line 302,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.DigestUtils.md2Hex(byte[])",
      "begin_line": 313,
      "end_line": 315,
      "comment": "\n     * Calculates the MD2 digest and returns the value as a 32 character hex string.\n     *\n     * @param data\n     *            Data to digest\n     * @return MD2 digest as a hex string\n     * @since 1.7\n     ",
      "child_ranges": [
        "(line 314,col 9)-(line 314,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.DigestUtils.md2Hex(java.io.InputStream)",
      "begin_line": 327,
      "end_line": 329,
      "comment": "\n     * Calculates the MD2 digest and returns the value as a 32 character hex string.\n     *\n     * @param data\n     *            Data to digest\n     * @return MD2 digest as a hex string\n     * @throws IOException\n     *             On error reading from the stream\n     * @since 1.7\n     ",
      "child_ranges": [
        "(line 328,col 9)-(line 328,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.DigestUtils.md2Hex(java.lang.String)",
      "begin_line": 339,
      "end_line": 341,
      "comment": "\n     * Calculates the MD2 digest and returns the value as a 32 character hex string.\n     *\n     * @param data\n     *            Data to digest\n     * @return MD2 digest as a hex string\n     * @since 1.7\n     ",
      "child_ranges": [
        "(line 340,col 9)-(line 340,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.DigestUtils.md5(byte[])",
      "begin_line": 350,
      "end_line": 352,
      "comment": "\n     * Calculates the MD5 digest and returns the value as a 16 element \u003ccode\u003ebyte[]\u003c/code\u003e.\n     *\n     * @param data\n     *            Data to digest\n     * @return MD5 digest\n     ",
      "child_ranges": [
        "(line 351,col 9)-(line 351,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.DigestUtils.md5(java.io.InputStream)",
      "begin_line": 364,
      "end_line": 366,
      "comment": "\n     * Calculates the MD5 digest and returns the value as a 16 element \u003ccode\u003ebyte[]\u003c/code\u003e.\n     *\n     * @param data\n     *            Data to digest\n     * @return MD5 digest\n     * @throws IOException\n     *             On error reading from the stream\n     * @since 1.4\n     ",
      "child_ranges": [
        "(line 365,col 9)-(line 365,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.DigestUtils.md5(java.lang.String)",
      "begin_line": 375,
      "end_line": 377,
      "comment": "\n     * Calculates the MD5 digest and returns the value as a 16 element \u003ccode\u003ebyte[]\u003c/code\u003e.\n     *\n     * @param data\n     *            Data to digest; converted to bytes using {@link StringUtils#getBytesUtf8(String)}\n     * @return MD5 digest\n     ",
      "child_ranges": [
        "(line 376,col 9)-(line 376,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.DigestUtils.md5Hex(byte[])",
      "begin_line": 386,
      "end_line": 388,
      "comment": "\n     * Calculates the MD5 digest and returns the value as a 32 character hex string.\n     *\n     * @param data\n     *            Data to digest\n     * @return MD5 digest as a hex string\n     ",
      "child_ranges": [
        "(line 387,col 9)-(line 387,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.DigestUtils.md5Hex(java.io.InputStream)",
      "begin_line": 400,
      "end_line": 402,
      "comment": "\n     * Calculates the MD5 digest and returns the value as a 32 character hex string.\n     *\n     * @param data\n     *            Data to digest\n     * @return MD5 digest as a hex string\n     * @throws IOException\n     *             On error reading from the stream\n     * @since 1.4\n     ",
      "child_ranges": [
        "(line 401,col 9)-(line 401,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.DigestUtils.md5Hex(java.lang.String)",
      "begin_line": 411,
      "end_line": 413,
      "comment": "\n     * Calculates the MD5 digest and returns the value as a 32 character hex string.\n     *\n     * @param data\n     *            Data to digest\n     * @return MD5 digest as a hex string\n     ",
      "child_ranges": [
        "(line 412,col 9)-(line 412,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.DigestUtils.sha(byte[])",
      "begin_line": 423,
      "end_line": 426,
      "comment": "\n * Calculates the SHA-1 digest and returns the value as a \u003ccode\u003ebyte[]\u003c/code\u003e.\n *\n * @param data\n *            Data to digest\n * @return SHA-1 digest\n * @deprecated Use {@link #sha1(byte[])}\n ",
      "child_ranges": [
        "(line 425,col 5)-(line 425,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.DigestUtils.sha(java.io.InputStream)",
      "begin_line": 439,
      "end_line": 442,
      "comment": "\n     * Calculates the SHA-1 digest and returns the value as a \u003ccode\u003ebyte[]\u003c/code\u003e.\n     *\n     * @param data\n     *            Data to digest\n     * @return SHA-1 digest\n     * @throws IOException\n     *             On error reading from the stream\n     * @since 1.4\n     * @deprecated Use {@link #sha1(InputStream)}\n     ",
      "child_ranges": [
        "(line 441,col 9)-(line 441,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.DigestUtils.sha(java.lang.String)",
      "begin_line": 452,
      "end_line": 455,
      "comment": "\n     * Calculates the SHA-1 digest and returns the value as a \u003ccode\u003ebyte[]\u003c/code\u003e.\n     *\n     * @param data\n     *            Data to digest\n     * @return SHA-1 digest\n     * @deprecated Use {@link #sha1(String)}\n     ",
      "child_ranges": [
        "(line 454,col 9)-(line 454,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.DigestUtils.sha1(byte[])",
      "begin_line": 465,
      "end_line": 467,
      "comment": "\n     * Calculates the SHA-1 digest and returns the value as a \u003ccode\u003ebyte[]\u003c/code\u003e.\n     *\n     * @param data\n     *            Data to digest\n     * @return SHA-1 digest\n     * @since 1.7\n     ",
      "child_ranges": [
        "(line 466,col 9)-(line 466,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.DigestUtils.sha1(java.io.InputStream)",
      "begin_line": 479,
      "end_line": 481,
      "comment": "\n     * Calculates the SHA-1 digest and returns the value as a \u003ccode\u003ebyte[]\u003c/code\u003e.\n     *\n     * @param data\n     *            Data to digest\n     * @return SHA-1 digest\n     * @throws IOException\n     *             On error reading from the stream\n     * @since 1.7\n     ",
      "child_ranges": [
        "(line 480,col 9)-(line 480,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.DigestUtils.sha1(java.lang.String)",
      "begin_line": 490,
      "end_line": 492,
      "comment": "\n     * Calculates the SHA-1 digest and returns the value as a \u003ccode\u003ebyte[]\u003c/code\u003e.\n     *\n     * @param data\n     *            Data to digest; converted to bytes using {@link StringUtils#getBytesUtf8(String)}\n     * @return SHA-1 digest\n     ",
      "child_ranges": [
        "(line 491,col 9)-(line 491,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.DigestUtils.sha1Hex(byte[])",
      "begin_line": 502,
      "end_line": 504,
      "comment": "\n     * Calculates the SHA-1 digest and returns the value as a hex string.\n     *\n     * @param data\n     *            Data to digest\n     * @return SHA-1 digest as a hex string\n     * @since 1.7\n     ",
      "child_ranges": [
        "(line 503,col 9)-(line 503,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.DigestUtils.sha1Hex(java.io.InputStream)",
      "begin_line": 516,
      "end_line": 518,
      "comment": "\n     * Calculates the SHA-1 digest and returns the value as a hex string.\n     *\n     * @param data\n     *            Data to digest\n     * @return SHA-1 digest as a hex string\n     * @throws IOException\n     *             On error reading from the stream\n     * @since 1.7\n     ",
      "child_ranges": [
        "(line 517,col 9)-(line 517,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.DigestUtils.sha1Hex(java.lang.String)",
      "begin_line": 528,
      "end_line": 530,
      "comment": "\n     * Calculates the SHA-1 digest and returns the value as a hex string.\n     *\n     * @param data\n     *            Data to digest\n     * @return SHA-1 digest as a hex string\n     * @since 1.7\n     ",
      "child_ranges": [
        "(line 529,col 9)-(line 529,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.DigestUtils.sha256(byte[])",
      "begin_line": 543,
      "end_line": 545,
      "comment": "\n     * Calculates the SHA-256 digest and returns the value as a \u003ccode\u003ebyte[]\u003c/code\u003e.\n     * \u003cp\u003e\n     * Throws a \u003ccode\u003eRuntimeException\u003c/code\u003e on JRE versions prior to 1.4.0.\n     * \u003c/p\u003e\n     *\n     * @param data\n     *            Data to digest\n     * @return SHA-256 digest\n     * @since 1.4\n     ",
      "child_ranges": [
        "(line 544,col 9)-(line 544,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.DigestUtils.sha256(java.io.InputStream)",
      "begin_line": 560,
      "end_line": 562,
      "comment": "\n     * Calculates the SHA-256 digest and returns the value as a \u003ccode\u003ebyte[]\u003c/code\u003e.\n     * \u003cp\u003e\n     * Throws a \u003ccode\u003eRuntimeException\u003c/code\u003e on JRE versions prior to 1.4.0.\n     * \u003c/p\u003e\n     *\n     * @param data\n     *            Data to digest\n     * @return SHA-256 digest\n     * @throws IOException\n     *             On error reading from the stream\n     * @since 1.4\n     ",
      "child_ranges": [
        "(line 561,col 9)-(line 561,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.DigestUtils.sha256(java.lang.String)",
      "begin_line": 575,
      "end_line": 577,
      "comment": "\n     * Calculates the SHA-256 digest and returns the value as a \u003ccode\u003ebyte[]\u003c/code\u003e.\n     * \u003cp\u003e\n     * Throws a \u003ccode\u003eRuntimeException\u003c/code\u003e on JRE versions prior to 1.4.0.\n     * \u003c/p\u003e\n     *\n     * @param data\n     *            Data to digest; converted to bytes using {@link StringUtils#getBytesUtf8(String)}\n     * @return SHA-256 digest\n     * @since 1.4\n     ",
      "child_ranges": [
        "(line 576,col 9)-(line 576,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.DigestUtils.sha256Hex(byte[])",
      "begin_line": 590,
      "end_line": 592,
      "comment": "\n     * Calculates the SHA-256 digest and returns the value as a hex string.\n     * \u003cp\u003e\n     * Throws a \u003ccode\u003eRuntimeException\u003c/code\u003e on JRE versions prior to 1.4.0.\n     * \u003c/p\u003e\n     *\n     * @param data\n     *            Data to digest\n     * @return SHA-256 digest as a hex string\n     * @since 1.4\n     ",
      "child_ranges": [
        "(line 591,col 9)-(line 591,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.DigestUtils.sha256Hex(java.io.InputStream)",
      "begin_line": 607,
      "end_line": 609,
      "comment": "\n     * Calculates the SHA-256 digest and returns the value as a hex string.\n     * \u003cp\u003e\n     * Throws a \u003ccode\u003eRuntimeException\u003c/code\u003e on JRE versions prior to 1.4.0.\n     * \u003c/p\u003e\n     *\n     * @param data\n     *            Data to digest\n     * @return SHA-256 digest as a hex string\n     * @throws IOException\n     *             On error reading from the stream\n     * @since 1.4\n     ",
      "child_ranges": [
        "(line 608,col 9)-(line 608,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.DigestUtils.sha256Hex(java.lang.String)",
      "begin_line": 622,
      "end_line": 624,
      "comment": "\n     * Calculates the SHA-256 digest and returns the value as a hex string.\n     * \u003cp\u003e\n     * Throws a \u003ccode\u003eRuntimeException\u003c/code\u003e on JRE versions prior to 1.4.0.\n     * \u003c/p\u003e\n     *\n     * @param data\n     *            Data to digest\n     * @return SHA-256 digest as a hex string\n     * @since 1.4\n     ",
      "child_ranges": [
        "(line 623,col 9)-(line 623,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.DigestUtils.sha384(byte[])",
      "begin_line": 637,
      "end_line": 639,
      "comment": "\n     * Calculates the SHA-384 digest and returns the value as a \u003ccode\u003ebyte[]\u003c/code\u003e.\n     * \u003cp\u003e\n     * Throws a \u003ccode\u003eRuntimeException\u003c/code\u003e on JRE versions prior to 1.4.0.\n     * \u003c/p\u003e\n     *\n     * @param data\n     *            Data to digest\n     * @return SHA-384 digest\n     * @since 1.4\n     ",
      "child_ranges": [
        "(line 638,col 9)-(line 638,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.DigestUtils.sha384(java.io.InputStream)",
      "begin_line": 654,
      "end_line": 656,
      "comment": "\n     * Calculates the SHA-384 digest and returns the value as a \u003ccode\u003ebyte[]\u003c/code\u003e.\n     * \u003cp\u003e\n     * Throws a \u003ccode\u003eRuntimeException\u003c/code\u003e on JRE versions prior to 1.4.0.\n     * \u003c/p\u003e\n     *\n     * @param data\n     *            Data to digest\n     * @return SHA-384 digest\n     * @throws IOException\n     *             On error reading from the stream\n     * @since 1.4\n     ",
      "child_ranges": [
        "(line 655,col 9)-(line 655,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.DigestUtils.sha384(java.lang.String)",
      "begin_line": 669,
      "end_line": 671,
      "comment": "\n     * Calculates the SHA-384 digest and returns the value as a \u003ccode\u003ebyte[]\u003c/code\u003e.\n     * \u003cp\u003e\n     * Throws a \u003ccode\u003eRuntimeException\u003c/code\u003e on JRE versions prior to 1.4.0.\n     * \u003c/p\u003e\n     *\n     * @param data\n     *            Data to digest; converted to bytes using {@link StringUtils#getBytesUtf8(String)}\n     * @return SHA-384 digest\n     * @since 1.4\n     ",
      "child_ranges": [
        "(line 670,col 9)-(line 670,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.DigestUtils.sha384Hex(byte[])",
      "begin_line": 684,
      "end_line": 686,
      "comment": "\n     * Calculates the SHA-384 digest and returns the value as a hex string.\n     * \u003cp\u003e\n     * Throws a \u003ccode\u003eRuntimeException\u003c/code\u003e on JRE versions prior to 1.4.0.\n     * \u003c/p\u003e\n     *\n     * @param data\n     *            Data to digest\n     * @return SHA-384 digest as a hex string\n     * @since 1.4\n     ",
      "child_ranges": [
        "(line 685,col 9)-(line 685,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.DigestUtils.sha384Hex(java.io.InputStream)",
      "begin_line": 701,
      "end_line": 703,
      "comment": "\n     * Calculates the SHA-384 digest and returns the value as a hex string.\n     * \u003cp\u003e\n     * Throws a \u003ccode\u003eRuntimeException\u003c/code\u003e on JRE versions prior to 1.4.0.\n     * \u003c/p\u003e\n     *\n     * @param data\n     *            Data to digest\n     * @return SHA-384 digest as a hex string\n     * @throws IOException\n     *             On error reading from the stream\n     * @since 1.4\n     ",
      "child_ranges": [
        "(line 702,col 9)-(line 702,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.DigestUtils.sha384Hex(java.lang.String)",
      "begin_line": 716,
      "end_line": 718,
      "comment": "\n     * Calculates the SHA-384 digest and returns the value as a hex string.\n     * \u003cp\u003e\n     * Throws a \u003ccode\u003eRuntimeException\u003c/code\u003e on JRE versions prior to 1.4.0.\n     * \u003c/p\u003e\n     *\n     * @param data\n     *            Data to digest\n     * @return SHA-384 digest as a hex string\n     * @since 1.4\n     ",
      "child_ranges": [
        "(line 717,col 9)-(line 717,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.DigestUtils.sha512(byte[])",
      "begin_line": 731,
      "end_line": 733,
      "comment": "\n     * Calculates the SHA-512 digest and returns the value as a \u003ccode\u003ebyte[]\u003c/code\u003e.\n     * \u003cp\u003e\n     * Throws a \u003ccode\u003eRuntimeException\u003c/code\u003e on JRE versions prior to 1.4.0.\n     * \u003c/p\u003e\n     *\n     * @param data\n     *            Data to digest\n     * @return SHA-512 digest\n     * @since 1.4\n     ",
      "child_ranges": [
        "(line 732,col 9)-(line 732,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.DigestUtils.sha512(java.io.InputStream)",
      "begin_line": 748,
      "end_line": 750,
      "comment": "\n     * Calculates the SHA-512 digest and returns the value as a \u003ccode\u003ebyte[]\u003c/code\u003e.\n     * \u003cp\u003e\n     * Throws a \u003ccode\u003eRuntimeException\u003c/code\u003e on JRE versions prior to 1.4.0.\n     * \u003c/p\u003e\n     *\n     * @param data\n     *            Data to digest\n     * @return SHA-512 digest\n     * @throws IOException\n     *             On error reading from the stream\n     * @since 1.4\n     ",
      "child_ranges": [
        "(line 749,col 9)-(line 749,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.DigestUtils.sha512(java.lang.String)",
      "begin_line": 763,
      "end_line": 765,
      "comment": "\n     * Calculates the SHA-512 digest and returns the value as a \u003ccode\u003ebyte[]\u003c/code\u003e.\n     * \u003cp\u003e\n     * Throws a \u003ccode\u003eRuntimeException\u003c/code\u003e on JRE versions prior to 1.4.0.\n     * \u003c/p\u003e\n     *\n     * @param data\n     *            Data to digest; converted to bytes using {@link StringUtils#getBytesUtf8(String)}\n     * @return SHA-512 digest\n     * @since 1.4\n     ",
      "child_ranges": [
        "(line 764,col 9)-(line 764,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.DigestUtils.sha512Hex(byte[])",
      "begin_line": 778,
      "end_line": 780,
      "comment": "\n     * Calculates the SHA-512 digest and returns the value as a hex string.\n     * \u003cp\u003e\n     * Throws a \u003ccode\u003eRuntimeException\u003c/code\u003e on JRE versions prior to 1.4.0.\n     * \u003c/p\u003e\n     *\n     * @param data\n     *            Data to digest\n     * @return SHA-512 digest as a hex string\n     * @since 1.4\n     ",
      "child_ranges": [
        "(line 779,col 9)-(line 779,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.DigestUtils.sha512Hex(java.io.InputStream)",
      "begin_line": 795,
      "end_line": 797,
      "comment": "\n     * Calculates the SHA-512 digest and returns the value as a hex string.\n     * \u003cp\u003e\n     * Throws a \u003ccode\u003eRuntimeException\u003c/code\u003e on JRE versions prior to 1.4.0.\n     * \u003c/p\u003e\n     *\n     * @param data\n     *            Data to digest\n     * @return SHA-512 digest as a hex string\n     * @throws IOException\n     *             On error reading from the stream\n     * @since 1.4\n     ",
      "child_ranges": [
        "(line 796,col 9)-(line 796,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.DigestUtils.sha512Hex(java.lang.String)",
      "begin_line": 810,
      "end_line": 812,
      "comment": "\n     * Calculates the SHA-512 digest and returns the value as a hex string.\n     * \u003cp\u003e\n     * Throws a \u003ccode\u003eRuntimeException\u003c/code\u003e on JRE versions prior to 1.4.0.\n     * \u003c/p\u003e\n     *\n     * @param data\n     *            Data to digest\n     * @return SHA-512 digest as a hex string\n     * @since 1.4\n     ",
      "child_ranges": [
        "(line 811,col 9)-(line 811,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.DigestUtils.shaHex(byte[])",
      "begin_line": 822,
      "end_line": 825,
      "comment": "\n     * Calculates the SHA-1 digest and returns the value as a hex string.\n     *\n     * @param data\n     *            Data to digest\n     * @return SHA-1 digest as a hex string\n     * @deprecated Use {@link #sha1Hex(byte[])}\n     ",
      "child_ranges": [
        "(line 824,col 9)-(line 824,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.DigestUtils.shaHex(java.io.InputStream)",
      "begin_line": 838,
      "end_line": 841,
      "comment": "\n     * Calculates the SHA-1 digest and returns the value as a hex string.\n     *\n     * @param data\n     *            Data to digest\n     * @return SHA-1 digest as a hex string\n     * @throws IOException\n     *             On error reading from the stream\n     * @since 1.4\n     * @deprecated Use {@link #sha1Hex(InputStream)}\n     ",
      "child_ranges": [
        "(line 840,col 9)-(line 840,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.DigestUtils.shaHex(java.lang.String)",
      "begin_line": 851,
      "end_line": 854,
      "comment": "\n     * Calculates the SHA-1 digest and returns the value as a hex string.\n     *\n     * @param data\n     *            Data to digest\n     * @return SHA-1 digest as a hex string\n     * @deprecated Use {@link #sha1Hex(String)}\n     ",
      "child_ranges": [
        "(line 853,col 9)-(line 853,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.DigestUtils.updateDigest(java.security.MessageDigest, byte[])",
      "begin_line": 866,
      "end_line": 869,
      "comment": "\n     * Updates the given {@link MessageDigest}.\n     *\n     * @param messageDigest\n     *            the {@link MessageDigest} to update\n     * @param valueToDigest\n     *            the value to update the {@link MessageDigest} with\n     * @return the updated {@link MessageDigest}\n     * @since 1.7\n     ",
      "child_ranges": [
        "(line 867,col 9)-(line 867,col 44)",
        "(line 868,col 9)-(line 868,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.DigestUtils.updateDigest(java.security.MessageDigest, java.nio.ByteBuffer)",
      "begin_line": 881,
      "end_line": 884,
      "comment": "\n     * Updates the given {@link MessageDigest}.\n     *\n     * @param messageDigest\n     *            the {@link MessageDigest} to update\n     * @param valueToDigest\n     *            the value to update the {@link MessageDigest} with\n     * @return the updated {@link MessageDigest}\n     * @since 1.11\n     ",
      "child_ranges": [
        "(line 882,col 9)-(line 882,col 44)",
        "(line 883,col 9)-(line 883,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.DigestUtils.updateDigest(java.security.MessageDigest, java.io.File)",
      "begin_line": 898,
      "end_line": 905,
      "comment": "\n     * Reads through a File and updates the digest for the data\n     *\n     * @param digest\n     *            The MessageDigest to use (e.g. MD5)\n     * @param data\n     *            Data to digest\n     * @return the digest\n     * @throws IOException\n     *             On error reading from the stream\n     * @since 1.11\n     ",
      "child_ranges": [
        "(line 899,col 9)-(line 899,col 94)",
        "(line 900,col 9)-(line 904,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.DigestUtils.updateDigest(java.security.MessageDigest, java.io.InputStream)",
      "begin_line": 919,
      "end_line": 929,
      "comment": "\n     * Reads through an InputStream and updates the digest for the data\n     *\n     * @param digest\n     *            The MessageDigest to use (e.g. MD5)\n     * @param data\n     *            Data to digest\n     * @return the digest\n     * @throws IOException\n     *             On error reading from the stream\n     * @since 1.8\n     ",
      "child_ranges": [
        "(line 920,col 9)-(line 920,col 61)",
        "(line 921,col 9)-(line 921,col 62)",
        "(line 923,col 9)-(line 926,col 9)",
        "(line 928,col 9)-(line 928,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.DigestUtils.updateDigest(java.security.MessageDigest, java.lang.String)",
      "begin_line": 947,
      "end_line": 950,
      "comment": "\n     * Updates the given {@link MessageDigest} from a String (converted to bytes using UTF-8).\n     * \u003cp\u003e\n     * To update the digest using a different charset for the conversion,\n     * convert the String to a byte array using\n     * {@link String#getBytes(java.nio.charset.Charset)} and pass that\n     * to the {@link DigestUtils#updateDigest(MessageDigest, byte[])} method\n     *\n     * @param messageDigest\n     *            the {@link MessageDigest} to update\n     * @param valueToDigest\n     *            the value to update the {@link MessageDigest} with;\n     *            converted to bytes using {@link StringUtils#getBytesUtf8(String)}\n     * @return the updated {@link MessageDigest}\n     * @since 1.7\n     ",
      "child_ranges": [
        "(line 948,col 9)-(line 948,col 70)",
        "(line 949,col 9)-(line 949,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.DigestUtils.isAvailable(java.lang.String)",
      "begin_line": 958,
      "end_line": 960,
      "comment": "\n     * Test whether the algorithm is supported.\n     * @param messageDigestAlgorithm the algorithm name\n     * @return {@code true} if the algorithm can be found\n     * @since 1.11\n     ",
      "child_ranges": [
        "(line 959,col 9)-(line 959,col 63)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "messageDigest"
      ],
      "begin_line": 962,
      "end_line": 962,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.codec.digest.DigestUtils.DigestUtils()",
      "begin_line": 969,
      "end_line": 972,
      "comment": "\n    * Preserves binary compatibity only.\n    * As for previous versions does not provide useful behaviour\n    * @deprecated since 1.11; only useful to preserve binary compatibility\n    ",
      "child_ranges": [
        "(line 971,col 9)-(line 971,col 34)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.codec.digest.DigestUtils.DigestUtils(java.security.MessageDigest)",
      "begin_line": 983,
      "end_line": 985,
      "comment": "\n     * Creates an instance using the provided {@link MessageDigest} parameter.\n     *\n     * This can then be used to create digests using methods such as\n     * {@link #digest(byte[])} and {@link #digestAsHex(File)}.\n     *\n     * @param digest the {@link MessageDigest} to use\n     * @since 1.11\n     ",
      "child_ranges": [
        "(line 984,col 9)-(line 984,col 36)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.codec.digest.DigestUtils.DigestUtils(java.lang.String)",
      "begin_line": 999,
      "end_line": 1001,
      "comment": "\n     * Creates an instance using the provided {@link MessageDigest} parameter.\n     *\n     * This can then be used to create digests using methods such as\n     * {@link #digest(byte[])} and {@link #digestAsHex(File)}.\n     *\n     * @param name the name of the {@link MessageDigest} to use\n     * @see #getDigest(String)\n     * @throws IllegalArgumentException\n     *             when a {@link NoSuchAlgorithmException} is caught.\n     * @since 1.11\n     ",
      "child_ranges": [
        "(line 1000,col 9)-(line 1000,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.DigestUtils.getMessageDigest()",
      "begin_line": 1008,
      "end_line": 1010,
      "comment": "\n     * Returns the message digest instance.\n     * @return the message digest instance\n     * @since 1.11\n     ",
      "child_ranges": [
        "(line 1009,col 9)-(line 1009,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.DigestUtils.digest(byte[])",
      "begin_line": 1020,
      "end_line": 1022,
      "comment": "\n     * Reads through a byte array and returns the digest for the data.\n     *\n     * @param data\n     *            Data to digest\n     * @return the digest\n     * @since 1.11\n     ",
      "child_ranges": [
        "(line 1021,col 9)-(line 1021,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.DigestUtils.digest(java.lang.String)",
      "begin_line": 1032,
      "end_line": 1034,
      "comment": "\n     * Reads through a byte array and returns the digest for the data.\n     *\n     * @param data\n     *            Data to digest treated as UTF-8 string\n     * @return the digest\n     * @since 1.11\n     ",
      "child_ranges": [
        "(line 1033,col 9)-(line 1033,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.DigestUtils.digest(java.nio.ByteBuffer)",
      "begin_line": 1045,
      "end_line": 1047,
      "comment": "\n     * Reads through a ByteBuffer and returns the digest for the data\n     *\n     * @param data\n     *            Data to digest\n     * @return the digest\n     *\n     * @since 1.11\n     ",
      "child_ranges": [
        "(line 1046,col 9)-(line 1046,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.DigestUtils.digest(java.io.File)",
      "begin_line": 1059,
      "end_line": 1061,
      "comment": "\n     * Reads through a File and returns the digest for the data\n     *\n     * @param data\n     *            Data to digest\n     * @return the digest\n     * @throws IOException\n     *             On error reading from the stream\n     * @since 1.11\n     ",
      "child_ranges": [
        "(line 1060,col 9)-(line 1060,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.DigestUtils.digest(java.io.InputStream)",
      "begin_line": 1073,
      "end_line": 1075,
      "comment": "\n     * Reads through an InputStream and returns the digest for the data\n     *\n     * @param data\n     *            Data to digest\n     * @return the digest\n     * @throws IOException\n     *             On error reading from the stream\n     * @since 1.11\n     ",
      "child_ranges": [
        "(line 1074,col 9)-(line 1074,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.DigestUtils.digestAsHex(byte[])",
      "begin_line": 1085,
      "end_line": 1087,
      "comment": "\n     * Reads through a byte array and returns the digest for the data.\n     *\n     * @param data\n     *            Data to digest\n     * @return the digest as a hex string\n     * @since 1.11\n     ",
      "child_ranges": [
        "(line 1086,col 9)-(line 1086,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.DigestUtils.digestAsHex(java.lang.String)",
      "begin_line": 1097,
      "end_line": 1099,
      "comment": "\n     * Reads through a byte array and returns the digest for the data.\n     *\n     * @param data\n     *            Data to digest treated as UTF-8 string\n     * @return the digest as a hex string\n     * @since 1.11\n     ",
      "child_ranges": [
        "(line 1098,col 9)-(line 1098,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.DigestUtils.digestAsHex(java.nio.ByteBuffer)",
      "begin_line": 1110,
      "end_line": 1112,
      "comment": "\n     * Reads through a ByteBuffer and returns the digest for the data\n     *\n     * @param data\n     *            Data to digest\n     * @return the digest as a hex string\n     *\n     * @since 1.11\n     ",
      "child_ranges": [
        "(line 1111,col 9)-(line 1111,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.DigestUtils.digestAsHex(java.io.File)",
      "begin_line": 1124,
      "end_line": 1126,
      "comment": "\n     * Reads through a File and returns the digest for the data\n     *\n     * @param data\n     *            Data to digest\n     * @return the digest as a hex string\n     * @throws IOException\n     *             On error reading from the stream\n     * @since 1.11\n     ",
      "child_ranges": [
        "(line 1125,col 9)-(line 1125,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.DigestUtils.digestAsHex(java.io.InputStream)",
      "begin_line": 1138,
      "end_line": 1140,
      "comment": "\n     * Reads through an InputStream and returns the digest for the data\n     *\n     * @param data\n     *            Data to digest\n     * @return the digest as a hex string\n     * @throws IOException\n     *             On error reading from the stream\n     * @since 1.11\n     ",
      "child_ranges": [
        "(line 1139,col 9)-(line 1139,col 49)"
      ]
    }
  ]
}