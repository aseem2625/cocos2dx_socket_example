// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: CommunicationMessageType.proto

package ProtoMessages;

public final class CommunicationMessageTypeBase {
  private CommunicationMessageTypeBase() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }
  /**
   * Protobuf enum {@code eCommunicationMessageType}
   */
  public enum eCommunicationMessageType
      implements com.google.protobuf.Internal.EnumLite {
    /**
     * <code>cmtNone = 0;</code>
     */
    cmtNone(0),
    /**
     * <pre>
     * simple message that send client to server
     * </pre>
     *
     * <code>cmtPing = 1;</code>
     */
    cmtPing(1),
    /**
     * <pre>
     * simple message that send server to client
     * </pre>
     *
     * <code>cmtPong = 2;</code>
     */
    cmtPong(2),
    ;

    /**
     * <code>cmtNone = 0;</code>
     */
    public static final int cmtNone_VALUE = 0;
    /**
     * <pre>
     * simple message that send client to server
     * </pre>
     *
     * <code>cmtPing = 1;</code>
     */
    public static final int cmtPing_VALUE = 1;
    /**
     * <pre>
     * simple message that send server to client
     * </pre>
     *
     * <code>cmtPong = 2;</code>
     */
    public static final int cmtPong_VALUE = 2;


    public final int getNumber() {
      return value;
    }

    /**
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static eCommunicationMessageType valueOf(int value) {
      return forNumber(value);
    }

    public static eCommunicationMessageType forNumber(int value) {
      switch (value) {
        case 0: return cmtNone;
        case 1: return cmtPing;
        case 2: return cmtPong;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<eCommunicationMessageType>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        eCommunicationMessageType> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<eCommunicationMessageType>() {
            public eCommunicationMessageType findValueByNumber(int number) {
              return eCommunicationMessageType.forNumber(number);
            }
          };

    private final int value;

    private eCommunicationMessageType(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:eCommunicationMessageType)
  }


  static {
  }

  // @@protoc_insertion_point(outer_class_scope)
}
