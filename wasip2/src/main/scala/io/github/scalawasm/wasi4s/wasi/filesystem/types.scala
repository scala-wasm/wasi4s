package io.github.scalawasm.wasi4s.wasi.filesystem

package object types {

  // Type definitions
  type InputStream = io.github.scalawasm.wasi4s.wasi.io.streams.InputStream

  type OutputStream = io.github.scalawasm.wasi4s.wasi.io.streams.OutputStream

  type Error = io.github.scalawasm.wasi4s.wasi.io.streams.Error

  type Datetime = io.github.scalawasm.wasi4s.wasi.clocks.wall_clock.Datetime

  @scala.scalajs.wit.annotation.WitAlias(scala.scalajs.wit.annotation.WitScope("wasi", "filesystem", "types", "0.2.12"), "filesize")
  type Filesize = scala.scalajs.wit.unsigned.ULong

  /** The type of a filesystem object referenced by a descriptor.
   *
   *  Note: This was called `filetype` in earlier versions of WASI.
   */
  @scala.scalajs.wit.annotation.WitEnum(scala.scalajs.wit.annotation.WitScope("wasi", "filesystem", "types", "0.2.12"), "descriptor-type")
  sealed trait DescriptorType
  object DescriptorType {
    @scala.scalajs.wit.annotation.WitName("unknown")
    object Unknown extends DescriptorType {
      override def toString(): String = "Unknown"
    }
    @scala.scalajs.wit.annotation.WitName("block-device")
    object BlockDevice extends DescriptorType {
      override def toString(): String = "BlockDevice"
    }
    @scala.scalajs.wit.annotation.WitName("character-device")
    object CharacterDevice extends DescriptorType {
      override def toString(): String = "CharacterDevice"
    }
    @scala.scalajs.wit.annotation.WitName("directory")
    object Directory extends DescriptorType {
      override def toString(): String = "Directory"
    }
    @scala.scalajs.wit.annotation.WitName("fifo")
    object Fifo extends DescriptorType {
      override def toString(): String = "Fifo"
    }
    @scala.scalajs.wit.annotation.WitName("symbolic-link")
    object SymbolicLink extends DescriptorType {
      override def toString(): String = "SymbolicLink"
    }
    @scala.scalajs.wit.annotation.WitName("regular-file")
    object RegularFile extends DescriptorType {
      override def toString(): String = "RegularFile"
    }
    @scala.scalajs.wit.annotation.WitName("socket")
    object Socket extends DescriptorType {
      override def toString(): String = "Socket"
    }
  }

  /** Descriptor flags.
   *
   *  Note: This was called `fdflags` in earlier versions of WASI.
   */
  @scala.scalajs.wit.annotation.WitFlags(scala.scalajs.wit.annotation.WitScope("wasi", "filesystem", "types", "0.2.12"), "descriptor-flags", Array("read", "write", "file-integrity-sync", "data-integrity-sync", "requested-write-sync", "mutate-directory"))
  final class DescriptorFlags(val value: Int) {
    def |(other: DescriptorFlags): DescriptorFlags = new DescriptorFlags(value | other.value)
    def &(other: DescriptorFlags): DescriptorFlags = new DescriptorFlags(value & other.value)
    def ^(other: DescriptorFlags): DescriptorFlags = new DescriptorFlags(value ^ other.value)
    def unary_~ : DescriptorFlags = new DescriptorFlags(~value)
    def contains(other: DescriptorFlags): Boolean = (value & other.value) == other.value
    override def equals(other: Any): Boolean = other match {
      case that: DescriptorFlags => this.value == that.value
      case _ => false
    }
    override def hashCode(): Int = {
      value.hashCode()
    }
    override def toString(): String = "DescriptorFlags(" + value + ")"
  }
  object DescriptorFlags {
    def apply(value: Int): DescriptorFlags = new DescriptorFlags(value)
    def unapply(arg: DescriptorFlags): Some[Int] = Some(arg.value)
    val read = new DescriptorFlags(1 << 0)
    val write = new DescriptorFlags(1 << 1)
    val fileIntegritySync = new DescriptorFlags(1 << 2)
    val dataIntegritySync = new DescriptorFlags(1 << 3)
    val requestedWriteSync = new DescriptorFlags(1 << 4)
    val mutateDirectory = new DescriptorFlags(1 << 5)
  }

  /** Flags determining the method of how paths are resolved.
   */
  @scala.scalajs.wit.annotation.WitFlags(scala.scalajs.wit.annotation.WitScope("wasi", "filesystem", "types", "0.2.12"), "path-flags", Array("symlink-follow"))
  final class PathFlags(val value: Int) {
    def |(other: PathFlags): PathFlags = new PathFlags(value | other.value)
    def &(other: PathFlags): PathFlags = new PathFlags(value & other.value)
    def ^(other: PathFlags): PathFlags = new PathFlags(value ^ other.value)
    def unary_~ : PathFlags = new PathFlags(~value)
    def contains(other: PathFlags): Boolean = (value & other.value) == other.value
    override def equals(other: Any): Boolean = other match {
      case that: PathFlags => this.value == that.value
      case _ => false
    }
    override def hashCode(): Int = {
      value.hashCode()
    }
    override def toString(): String = "PathFlags(" + value + ")"
  }
  object PathFlags {
    def apply(value: Int): PathFlags = new PathFlags(value)
    def unapply(arg: PathFlags): Some[Int] = Some(arg.value)
    val symlinkFollow = new PathFlags(1 << 0)
  }

  /** Open flags used by `open-at`.
   */
  @scala.scalajs.wit.annotation.WitFlags(scala.scalajs.wit.annotation.WitScope("wasi", "filesystem", "types", "0.2.12"), "open-flags", Array("create", "directory", "exclusive", "truncate"))
  final class OpenFlags(val value: Int) {
    def |(other: OpenFlags): OpenFlags = new OpenFlags(value | other.value)
    def &(other: OpenFlags): OpenFlags = new OpenFlags(value & other.value)
    def ^(other: OpenFlags): OpenFlags = new OpenFlags(value ^ other.value)
    def unary_~ : OpenFlags = new OpenFlags(~value)
    def contains(other: OpenFlags): Boolean = (value & other.value) == other.value
    override def equals(other: Any): Boolean = other match {
      case that: OpenFlags => this.value == that.value
      case _ => false
    }
    override def hashCode(): Int = {
      value.hashCode()
    }
    override def toString(): String = "OpenFlags(" + value + ")"
  }
  object OpenFlags {
    def apply(value: Int): OpenFlags = new OpenFlags(value)
    def unapply(arg: OpenFlags): Some[Int] = Some(arg.value)
    val create = new OpenFlags(1 << 0)
    val directory = new OpenFlags(1 << 1)
    val exclusive = new OpenFlags(1 << 2)
    val truncate = new OpenFlags(1 << 3)
  }

  @scala.scalajs.wit.annotation.WitAlias(scala.scalajs.wit.annotation.WitScope("wasi", "filesystem", "types", "0.2.12"), "link-count")
  type LinkCount = scala.scalajs.wit.unsigned.ULong

  /** File attributes.
   *
   *  Note: This was called `filestat` in earlier versions of WASI.
   */
  @scala.scalajs.wit.annotation.WitRecord(scala.scalajs.wit.annotation.WitScope("wasi", "filesystem", "types", "0.2.12"), "descriptor-stat")
  final class DescriptorStat(@scala.scalajs.wit.annotation.WitName("type") val `type`: DescriptorType, @scala.scalajs.wit.annotation.WitName("link-count") val linkCount: LinkCount, @scala.scalajs.wit.annotation.WitName("size") val size: Filesize, @scala.scalajs.wit.annotation.WitName("data-access-timestamp") val dataAccessTimestamp: scala.scalajs.wit.Option[Datetime], @scala.scalajs.wit.annotation.WitName("data-modification-timestamp") val dataModificationTimestamp: scala.scalajs.wit.Option[Datetime], @scala.scalajs.wit.annotation.WitName("status-change-timestamp") val statusChangeTimestamp: scala.scalajs.wit.Option[Datetime]) {
    override def equals(other: Any): Boolean = other match {
      case that: DescriptorStat => this.`type` == that.`type` && this.linkCount == that.linkCount && this.size == that.size && this.dataAccessTimestamp == that.dataAccessTimestamp && this.dataModificationTimestamp == that.dataModificationTimestamp && this.statusChangeTimestamp == that.statusChangeTimestamp
      case _ => false
    }
    override def hashCode(): Int = {
      var result = 1
      result = 31 * result + `type`.hashCode()
      result = 31 * result + linkCount.hashCode()
      result = 31 * result + size.hashCode()
      result = 31 * result + dataAccessTimestamp.hashCode()
      result = 31 * result + dataModificationTimestamp.hashCode()
      result = 31 * result + statusChangeTimestamp.hashCode()
      result
    }
    override def toString(): String = "DescriptorStat(" + `type` + ", " + linkCount + ", " + size + ", " + dataAccessTimestamp + ", " + dataModificationTimestamp + ", " + statusChangeTimestamp + ")"
  }
  object DescriptorStat {
    def apply(`type`: DescriptorType, linkCount: LinkCount, size: Filesize, dataAccessTimestamp: scala.scalajs.wit.Option[Datetime], dataModificationTimestamp: scala.scalajs.wit.Option[Datetime], statusChangeTimestamp: scala.scalajs.wit.Option[Datetime]): DescriptorStat = new DescriptorStat(`type`, linkCount, size, dataAccessTimestamp, dataModificationTimestamp, statusChangeTimestamp)
    def unapply(arg: DescriptorStat): Some[(DescriptorType, LinkCount, Filesize, scala.scalajs.wit.Option[Datetime], scala.scalajs.wit.Option[Datetime], scala.scalajs.wit.Option[Datetime])] = Some((arg.`type`, arg.linkCount, arg.size, arg.dataAccessTimestamp, arg.dataModificationTimestamp, arg.statusChangeTimestamp))
  }

  /** When setting a timestamp, this gives the value to set it to.
   */
  @scala.scalajs.wit.annotation.WitVariant(scala.scalajs.wit.annotation.WitScope("wasi", "filesystem", "types", "0.2.12"), "new-timestamp")
  sealed trait NewTimestamp
  object NewTimestamp {
    @scala.scalajs.wit.annotation.WitName("no-change")
    object NoChange extends NewTimestamp {
      override def toString(): String = "NoChange"
    }
    @scala.scalajs.wit.annotation.WitName("now")
    object Now extends NewTimestamp {
      override def toString(): String = "Now"
    }
    @scala.scalajs.wit.annotation.WitName("timestamp")
    final class Timestamp(@scala.scalajs.wit.annotation.WitName("value") val value: Datetime) extends NewTimestamp {
      override def equals(other: Any): Boolean = other match {
        case that: Timestamp => this.value == that.value
        case _ => false
      }
      override def hashCode(): Int = {
        value.hashCode()
      }
      override def toString(): String = "Timestamp(" + value + ")"
    }
    object Timestamp {
      def apply(value: Datetime): Timestamp = new Timestamp(value)
      def unapply(arg: Timestamp): Some[Datetime] = Some(arg.value)
    }
  }

  /** A directory entry.
   */
  @scala.scalajs.wit.annotation.WitRecord(scala.scalajs.wit.annotation.WitScope("wasi", "filesystem", "types", "0.2.12"), "directory-entry")
  final class DirectoryEntry(@scala.scalajs.wit.annotation.WitName("type") val `type`: DescriptorType, @scala.scalajs.wit.annotation.WitName("name") val name: String) {
    override def equals(other: Any): Boolean = other match {
      case that: DirectoryEntry => this.`type` == that.`type` && this.name == that.name
      case _ => false
    }
    override def hashCode(): Int = {
      var result = 1
      result = 31 * result + `type`.hashCode()
      result = 31 * result + name.hashCode()
      result
    }
    override def toString(): String = "DirectoryEntry(" + `type` + ", " + name + ")"
  }
  object DirectoryEntry {
    def apply(`type`: DescriptorType, name: String): DirectoryEntry = new DirectoryEntry(`type`, name)
    def unapply(arg: DirectoryEntry): Some[(DescriptorType, String)] = Some((arg.`type`, arg.name))
  }

  /** Error codes returned by functions, similar to `errno` in POSIX.
   *  Not all of these error codes are returned by the functions provided by this
   *  API; some are used in higher-level library layers, and others are provided
   *  merely for alignment with POSIX.
   */
  @scala.scalajs.wit.annotation.WitEnum(scala.scalajs.wit.annotation.WitScope("wasi", "filesystem", "types", "0.2.12"), "error-code")
  sealed trait ErrorCode
  object ErrorCode {
    @scala.scalajs.wit.annotation.WitName("access")
    object Access extends ErrorCode {
      override def toString(): String = "Access"
    }
    @scala.scalajs.wit.annotation.WitName("would-block")
    object WouldBlock extends ErrorCode {
      override def toString(): String = "WouldBlock"
    }
    @scala.scalajs.wit.annotation.WitName("already")
    object Already extends ErrorCode {
      override def toString(): String = "Already"
    }
    @scala.scalajs.wit.annotation.WitName("bad-descriptor")
    object BadDescriptor extends ErrorCode {
      override def toString(): String = "BadDescriptor"
    }
    @scala.scalajs.wit.annotation.WitName("busy")
    object Busy extends ErrorCode {
      override def toString(): String = "Busy"
    }
    @scala.scalajs.wit.annotation.WitName("deadlock")
    object Deadlock extends ErrorCode {
      override def toString(): String = "Deadlock"
    }
    @scala.scalajs.wit.annotation.WitName("quota")
    object Quota extends ErrorCode {
      override def toString(): String = "Quota"
    }
    @scala.scalajs.wit.annotation.WitName("exist")
    object Exist extends ErrorCode {
      override def toString(): String = "Exist"
    }
    @scala.scalajs.wit.annotation.WitName("file-too-large")
    object FileTooLarge extends ErrorCode {
      override def toString(): String = "FileTooLarge"
    }
    @scala.scalajs.wit.annotation.WitName("illegal-byte-sequence")
    object IllegalByteSequence extends ErrorCode {
      override def toString(): String = "IllegalByteSequence"
    }
    @scala.scalajs.wit.annotation.WitName("in-progress")
    object InProgress extends ErrorCode {
      override def toString(): String = "InProgress"
    }
    @scala.scalajs.wit.annotation.WitName("interrupted")
    object Interrupted extends ErrorCode {
      override def toString(): String = "Interrupted"
    }
    @scala.scalajs.wit.annotation.WitName("invalid")
    object Invalid extends ErrorCode {
      override def toString(): String = "Invalid"
    }
    @scala.scalajs.wit.annotation.WitName("io")
    object Io extends ErrorCode {
      override def toString(): String = "Io"
    }
    @scala.scalajs.wit.annotation.WitName("is-directory")
    object IsDirectory extends ErrorCode {
      override def toString(): String = "IsDirectory"
    }
    @scala.scalajs.wit.annotation.WitName("loop")
    object Loop extends ErrorCode {
      override def toString(): String = "Loop"
    }
    @scala.scalajs.wit.annotation.WitName("too-many-links")
    object TooManyLinks extends ErrorCode {
      override def toString(): String = "TooManyLinks"
    }
    @scala.scalajs.wit.annotation.WitName("message-size")
    object MessageSize extends ErrorCode {
      override def toString(): String = "MessageSize"
    }
    @scala.scalajs.wit.annotation.WitName("name-too-long")
    object NameTooLong extends ErrorCode {
      override def toString(): String = "NameTooLong"
    }
    @scala.scalajs.wit.annotation.WitName("no-device")
    object NoDevice extends ErrorCode {
      override def toString(): String = "NoDevice"
    }
    @scala.scalajs.wit.annotation.WitName("no-entry")
    object NoEntry extends ErrorCode {
      override def toString(): String = "NoEntry"
    }
    @scala.scalajs.wit.annotation.WitName("no-lock")
    object NoLock extends ErrorCode {
      override def toString(): String = "NoLock"
    }
    @scala.scalajs.wit.annotation.WitName("insufficient-memory")
    object InsufficientMemory extends ErrorCode {
      override def toString(): String = "InsufficientMemory"
    }
    @scala.scalajs.wit.annotation.WitName("insufficient-space")
    object InsufficientSpace extends ErrorCode {
      override def toString(): String = "InsufficientSpace"
    }
    @scala.scalajs.wit.annotation.WitName("not-directory")
    object NotDirectory extends ErrorCode {
      override def toString(): String = "NotDirectory"
    }
    @scala.scalajs.wit.annotation.WitName("not-empty")
    object NotEmpty extends ErrorCode {
      override def toString(): String = "NotEmpty"
    }
    @scala.scalajs.wit.annotation.WitName("not-recoverable")
    object NotRecoverable extends ErrorCode {
      override def toString(): String = "NotRecoverable"
    }
    @scala.scalajs.wit.annotation.WitName("unsupported")
    object Unsupported extends ErrorCode {
      override def toString(): String = "Unsupported"
    }
    @scala.scalajs.wit.annotation.WitName("no-tty")
    object NoTty extends ErrorCode {
      override def toString(): String = "NoTty"
    }
    @scala.scalajs.wit.annotation.WitName("no-such-device")
    object NoSuchDevice extends ErrorCode {
      override def toString(): String = "NoSuchDevice"
    }
    @scala.scalajs.wit.annotation.WitName("overflow")
    object Overflow extends ErrorCode {
      override def toString(): String = "Overflow"
    }
    @scala.scalajs.wit.annotation.WitName("not-permitted")
    object NotPermitted extends ErrorCode {
      override def toString(): String = "NotPermitted"
    }
    @scala.scalajs.wit.annotation.WitName("pipe")
    object Pipe extends ErrorCode {
      override def toString(): String = "Pipe"
    }
    @scala.scalajs.wit.annotation.WitName("read-only")
    object ReadOnly extends ErrorCode {
      override def toString(): String = "ReadOnly"
    }
    @scala.scalajs.wit.annotation.WitName("invalid-seek")
    object InvalidSeek extends ErrorCode {
      override def toString(): String = "InvalidSeek"
    }
    @scala.scalajs.wit.annotation.WitName("text-file-busy")
    object TextFileBusy extends ErrorCode {
      override def toString(): String = "TextFileBusy"
    }
    @scala.scalajs.wit.annotation.WitName("cross-device")
    object CrossDevice extends ErrorCode {
      override def toString(): String = "CrossDevice"
    }
  }

  /** File or memory access pattern advisory information.
   */
  @scala.scalajs.wit.annotation.WitEnum(scala.scalajs.wit.annotation.WitScope("wasi", "filesystem", "types", "0.2.12"), "advice")
  sealed trait Advice
  object Advice {
    @scala.scalajs.wit.annotation.WitName("normal")
    object Normal extends Advice {
      override def toString(): String = "Normal"
    }
    @scala.scalajs.wit.annotation.WitName("sequential")
    object Sequential extends Advice {
      override def toString(): String = "Sequential"
    }
    @scala.scalajs.wit.annotation.WitName("random")
    object Random extends Advice {
      override def toString(): String = "Random"
    }
    @scala.scalajs.wit.annotation.WitName("will-need")
    object WillNeed extends Advice {
      override def toString(): String = "WillNeed"
    }
    @scala.scalajs.wit.annotation.WitName("dont-need")
    object DontNeed extends Advice {
      override def toString(): String = "DontNeed"
    }
    @scala.scalajs.wit.annotation.WitName("no-reuse")
    object NoReuse extends Advice {
      override def toString(): String = "NoReuse"
    }
  }

  /** A 128-bit hash value, split into parts because wasm doesn't have a
   *  128-bit integer type.
   */
  @scala.scalajs.wit.annotation.WitRecord(scala.scalajs.wit.annotation.WitScope("wasi", "filesystem", "types", "0.2.12"), "metadata-hash-value")
  final class MetadataHashValue(@scala.scalajs.wit.annotation.WitName("lower") val lower: scala.scalajs.wit.unsigned.ULong, @scala.scalajs.wit.annotation.WitName("upper") val upper: scala.scalajs.wit.unsigned.ULong) {
    override def equals(other: Any): Boolean = other match {
      case that: MetadataHashValue => this.lower == that.lower && this.upper == that.upper
      case _ => false
    }
    override def hashCode(): Int = {
      var result = 1
      result = 31 * result + lower.hashCode()
      result = 31 * result + upper.hashCode()
      result
    }
    override def toString(): String = "MetadataHashValue(" + lower + ", " + upper + ")"
  }
  object MetadataHashValue {
    def apply(lower: scala.scalajs.wit.unsigned.ULong, upper: scala.scalajs.wit.unsigned.ULong): MetadataHashValue = new MetadataHashValue(lower, upper)
    def unapply(arg: MetadataHashValue): Some[(scala.scalajs.wit.unsigned.ULong, scala.scalajs.wit.unsigned.ULong)] = Some((arg.lower, arg.upper))
  }

  // Resources
  /** A descriptor is a reference to a filesystem object, which may be a file,
   *  directory, named pipe, special file, or other object on which filesystem
   *  calls may be made.
   */
  @scala.scalajs.wit.annotation.WitResourceImport(scala.scalajs.wit.annotation.WitScope("wasi", "filesystem", "types", "0.2.12"), "descriptor")
  final class Descriptor private () extends Object {
    /** Return a stream for reading from a file, if available.
     *
     *  May fail with an error-code describing why the file cannot be read.
     *
     *  Multiple read, write, and append streams may be active on the same open
     *  file and they do not interfere with each other.
     *
     *  Note: This allows using `read-stream`, which is similar to `read` in POSIX.
     */
    @scala.scalajs.wit.annotation.WitResourceMethod("read-via-stream")
    def readViaStream(@scala.scalajs.wit.annotation.WitName("offset") offset: Filesize): scala.scalajs.wit.Result[InputStream, ErrorCode] = scala.scalajs.wit.native
    /** Return a stream for writing to a file, if available.
     *
     *  May fail with an error-code describing why the file cannot be written.
     *
     *  Note: This allows using `write-stream`, which is similar to `write` in
     *  POSIX.
     */
    @scala.scalajs.wit.annotation.WitResourceMethod("write-via-stream")
    def writeViaStream(@scala.scalajs.wit.annotation.WitName("offset") offset: Filesize): scala.scalajs.wit.Result[OutputStream, ErrorCode] = scala.scalajs.wit.native
    /** Return a stream for appending to a file, if available.
     *
     *  May fail with an error-code describing why the file cannot be appended.
     *
     *  Note: This allows using `write-stream`, which is similar to `write` with
     *  `O_APPEND` in POSIX.
     */
    @scala.scalajs.wit.annotation.WitResourceMethod("append-via-stream")
    def appendViaStream(): scala.scalajs.wit.Result[OutputStream, ErrorCode] = scala.scalajs.wit.native
    /** Provide file advisory information on a descriptor.
     *
     *  This is similar to `posix_fadvise` in POSIX.
     */
    @scala.scalajs.wit.annotation.WitResourceMethod("advise")
    def advise(@scala.scalajs.wit.annotation.WitName("offset") offset: Filesize, @scala.scalajs.wit.annotation.WitName("length") length: Filesize, @scala.scalajs.wit.annotation.WitName("advice") advice: Advice): scala.scalajs.wit.Result[Unit, ErrorCode] = scala.scalajs.wit.native
    /** Synchronize the data of a file to disk.
     *
     *  This function succeeds with no effect if the file descriptor is not
     *  opened for writing.
     *
     *  Note: This is similar to `fdatasync` in POSIX.
     */
    @scala.scalajs.wit.annotation.WitResourceMethod("sync-data")
    def syncData(): scala.scalajs.wit.Result[Unit, ErrorCode] = scala.scalajs.wit.native
    /** Get flags associated with a descriptor.
     *
     *  Note: This returns similar flags to `fcntl(fd, F_GETFL)` in POSIX.
     *
     *  Note: This returns the value that was the `fs_flags` value returned
     *  from `fdstat_get` in earlier versions of WASI.
     */
    @scala.scalajs.wit.annotation.WitResourceMethod("get-flags")
    def getFlags(): scala.scalajs.wit.Result[DescriptorFlags, ErrorCode] = scala.scalajs.wit.native
    /** Get the dynamic type of a descriptor.
     *
     *  Note: This returns the same value as the `type` field of the `fd-stat`
     *  returned by `stat`, `stat-at` and similar.
     *
     *  Note: This returns similar flags to the `st_mode & S_IFMT` value provided
     *  by `fstat` in POSIX.
     *
     *  Note: This returns the value that was the `fs_filetype` value returned
     *  from `fdstat_get` in earlier versions of WASI.
     */
    @scala.scalajs.wit.annotation.WitResourceMethod("get-type")
    def getType(): scala.scalajs.wit.Result[DescriptorType, ErrorCode] = scala.scalajs.wit.native
    /** Adjust the size of an open file. If this increases the file's size, the
     *  extra bytes are filled with zeros.
     *
     *  Note: This was called `fd_filestat_set_size` in earlier versions of WASI.
     */
    @scala.scalajs.wit.annotation.WitResourceMethod("set-size")
    def setSize(@scala.scalajs.wit.annotation.WitName("size") size: Filesize): scala.scalajs.wit.Result[Unit, ErrorCode] = scala.scalajs.wit.native
    /** Adjust the timestamps of an open file or directory.
     *
     *  Note: This is similar to `futimens` in POSIX.
     *
     *  Note: This was called `fd_filestat_set_times` in earlier versions of WASI.
     */
    @scala.scalajs.wit.annotation.WitResourceMethod("set-times")
    def setTimes(@scala.scalajs.wit.annotation.WitName("data-access-timestamp") dataAccessTimestamp: NewTimestamp, @scala.scalajs.wit.annotation.WitName("data-modification-timestamp") dataModificationTimestamp: NewTimestamp): scala.scalajs.wit.Result[Unit, ErrorCode] = scala.scalajs.wit.native
    /** Read from a descriptor, without using and updating the descriptor's offset.
     *
     *  This function returns a list of bytes containing the data that was
     *  read, along with a bool which, when true, indicates that the end of the
     *  file was reached. The returned list will contain up to `length` bytes; it
     *  may return fewer than requested, if the end of the file is reached or
     *  if the I/O operation is interrupted.
     *
     *  In the future, this may change to return a `stream<u8, error-code>`.
     *
     *  Note: This is similar to `pread` in POSIX.
     */
    @scala.scalajs.wit.annotation.WitResourceMethod("read")
    def read(@scala.scalajs.wit.annotation.WitName("length") length: Filesize, @scala.scalajs.wit.annotation.WitName("offset") offset: Filesize): scala.scalajs.wit.Result[scala.scalajs.wit.Tuple2[Array[scala.scalajs.wit.unsigned.UByte], Boolean], ErrorCode] = scala.scalajs.wit.native
    /** Write to a descriptor, without using and updating the descriptor's offset.
     *
     *  It is valid to write past the end of a file; the file is extended to the
     *  extent of the write, with bytes between the previous end and the start of
     *  the write set to zero.
     *
     *  In the future, this may change to take a `stream<u8, error-code>`.
     *
     *  Note: This is similar to `pwrite` in POSIX.
     */
    @scala.scalajs.wit.annotation.WitResourceMethod("write")
    def write(@scala.scalajs.wit.annotation.WitName("buffer") buffer: Array[scala.scalajs.wit.unsigned.UByte], @scala.scalajs.wit.annotation.WitName("offset") offset: Filesize): scala.scalajs.wit.Result[Filesize, ErrorCode] = scala.scalajs.wit.native
    /** Read directory entries from a directory.
     *
     *  On filesystems where directories contain entries referring to themselves
     *  and their parents, often named `.` and `..` respectively, these entries
     *  are omitted.
     *
     *  This always returns a new stream which starts at the beginning of the
     *  directory. Multiple streams may be active on the same directory, and they
     *  do not interfere with each other.
     */
    @scala.scalajs.wit.annotation.WitResourceMethod("read-directory")
    def readDirectory(): scala.scalajs.wit.Result[DirectoryEntryStream, ErrorCode] = scala.scalajs.wit.native
    /** Synchronize the data and metadata of a file to disk.
     *
     *  This function succeeds with no effect if the file descriptor is not
     *  opened for writing.
     *
     *  Note: This is similar to `fsync` in POSIX.
     */
    @scala.scalajs.wit.annotation.WitResourceMethod("sync")
    def sync(): scala.scalajs.wit.Result[Unit, ErrorCode] = scala.scalajs.wit.native
    /** Create a directory.
     *
     *  Note: This is similar to `mkdirat` in POSIX.
     */
    @scala.scalajs.wit.annotation.WitResourceMethod("create-directory-at")
    def createDirectoryAt(@scala.scalajs.wit.annotation.WitName("path") path: String): scala.scalajs.wit.Result[Unit, ErrorCode] = scala.scalajs.wit.native
    /** Return the attributes of an open file or directory.
     *
     *  Note: This is similar to `fstat` in POSIX, except that it does not return
     *  device and inode information. For testing whether two descriptors refer to
     *  the same underlying filesystem object, use `is-same-object`. To obtain
     *  additional data that can be used do determine whether a file has been
     *  modified, use `metadata-hash`.
     *
     *  Note: This was called `fd_filestat_get` in earlier versions of WASI.
     */
    @scala.scalajs.wit.annotation.WitResourceMethod("stat")
    def stat(): scala.scalajs.wit.Result[DescriptorStat, ErrorCode] = scala.scalajs.wit.native
    /** Return the attributes of a file or directory.
     *
     *  Note: This is similar to `fstatat` in POSIX, except that it does not
     *  return device and inode information. See the `stat` description for a
     *  discussion of alternatives.
     *
     *  Note: This was called `path_filestat_get` in earlier versions of WASI.
     */
    @scala.scalajs.wit.annotation.WitResourceMethod("stat-at")
    def statAt(@scala.scalajs.wit.annotation.WitName("path-flags") pathFlags: PathFlags, @scala.scalajs.wit.annotation.WitName("path") path: String): scala.scalajs.wit.Result[DescriptorStat, ErrorCode] = scala.scalajs.wit.native
    /** Adjust the timestamps of a file or directory.
     *
     *  Note: This is similar to `utimensat` in POSIX.
     *
     *  Note: This was called `path_filestat_set_times` in earlier versions of
     *  WASI.
     */
    @scala.scalajs.wit.annotation.WitResourceMethod("set-times-at")
    def setTimesAt(@scala.scalajs.wit.annotation.WitName("path-flags") pathFlags: PathFlags, @scala.scalajs.wit.annotation.WitName("path") path: String, @scala.scalajs.wit.annotation.WitName("data-access-timestamp") dataAccessTimestamp: NewTimestamp, @scala.scalajs.wit.annotation.WitName("data-modification-timestamp") dataModificationTimestamp: NewTimestamp): scala.scalajs.wit.Result[Unit, ErrorCode] = scala.scalajs.wit.native
    /** Create a hard link.
     *
     *  Fails with `error-code::no-entry` if the old path does not exist,
     *  with `error-code::exist` if the new path already exists, and
     *  `error-code::not-permitted` if the old path is not a file.
     *
     *  Note: This is similar to `linkat` in POSIX.
     */
    @scala.scalajs.wit.annotation.WitResourceMethod("link-at")
    def linkAt(@scala.scalajs.wit.annotation.WitName("old-path-flags") oldPathFlags: PathFlags, @scala.scalajs.wit.annotation.WitName("old-path") oldPath: String, @scala.scalajs.wit.annotation.WitName("new-descriptor") newDescriptor: scala.scalajs.wit.Borrow[Descriptor], @scala.scalajs.wit.annotation.WitName("new-path") newPath: String): scala.scalajs.wit.Result[Unit, ErrorCode] = scala.scalajs.wit.native
    /** Open a file or directory.
     *
     *  If `flags` contains `descriptor-flags::mutate-directory`, and the base
     *  descriptor doesn't have `descriptor-flags::mutate-directory` set,
     *  `open-at` fails with `error-code::read-only`.
     *
     *  If `flags` contains `write` or `mutate-directory`, or `open-flags`
     *  contains `truncate` or `create`, and the base descriptor doesn't have
     *  `descriptor-flags::mutate-directory` set, `open-at` fails with
     *  `error-code::read-only`.
     *
     *  Note: This is similar to `openat` in POSIX.
     */
    @scala.scalajs.wit.annotation.WitResourceMethod("open-at")
    def openAt(@scala.scalajs.wit.annotation.WitName("path-flags") pathFlags: PathFlags, @scala.scalajs.wit.annotation.WitName("path") path: String, @scala.scalajs.wit.annotation.WitName("open-flags") openFlags: OpenFlags, @scala.scalajs.wit.annotation.WitName("flags") flags: DescriptorFlags): scala.scalajs.wit.Result[Descriptor, ErrorCode] = scala.scalajs.wit.native
    /** Read the contents of a symbolic link.
     *
     *  If the contents contain an absolute or rooted path in the underlying
     *  filesystem, this function fails with `error-code::not-permitted`.
     *
     *  Note: This is similar to `readlinkat` in POSIX.
     */
    @scala.scalajs.wit.annotation.WitResourceMethod("readlink-at")
    def readlinkAt(@scala.scalajs.wit.annotation.WitName("path") path: String): scala.scalajs.wit.Result[String, ErrorCode] = scala.scalajs.wit.native
    /** Remove a directory.
     *
     *  Return `error-code::not-empty` if the directory is not empty.
     *
     *  Note: This is similar to `unlinkat(fd, path, AT_REMOVEDIR)` in POSIX.
     */
    @scala.scalajs.wit.annotation.WitResourceMethod("remove-directory-at")
    def removeDirectoryAt(@scala.scalajs.wit.annotation.WitName("path") path: String): scala.scalajs.wit.Result[Unit, ErrorCode] = scala.scalajs.wit.native
    /** Rename a filesystem object.
     *
     *  Note: This is similar to `renameat` in POSIX.
     */
    @scala.scalajs.wit.annotation.WitResourceMethod("rename-at")
    def renameAt(@scala.scalajs.wit.annotation.WitName("old-path") oldPath: String, @scala.scalajs.wit.annotation.WitName("new-descriptor") newDescriptor: scala.scalajs.wit.Borrow[Descriptor], @scala.scalajs.wit.annotation.WitName("new-path") newPath: String): scala.scalajs.wit.Result[Unit, ErrorCode] = scala.scalajs.wit.native
    /** Create a symbolic link (also known as a "symlink").
     *
     *  If `old-path` starts with `/`, the function fails with
     *  `error-code::not-permitted`.
     *
     *  Note: This is similar to `symlinkat` in POSIX.
     */
    @scala.scalajs.wit.annotation.WitResourceMethod("symlink-at")
    def symlinkAt(@scala.scalajs.wit.annotation.WitName("old-path") oldPath: String, @scala.scalajs.wit.annotation.WitName("new-path") newPath: String): scala.scalajs.wit.Result[Unit, ErrorCode] = scala.scalajs.wit.native
    /** Unlink a filesystem object that is not a directory.
     *
     *  Return `error-code::is-directory` if the path refers to a directory.
     *  Note: This is similar to `unlinkat(fd, path, 0)` in POSIX.
     */
    @scala.scalajs.wit.annotation.WitResourceMethod("unlink-file-at")
    def unlinkFileAt(@scala.scalajs.wit.annotation.WitName("path") path: String): scala.scalajs.wit.Result[Unit, ErrorCode] = scala.scalajs.wit.native
    /** Test whether two descriptors refer to the same filesystem object.
     *
     *  In POSIX, this corresponds to testing whether the two descriptors have the
     *  same device (`st_dev`) and inode (`st_ino` or `d_ino`) numbers.
     *  wasi-filesystem does not expose device and inode numbers, so this function
     *  may be used instead.
     */
    @scala.scalajs.wit.annotation.WitResourceMethod("is-same-object")
    def isSameObject(@scala.scalajs.wit.annotation.WitName("other") other: scala.scalajs.wit.Borrow[Descriptor]): Boolean = scala.scalajs.wit.native
    /** Return a hash of the metadata associated with a filesystem object referred
     *  to by a descriptor.
     *
     *  This returns a hash of the last-modification timestamp and file size, and
     *  may also include the inode number, device number, birth timestamp, and
     *  other metadata fields that may change when the file is modified or
     *  replaced. It may also include a secret value chosen by the
     *  implementation and not otherwise exposed.
     *
     *  Implementations are encouraged to provide the following properties:
     *
     *   - If the file is not modified or replaced, the computed hash value should
     *     usually not change.
     *   - If the object is modified or replaced, the computed hash value should
     *     usually change.
     *   - The inputs to the hash should not be easily computable from the
     *     computed hash.
     *
     *  However, none of these is required.
     */
    @scala.scalajs.wit.annotation.WitResourceMethod("metadata-hash")
    def metadataHash(): scala.scalajs.wit.Result[MetadataHashValue, ErrorCode] = scala.scalajs.wit.native
    /** Return a hash of the metadata associated with a filesystem object referred
     *  to by a directory descriptor and a relative path.
     *
     *  This performs the same hash computation as `metadata-hash`.
     */
    @scala.scalajs.wit.annotation.WitResourceMethod("metadata-hash-at")
    def metadataHashAt(@scala.scalajs.wit.annotation.WitName("path-flags") pathFlags: PathFlags, @scala.scalajs.wit.annotation.WitName("path") path: String): scala.scalajs.wit.Result[MetadataHashValue, ErrorCode] = scala.scalajs.wit.native
    @scala.scalajs.wit.annotation.WitResourceDrop
    def close(): Unit = scala.scalajs.wit.native
  }
  object Descriptor {
  }

  /** A stream of directory entries.
   */
  @scala.scalajs.wit.annotation.WitResourceImport(scala.scalajs.wit.annotation.WitScope("wasi", "filesystem", "types", "0.2.12"), "directory-entry-stream")
  final class DirectoryEntryStream private () extends Object {
    /** Read a single directory entry from a `directory-entry-stream`.
     */
    @scala.scalajs.wit.annotation.WitResourceMethod("read-directory-entry")
    def readDirectoryEntry(): scala.scalajs.wit.Result[scala.scalajs.wit.Option[DirectoryEntry], ErrorCode] = scala.scalajs.wit.native
    @scala.scalajs.wit.annotation.WitResourceDrop
    def close(): Unit = scala.scalajs.wit.native
  }
  object DirectoryEntryStream {
  }

  // Functions
  /** Attempts to extract a filesystem-related `error-code` from the stream
   *  `error` provided.
   *
   *  Stream operations which return `stream-error::last-operation-failed`
   *  have a payload with more information about the operation that failed.
   *  This payload can be passed through to this function to see if there's
   *  filesystem-related information about the error to return.
   *
   *  Note that this function is fallible because not all stream-related
   *  errors are filesystem-related errors.
   */
  @scala.scalajs.wit.annotation.WitImport(scala.scalajs.wit.annotation.WitScope("wasi", "filesystem", "types", "0.2.12"), "filesystem-error-code")
  def filesystemErrorCode(@scala.scalajs.wit.annotation.WitName("err") err: scala.scalajs.wit.Borrow[Error]): scala.scalajs.wit.Option[ErrorCode] = scala.scalajs.wit.native

}
