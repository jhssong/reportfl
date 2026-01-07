{
  "filepath": "/tmp/Codec-3b/src/java/org/apache/commons/codec/digest/DigestUtils.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "DigestUtils",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 33,
      "end_line": 555,
      "comment": "\n * Operations to simplifiy common {@link java.security.MessageDigest} tasks. This class is thread safe.\n * \n * @author Apache Software Foundation\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "STREAM_BUFFER_LENGTH"
      ],
      "begin_line": 35,
      "end_line": 35,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.DigestUtils.digest(java.security.MessageDigest, java.io.InputStream)",
      "begin_line": 45,
      "end_line": 55,
      "comment": "\n     * Read through an InputStream and returns the digest for the data\n     * \n     * @param digest The MessageDigest to use (e.g. MD5)\n     * @param data Data to digest\n     * @return MD5 digest\n     * @throws IOException On error reading from the stream\n     ",
      "child_ranges": [
        "(line 46,col 9)-(line 46,col 55)",
        "(line 47,col 9)-(line 47,col 62)",
        "(line 49,col 9)-(line 52,col 9)",
        "(line 54,col 9)-(line 54,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.DigestUtils.getDigest(java.lang.String)",
      "begin_line": 70,
      "end_line": 76,
      "comment": "\n     * Returns a \u003ccode\u003eMessageDigest\u003c/code\u003e for the given \u003ccode\u003ealgorithm\u003c/code\u003e.\n     * \n     * @param algorithm\n     *            the name of the algorithm requested. See \u003ca\n     *            href\u003d\"http://java.sun.com/j2se/1.3/docs/guide/security/CryptoSpec.html#AppA\"\u003eAppendix A in the Java\n     *            Cryptography Architecture API Specification \u0026 Reference\u003c/a\u003e for information about standard algorithm\n     *            names.\n     * @return An MD5 digest instance.\n     * @see MessageDigest#getInstance(String)\n     * @throws RuntimeException\n     *             when a {@link java.security.NoSuchAlgorithmException} is caught.\n     ",
      "child_ranges": [
        "(line 71,col 9)-(line 75,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.DigestUtils.getMd5Digest()",
      "begin_line": 85,
      "end_line": 87,
      "comment": "\n     * Returns an MD5 MessageDigest.\n     * \n     * @return An MD5 digest instance.\n     * @throws RuntimeException\n     *             when a {@link java.security.NoSuchAlgorithmException} is caught.\n     ",
      "child_ranges": [
        "(line 86,col 9)-(line 86,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.DigestUtils.getSha256Digest()",
      "begin_line": 99,
      "end_line": 101,
      "comment": "\n     * Returns an SHA-256 digest.\n     * \u003cp\u003e\n     * Throws a \u003ccode\u003eRuntimeException\u003c/code\u003e on JRE versions prior to 1.4.0.\n     * \u003c/p\u003e\n     * \n     * @return An SHA-256 digest instance.\n     * @throws RuntimeException\n     *             when a {@link java.security.NoSuchAlgorithmException} is caught.\n     ",
      "child_ranges": [
        "(line 100,col 9)-(line 100,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.DigestUtils.getSha384Digest()",
      "begin_line": 113,
      "end_line": 115,
      "comment": "\n     * Returns an SHA-384 digest.\n     * \u003cp\u003e\n     * Throws a \u003ccode\u003eRuntimeException\u003c/code\u003e on JRE versions prior to 1.4.0.\n     * \u003c/p\u003e\n     * \n     * @return An SHA-384 digest instance.\n     * @throws RuntimeException\n     *             when a {@link java.security.NoSuchAlgorithmException} is caught.\n     ",
      "child_ranges": [
        "(line 114,col 9)-(line 114,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.DigestUtils.getSha512Digest()",
      "begin_line": 127,
      "end_line": 129,
      "comment": "\n     * Returns an SHA-512 digest.\n     * \u003cp\u003e\n     * Throws a \u003ccode\u003eRuntimeException\u003c/code\u003e on JRE versions prior to 1.4.0.\n     * \u003c/p\u003e\n     * \n     * @return An SHA-512 digest instance.\n     * @throws RuntimeException\n     *             when a {@link java.security.NoSuchAlgorithmException} is caught.\n     ",
      "child_ranges": [
        "(line 128,col 9)-(line 128,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.DigestUtils.getShaDigest()",
      "begin_line": 138,
      "end_line": 140,
      "comment": "\n     * Returns an SHA-1 digest.\n     * \n     * @return An SHA-1 digest instance.\n     * @throws RuntimeException\n     *             when a {@link java.security.NoSuchAlgorithmException} is caught.\n     ",
      "child_ranges": [
        "(line 139,col 9)-(line 139,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.DigestUtils.md5(byte[])",
      "begin_line": 149,
      "end_line": 151,
      "comment": "\n     * Calculates the MD5 digest and returns the value as a 16 element \u003ccode\u003ebyte[]\u003c/code\u003e.\n     * \n     * @param data\n     *            Data to digest\n     * @return MD5 digest\n     ",
      "child_ranges": [
        "(line 150,col 9)-(line 150,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.DigestUtils.md5(java.io.InputStream)",
      "begin_line": 162,
      "end_line": 164,
      "comment": "\n     * Calculates the MD5 digest and returns the value as a 16 element \u003ccode\u003ebyte[]\u003c/code\u003e.\n     * \n     * @param data\n     *            Data to digest\n     * @return MD5 digest\n     * @throws IOException On error reading from the stream\n     * @since 1.4\n     ",
      "child_ranges": [
        "(line 163,col 9)-(line 163,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.DigestUtils.md5(java.lang.String)",
      "begin_line": 173,
      "end_line": 175,
      "comment": "\n     * Calculates the MD5 digest and returns the value as a 16 element \u003ccode\u003ebyte[]\u003c/code\u003e.\n     * \n     * @param data\n     *            Data to digest\n     * @return MD5 digest\n     ",
      "child_ranges": [
        "(line 174,col 9)-(line 174,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.DigestUtils.md5Hex(byte[])",
      "begin_line": 184,
      "end_line": 186,
      "comment": "\n     * Calculates the MD5 digest and returns the value as a 32 character hex string.\n     * \n     * @param data\n     *            Data to digest\n     * @return MD5 digest as a hex string\n     ",
      "child_ranges": [
        "(line 185,col 9)-(line 185,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.DigestUtils.md5Hex(java.io.InputStream)",
      "begin_line": 197,
      "end_line": 199,
      "comment": "\n     * Calculates the MD5 digest and returns the value as a 32 character hex string.\n     * \n     * @param data\n     *            Data to digest\n     * @return MD5 digest as a hex string\n     * @throws IOException On error reading from the stream\n     * @since 1.4\n     ",
      "child_ranges": [
        "(line 198,col 9)-(line 198,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.DigestUtils.md5Hex(java.lang.String)",
      "begin_line": 208,
      "end_line": 210,
      "comment": "\n     * Calculates the MD5 digest and returns the value as a 32 character hex string.\n     * \n     * @param data\n     *            Data to digest\n     * @return MD5 digest as a hex string\n     ",
      "child_ranges": [
        "(line 209,col 9)-(line 209,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.DigestUtils.sha(byte[])",
      "begin_line": 219,
      "end_line": 221,
      "comment": "\n     * Calculates the SHA-1 digest and returns the value as a \u003ccode\u003ebyte[]\u003c/code\u003e.\n     * \n     * @param data\n     *            Data to digest\n     * @return SHA-1 digest\n     ",
      "child_ranges": [
        "(line 220,col 9)-(line 220,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.DigestUtils.sha(java.io.InputStream)",
      "begin_line": 231,
      "end_line": 233,
      "comment": "\n     * Calculates the SHA-1 digest and returns the value as a \u003ccode\u003ebyte[]\u003c/code\u003e.\n     * \n     * @param data\n     *            Data to digest\n     * @return SHA-1 digest\n     * @throws IOException On error reading from the stream\n     ",
      "child_ranges": [
        "(line 232,col 9)-(line 232,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.DigestUtils.sha(java.lang.String)",
      "begin_line": 242,
      "end_line": 244,
      "comment": "\n     * Calculates the SHA-1 digest and returns the value as a \u003ccode\u003ebyte[]\u003c/code\u003e.\n     * \n     * @param data\n     *            Data to digest\n     * @return SHA-1 digest\n     ",
      "child_ranges": [
        "(line 243,col 9)-(line 243,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.DigestUtils.sha256(byte[])",
      "begin_line": 257,
      "end_line": 259,
      "comment": "\n     * Calculates the SHA-256 digest and returns the value as a \u003ccode\u003ebyte[]\u003c/code\u003e.\n     * \u003cp\u003e\n     * Throws a \u003ccode\u003eRuntimeException\u003c/code\u003e on JRE versions prior to 1.4.0.\n     * \u003c/p\u003e\n     * \n     * @param data\n     *            Data to digest\n     * @return SHA-256 digest\n     * @since 1.4\n     ",
      "child_ranges": [
        "(line 258,col 9)-(line 258,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.DigestUtils.sha256(java.io.InputStream)",
      "begin_line": 273,
      "end_line": 275,
      "comment": "\n     * Calculates the SHA-256 digest and returns the value as a \u003ccode\u003ebyte[]\u003c/code\u003e.\n     * \u003cp\u003e\n     * Throws a \u003ccode\u003eRuntimeException\u003c/code\u003e on JRE versions prior to 1.4.0.\n     * \u003c/p\u003e\n     * \n     * @param data\n     *            Data to digest\n     * @return SHA-256 digest\n     * @throws IOException On error reading from the stream\n     * @since 1.4\n     ",
      "child_ranges": [
        "(line 274,col 9)-(line 274,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.DigestUtils.sha256(java.lang.String)",
      "begin_line": 288,
      "end_line": 290,
      "comment": "\n     * Calculates the SHA-256 digest and returns the value as a \u003ccode\u003ebyte[]\u003c/code\u003e.\n     * \u003cp\u003e\n     * Throws a \u003ccode\u003eRuntimeException\u003c/code\u003e on JRE versions prior to 1.4.0.\n     * \u003c/p\u003e\n     * \n     * @param data\n     *            Data to digest\n     * @return SHA-256 digest\n     * @since 1.4\n     ",
      "child_ranges": [
        "(line 289,col 9)-(line 289,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.DigestUtils.sha256Hex(byte[])",
      "begin_line": 303,
      "end_line": 305,
      "comment": "\n     * Calculates the SHA-256 digest and returns the value as a hex string.\n     * \u003cp\u003e\n     * Throws a \u003ccode\u003eRuntimeException\u003c/code\u003e on JRE versions prior to 1.4.0.\n     * \u003c/p\u003e\n     * \n     * @param data\n     *            Data to digest\n     * @return SHA-256 digest as a hex string\n     * @since 1.4\n     ",
      "child_ranges": [
        "(line 304,col 9)-(line 304,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.DigestUtils.sha256Hex(java.io.InputStream)",
      "begin_line": 319,
      "end_line": 321,
      "comment": "\n     * Calculates the SHA-256 digest and returns the value as a hex string.\n     * \u003cp\u003e\n     * Throws a \u003ccode\u003eRuntimeException\u003c/code\u003e on JRE versions prior to 1.4.0.\n     * \u003c/p\u003e\n     * \n     * @param data\n     *            Data to digest\n     * @return SHA-256 digest as a hex string\n     * @throws IOException On error reading from the stream\n     * @since 1.4\n     ",
      "child_ranges": [
        "(line 320,col 9)-(line 320,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.DigestUtils.sha256Hex(java.lang.String)",
      "begin_line": 334,
      "end_line": 336,
      "comment": "\n     * Calculates the SHA-256 digest and returns the value as a hex string.\n     * \u003cp\u003e\n     * Throws a \u003ccode\u003eRuntimeException\u003c/code\u003e on JRE versions prior to 1.4.0.\n     * \u003c/p\u003e\n     * \n     * @param data\n     *            Data to digest\n     * @return SHA-256 digest as a hex string\n     * @since 1.4\n     ",
      "child_ranges": [
        "(line 335,col 9)-(line 335,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.DigestUtils.sha384(byte[])",
      "begin_line": 349,
      "end_line": 351,
      "comment": "\n     * Calculates the SHA-384 digest and returns the value as a \u003ccode\u003ebyte[]\u003c/code\u003e.\n     * \u003cp\u003e\n     * Throws a \u003ccode\u003eRuntimeException\u003c/code\u003e on JRE versions prior to 1.4.0.\n     * \u003c/p\u003e\n     * \n     * @param data\n     *            Data to digest\n     * @return SHA-384 digest\n     * @since 1.4\n     ",
      "child_ranges": [
        "(line 350,col 9)-(line 350,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.DigestUtils.sha384(java.io.InputStream)",
      "begin_line": 365,
      "end_line": 367,
      "comment": "\n     * Calculates the SHA-384 digest and returns the value as a \u003ccode\u003ebyte[]\u003c/code\u003e.\n     * \u003cp\u003e\n     * Throws a \u003ccode\u003eRuntimeException\u003c/code\u003e on JRE versions prior to 1.4.0.\n     * \u003c/p\u003e\n     * \n     * @param data\n     *            Data to digest\n     * @return SHA-384 digest\n     * @throws IOException On error reading from the stream\n     * @since 1.4\n     ",
      "child_ranges": [
        "(line 366,col 9)-(line 366,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.DigestUtils.sha384(java.lang.String)",
      "begin_line": 380,
      "end_line": 382,
      "comment": "\n     * Calculates the SHA-384 digest and returns the value as a \u003ccode\u003ebyte[]\u003c/code\u003e.\n     * \u003cp\u003e\n     * Throws a \u003ccode\u003eRuntimeException\u003c/code\u003e on JRE versions prior to 1.4.0.\n     * \u003c/p\u003e\n     * \n     * @param data\n     *            Data to digest\n     * @return SHA-384 digest\n     * @since 1.4\n     ",
      "child_ranges": [
        "(line 381,col 9)-(line 381,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.DigestUtils.sha384Hex(byte[])",
      "begin_line": 395,
      "end_line": 397,
      "comment": "\n     * Calculates the SHA-384 digest and returns the value as a hex string.\n     * \u003cp\u003e\n     * Throws a \u003ccode\u003eRuntimeException\u003c/code\u003e on JRE versions prior to 1.4.0.\n     * \u003c/p\u003e\n     * \n     * @param data\n     *            Data to digest\n     * @return SHA-384 digest as a hex string\n     * @since 1.4\n     ",
      "child_ranges": [
        "(line 396,col 9)-(line 396,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.DigestUtils.sha384Hex(java.io.InputStream)",
      "begin_line": 411,
      "end_line": 413,
      "comment": "\n     * Calculates the SHA-384 digest and returns the value as a hex string.\n     * \u003cp\u003e\n     * Throws a \u003ccode\u003eRuntimeException\u003c/code\u003e on JRE versions prior to 1.4.0.\n     * \u003c/p\u003e\n     * \n     * @param data\n     *            Data to digest\n     * @return SHA-384 digest as a hex string\n     * @throws IOException On error reading from the stream\n     * @since 1.4\n     ",
      "child_ranges": [
        "(line 412,col 9)-(line 412,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.DigestUtils.sha384Hex(java.lang.String)",
      "begin_line": 426,
      "end_line": 428,
      "comment": "\n     * Calculates the SHA-384 digest and returns the value as a hex string.\n     * \u003cp\u003e\n     * Throws a \u003ccode\u003eRuntimeException\u003c/code\u003e on JRE versions prior to 1.4.0.\n     * \u003c/p\u003e\n     * \n     * @param data\n     *            Data to digest\n     * @return SHA-384 digest as a hex string\n     * @since 1.4\n     ",
      "child_ranges": [
        "(line 427,col 9)-(line 427,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.DigestUtils.sha512(byte[])",
      "begin_line": 441,
      "end_line": 443,
      "comment": "\n     * Calculates the SHA-512 digest and returns the value as a \u003ccode\u003ebyte[]\u003c/code\u003e.\n     * \u003cp\u003e\n     * Throws a \u003ccode\u003eRuntimeException\u003c/code\u003e on JRE versions prior to 1.4.0.\n     * \u003c/p\u003e\n     * \n     * @param data\n     *            Data to digest\n     * @return SHA-512 digest\n     * @since 1.4\n     ",
      "child_ranges": [
        "(line 442,col 9)-(line 442,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.DigestUtils.sha512(java.io.InputStream)",
      "begin_line": 457,
      "end_line": 459,
      "comment": "\n     * Calculates the SHA-512 digest and returns the value as a \u003ccode\u003ebyte[]\u003c/code\u003e.\n     * \u003cp\u003e\n     * Throws a \u003ccode\u003eRuntimeException\u003c/code\u003e on JRE versions prior to 1.4.0.\n     * \u003c/p\u003e\n     * \n     * @param data\n     *            Data to digest\n     * @return SHA-512 digest\n     * @throws IOException On error reading from the stream\n     * @since 1.4\n     ",
      "child_ranges": [
        "(line 458,col 9)-(line 458,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.DigestUtils.sha512(java.lang.String)",
      "begin_line": 472,
      "end_line": 474,
      "comment": "\n     * Calculates the SHA-512 digest and returns the value as a \u003ccode\u003ebyte[]\u003c/code\u003e.\n     * \u003cp\u003e\n     * Throws a \u003ccode\u003eRuntimeException\u003c/code\u003e on JRE versions prior to 1.4.0.\n     * \u003c/p\u003e\n     * \n     * @param data\n     *            Data to digest\n     * @return SHA-512 digest\n     * @since 1.4\n     ",
      "child_ranges": [
        "(line 473,col 9)-(line 473,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.DigestUtils.sha512Hex(byte[])",
      "begin_line": 487,
      "end_line": 489,
      "comment": "\n     * Calculates the SHA-512 digest and returns the value as a hex string.\n     * \u003cp\u003e\n     * Throws a \u003ccode\u003eRuntimeException\u003c/code\u003e on JRE versions prior to 1.4.0.\n     * \u003c/p\u003e\n     * \n     * @param data\n     *            Data to digest\n     * @return SHA-512 digest as a hex string\n     * @since 1.4\n     ",
      "child_ranges": [
        "(line 488,col 9)-(line 488,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.DigestUtils.sha512Hex(java.io.InputStream)",
      "begin_line": 503,
      "end_line": 505,
      "comment": "\n     * Calculates the SHA-512 digest and returns the value as a hex string.\n     * \u003cp\u003e\n     * Throws a \u003ccode\u003eRuntimeException\u003c/code\u003e on JRE versions prior to 1.4.0.\n     * \u003c/p\u003e\n     * \n     * @param data\n     *            Data to digest\n     * @return SHA-512 digest as a hex string\n     * @throws IOException On error reading from the stream\n     * @since 1.4\n     ",
      "child_ranges": [
        "(line 504,col 9)-(line 504,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.DigestUtils.sha512Hex(java.lang.String)",
      "begin_line": 518,
      "end_line": 520,
      "comment": "\n     * Calculates the SHA-512 digest and returns the value as a hex string.\n     * \u003cp\u003e\n     * Throws a \u003ccode\u003eRuntimeException\u003c/code\u003e on JRE versions prior to 1.4.0.\n     * \u003c/p\u003e\n     * \n     * @param data\n     *            Data to digest\n     * @return SHA-512 digest as a hex string\n     * @since 1.4\n     ",
      "child_ranges": [
        "(line 519,col 9)-(line 519,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.DigestUtils.shaHex(byte[])",
      "begin_line": 529,
      "end_line": 531,
      "comment": "\n     * Calculates the SHA-1 digest and returns the value as a hex string.\n     * \n     * @param data\n     *            Data to digest\n     * @return SHA-1 digest as a hex string\n     ",
      "child_ranges": [
        "(line 530,col 9)-(line 530,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.DigestUtils.shaHex(java.io.InputStream)",
      "begin_line": 541,
      "end_line": 543,
      "comment": "\n     * Calculates the SHA-1 digest and returns the value as a hex string.\n     * \n     * @param data\n     *            Data to digest\n     * @return SHA-1 digest as a hex string\n     * @throws IOException On error reading from the stream\n     ",
      "child_ranges": [
        "(line 542,col 9)-(line 542,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.DigestUtils.shaHex(java.lang.String)",
      "begin_line": 552,
      "end_line": 554,
      "comment": "\n     * Calculates the SHA-1 digest and returns the value as a hex string.\n     * \n     * @param data\n     *            Data to digest\n     * @return SHA-1 digest as a hex string\n     ",
      "child_ranges": [
        "(line 553,col 9)-(line 553,col 52)"
      ]
    }
  ]
}