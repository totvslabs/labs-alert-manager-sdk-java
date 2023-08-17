

# NotificationSchema


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**clientUuid** | **String** | Notification Client UUID |  |
|**createdAt** | **OffsetDateTime** |  |  [optional] |
|**events** | **List&lt;String&gt;** | List of notification events |  [optional] |
|**firstEvent** | **OffsetDateTime** |  |  [optional] |
|**id** | **String** | Id |  |
|**retries** | **Integer** | Quantity notification retries |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) | Notification status |  |
|**updatedAt** | **OffsetDateTime** |  |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| QUEUED | &quot;Queued&quot; |
| PROCESSING | &quot;Processing&quot; |
| FAILED | &quot;Failed&quot; |
| SUCCESS | &quot;Success&quot; |



